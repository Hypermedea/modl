package org.hypermedea.reasoner;

import org.semanticweb.owlapi.model.OWLClassExpression;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Implementation of a reasoner for ALC<sub>reg</sub> (and its syntactic variant, PDL) based on a Tableau algorithm.
 * Axioms are expressed as SHACL shapes.
 *
 * <ol>
 *     <li>apply alpha-rules and beta-rules until saturation</li>
 *     <li>apply sigma-rule</li>
 *     <li>verify satisfaction of eventualities</li>
 * </ol>
 */
public class Reasoner {

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
                propagateStatus(e.getNode());

                // TODO check/repair eventualities

                if (t.getRootNode().isConsistent() || t.getRootNode().isInconsistent()) {
                    return;
                }
            }
        }

        t.updateRemainingNodes();
    }

    private static void propagateStatus(TableauNode startNode) {
        Queue<TableauNode> q = new LinkedList<>();
        q.addAll(startNode.getParents());

        while (!q.isEmpty()) {
            TableauNode n = q.poll();

            n.updateStatus();
            q.addAll(n.getParents());
        }
    }

}
