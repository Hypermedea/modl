// Generated from Modl.g4 by ANTLR 4.9.2
package org.hypermedea.modl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModlParser}.
 */
public interface ModlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModlParser#formulae}.
	 * @param ctx the parse tree
	 */
	void enterFormulae(ModlParser.FormulaeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#formulae}.
	 * @param ctx the parse tree
	 */
	void exitFormulae(ModlParser.FormulaeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(ModlParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(ModlParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#proposition}.
	 * @param ctx the parse tree
	 */
	void enterProposition(ModlParser.PropositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#proposition}.
	 * @param ctx the parse tree
	 */
	void exitProposition(ModlParser.PropositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#booleanFormula}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFormula(ModlParser.BooleanFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#booleanFormula}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFormula(ModlParser.BooleanFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#unaryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void enterUnaryBooleanFormula(ModlParser.UnaryBooleanFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#unaryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void exitUnaryBooleanFormula(ModlParser.UnaryBooleanFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(ModlParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(ModlParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#enclosedBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedBooleanFormula(ModlParser.EnclosedBooleanFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#enclosedBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedBooleanFormula(ModlParser.EnclosedBooleanFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#nAryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void enterNAryBooleanFormula(ModlParser.NAryBooleanFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#nAryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void exitNAryBooleanFormula(ModlParser.NAryBooleanFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#binaryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void enterBinaryBooleanFormula(ModlParser.BinaryBooleanFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#binaryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void exitBinaryBooleanFormula(ModlParser.BinaryBooleanFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#otherNAryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void enterOtherNAryBooleanFormula(ModlParser.OtherNAryBooleanFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#otherNAryBooleanFormula}.
	 * @param ctx the parse tree
	 */
	void exitOtherNAryBooleanFormula(ModlParser.OtherNAryBooleanFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(ModlParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(ModlParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#equivalence}.
	 * @param ctx the parse tree
	 */
	void enterEquivalence(ModlParser.EquivalenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#equivalence}.
	 * @param ctx the parse tree
	 */
	void exitEquivalence(ModlParser.EquivalenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(ModlParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(ModlParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(ModlParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(ModlParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#disjointUnionFormula}.
	 * @param ctx the parse tree
	 */
	void enterDisjointUnionFormula(ModlParser.DisjointUnionFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#disjointUnionFormula}.
	 * @param ctx the parse tree
	 */
	void exitDisjointUnionFormula(ModlParser.DisjointUnionFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#quantification}.
	 * @param ctx the parse tree
	 */
	void enterQuantification(ModlParser.QuantificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#quantification}.
	 * @param ctx the parse tree
	 */
	void exitQuantification(ModlParser.QuantificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#existentialQuantification}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantification(ModlParser.ExistentialQuantificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#existentialQuantification}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantification(ModlParser.ExistentialQuantificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#universalQuantification}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantification(ModlParser.UniversalQuantificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#universalQuantification}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantification(ModlParser.UniversalQuantificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#temporalFormula}.
	 * @param ctx the parse tree
	 */
	void enterTemporalFormula(ModlParser.TemporalFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#temporalFormula}.
	 * @param ctx the parse tree
	 */
	void exitTemporalFormula(ModlParser.TemporalFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#unaryTemporalFormula}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporalFormula(ModlParser.UnaryTemporalFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#unaryTemporalFormula}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporalFormula(ModlParser.UnaryTemporalFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#always}.
	 * @param ctx the parse tree
	 */
	void enterAlways(ModlParser.AlwaysContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#always}.
	 * @param ctx the parse tree
	 */
	void exitAlways(ModlParser.AlwaysContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#eventually}.
	 * @param ctx the parse tree
	 */
	void enterEventually(ModlParser.EventuallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#eventually}.
	 * @param ctx the parse tree
	 */
	void exitEventually(ModlParser.EventuallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(ModlParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(ModlParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#enclosedBinaryTemporalFormula}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedBinaryTemporalFormula(ModlParser.EnclosedBinaryTemporalFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#enclosedBinaryTemporalFormula}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedBinaryTemporalFormula(ModlParser.EnclosedBinaryTemporalFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#binaryTemporalFormula}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTemporalFormula(ModlParser.BinaryTemporalFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#binaryTemporalFormula}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTemporalFormula(ModlParser.BinaryTemporalFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(ModlParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(ModlParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#release}.
	 * @param ctx the parse tree
	 */
	void enterRelease(ModlParser.ReleaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#release}.
	 * @param ctx the parse tree
	 */
	void exitRelease(ModlParser.ReleaseContext ctx);
}