package org.semanticweb.owlapi.model;

import java.util.Set;

public interface OWLObjectAlternativePath extends OWLObjectPropertyPath {

    Set<OWLObjectPropertyExpression> getOperands();

}
