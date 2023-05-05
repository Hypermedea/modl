package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLPropertyExpression;

import java.util.Set;

public interface OWLRegAlternativePath extends OWLRegPropertyPath {

    Set<OWLObjectPropertyExpression> getOperands();

}
