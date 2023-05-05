package org.hypermedea.reasoner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

public class ReasonerTest {

    private static final OWLDataFactory DF = OWLManager.getOWLDataFactory();

    private static final OWLClass C = DF.getOWLClass(IRI.create("C"));

    private static final OWLClass D = DF.getOWLClass(IRI.create("D"));

    private static final OWLObjectProperty P = DF.getOWLObjectProperty(IRI.create("p"));

    private static final OWLObjectProperty Q = DF.getOWLObjectProperty(IRI.create("q"));

    @Test
    public void testClass() {
        Tableau t = Reasoner.get().getTableau(C);
        assertTrue(t.getRootNode().isConsistent());
    }

    @Test
    public void testPropositionalContradiction() {
        // not ((C and D) or C)
        OWLClassExpression e = DF.getOWLObjectComplementOf(
                DF.getOWLObjectUnionOf(
                        DF.getOWLObjectIntersectionOf(C, D), C));

        Tableau t = Reasoner.get().getTableau(e);
        assertTrue(t.getRootNode().isConsistent());
    }

    @Test
    public void testSatKExpression() {
        // p some (C or D) and p only not C
        OWLClassExpression e = DF.getOWLObjectIntersectionOf(
                DF.getOWLObjectSomeValuesFrom(P,
                        DF.getOWLObjectUnionOf(C, D)),
                DF.getOWLObjectAllValuesFrom(P,
                        DF.getOWLObjectComplementOf(C)));

        Tableau t = Reasoner.get().getTableau(e);
        assertTrue(t.getRootNode().isConsistent());
    }

    @Test
    public void testUnsatKExpression() {
        // p some (C and D) and p only not C
        OWLClassExpression e = DF.getOWLObjectIntersectionOf(
                DF.getOWLObjectSomeValuesFrom(P,
                        DF.getOWLObjectIntersectionOf(C, D)),
                DF.getOWLObjectAllValuesFrom(P,
                        DF.getOWLObjectComplementOf(C)));

        Tableau t = Reasoner.get().getTableau(e);
        assertTrue(t.getRootNode().isInconsistent());
    }

    @Test
    public void testSatALCExpression() {
        // p some C and p some D and q only not C
        OWLClassExpression e = DF.getOWLObjectIntersectionOf(
                DF.getOWLObjectSomeValuesFrom(P, C),
                DF.getOWLObjectSomeValuesFrom(P, D),
                DF.getOWLObjectAllValuesFrom(Q,
                        DF.getOWLObjectComplementOf(C)));

        Tableau t = Reasoner.get().getTableau(e);
        assertTrue(t.getRootNode().isConsistent());
    }

    @Test
    public void testUnsatALCExpression() {
        // p some C and q some D and q only not C
        OWLClassExpression e = DF.getOWLObjectIntersectionOf(
                DF.getOWLObjectSomeValuesFrom(P, C),
                DF.getOWLObjectSomeValuesFrom(Q, D),
                DF.getOWLObjectAllValuesFrom(P,
                        DF.getOWLObjectComplementOf(C)));

        Tableau t = Reasoner.get().getTableau(e);
        assertTrue(t.getRootNode().isInconsistent());
    }

}
