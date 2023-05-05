package org.hypermedea.reasoner.aggregation;

import org.hypermedea.reasoner.TableauNode;

import java.util.Set;

public interface AggregationStrategy {

    /**
     * Aggregate the status of some nodes.
     *
     * @param nodes the nodes whose status is to aggregate
     */
    TableauNode.Status aggregateStatus(Set<TableauNode> nodes);

}
