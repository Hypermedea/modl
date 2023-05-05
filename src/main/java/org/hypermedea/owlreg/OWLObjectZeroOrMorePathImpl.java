package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectZeroOrMorePath;

public class OWLObjectZeroOrMorePathImpl extends OWLObjectPropertyPathImpl implements OWLObjectZeroOrMorePath {

    private final OWLObjectPropertyExpression expression;

    public OWLObjectZeroOrMorePathImpl(OWLObjectPropertyExpression p) {
        expression = p;
    }

    @Override
    public OWLObjectPropertyExpression getFiller() {
        return expression;
    }

}
