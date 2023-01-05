// Generated from Modl.g4 by ANTLR 4.9.2
package org.hypermedea.modl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModlParser}.
 */
public interface ModlListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link ModlParser#singleFormula}.
	 * @param ctx the parse tree
	 */
	void enterSingleFormula(ModlParser.SingleFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#singleFormula}.
	 * @param ctx the parse tree
	 */
	void exitSingleFormula(ModlParser.SingleFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#enclosedFormula}.
	 * @param ctx the parse tree
	 */
	void enterEnclosedFormula(ModlParser.EnclosedFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#enclosedFormula}.
	 * @param ctx the parse tree
	 */
	void exitEnclosedFormula(ModlParser.EnclosedFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModlParser#negatedFormula}.
	 * @param ctx the parse tree
	 */
	void enterNegatedFormula(ModlParser.NegatedFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModlParser#negatedFormula}.
	 * @param ctx the parse tree
	 */
	void exitNegatedFormula(ModlParser.NegatedFormulaContext ctx);
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