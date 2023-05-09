package org.hypermedea.owlreg;

import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleRenderer;

import javax.annotation.Nonnull;
import java.util.Iterator;

public class OWLRegObjectRenderer implements OWLObjectRenderer {

    private final OWLObjectRenderer baseRenderer = new SimpleRenderer();

    private StringBuilder sb = new StringBuilder();

    @Override
    public void setShortFormProvider(@Nonnull ShortFormProvider shortFormProvider) {
        baseRenderer.setShortFormProvider(shortFormProvider);
    }

    @Nonnull
    @Override
    public String render(@Nonnull OWLObject object) {
        if (object instanceof OWLObjectPropertyPath) {
            reset();

            if (object instanceof OWLObjectAlternativePath) renderInBuffer((OWLObjectAlternativePath) object);
            if (object instanceof OWLObjectSequencePath) renderInBuffer((OWLObjectSequencePath) object);
            if (object instanceof OWLObjectTestPath) renderInBuffer((OWLObjectTestPath) object);
            if (object instanceof OWLObjectZeroOrMorePath) renderInBuffer((OWLObjectZeroOrMorePath) object);

            return sb.toString();
        } else {
            return baseRenderer.render(object);
        }
    }

    public void reset() {
        sb = new StringBuilder();
    }

    private void renderInBuffer(OWLObjectAlternativePath p) {
        Iterator<OWLObjectPropertyExpression> it = p.getOperands().iterator();

        sb.append("ObjectAlternativePath(");
        while (it.hasNext()) {
            sb.append(this.render(it.next()));
            sb.append(it.hasNext() ? "," : ")");
        }
    }

    private void renderInBuffer(OWLObjectSequencePath p) {
        Iterator<OWLObjectPropertyExpression> it = p.getOrderedOperands().iterator();

        sb.append("ObjectSequencePath(");
        while (it.hasNext()) {
            sb.append(this.render(it.next()));
            sb.append(it.hasNext() ? "," : ")");
        }
    }

    private void renderInBuffer(OWLObjectTestPath p) {
        sb.append("ObjectTestPath(");
        sb.append(render(p.getFiller()));
        sb.append(")");
    }

    private void renderInBuffer(OWLObjectZeroOrMorePath p) {
        sb.append("ObjectZeroOrMorePath(");
        sb.append(render(p.getFiller()));
        sb.append(")");
    }

}
