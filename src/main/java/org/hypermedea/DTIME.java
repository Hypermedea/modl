package org.hypermedea;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import java.util.HashSet;
import java.util.Set;

public class DTIME {

    private static final OWLDataFactory df = OWLManager.getOWLDataFactory();

    public static final String NS = "http://example.org/";

    public static final Set<OWLAxiom> AXIOMS = new HashSet<>();

    public static final OWLClass Instant = df.getOWLClass(IRI.create(NS + "Instant"));

    public static final OWLObjectProperty g = df.getOWLObjectProperty(IRI.create(NS + "g"));

    public static final OWLObjectProperty x = df.getOWLObjectProperty(IRI.create(NS + "x"));

    static {
        AXIOMS.add(df.getOWLSubObjectPropertyOfAxiom(x, g));
        AXIOMS.add(df.getOWLReflexiveObjectPropertyAxiom(g));
        AXIOMS.add(df.getOWLTransitiveObjectPropertyAxiom(g));

        AXIOMS.add(df.getOWLSubClassOfAxiom(Instant, df.getOWLObjectSomeValuesFrom(x, Instant)));
        AXIOMS.add(df.getOWLObjectPropertyDomainAxiom(g, Instant));
        AXIOMS.add(df.getOWLObjectPropertyRangeAxiom(g, Instant));

        // TODO register DTIME prefix?
    }

}
