package org.hypermedea.reasoner.aggregation;

import org.hypermedea.reasoner.TableauNode;

import java.util.Set;

public class OrAggregationStrategy implements AggregationStrategy {

    private static OrAggregationStrategy instance = new OrAggregationStrategy();

    public static OrAggregationStrategy get() {
        return instance;
    }

    private OrAggregationStrategy() {
        // do nothing
    }

    @Override
    public TableauNode.Status aggregateStatus(Set<TableauNode> nodes) {
        if (nodes.stream().anyMatch(n -> n.isConsistent())) return TableauNode.Status.CONSISTENT;
        else if (nodes.stream().allMatch(n -> n.isInconsistent())) return TableauNode.Status.INCONSISTENT;
        else return TableauNode.Status.EXPANDED;
    }

}
