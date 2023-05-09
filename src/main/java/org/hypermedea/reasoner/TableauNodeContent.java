package org.hypermedea.reasoner;

import org.semanticweb.owlapi.model.OWLObjectAlternativePath;
import org.semanticweb.owlapi.model.OWLObjectSequencePath;
import org.semanticweb.owlapi.model.OWLObjectTestPath;
import org.semanticweb.owlapi.model.OWLObjectZeroOrMorePath;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLClassExpressionVisitorAdapter;

import java.util.*;

public class TableauNodeContent {

    private class TableauNodeVisitor extends OWLClassExpressionVisitorAdapter {

        @Override
        public void visit(OWLClass c) {
            OWLObjectComplementOf neg = DF.getOWLObjectComplementOf(c);

            if (atomicExpressions.contains(neg)) holdsContradiction = true;
            atomicExpressions.add(c);
        }

        @Override
        public void visit(OWLObjectComplementOf e) {
            if (!e.isClassExpressionLiteral()) {
                throw new RuntimeException("The input expression should be in negation normal form");
            }

            atomicExpressions.add(e);
            if (atomicExpressions.contains(e.getOperand())) holdsContradiction = true;
        }

        @Override
        public void visit(OWLObjectIntersectionOf e) {
            alphaExpressions.add(e);
        }

        @Override
        public void visit(OWLObjectUnionOf e) {
            betaExpressions.add(e);
        }

        @Override
        public void visit(OWLObjectSomeValuesFrom e) {
            OWLObjectPropertyExpression p = e.getProperty();

            if (p instanceof OWLObjectProperty) {
                existentialExpressions.add(e);
            } else if (p instanceof OWLObjectAlternativePath) {
                betaExpressions.add(DF.getOWLObjectUnionOf(getOperands((OWLObjectAlternativePath) p, e)));
            } else if (p instanceof OWLObjectSequencePath) {
                alphaExpressions.add(DF.getOWLObjectIntersectionOf(getOperands((OWLObjectSequencePath) p, e)));
            } else if (p instanceof OWLObjectTestPath) {
                alphaExpressions.add(DF.getOWLObjectIntersectionOf(getOperands((OWLObjectTestPath) p, e)));
            } else if (p instanceof OWLObjectZeroOrMorePath) {
                OWLObjectUnionOf other = DF.getOWLObjectUnionOf(getOperands((OWLObjectZeroOrMorePath) p, e));
                betaExpressions.add(other);
                eventualities.put(other, e.getFiller());
            }
        }

        @Override
        public void visit(OWLObjectAllValuesFrom e) {
            OWLObjectPropertyExpression p = e.getProperty();

            if (p instanceof OWLObjectProperty) {
                universalExpressions.add(e);
            } else if (p instanceof OWLObjectAlternativePath) {
                alphaExpressions.add(DF.getOWLObjectIntersectionOf(getOperands((OWLObjectAlternativePath) p, e)));
            } else if (p instanceof OWLObjectSequencePath) {
                alphaExpressions.add(DF.getOWLObjectIntersectionOf(getOperands((OWLObjectSequencePath) p, e)));
            } else if (p instanceof OWLObjectTestPath) {
                betaExpressions.add(DF.getOWLObjectUnionOf(getOperands((OWLObjectTestPath) p, e)));
            } else if (p instanceof OWLObjectZeroOrMorePath) {
                alphaExpressions.add(DF.getOWLObjectIntersectionOf(getOperands((OWLObjectZeroOrMorePath) p, e)));
            }
        }

        private Set<OWLClassExpression> getOperands(OWLObjectAlternativePath p, OWLObjectSomeValuesFrom e) {
            Set<OWLClassExpression> operands = new HashSet<>();

            for (OWLObjectPropertyExpression pe : p.getOperands()) {
                operands.add(DF.getOWLObjectSomeValuesFrom(pe, e.getFiller()));
            }

            return operands;
        }

        private Set<OWLClassExpression> getOperands(OWLObjectSequencePath p, OWLObjectSomeValuesFrom e) {
            ListIterator<OWLObjectPropertyExpression> it = p.getOrderedOperands().listIterator();
            OWLClassExpression other = e.getFiller();

            while (it.hasPrevious()) {
                other = DF.getOWLObjectSomeValuesFrom(it.previous(), other);
            }

            return Set.of(other);
        }

        private Set<OWLClassExpression> getOperands(OWLObjectTestPath p, OWLObjectSomeValuesFrom e) {
            return Set.of(e.getFiller(), p.getFiller());
        }

        private Set<OWLClassExpression> getOperands(OWLObjectZeroOrMorePath p, OWLObjectSomeValuesFrom e) {
            OWLClassExpression other = DF.getOWLObjectSomeValuesFrom(p.getFiller(), e);
            return Set.of(e.getFiller(), other);
        }

        private Set<OWLClassExpression> getOperands(OWLObjectAlternativePath p, OWLObjectAllValuesFrom e) {
            Set<OWLClassExpression> operands = new HashSet<>();

            for (OWLObjectPropertyExpression pe : p.getOperands()) {
                operands.add(DF.getOWLObjectAllValuesFrom(pe, e.getFiller()));
            }

            return operands;
        }

        private Set<OWLClassExpression> getOperands(OWLObjectSequencePath p, OWLObjectAllValuesFrom e) {
            ListIterator<OWLObjectPropertyExpression> it = p.getOrderedOperands().listIterator();
            OWLClassExpression other = e.getFiller();

            while (it.hasPrevious()) {
                other = DF.getOWLObjectAllValuesFrom(it.previous(), other);
            }

            return Set.of(other);
        }

        private Set<OWLClassExpression> getOperands(OWLObjectTestPath p, OWLObjectAllValuesFrom e) {
            OWLClassExpression other = DF.getOWLObjectComplementOf(p.getFiller()).getNNF();
            return Set.of(e.getFiller(), other);
        }

        private Set<OWLClassExpression> getOperands(OWLObjectZeroOrMorePath p, OWLObjectAllValuesFrom e) {
            OWLClassExpression other = DF.getOWLObjectAllValuesFrom(p.getFiller(), e);
            return Set.of(e.getFiller(), other);
        }

    }

    private final static OWLDataFactory DF = OWLManager.getOWLDataFactory();

    private Boolean holdsContradiction = false;

    private final Set<OWLClassExpression> atomicExpressions = new HashSet<>();

    private final Set<OWLObjectIntersectionOf> alphaExpressions = new HashSet<>();

    private final Set<OWLObjectUnionOf> betaExpressions = new HashSet<>();

    private final Set<OWLObjectSomeValuesFrom> existentialExpressions = new HashSet<>();

    private final Set<OWLObjectAllValuesFrom> universalExpressions = new HashSet<>();

    private final Map<OWLClassExpression, OWLClassExpression> eventualities = new HashMap<>();

    public TableauNodeContent(Set<OWLClassExpression> additions) {
        for (OWLClassExpression e : additions) e.accept(new TableauNodeVisitor());
    }

    public TableauNodeContent(TableauNodeContent other, Set<OWLClassExpression> additions, Set<OWLClassExpression> deletions) {
        atomicExpressions.addAll(other.atomicExpressions);
        alphaExpressions.addAll(other.alphaExpressions);
        betaExpressions.addAll(other.betaExpressions);
        existentialExpressions.addAll(other.existentialExpressions);
        universalExpressions.addAll(other.universalExpressions);
        eventualities.putAll(other.eventualities);

        atomicExpressions.removeAll(deletions);
        alphaExpressions.removeAll(deletions);
        betaExpressions.removeAll(deletions);
        existentialExpressions.removeAll(deletions);
        universalExpressions.removeAll(deletions);
        deletions.forEach(e -> eventualities.remove(e));
        // TODO remove operands (only saves space)

        for (OWLClassExpression e : additions) e.accept(new TableauNodeVisitor());
    }

    public boolean holdsContradiction() {
        return holdsContradiction;
    }

    public Set<OWLClassExpression> getAtomicExpressions() {
        return atomicExpressions;
    }

    public Set<OWLObjectIntersectionOf> getAlphaExpressions() {
        return alphaExpressions;
    }

    public Set<OWLObjectUnionOf> getBetaExpressions() {
        return betaExpressions;
    }

    public Set<OWLObjectSomeValuesFrom> getExistentialExpressions() {
        return existentialExpressions;
    }

    public Set<OWLObjectAllValuesFrom> getUniversalExpressions() {
        return universalExpressions;
    }

    public boolean hasEventuality(OWLClassExpression e) {
        return eventualities.containsKey(e);
    }

    public OWLClassExpression getEventualityTarget(OWLClassExpression e) {
        return eventualities.get(e);
    }

    public boolean contains(OWLClassExpression e) {
        return atomicExpressions.contains(e)
                || alphaExpressions.contains(e)
                || betaExpressions.contains(e)
                || existentialExpressions.contains(e)
                || universalExpressions.contains(e);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableauNodeContent) {
            TableauNodeContent cnt = (TableauNodeContent) obj;

            return atomicExpressions.equals(cnt.atomicExpressions)
                    && alphaExpressions.equals(cnt.alphaExpressions)
                    && betaExpressions.equals(cnt.betaExpressions)
                    && existentialExpressions.equals(cnt.existentialExpressions)
                    && universalExpressions.equals(cnt.universalExpressions);
        } else {
            return false;
        }
    }

}
