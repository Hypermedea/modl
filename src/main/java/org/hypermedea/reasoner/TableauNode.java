package org.hypermedea.reasoner;

import org.hypermedea.reasoner.aggregation.AggregationStrategy;
import org.hypermedea.reasoner.aggregation.AndAggregationStrategy;
import org.hypermedea.reasoner.aggregation.OrAggregationStrategy;
import org.hypermedea.reasoner.aggregation.OrForwardBackwardAggregationStrategy;
import org.semanticweb.owlapi.model.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TableauNode {

    private enum Status {
        /**
         * A node is inconsistent if its set of expressions holds a contradiction.
         */
        INCONSISTENT,
        /**
         * A node is consistent if no expansion rule applies to it and if its set of expressions holds no contradiction.
         */
        CONSISTENT,
        /**
         * A node is expanded if an expansion rule has been applied to it.
         */
        EXPANDED,
        /**
         * A node is unexpanded if no expansion rule has yet been applied to it.
         */
        UNEXPANDED
    }

    private Status status = Status.UNEXPANDED;

    private AggregationStrategy aggregationStrategy = null;

    private final TableauNodeContent content;

    private final Set<TableauNode> children = new HashSet<>();

    private Optional<TableauNode> forwardParent = Optional.empty();

    private final Set<TableauNode> backwardParents = new HashSet<>();

    private final Tableau tableau;

    public TableauNode(Set<OWLClassExpression> es, Tableau t) {
        content = new TableauNodeContent(es);
        tableau = t;
    }

    public TableauNode(TableauNodeContent cnt, Tableau t) {
        content = cnt;
        tableau = t;
    }

    public boolean isInconsistent() {
        return status == Status.INCONSISTENT;
    }

    public boolean isConsistent() {
        return status == Status.CONSISTENT;
    }

    public boolean hasStatusSet() {
        return isConsistent() || isInconsistent();
    }

    public boolean isExpanded() {
        return status == Status.EXPANDED;
    }

    public boolean isUnexpanded() {
        return status == Status.UNEXPANDED;
    }

    public void setInconsistent() {
        if (status == Status.UNEXPANDED) throw new RuntimeException("Unexpanded node cannot be set inconsistent");
        if (status == Status.CONSISTENT) throw new RuntimeException("Node previously set as consistent cannot change status");
        // TODO warn that inconsistent node shouldn't change status
        if (status == Status.EXPANDED) status = Status.INCONSISTENT;
    }

    public void setConsistent() {
        if (status == Status.UNEXPANDED) throw new RuntimeException("Unexpanded node cannot be set consistent");
        if (status == Status.INCONSISTENT) throw new RuntimeException("Node previously set as inconsistent cannot change status");
        // TODO warn that consistent node shouldn't change status
        if (status == Status.EXPANDED) status = Status.CONSISTENT;
    }

    public Set<TableauNode> expand() {
        // apply id-rule
        if (content.holdsContradiction()) {
            status = Status.INCONSISTENT;
            throw new NodeStatusSetException(this);
        }

        // apply alpha-rule (conjunction)
        if (!content.getAlphaExpressions().isEmpty()) {
            OWLObjectIntersectionOf e = content.getAlphaExpressions().stream().findAny().get();

            TableauNodeContent cnt = new TableauNodeContent(content, e.getOperands(), Set.of(e));
            Optional<TableauNode> opt = linkToNode(cnt);

            aggregationStrategy = AndAggregationStrategy.get();
            status = Status.EXPANDED;

            return opt.isPresent() ? Set.of(opt.get()) : Set.of();
        }

        // apply beta-rule (disjunction)
        if (!content.getBetaExpressions().isEmpty()) {
            OWLObjectUnionOf e = content.getBetaExpressions().stream().findAny().get();

            Set<TableauNode> nodes = new HashSet<>();

            for (OWLClassExpression op : e.getOperands()) {
                TableauNodeContent cnt = new TableauNodeContent(content, Set.of(op), Set.of(e));
                Optional<TableauNode> opt = linkToNode(cnt);

                if (opt.isPresent()) nodes.add(opt.get());
            }

            aggregationStrategy = content.hasEventuality(e)
                    ? OrForwardBackwardAggregationStrategy.get(e)
                    : OrAggregationStrategy.get();

            status = Status.EXPANDED;

            return nodes;
        }

        // apply existential rule
        if (!content.getExistentialExpressions().isEmpty()) {
            Set<TableauNode> nodes = new HashSet<>();

            for (OWLObjectSomeValuesFrom e : content.getExistentialExpressions()) {
                OWLObjectPropertyExpression p = e.getProperty();

                Stream<OWLObjectAllValuesFrom> str = content.getUniversalExpressions().stream().filter(other -> other.getProperty().equals(p));

                Set<OWLClassExpression> additions = new HashSet<>();
                additions.addAll(str.map(other -> other.getFiller()).collect(Collectors.toSet()));
                additions.add(e.getFiller());

                TableauNodeContent cnt = new TableauNodeContent(additions);
                Optional<TableauNode> opt = linkToNode(cnt);

                if (opt.isPresent()) nodes.add(opt.get());
            }

            aggregationStrategy = AndAggregationStrategy.get();
            status = Status.EXPANDED;

            return nodes;
        }

        status = Status.CONSISTENT;
        throw new NodeStatusSetException(this);
    }

    public void updateStatus() {
        if (aggregationStrategy == null) throw new RuntimeException("Node status cannot be updated");
        aggregationStrategy.aggregateStatus(this);
    }

    public TableauNodeContent getContent() {
        return content;
    }

    public Set<TableauNode> getChildren() {
        return children;
    }

    public Set<TableauNode> getParents() {
        Set<TableauNode> allParents = new HashSet<>();

        if (forwardParent.isPresent()) allParents.add(forwardParent.get());
        allParents.addAll(backwardParents);

        return allParents;
    }

    public Optional<TableauNode> getForwardParent() {
        return forwardParent;
    }

    private Optional<TableauNode> linkToNode(TableauNodeContent cnt) {
        Optional<TableauNode> cache = tableau.getCachedNode(cnt);

        if (cache.isEmpty()) {
            TableauNode n = new TableauNode(cnt, tableau);
            tableau.addNode(n);

            children.add(n);
            n.forwardParent = Optional.of(this);

            return Optional.of(n);
        } else {
            TableauNode n = cache.get();

            children.add(n);
            n.backwardParents.add(this);

            return Optional.empty();
        }
    }

}
