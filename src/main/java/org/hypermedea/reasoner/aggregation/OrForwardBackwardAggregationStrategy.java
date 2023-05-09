package org.hypermedea.reasoner.aggregation;

import org.hypermedea.reasoner.TableauNode;
import org.semanticweb.owlapi.model.OWLClassExpression;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrForwardBackwardAggregationStrategy implements AggregationStrategy {

    public static OrForwardBackwardAggregationStrategy get(OWLClassExpression e) {
        // TODO cache instances instead, to remember location of nodes with appropriate expr
        return new OrForwardBackwardAggregationStrategy(e);
    }

    private final OWLClassExpression eventuality;

    private OrForwardBackwardAggregationStrategy(OWLClassExpression e) {
        eventuality = e;
    }

    @Override
    public void aggregateStatus(TableauNode node) {
        OWLClassExpression e = node.getContent().getEventualityTarget(eventuality);

        Set<TableauNode> children = node.getChildren();
        Optional<TableauNode> opt = children.stream().filter(n -> n.getContent().contains(e)).findAny();

        if (opt.isEmpty()) throw new RuntimeException("Children of an eventuality node should include node with eventuality target");
        TableauNode targetNode = opt.get();

        if (children.stream().anyMatch(n -> n.isConsistent())) {
            node.setConsistent();
        } else if (targetNode.isInconsistent() && children.stream().noneMatch(n -> n.isUnexpanded())) {
            Set<TableauNode> rescuers = getPotentialRescuers(node, node, eventuality);

            if (rescuers.isEmpty()) node.setInconsistent();
            else if (rescuers.stream().anyMatch(n -> n.isConsistent())) node.setConsistent();
            else if (rescuers.stream().allMatch(n -> n.isInconsistent())) node.setInconsistent();
        }
    }

    private static Set<TableauNode> getPotentialRescuers(TableauNode node, TableauNode descendant, OWLClassExpression e) {
        if (node.getForwardParent().isEmpty()) {
            return new HashSet<>();
        } else {
            TableauNode parent = node.getForwardParent().get();
            Set<TableauNode> ancestors = getPotentialRescuers(parent, descendant, e);

            if (hasEventuality(parent, e) &&
                    hasPotentiallyConsistentAncestor(parent, descendant) &&
                    isBranchingNode(parent)) {
                ancestors.add(parent);
            }

            return ancestors;
        }
    }

    private static boolean hasEventuality(TableauNode node, OWLClassExpression e) {
        return node.getContent().hasEventuality(e);
    }

    private static boolean hasPotentiallyConsistentAncestor(TableauNode node, TableauNode ancestor) {
        Set<TableauNode> parents = node.getParents().stream().filter(n -> !n.isInconsistent()).collect(Collectors.toSet());

        if (parents.stream().anyMatch(n -> n.equals(ancestor))) return true;
        else return parents.stream().anyMatch(n -> hasPotentiallyConsistentAncestor(n, ancestor));
    }

    private static boolean isBranchingNode(TableauNode node) {
        return node.getChildren().size() > 1;
    }

}
