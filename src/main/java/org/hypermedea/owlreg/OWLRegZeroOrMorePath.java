package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLPropertyExpression;

public interface OWLRegZeroOrMorePath extends OWLRegPropertyPath {

    OWLObjectPropertyExpression getFiller();

}
