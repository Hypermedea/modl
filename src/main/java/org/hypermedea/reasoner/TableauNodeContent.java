package org.hypermedea.reasoner;

import org.hypermedea.owlreg.OWLRegAlternativePath;
import org.hypermedea.owlreg.OWLRegSequencePath;
import org.hypermedea.owlreg.OWLRegTestPath;
import org.hypermedea.owlreg.OWLRegZeroOrMorePath;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLClassExpressionVisitorAdapter;

import java.util.*;

public class TableauNodeContent {

    private class TableauNodeVisitor extends OWLClassExpressionVisitorAdapter {

        @Override
        public void visit(OWLClass c) {
            OWLObjectComplementOf neg = DF.getOWLObjectComplementOf(c);
            if (atomicExpressions.contains(neg)) {
                throw new InconsistentContentException();
            } else {
                atomicExpressions.add(c);
            }
        }

        @Override
        public void visit(OWLObjectComplementOf e) {
            if (!e.isClassExpressionLiteral()) {
                throw new RuntimeException("The input expression should be in negation normal form");
            } else if (atomicExpressions.contains(e.getOperand())) {
                throw new InconsistentContentException();
            } else {
                atomicExpressions.add(e);
            }
        }

        @Override
        public void visit(OWLObjectIntersectionOf e) {
            alphaExpressions.add(e);
            operands.put(e, e.getOperands());
        }

        @Override
        public void visit(OWLObjectUnionOf e) {
            betaExpressions.add(e);
            operands.put(e, e.getOperands());
        }

        @Override
        public void visit(OWLObjectSomeValuesFrom e) {
            OWLObjectPropertyExpression p = e.getProperty();

            if (p instanceof OWLObjectProperty) {
                existentialExpressions.add(e);
                operands.put(e, Set.of(e.getFiller()));
            } else if (p instanceof OWLRegAlternativePath) {
                betaExpressions.add(e);
                operands.put(e, getOperands((OWLRegAlternativePath) p, e));
            } else if (p instanceof OWLRegSequencePath) {
                alphaExpressions.add(e);
                operands.put(e, getOperands((OWLRegSequencePath) p, e));
            } else if (p instanceof OWLRegTestPath) {
                alphaExpressions.add(e);
                operands.put(e, getOperands((OWLRegTestPath) p, e));
            } else if (p instanceof OWLRegZeroOrMorePath) {
                betaExpressions.add(e);
                operands.put(e, getOperands((OWLRegZeroOrMorePath) p, e));
            }
        }

        @Override
        public void visit(OWLObjectAllValuesFrom e) {
            OWLObjectPropertyExpression p = e.getProperty();

            if (p instanceof OWLObjectProperty) {
                universalExpressions.add(e);
                operands.put(e, Set.of(e.getFiller()));
            } else if (p instanceof OWLRegAlternativePath) {
                alphaExpressions.add(e);
                operands.put(e, getOperands((OWLRegAlternativePath) p, e));
            } else if (p instanceof OWLRegSequencePath) {
                alphaExpressions.add(e);
                operands.put(e, getOperands((OWLRegSequencePath) p, e));
            } else if (p instanceof OWLRegTestPath) {
                betaExpressions.add(e);
                operands.put(e, getOperands((OWLRegTestPath) p, e));
            } else if (p instanceof OWLRegZeroOrMorePath) {
                alphaExpressions.add(e);
                operands.put(e, getOperands((OWLRegZeroOrMorePath) p, e));
            }
        }

        private Set<OWLClassExpression> getOperands(OWLRegAlternativePath p, OWLObjectSomeValuesFrom e) {
            Set<OWLClassExpression> operands = new HashSet<>();

            for (OWLObjectPropertyExpression pe : p.getOperands()) {
                operands.add(DF.getOWLObjectSomeValuesFrom(pe, e.getFiller()));
            }

            return operands;
        }

        private Set<OWLClassExpression> getOperands(OWLRegSequencePath p, OWLObjectSomeValuesFrom e) {
            ListIterator<OWLObjectPropertyExpression> it = p.getOrderedOperands().listIterator();
            OWLClassExpression other = e.getFiller();

            while (it.hasPrevious()) {
                other = DF.getOWLObjectSomeValuesFrom(it.previous(), other);
            }

            return Set.of(other);
        }

        private Set<OWLClassExpression> getOperands(OWLRegTestPath p, OWLObjectSomeValuesFrom e) {
            return Set.of(e.getFiller(), p.getFiller());
        }

        private Set<OWLClassExpression> getOperands(OWLRegZeroOrMorePath p, OWLObjectSomeValuesFrom e) {
            OWLClassExpression other = DF.getOWLObjectSomeValuesFrom(p.getFiller(), e);
            return Set.of(e.getFiller(), other);
        }

        private Set<OWLClassExpression> getOperands(OWLRegAlternativePath p, OWLObjectAllValuesFrom e) {
            Set<OWLClassExpression> operands = new HashSet<>();

            for (OWLObjectPropertyExpression pe : p.getOperands()) {
                operands.add(DF.getOWLObjectAllValuesFrom(pe, e.getFiller()));
            }

            return operands;
        }

        private Set<OWLClassExpression> getOperands(OWLRegSequencePath p, OWLObjectAllValuesFrom e) {
            ListIterator<OWLObjectPropertyExpression> it = p.getOrderedOperands().listIterator();
            OWLClassExpression other = e.getFiller();

            while (it.hasPrevious()) {
                other = DF.getOWLObjectAllValuesFrom(it.previous(), other);
            }

            return Set.of(other);
        }

        private Set<OWLClassExpression> getOperands(OWLRegTestPath p, OWLObjectAllValuesFrom e) {
            OWLClassExpression other = DF.getOWLObjectComplementOf(p.getFiller()).getNNF();
            return Set.of(e.getFiller(), other);
        }

        private Set<OWLClassExpression> getOperands(OWLRegZeroOrMorePath p, OWLObjectAllValuesFrom e) {
            OWLClassExpression other = DF.getOWLObjectAllValuesFrom(p.getFiller(), e);
            return Set.of(e.getFiller(), other);
        }

    }

    private final static OWLDataFactory DF = OWLManager.getOWLDataFactory();

    private Boolean holdsContradiction = false;

    private final Set<OWLClassExpression> atomicExpressions = new HashSet<>();

    private final Set<OWLClassExpression> alphaExpressions = new HashSet<>();

    private final Set<OWLClassExpression> betaExpressions = new HashSet<>();

    private final Set<OWLObjectSomeValuesFrom> existentialExpressions = new HashSet<>();

    private final Set<OWLObjectAllValuesFrom> universalExpressions = new HashSet<>();

    private final Map<OWLClassExpression, Set<OWLClassExpression>> operands = new HashMap<>();

    public TableauNodeContent(Set<OWLClassExpression> additions) {
        try {
            for (OWLClassExpression e : additions) e.accept(new TableauNodeVisitor());
        } catch (InconsistentContentException e) {
            holdsContradiction = true;
        }
    }

    public TableauNodeContent(TableauNodeContent other, Set<OWLClassExpression> additions, Set<OWLClassExpression> deletions) {
        atomicExpressions.addAll(other.atomicExpressions);
        alphaExpressions.addAll(other.alphaExpressions);
        betaExpressions.addAll(other.betaExpressions);
        existentialExpressions.addAll(other.existentialExpressions);
        universalExpressions.addAll(other.universalExpressions);
        operands.putAll(other.operands);

        atomicExpressions.removeAll(deletions);
        alphaExpressions.removeAll(deletions);
        betaExpressions.removeAll(deletions);
        existentialExpressions.removeAll(deletions);
        universalExpressions.removeAll(deletions);
        // TODO remove operands (only saves space)

        try {
            for (OWLClassExpression e : additions) e.accept(new TableauNodeVisitor());
        } catch (InconsistentContentException e) {
            holdsContradiction = true;
        }
    }

    public boolean holdsContradiction() {
        return holdsContradiction;
    }

    public Set<OWLClassExpression> getAtomicExpressions() {
        return atomicExpressions;
    }

    public Set<OWLClassExpression> getAlphaExpressions() {
        return alphaExpressions;
    }

    public Set<OWLClassExpression> getBetaExpressions() {
        return betaExpressions;
    }

    public Set<OWLObjectSomeValuesFrom> getExistentialExpressions() {
        return existentialExpressions;
    }

    public Set<OWLObjectAllValuesFrom> getUniversalExpressions() {
        return universalExpressions;
    }

    public Set<OWLClassExpression> getOperands(OWLClassExpression e) {
        return operands.get(e);
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