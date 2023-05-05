package org.semanticweb.owlapi.model;

import java.util.List;

public interface OWLObjectSequencePath extends OWLObjectPropertyPath {

    List<OWLObjectPropertyExpression> getOrderedOperands();

}
