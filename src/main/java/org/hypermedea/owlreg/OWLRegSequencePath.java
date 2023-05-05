package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLPropertyExpression;

import java.util.List;

public interface OWLRegSequencePath extends OWLRegPropertyPath {

    List<OWLObjectPropertyExpression> getOrderedOperands();

}
