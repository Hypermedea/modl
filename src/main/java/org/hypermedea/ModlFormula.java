package org.hypermedea;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.hypermedea.modl.ModlBaseListener;
import org.hypermedea.modl.ModlLexer;
import org.hypermedea.modl.ModlParser;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ModlFormula {

    private static class OWLBuilder extends ModlBaseListener {

        private final OWLDataFactory df = OWLManager.getOWLDataFactory();

        private final Map<String, OWLClassExpression> classes = new HashMap<>();

        private final Set<OWLAxiom> axioms = new HashSet<>();

        @Override
        public void exitEnclosedFormula(ModlParser.EnclosedFormulaContext ctx) {
            String op = ctx.formula().getText();

            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), c);
        }

        @Override
        public void exitProposition(ModlParser.PropositionContext ctx) {
            String id = ctx.ID().getText();
            OWLClass c = df.getOWLClass(IRI.create(id));

            if (ctx.children.size() == 2) classes.put(ctx.getText(), df.getOWLObjectComplementOf(c));
            else classes.put(ctx.getText(), c);
        }

        @Override
        public void exitNegatedFormula(ModlParser.NegatedFormulaContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), df.getOWLObjectComplementOf(c));
        }

        @Override
        public void exitDisjunction(ModlParser.DisjunctionContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            classes.put(ctx.getText(), df.getOWLObjectUnionOf(cleft, cright));
        }

        @Override
        public void exitConjunction(ModlParser.ConjunctionContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            classes.put(ctx.getText(), df.getOWLObjectIntersectionOf(cleft, cright));
        }

        @Override
        public void exitImplication(ModlParser.ImplicationContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            classes.put(ctx.getText(), df.getOWLObjectUnionOf(cright, df.getOWLObjectComplementOf(cleft)));
        }

        @Override
        public void exitEquivalence(ModlParser.EquivalenceContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            classes.put(ctx.getText(), df.getOWLObjectIntersectionOf(
                    df.getOWLObjectUnionOf(cright, df.getOWLObjectComplementOf(cleft)),
                    df.getOWLObjectUnionOf(cleft, df.getOWLObjectComplementOf(cright))));
        }

        @Override
        public void exitAlways(ModlParser.AlwaysContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), df.getOWLObjectAllValuesFrom(DTime.g, c));
        }

        @Override
        public void exitEventually(ModlParser.EventuallyContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), df.getOWLObjectSomeValuesFrom(DTime.g, c));
        }

        @Override
        public void exitNext(ModlParser.NextContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), df.getOWLObjectSomeValuesFrom(DTime.x, c));
        }

        @Override
        public void exitUntil(ModlParser.UntilContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            OWLClass c = df.getOWLClass(IRI.create(ctx.getText()));

            OWLAxiom alpha = df.getOWLSubClassOfAxiom(
                    c,
                    df.getOWLObjectIntersectionOf(
                        df.getOWLObjectSomeValuesFrom(DTime.g, cright),
                        df.getOWLObjectUnionOf(
                                cright,
                                df.getOWLObjectIntersectionOf(
                                    cleft,
                                    df.getOWLObjectSomeValuesFrom(DTime.x, c)))));

            axioms.add(alpha);
            classes.put(ctx.getText(), c);
        }

        @Override
        public void exitRelease(ModlParser.ReleaseContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            OWLClass c = df.getOWLClass(IRI.create(ctx.getText()));

            OWLAxiom alpha = df.getOWLSubClassOfAxiom(
                    c,
                    df.getOWLObjectUnionOf(
                            df.getOWLObjectIntersectionOf(cleft, cright),
                            df.getOWLObjectIntersectionOf(
                                    cright,
                                    df.getOWLObjectSomeValuesFrom(DTime.x, c))));

            axioms.add(alpha);
            classes.put(ctx.getText(), c);
        }

        public OWLClassExpression getOWLExpression(ParseTree ctx) {
            return classes.get(ctx.getText());
        }

        public Set<OWLAxiom> getOWLAxioms() {
            return axioms;
        }

        // TODO use reflection to call enclosedFormula on any context passed as arg:
        // TODO Class.getMethod("enclosedFormula").invoke()

    }

    public static ModlFormula build(InputStream input) throws IOException {
        CharStream in = CharStreams.fromStream(input, Charset.defaultCharset());
        ModlLexer lexer = new ModlLexer(in);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ModlParser parser = new ModlParser(tokens);

        ParseTree ast = parser.formula();

        OWLBuilder builder = new OWLBuilder();
        ParseTreeWalker.DEFAULT.walk(builder, ast);

        return new ModlFormula(ast.getText(), builder.getOWLExpression(ast), builder.getOWLAxioms());
    }

    private final String sourceText;

    private final OWLOntology ontology;

    private ModlFormula(String sourceText, OWLClassExpression owlClass, Set<OWLAxiom> owlAxioms) {
        this.sourceText = sourceText;

        OWLOntologyManager m = OWLManager.createOWLOntologyManager();
        OWLDataFactory df = OWLManager.getOWLDataFactory();

        try {
            this.ontology = m.createOntology();

            OWLNamedIndividual i = df.getOWLNamedIndividual(IRI.create("start"));
            OWLAxiom alpha = df.getOWLClassAssertionAxiom(owlClass, i);
            m.addAxiom(this.ontology, alpha);

            m.addAxioms(this.ontology, owlAxioms);
        } catch (OWLOntologyCreationException e) {
            throw new RuntimeException(e);
        }
    }

    public String getSource() {
        return sourceText;
    }

    public OWLOntology getOWLAxioms() {
        return ontology;
    }

}
