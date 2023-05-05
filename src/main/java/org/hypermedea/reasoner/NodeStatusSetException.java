package org.hypermedea.reasoner;

public class NodeStatusSetException extends RuntimeException {

    private final TableauNode node;

    public NodeStatusSetException(TableauNode n) {
        node = n;
    }

    public TableauNode getNode() {
        return node;
    }

}
