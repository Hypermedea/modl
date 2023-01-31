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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, WS=17, 
		CRLF=18;
	public static final int
		RULE_formulae = 0, RULE_formula = 1, RULE_proposition = 2, RULE_booleanFormula = 3, 
		RULE_unaryBooleanFormula = 4, RULE_negation = 5, RULE_enclosedBinaryBooleanFormula = 6, 
		RULE_binaryBooleanFormula = 7, RULE_conjunction = 8, RULE_disjunction = 9, 
		RULE_implication = 10, RULE_equivalence = 11, RULE_quantification = 12, 
		RULE_existentialQuantification = 13, RULE_universalQuantification = 14, 
		RULE_temporalFormula = 15, RULE_unaryTemporalFormula = 16, RULE_always = 17, 
		RULE_eventually = 18, RULE_next = 19, RULE_enclosedBinaryTemporalFormula = 20, 
		RULE_binaryTemporalFormula = 21, RULE_until = 22, RULE_release = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"formulae", "formula", "proposition", "booleanFormula", "unaryBooleanFormula", 
			"negation", "enclosedBinaryBooleanFormula", "binaryBooleanFormula", "conjunction", 
			"disjunction", "implication", "equivalence", "quantification", "existentialQuantification", 
			"universalQuantification", "temporalFormula", "unaryTemporalFormula", 
			"always", "eventually", "next", "enclosedBinaryTemporalFormula", "binaryTemporalFormula", 
			"until", "release"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\u00AC'", "'('", "')'", "'\u2227'", "'\u2228'", "'\u2192'", 
			"'\u2194'", "'E'", "'A'", "'G'", "'F'", "'X'", "'U'", "'R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "WS", "CRLF"
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

	public static class FormulaeContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public FormulaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterFormulae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitFormulae(this);
		}
	}

	public final FormulaeContext formulae() throws RecognitionException {
		FormulaeContext _localctx = new FormulaeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formulae);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				formula();
				setState(49);
				match(T__0);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0) );
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
		enterRule(_localctx, 2, RULE_formula);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				proposition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				booleanFormula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				temporalFormula();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
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
		enterRule(_localctx, 4, RULE_proposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 6, RULE_booleanFormula);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				unaryBooleanFormula();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
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
		enterRule(_localctx, 8, RULE_unaryBooleanFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		enterRule(_localctx, 10, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__1);
			setState(72);
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
		enterRule(_localctx, 12, RULE_enclosedBinaryBooleanFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			binaryBooleanFormula();
			setState(76);
			match(T__3);
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
		enterRule(_localctx, 14, RULE_binaryBooleanFormula);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				disjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				implication();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
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
		enterRule(_localctx, 16, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			formula();
			setState(86);
			match(T__4);
			setState(87);
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
		enterRule(_localctx, 18, RULE_disjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			formula();
			setState(90);
			match(T__5);
			setState(91);
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
		enterRule(_localctx, 20, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			formula();
			setState(94);
			match(T__6);
			setState(95);
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
		enterRule(_localctx, 22, RULE_equivalence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			formula();
			setState(98);
			match(T__7);
			setState(99);
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
		enterRule(_localctx, 24, RULE_quantification);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				existentialQuantification();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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
		enterRule(_localctx, 26, RULE_existentialQuantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
			setState(107);
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
		enterRule(_localctx, 28, RULE_universalQuantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__9);
			setState(110);
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
		enterRule(_localctx, 30, RULE_temporalFormula);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				unaryTemporalFormula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
		enterRule(_localctx, 32, RULE_unaryTemporalFormula);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				always();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				eventually();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
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
		enterRule(_localctx, 34, RULE_always);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__10);
			setState(124);
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
		enterRule(_localctx, 36, RULE_eventually);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__11);
			setState(127);
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
		enterRule(_localctx, 38, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__12);
			setState(130);
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
		enterRule(_localctx, 40, RULE_enclosedBinaryTemporalFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__2);
			setState(133);
			binaryTemporalFormula();
			setState(134);
			match(T__3);
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
		enterRule(_localctx, 42, RULE_binaryTemporalFormula);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				until();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
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
		enterRule(_localctx, 44, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			formula();
			setState(142);
			match(T__13);
			setState(143);
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
		enterRule(_localctx, 46, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			formula();
			setState(146);
			match(T__14);
			setState(147);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3"+
		"\4\3\5\3\5\3\5\5\5F\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\tV\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16k\n\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\5\21v\n\21\3\22\3\22\3\22\3\22\5\22|\n\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\5\27\u008e\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\2\2\32"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\2\u0093\2\65\3"+
		"\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16L\3\2"+
		"\2\2\20U\3\2\2\2\22W\3\2\2\2\24[\3\2\2\2\26_\3\2\2\2\30c\3\2\2\2\32j\3"+
		"\2\2\2\34l\3\2\2\2\36o\3\2\2\2 u\3\2\2\2\"{\3\2\2\2$}\3\2\2\2&\u0080\3"+
		"\2\2\2(\u0083\3\2\2\2*\u0086\3\2\2\2,\u008d\3\2\2\2.\u008f\3\2\2\2\60"+
		"\u0093\3\2\2\2\62\63\5\4\3\2\63\64\7\3\2\2\64\66\3\2\2\2\65\62\3\2\2\2"+
		"\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29?\3\2\2\2:?\5\6\4"+
		"\2;?\5\b\5\2<?\5 \21\2=?\5\32\16\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2"+
		"\2\2>=\3\2\2\2?\5\3\2\2\2@A\7\22\2\2A\7\3\2\2\2BF\3\2\2\2CF\5\n\6\2DF"+
		"\5\16\b\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\5\f\7\2H\13\3\2\2"+
		"\2IJ\7\4\2\2JK\5\4\3\2K\r\3\2\2\2LM\7\5\2\2MN\5\20\t\2NO\7\6\2\2O\17\3"+
		"\2\2\2PV\3\2\2\2QV\5\22\n\2RV\5\24\13\2SV\5\26\f\2TV\5\30\r\2UP\3\2\2"+
		"\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\21\3\2\2\2WX\5\4\3\2XY\7\7"+
		"\2\2YZ\5\4\3\2Z\23\3\2\2\2[\\\5\4\3\2\\]\7\b\2\2]^\5\4\3\2^\25\3\2\2\2"+
		"_`\5\4\3\2`a\7\t\2\2ab\5\4\3\2b\27\3\2\2\2cd\5\4\3\2de\7\n\2\2ef\5\4\3"+
		"\2f\31\3\2\2\2gk\3\2\2\2hk\5\34\17\2ik\5\36\20\2jg\3\2\2\2jh\3\2\2\2j"+
		"i\3\2\2\2k\33\3\2\2\2lm\7\13\2\2mn\5 \21\2n\35\3\2\2\2op\7\f\2\2pq\5 "+
		"\21\2q\37\3\2\2\2rv\3\2\2\2sv\5\"\22\2tv\5*\26\2ur\3\2\2\2us\3\2\2\2u"+
		"t\3\2\2\2v!\3\2\2\2w|\3\2\2\2x|\5$\23\2y|\5&\24\2z|\5(\25\2{w\3\2\2\2"+
		"{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|#\3\2\2\2}~\7\r\2\2~\177\5\4\3\2\177%\3"+
		"\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\5\4\3\2\u0082\'\3\2\2\2\u0083"+
		"\u0084\7\17\2\2\u0084\u0085\5\4\3\2\u0085)\3\2\2\2\u0086\u0087\7\5\2\2"+
		"\u0087\u0088\5,\27\2\u0088\u0089\7\6\2\2\u0089+\3\2\2\2\u008a\u008e\3"+
		"\2\2\2\u008b\u008e\5.\30\2\u008c\u008e\5\60\31\2\u008d\u008a\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e-\3\2\2\2\u008f\u0090\5\4\3\2"+
		"\u0090\u0091\7\20\2\2\u0091\u0092\5\4\3\2\u0092/\3\2\2\2\u0093\u0094\5"+
		"\4\3\2\u0094\u0095\7\21\2\2\u0095\u0096\5\4\3\2\u0096\61\3\2\2\2\n\67"+
		">EUju{\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}