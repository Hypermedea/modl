package org.hypermedea;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectProperty;

public class DTime {

    private static final OWLDataFactory df = OWLManager.getOWLDataFactory();

    public static final String NS = "http://example.org/";

    public static final OWLObjectProperty g = df.getOWLObjectProperty(IRI.create(NS + "g"));

    public static final OWLObjectProperty x = df.getOWLObjectProperty(IRI.create(NS + "x"));

}
