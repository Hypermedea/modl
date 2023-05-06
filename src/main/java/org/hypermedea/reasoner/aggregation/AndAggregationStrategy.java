package org.hypermedea.reasoner.aggregation;

import org.hypermedea.reasoner.TableauNode;

import java.util.Set;

public class AndAggregationStrategy implements AggregationStrategy {

    private static AndAggregationStrategy instance = new AndAggregationStrategy();

    public static AndAggregationStrategy get() {
        return instance;
    }

    private AndAggregationStrategy() {
        // do nothing
    }

    @Override
    public void aggregateStatus(TableauNode node) {
        Set<TableauNode> nodes = node.getChildren();

        if (nodes.stream().anyMatch(n -> n.isInconsistent())) node.setInconsistent();
        else if (nodes.stream().allMatch(n -> n.isConsistent())) node.setConsistent();
    }

}
