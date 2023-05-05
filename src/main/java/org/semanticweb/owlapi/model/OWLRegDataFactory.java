package org.semanticweb.owlapi.model;

public interface OWLRegDataFactory extends OWLDataFactory {

    OWLObjectAlternativePath getOWLAlternativePath(OWLObjectPropertyExpression... p);

    OWLObjectSequencePath getOWLSequencePath(OWLObjectPropertyExpression... p);

    OWLObjectTestPath getOWLTestPath(OWLClassExpression e);

    OWLObjectZeroOrMorePath getOWLZeroOrMorePath(OWLObjectPropertyExpression p);

}
