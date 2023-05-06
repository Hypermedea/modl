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
    public void aggregateStatus(TableauNode node) {
        Set<TableauNode> nodes = node.getChildren();

        if (nodes.stream().anyMatch(n -> n.isConsistent())) node.setConsistent();
        else if (nodes.stream().allMatch(n -> n.isInconsistent())) node.setInconsistent();
    }

}
