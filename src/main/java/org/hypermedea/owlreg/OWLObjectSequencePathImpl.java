package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectSequencePath;

import java.util.List;

public class OWLObjectSequencePathImpl extends OWLObjectPropertyPathImpl implements OWLObjectSequencePath {

    private final List<OWLObjectPropertyExpression> operands;

    public OWLObjectSequencePathImpl(OWLObjectPropertyExpression... p) {
        operands = List.of(p);
    }

    @Override
    public List<OWLObjectPropertyExpression> getOrderedOperands() {
        return operands;
    }

}
