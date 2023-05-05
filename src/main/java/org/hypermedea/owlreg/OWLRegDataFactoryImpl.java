package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.*;
import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;

public class OWLRegDataFactoryImpl extends OWLDataFactoryImpl implements OWLRegDataFactory {

    @Override
    public OWLObjectAlternativePath getOWLAlternativePath(OWLObjectPropertyExpression... p) {
        return new OWLObjectAlternativePathImpl(p);
    }

    @Override
    public OWLObjectSequencePath getOWLSequencePath(OWLObjectPropertyExpression... p) {
        return new OWLObjectSequencePathImpl(p);
    }

    @Override
    public OWLObjectTestPath getOWLTestPath(OWLClassExpression e) {
        return new OWLObjectTestPathImpl(e);
    }

    @Override
    public OWLObjectZeroOrMorePath getOWLZeroOrMorePath(OWLObjectPropertyExpression p) {
        return new OWLObjectZeroOrMorePathImpl(p);
    }
}
