package org.hypermedea.reasoner;

import org.hypermedea.owlreg.OWLRegObjectRenderer;
import org.semanticweb.owlapi.io.ToStringRenderer;
import org.semanticweb.owlapi.model.OWLClassExpression;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Implementation of a reasoner for ALC<sub>reg</sub> (and its syntactic variant, PDL) based on a Tableau algorithm.
 * Axioms are expressed as SHACL shapes.
 *
 * <ol>
 *     <li>apply alpha-rules and beta-rules until saturation</li>
 *     <li>apply existential rule</li>
 *     <li>verify satisfaction of eventualities</li>
 * </ol>
 */
public class Reasoner {

    static {
        ToStringRenderer.getInstance().setRenderer(new OWLRegObjectRenderer());
    }

    private static Reasoner instance = new Reasoner();

    public static Reasoner get() {
        return instance;
    }

    private Reasoner() {
        // nothing to do
    }

    public Tableau getTableau(OWLClassExpression e) {
        Tableau t = new Tableau(e);
        saturate(t);
        return t;
    }

    private static void saturate(Tableau t) {
        Queue<TableauNode> q = new LinkedList<>();
        q.add(t.getRootNode());

        // expand tableau until saturation
        while (!q.isEmpty()) {
            TableauNode n = q.poll();

            try {
                Set<TableauNode> nodes = n.expand();
                q.addAll(nodes);
            } catch (NodeStatusSetException e) {
                propagateStatus(e.getNode().getParents());

                if (t.getRootNode().hasStatusSet()) return;
            }
        }

        propagateStatus(t.getCache().stream().filter(n -> !n.hasStatusSet()).collect(Collectors.toSet()));

        t.updateRemainingNodes();
    }

    private static void propagateStatus(Set<TableauNode> startNodes) {
        Queue<TableauNode> q = new LinkedList<>();
        q.addAll(startNodes);

        Set<TableauNode> processedNodes = new HashSet<>();

        while (!q.isEmpty()) {
            TableauNode n = q.poll();
            processedNodes.add(n);

            n.updateStatus();

            if (n.hasStatusSet()) {
                q.addAll(n.getParents());
                q.removeAll(processedNodes);
            }
        }
    }

}
