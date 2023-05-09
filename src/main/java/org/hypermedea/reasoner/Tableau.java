package org.hypermedea.reasoner;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Tableau {

    private final Set<TableauNode> nodes = new HashSet<>();

    private final TableauNode root;

    public Tableau(OWLClassExpression e) {
        e = e.getNNF();

        Set<OWLClassExpression> expr = new HashSet<>();

        if (e instanceof OWLObjectIntersectionOf) {
            OWLObjectIntersectionOf conjunction = (OWLObjectIntersectionOf) e;
            expr.addAll(conjunction.getOperands());
        } else {
            expr.add(e);
        }

        root = new TableauNode(expr, this);
        nodes.add(root);
    }

    public TableauNode getRootNode() {
        return root;
    }

    public Optional<TableauNode> getCachedNode(TableauNodeContent cnt) {
        return nodes.stream().filter(n -> n.getContent().equals(cnt)).findAny();
    }

    public Set<TableauNode> getCache() {
        return nodes;
    }

    public void addNode(TableauNode n) {
        nodes.add(n);
    }

    public void updateRemainingNodes() {
        for (TableauNode n : nodes) {
            if (n.isExpanded()) n.setConsistent();
            else if (n.isUnexpanded()) throw new RuntimeException("Node is still unexpanded");
        }
    }

    public Model buildModel() {
        // TODO
        return ModelFactory.createDefaultModel();
    }

}
