package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLObjectTestPath;

public class OWLObjectTestPathImpl extends OWLObjectPropertyPathImpl implements OWLObjectTestPath {

    private final OWLClassExpression expression;

    public OWLObjectTestPathImpl(OWLClassExpression e) {
        expression = e;
    }

    @Override
    public OWLClassExpression getFiller() {
        return expression;
    }

}
