package org.hypermedea;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.hypermedea.modl.ModlBaseListener;
import org.hypermedea.modl.ModlLexer;
import org.hypermedea.modl.ModlParser;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ModlFormula {

    private static class OWLBuilder extends ModlBaseListener {

        private final Logger logger = LoggerFactory.getLogger(OWLBuilder.class);

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
        public void exitExistentialQuantification(ModlParser.ExistentialQuantificationContext ctx) {
            String op = ctx.temporalFormula().getText();

            // TODO add quantification
            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), c);
        }

        @Override
        public void exitUniversalQuantification(ModlParser.UniversalQuantificationContext ctx) {
            String op = ctx.temporalFormula().getText();

            // TODO add quantification
            OWLClassExpression c = classes.get(op);

            classes.put(ctx.getText(), c);
        }

        @Override
        public void exitAlways(ModlParser.AlwaysContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            if (isExistentiallyQuantified(ctx)) {
                OWLClass cfixpoint = df.getOWLClass(IRI.create(ctx.getText()));

                OWLAxiom alpha = df.getOWLSubClassOfAxiom(
                        cfixpoint,
                        df.getOWLObjectIntersectionOf(
                                c,
                                df.getOWLObjectSomeValuesFrom(DTIME.x, cfixpoint)));

                axioms.add(alpha);
                classes.put(ctx.getText(), cfixpoint);
            } else if (isUniversallyQuantified(ctx)) {
                classes.put(ctx.getText(), df.getOWLObjectAllValuesFrom(DTIME.g, c));
            } else {
                logger.warn("Unknown quantification for formula {}", ctx.getText());
            }

            logger.info("Translated {}", ctx.getText());
        }

        @Override
        public void exitEventually(ModlParser.EventuallyContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            if (isExistentiallyQuantified(ctx)) {
                classes.put(ctx.getText(), df.getOWLObjectSomeValuesFrom(DTIME.g, c));
            } else if (isUniversallyQuantified(ctx)) {
                OWLClass cfixpoint = df.getOWLClass(IRI.create(ctx.getText()));

                OWLAxiom alpha = df.getOWLSubClassOfAxiom(
                        cfixpoint,
                        df.getOWLObjectIntersectionOf(
                                df.getOWLObjectSomeValuesFrom(DTIME.g, c),
                                df.getOWLObjectUnionOf(
                                        df.getOWLObjectAllValuesFrom(DTIME.x, cfixpoint),
                                        c)));

                axioms.add(alpha);
                classes.put(ctx.getText(), cfixpoint);
            } else {
                logger.warn("Unknown quantification for formula {}", ctx.getText());
            }

            logger.info("Translated {}", ctx.getText());
        }

        @Override
        public void exitNext(ModlParser.NextContext ctx) {
            String op = ctx.singleFormula().getText();

            OWLClassExpression c = classes.get(op);

            if (isExistentiallyQuantified(ctx)) {
                classes.put(ctx.getText(), df.getOWLObjectSomeValuesFrom(DTIME.x, c));
            } else if (isUniversallyQuantified(ctx)) {
                classes.put(ctx.getText(), df.getOWLObjectAllValuesFrom(DTIME.x, c));
            } else {
                logger.warn("Unknown quantification for formula {}", ctx.getText());
            }

            logger.info("Translated {}", ctx.getText());
        }

        @Override
        public void exitUntil(ModlParser.UntilContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            OWLClass cfixpoint = df.getOWLClass(IRI.create(ctx.getText()));
            OWLClassExpression cx = null;

            if (isExistentiallyQuantified(ctx)) {
                cx = df.getOWLObjectSomeValuesFrom(DTIME.x, cfixpoint);
            } else if (isUniversallyQuantified(ctx)) {
                cx = df.getOWLObjectAllValuesFrom(DTIME.x, cfixpoint);
            } else {
                logger.warn("Unknown quantification for formula {}", ctx.getText());
            }

            if (cx == null) return;

            OWLAxiom alpha = df.getOWLSubClassOfAxiom(
                    cfixpoint,
                    df.getOWLObjectIntersectionOf(
                            df.getOWLObjectSomeValuesFrom(DTIME.g, cright),
                            df.getOWLObjectUnionOf(
                                    cright,
                                    df.getOWLObjectIntersectionOf(cleft, cx))));

            axioms.add(alpha);
            classes.put(ctx.getText(), cfixpoint);

            logger.info("Translated {}", ctx.getText());
        }

        @Override
        public void exitRelease(ModlParser.ReleaseContext ctx) {
            String left = ctx.singleFormula(0).getText();
            String right = ctx.singleFormula(1).getText();

            OWLClassExpression cleft = classes.get(left);
            OWLClassExpression cright = classes.get(right);

            OWLClass cfixpoint = df.getOWLClass(IRI.create(ctx.getText()));
            OWLClassExpression cx = null;

            if (isExistentiallyQuantified(ctx)) {
                cx = df.getOWLObjectSomeValuesFrom(DTIME.x, cfixpoint);
            } else if (isUniversallyQuantified(ctx)) {
                cx = df.getOWLObjectAllValuesFrom(DTIME.x, cfixpoint);
            } else {
                logger.warn("Unknown quantification for formula {}", ctx.getText());
            }

            if (cx == null) return;

            OWLAxiom alpha = df.getOWLSubClassOfAxiom(
                    cfixpoint,
                    df.getOWLObjectUnionOf(
                            df.getOWLObjectIntersectionOf(cleft, cright),
                            df.getOWLObjectIntersectionOf(cright, cx)));

            axioms.add(alpha);
            classes.put(ctx.getText(), cfixpoint);

            logger.info("Translated {}", ctx.getText());
        }

        public OWLClassExpression getOWLExpression(ParseTree ctx) {
            return classes.get(ctx.getText());
        }

        public Set<OWLAxiom> getOWLAxioms() {
            return axioms;
        }

        // TODO use reflection to call enclosedFormula on any context passed as arg:
        // TODO Class.getMethod("enclosedFormula").invoke()

        private Boolean isExistentiallyQuantified(ParserRuleContext ctx) {
            return ctx.getParent().getParent() instanceof ModlParser.ExistentialQuantificationContext;
        }

        private Boolean isUniversallyQuantified(ParserRuleContext ctx) {
            return ctx.getParent().getParent() instanceof ModlParser.UniversalQuantificationContext
                || ctx.getParent().getParent() instanceof ModlParser.FormulaContext; // default
        }

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