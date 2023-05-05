package org.hypermedea.owlreg;

import org.semanticweb.owlapi.model.*;
import uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyExpressionImpl;

import javax.annotation.Nonnull;
import java.util.Set;

public class OWLObjectPropertyPathImpl extends OWLObjectPropertyExpressionImpl implements OWLObjectPropertyPath {

    @Nonnull
    @Override
    public OWLObjectProperty asOWLObjectProperty() {
        return null;
    }

    @Nonnull
    @Override
    public OWLObjectPropertyExpression getInverseProperty() {
        return null;
    }

    @Nonnull
    @Override
    public OWLObjectProperty getNamedProperty() {
        return null;
    }

    @Override
    public boolean isAnonymous() {
        return false;
    }

    @Override
    public void accept(@Nonnull OWLPropertyExpressionVisitor visitor) {

    }

    @Nonnull
    @Override
    public <O> O accept(@Nonnull OWLPropertyExpressionVisitorEx<O> visitor) {
        return null;
    }

    @Override
    public boolean isOWLTopObjectProperty() {
        return false;
    }

    @Override
    public boolean isOWLBottomObjectProperty() {
        return false;
    }

    @Override
    public boolean isOWLTopDataProperty() {
        return false;
    }

    @Override
    public boolean isOWLBottomDataProperty() {
        return false;
    }

    @Override
    protected int index() {
        return 0;
    }

    @Override
    protected int compareObjectOfSameType(@Nonnull OWLObject object) {
        return 0;
    }

    @Override
    public void accept(@Nonnull OWLObjectVisitor visitor) {

    }

    @Nonnull
    @Override
    public <O> O accept(@Nonnull OWLObjectVisitorEx<O> visitor) {
        return null;
    }

    @Override
    public void addSignatureEntitiesToSet(@Nonnull Set<OWLEntity> entities) {

    }

    @Override
    public void addAnonymousIndividualsToSet(@Nonnull Set<OWLAnonymousIndividual> anons) {

    }

}
