package org.hypermedea.reasoner;

import org.hypermedea.reasoner.aggregation.AggregationStrategy;
import org.hypermedea.reasoner.aggregation.AndAggregationStrategy;
import org.hypermedea.reasoner.aggregation.OrAggregationStrategy;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TableauNode {

    public enum Status {
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

    private final Set<TableauNode> parents = new HashSet<>();

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

    public boolean isExpanded() {
        return status == Status.EXPANDED;
    }

    public boolean isUnexpanded() {
        return status == Status.UNEXPANDED;
    }

    public void setConsistent() {
        if (status == Status.UNEXPANDED) throw new RuntimeException("Some node is still unexpanded");
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
            OWLClassExpression e = content.getAlphaExpressions().stream().findAny().get();

            TableauNodeContent cnt = new TableauNodeContent(content, content.getOperands(e), Set.of(e));
            Optional<TableauNode> opt = linkToNode(cnt);

            aggregationStrategy = AndAggregationStrategy.get();

            return opt.isPresent() ? Set.of(opt.get()) : Set.of();
        }

        // apply beta-rule (disjunction)
        if (!content.getBetaExpressions().isEmpty()) {
            OWLClassExpression e = content.getBetaExpressions().stream().findAny().get();

            Set<TableauNode> nodes = new HashSet<>();

            for (OWLClassExpression op : content.getOperands(e)) {
                TableauNodeContent cnt = new TableauNodeContent(content, Set.of(op), Set.of(e));
                Optional<TableauNode> opt = linkToNode(cnt);

                if (opt.isPresent()) nodes.add(opt.get());
            }

            aggregationStrategy = OrAggregationStrategy.get();

            return nodes;
        }

        // apply existential rule
        if (!content.getExistentialExpressions().isEmpty()) {
            Set<TableauNode> nodes = new HashSet<>();

            for (OWLObjectSomeValuesFrom e : content.getExistentialExpressions()) {
                OWLObjectPropertyExpression p = e.getProperty();

                for (OWLClassExpression op : content.getOperands(e)) {
                    Stream<OWLObjectAllValuesFrom> str = content.getUniversalExpressions().stream().filter(other -> other.getProperty().equals(p));

                    Set<OWLClassExpression> additions = new HashSet<>();
                    additions.addAll(str.map(other -> other.getFiller()).collect(Collectors.toSet()));
                    additions.add(op);

                    TableauNodeContent cnt = new TableauNodeContent(additions);
                    Optional<TableauNode> opt = linkToNode(cnt);

                    if (opt.isPresent()) nodes.add(opt.get());
                }
            }

            aggregationStrategy = AndAggregationStrategy.get();

            return nodes;
        }

        status = Status.CONSISTENT;
        throw new NodeStatusSetException(this);
    }

    public void updateStatus() {
        if (aggregationStrategy == null) throw new RuntimeException("tableau node status cannot be updated");
        status = aggregationStrategy.aggregateStatus(children);
    }

    public TableauNodeContent getContent() {
        return content;
    }

    public Set<TableauNode> getChildren() {
        return children;
    }

    public Set<TableauNode> getParents() {
        return parents;
    }

    public void addParent(TableauNode n) {
        parents.add(n);
    }

    private Optional<TableauNode> linkToNode(TableauNodeContent cnt) {
        Optional<TableauNode> opt = tableau.getDuplicateNode(cnt);

        TableauNode n = opt.isEmpty() ? new TableauNode(cnt, tableau) : opt.get();

        children.add(n);
        n.addParent(this);

        if (opt.isEmpty()) {
            tableau.addNode(n);
            return Optional.of(n);
        } else {
            return Optional.empty();
        }
    }

}
