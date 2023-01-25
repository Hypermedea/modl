// Generated from Modl.g4 by ANTLR 4.9.2
package org.hypermedea.modl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, WS=16, CRLF=17;
	public static final int
		RULE_formula = 0, RULE_proposition = 1, RULE_booleanFormula = 2, RULE_unaryBooleanFormula = 3, 
		RULE_negation = 4, RULE_enclosedBinaryBooleanFormula = 5, RULE_binaryBooleanFormula = 6, 
		RULE_conjunction = 7, RULE_disjunction = 8, RULE_implication = 9, RULE_equivalence = 10, 
		RULE_quantification = 11, RULE_existentialQuantification = 12, RULE_universalQuantification = 13, 
		RULE_temporalFormula = 14, RULE_unaryTemporalFormula = 15, RULE_always = 16, 
		RULE_eventually = 17, RULE_next = 18, RULE_enclosedBinaryTemporalFormula = 19, 
		RULE_binaryTemporalFormula = 20, RULE_until = 21, RULE_release = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"formula", "proposition", "booleanFormula", "unaryBooleanFormula", "negation", 
			"enclosedBinaryBooleanFormula", "binaryBooleanFormula", "conjunction", 
			"disjunction", "implication", "equivalence", "quantification", "existentialQuantification", 
			"universalQuantification", "temporalFormula", "unaryTemporalFormula", 
			"always", "eventually", "next", "enclosedBinaryTemporalFormula", "binaryTemporalFormula", 
			"until", "release"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u00AC'", "'('", "')'", "'\u2227'", "'\u2228'", "'\u2192'", "'\u2194'", 
			"'E'", "'A'", "'G'", "'F'", "'X'", "'U'", "'R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "WS", "CRLF"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Modl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FormulaContext extends ParserRuleContext {
		public PropositionContext proposition() {
			return getRuleContext(PropositionContext.class,0);
		}
		public BooleanFormulaContext booleanFormula() {
			return getRuleContext(BooleanFormulaContext.class,0);
		}
		public TemporalFormulaContext temporalFormula() {
			return getRuleContext(TemporalFormulaContext.class,0);
		}
		public QuantificationContext quantification() {
			return getRuleContext(QuantificationContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				proposition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				booleanFormula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				temporalFormula();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				quantification();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropositionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ModlParser.ID, 0); }
		public PropositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterProposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitProposition(this);
		}
	}

	public final PropositionContext proposition() throws RecognitionException {
		PropositionContext _localctx = new PropositionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanFormulaContext extends ParserRuleContext {
		public UnaryBooleanFormulaContext unaryBooleanFormula() {
			return getRuleContext(UnaryBooleanFormulaContext.class,0);
		}
		public EnclosedBinaryBooleanFormulaContext enclosedBinaryBooleanFormula() {
			return getRuleContext(EnclosedBinaryBooleanFormulaContext.class,0);
		}
		public BooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitBooleanFormula(this);
		}
	}

	public final BooleanFormulaContext booleanFormula() throws RecognitionException {
		BooleanFormulaContext _localctx = new BooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanFormula);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				unaryBooleanFormula();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				enclosedBinaryBooleanFormula();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryBooleanFormulaContext extends ParserRuleContext {
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public UnaryBooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryBooleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterUnaryBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitUnaryBooleanFormula(this);
		}
	}

	public final UnaryBooleanFormulaContext unaryBooleanFormula() throws RecognitionException {
		UnaryBooleanFormulaContext _localctx = new UnaryBooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryBooleanFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			negation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedBinaryBooleanFormulaContext extends ParserRuleContext {
		public BinaryBooleanFormulaContext binaryBooleanFormula() {
			return getRuleContext(BinaryBooleanFormulaContext.class,0);
		}
		public EnclosedBinaryBooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedBinaryBooleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterEnclosedBinaryBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitEnclosedBinaryBooleanFormula(this);
		}
	}

	public final EnclosedBinaryBooleanFormulaContext enclosedBinaryBooleanFormula() throws RecognitionException {
		EnclosedBinaryBooleanFormulaContext _localctx = new EnclosedBinaryBooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enclosedBinaryBooleanFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			binaryBooleanFormula();
			setState(67);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryBooleanFormulaContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public EquivalenceContext equivalence() {
			return getRuleContext(EquivalenceContext.class,0);
		}
		public BinaryBooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryBooleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterBinaryBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitBinaryBooleanFormula(this);
		}
	}

	public final BinaryBooleanFormulaContext binaryBooleanFormula() throws RecognitionException {
		BinaryBooleanFormulaContext _localctx = new BinaryBooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binaryBooleanFormula);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				disjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				implication();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				equivalence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			formula();
			setState(77);
			match(T__3);
			setState(78);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_disjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			formula();
			setState(81);
			match(T__4);
			setState(82);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicationContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitImplication(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			formula();
			setState(85);
			match(T__5);
			setState(86);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquivalenceContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public EquivalenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterEquivalence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitEquivalence(this);
		}
	}

	public final EquivalenceContext equivalence() throws RecognitionException {
		EquivalenceContext _localctx = new EquivalenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equivalence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			formula();
			setState(89);
			match(T__6);
			setState(90);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantificationContext extends ParserRuleContext {
		public ExistentialQuantificationContext existentialQuantification() {
			return getRuleContext(ExistentialQuantificationContext.class,0);
		}
		public UniversalQuantificationContext universalQuantification() {
			return getRuleContext(UniversalQuantificationContext.class,0);
		}
		public QuantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterQuantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitQuantification(this);
		}
	}

	public final QuantificationContext quantification() throws RecognitionException {
		QuantificationContext _localctx = new QuantificationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantification);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				existentialQuantification();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				universalQuantification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistentialQuantificationContext extends ParserRuleContext {
		public TemporalFormulaContext temporalFormula() {
			return getRuleContext(TemporalFormulaContext.class,0);
		}
		public ExistentialQuantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialQuantification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterExistentialQuantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitExistentialQuantification(this);
		}
	}

	public final ExistentialQuantificationContext existentialQuantification() throws RecognitionException {
		ExistentialQuantificationContext _localctx = new ExistentialQuantificationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_existentialQuantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__7);
			setState(98);
			temporalFormula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniversalQuantificationContext extends ParserRuleContext {
		public TemporalFormulaContext temporalFormula() {
			return getRuleContext(TemporalFormulaContext.class,0);
		}
		public UniversalQuantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalQuantification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterUniversalQuantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitUniversalQuantification(this);
		}
	}

	public final UniversalQuantificationContext universalQuantification() throws RecognitionException {
		UniversalQuantificationContext _localctx = new UniversalQuantificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_universalQuantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__8);
			setState(101);
			temporalFormula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemporalFormulaContext extends ParserRuleContext {
		public UnaryTemporalFormulaContext unaryTemporalFormula() {
			return getRuleContext(UnaryTemporalFormulaContext.class,0);
		}
		public EnclosedBinaryTemporalFormulaContext enclosedBinaryTemporalFormula() {
			return getRuleContext(EnclosedBinaryTemporalFormulaContext.class,0);
		}
		public TemporalFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterTemporalFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitTemporalFormula(this);
		}
	}

	public final TemporalFormulaContext temporalFormula() throws RecognitionException {
		TemporalFormulaContext _localctx = new TemporalFormulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_temporalFormula);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				unaryTemporalFormula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				enclosedBinaryTemporalFormula();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryTemporalFormulaContext extends ParserRuleContext {
		public AlwaysContext always() {
			return getRuleContext(AlwaysContext.class,0);
		}
		public EventuallyContext eventually() {
			return getRuleContext(EventuallyContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public UnaryTemporalFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTemporalFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterUnaryTemporalFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitUnaryTemporalFormula(this);
		}
	}

	public final UnaryTemporalFormulaContext unaryTemporalFormula() throws RecognitionException {
		UnaryTemporalFormulaContext _localctx = new UnaryTemporalFormulaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryTemporalFormula);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				always();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				eventually();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				next();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlwaysContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public AlwaysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_always; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterAlways(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitAlways(this);
		}
	}

	public final AlwaysContext always() throws RecognitionException {
		AlwaysContext _localctx = new AlwaysContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_always);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__9);
			setState(115);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventuallyContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public EventuallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventually; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterEventually(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitEventually(this);
		}
	}

	public final EventuallyContext eventually() throws RecognitionException {
		EventuallyContext _localctx = new EventuallyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eventually);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__10);
			setState(118);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NextContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitNext(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__11);
			setState(121);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedBinaryTemporalFormulaContext extends ParserRuleContext {
		public BinaryTemporalFormulaContext binaryTemporalFormula() {
			return getRuleContext(BinaryTemporalFormulaContext.class,0);
		}
		public EnclosedBinaryTemporalFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedBinaryTemporalFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterEnclosedBinaryTemporalFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitEnclosedBinaryTemporalFormula(this);
		}
	}

	public final EnclosedBinaryTemporalFormulaContext enclosedBinaryTemporalFormula() throws RecognitionException {
		EnclosedBinaryTemporalFormulaContext _localctx = new EnclosedBinaryTemporalFormulaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enclosedBinaryTemporalFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__1);
			setState(124);
			binaryTemporalFormula();
			setState(125);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryTemporalFormulaContext extends ParserRuleContext {
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public ReleaseContext release() {
			return getRuleContext(ReleaseContext.class,0);
		}
		public BinaryTemporalFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTemporalFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterBinaryTemporalFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitBinaryTemporalFormula(this);
		}
	}

	public final BinaryTemporalFormulaContext binaryTemporalFormula() throws RecognitionException {
		BinaryTemporalFormulaContext _localctx = new BinaryTemporalFormulaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryTemporalFormula);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				until();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				release();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UntilContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitUntil(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			formula();
			setState(133);
			match(T__12);
			setState(134);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReleaseContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ReleaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterRelease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitRelease(this);
		}
	}

	public final ReleaseContext release() throws RecognitionException {
		ReleaseContext _localctx = new ReleaseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			formula();
			setState(137);
			match(T__13);
			setState(138);
			formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\66\n\2\3\3\3\3\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rb\n\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20m\n\20\3\21\3\21\3\21\3\21"+
		"\5\21s\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u0085\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2"+
		"\2\u008a\2\65\3\2\2\2\4\67\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\f"+
		"C\3\2\2\2\16L\3\2\2\2\20N\3\2\2\2\22R\3\2\2\2\24V\3\2\2\2\26Z\3\2\2\2"+
		"\30a\3\2\2\2\32c\3\2\2\2\34f\3\2\2\2\36l\3\2\2\2 r\3\2\2\2\"t\3\2\2\2"+
		"$w\3\2\2\2&z\3\2\2\2(}\3\2\2\2*\u0084\3\2\2\2,\u0086\3\2\2\2.\u008a\3"+
		"\2\2\2\60\66\3\2\2\2\61\66\5\4\3\2\62\66\5\6\4\2\63\66\5\36\20\2\64\66"+
		"\5\30\r\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64"+
		"\3\2\2\2\66\3\3\2\2\2\678\7\21\2\28\5\3\2\2\29=\3\2\2\2:=\5\b\5\2;=\5"+
		"\f\7\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\5\n\6\2?\t\3\2\2\2@"+
		"A\7\3\2\2AB\5\2\2\2B\13\3\2\2\2CD\7\4\2\2DE\5\16\b\2EF\7\5\2\2F\r\3\2"+
		"\2\2GM\3\2\2\2HM\5\20\t\2IM\5\22\n\2JM\5\24\13\2KM\5\26\f\2LG\3\2\2\2"+
		"LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\17\3\2\2\2NO\5\2\2\2OP\7\6\2"+
		"\2PQ\5\2\2\2Q\21\3\2\2\2RS\5\2\2\2ST\7\7\2\2TU\5\2\2\2U\23\3\2\2\2VW\5"+
		"\2\2\2WX\7\b\2\2XY\5\2\2\2Y\25\3\2\2\2Z[\5\2\2\2[\\\7\t\2\2\\]\5\2\2\2"+
		"]\27\3\2\2\2^b\3\2\2\2_b\5\32\16\2`b\5\34\17\2a^\3\2\2\2a_\3\2\2\2a`\3"+
		"\2\2\2b\31\3\2\2\2cd\7\n\2\2de\5\36\20\2e\33\3\2\2\2fg\7\13\2\2gh\5\36"+
		"\20\2h\35\3\2\2\2im\3\2\2\2jm\5 \21\2km\5(\25\2li\3\2\2\2lj\3\2\2\2lk"+
		"\3\2\2\2m\37\3\2\2\2ns\3\2\2\2os\5\"\22\2ps\5$\23\2qs\5&\24\2rn\3\2\2"+
		"\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s!\3\2\2\2tu\7\f\2\2uv\5\2\2\2v#\3\2\2"+
		"\2wx\7\r\2\2xy\5\2\2\2y%\3\2\2\2z{\7\16\2\2{|\5\2\2\2|\'\3\2\2\2}~\7\4"+
		"\2\2~\177\5*\26\2\177\u0080\7\5\2\2\u0080)\3\2\2\2\u0081\u0085\3\2\2\2"+
		"\u0082\u0085\5,\27\2\u0083\u0085\5.\30\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085+\3\2\2\2\u0086\u0087\5\2\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\5\2\2\2\u0089-\3\2\2\2\u008a\u008b\5\2\2\2"+
		"\u008b\u008c\7\20\2\2\u008c\u008d\5\2\2\2\u008d/\3\2\2\2\t\65<Lalr\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}