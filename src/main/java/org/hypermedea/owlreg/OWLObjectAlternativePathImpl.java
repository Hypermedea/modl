package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.*;

import java.util.Set;

public class OWLObjectAlternativePathImpl extends OWLObjectPropertyPathImpl implements OWLObjectAlternativePath {

    private final Set<OWLObjectPropertyExpression> operands;

    public OWLObjectAlternativePathImpl(OWLObjectPropertyExpression... p) {
        operands = Set.of(p);
    }

    @Override
    public Set<OWLObjectPropertyExpression> getOperands() {
        return operands;
    }

}
