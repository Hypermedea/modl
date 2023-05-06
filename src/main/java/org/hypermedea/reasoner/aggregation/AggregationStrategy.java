package org.hypermedea.reasoner.aggregation;

import org.hypermedea.reasoner.TableauNode;

import java.util.Set;

public interface AggregationStrategy {

    /**
     * Aggregate the status of children of some node and set status of that node if known.
     *
     * @param node the node whose status is to set
     */
    void aggregateStatus(TableauNode node);

}
