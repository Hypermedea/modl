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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, WS=19, CRLF=20;
	public static final int
		RULE_formulae = 0, RULE_formula = 1, RULE_proposition = 2, RULE_booleanFormula = 3, 
		RULE_unaryBooleanFormula = 4, RULE_negation = 5, RULE_enclosedBooleanFormula = 6, 
		RULE_nAryBooleanFormula = 7, RULE_binaryBooleanFormula = 8, RULE_otherNAryBooleanFormula = 9, 
		RULE_implication = 10, RULE_equivalence = 11, RULE_conjunction = 12, RULE_disjunction = 13, 
		RULE_disjointUnionFormula = 14, RULE_quantification = 15, RULE_existentialQuantification = 16, 
		RULE_universalQuantification = 17, RULE_temporalFormula = 18, RULE_unaryTemporalFormula = 19, 
		RULE_always = 20, RULE_eventually = 21, RULE_next = 22, RULE_enclosedBinaryTemporalFormula = 23, 
		RULE_binaryTemporalFormula = 24, RULE_until = 25, RULE_release = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"formulae", "formula", "proposition", "booleanFormula", "unaryBooleanFormula", 
			"negation", "enclosedBooleanFormula", "nAryBooleanFormula", "binaryBooleanFormula", 
			"otherNAryBooleanFormula", "implication", "equivalence", "conjunction", 
			"disjunction", "disjointUnionFormula", "quantification", "existentialQuantification", 
			"universalQuantification", "temporalFormula", "unaryTemporalFormula", 
			"always", "eventually", "next", "enclosedBinaryTemporalFormula", "binaryTemporalFormula", 
			"until", "release"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'\u00AC'", "'('", "')'", "'\u2192'", "'\u2194'", "'\u2227'", 
			"'\u2228'", "'{'", "'}'", "'E'", "'A'", "'G'", "'F'", "'X'", "'U'", "'R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "WS", "CRLF"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				formula();
				setState(55);
				match(T__0);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << ID))) != 0) );
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
			setState(66);
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
				setState(62);
				proposition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				booleanFormula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				temporalFormula();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
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
			setState(68);
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
		public DisjointUnionFormulaContext disjointUnionFormula() {
			return getRuleContext(DisjointUnionFormulaContext.class,0);
		}
		public EnclosedBooleanFormulaContext enclosedBooleanFormula() {
			return getRuleContext(EnclosedBooleanFormulaContext.class,0);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				unaryBooleanFormula();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				disjointUnionFormula();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				enclosedBooleanFormula();
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
			setState(76);
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
			setState(78);
			match(T__1);
			setState(79);
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

	public static class EnclosedBooleanFormulaContext extends ParserRuleContext {
		public NAryBooleanFormulaContext nAryBooleanFormula() {
			return getRuleContext(NAryBooleanFormulaContext.class,0);
		}
		public EnclosedBooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedBooleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterEnclosedBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitEnclosedBooleanFormula(this);
		}
	}

	public final EnclosedBooleanFormulaContext enclosedBooleanFormula() throws RecognitionException {
		EnclosedBooleanFormulaContext _localctx = new EnclosedBooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enclosedBooleanFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__2);
			setState(82);
			nAryBooleanFormula();
			setState(83);
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

	public static class NAryBooleanFormulaContext extends ParserRuleContext {
		public BinaryBooleanFormulaContext binaryBooleanFormula() {
			return getRuleContext(BinaryBooleanFormulaContext.class,0);
		}
		public OtherNAryBooleanFormulaContext otherNAryBooleanFormula() {
			return getRuleContext(OtherNAryBooleanFormulaContext.class,0);
		}
		public NAryBooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nAryBooleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterNAryBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitNAryBooleanFormula(this);
		}
	}

	public final NAryBooleanFormulaContext nAryBooleanFormula() throws RecognitionException {
		NAryBooleanFormulaContext _localctx = new NAryBooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nAryBooleanFormula);
		try {
			setState(88);
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
				setState(86);
				binaryBooleanFormula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				otherNAryBooleanFormula();
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

	public static class BinaryBooleanFormulaContext extends ParserRuleContext {
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
		enterRule(_localctx, 16, RULE_binaryBooleanFormula);
		try {
			setState(93);
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
				setState(91);
				implication();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
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

	public static class OtherNAryBooleanFormulaContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjointUnionFormulaContext disjointUnionFormula() {
			return getRuleContext(DisjointUnionFormulaContext.class,0);
		}
		public OtherNAryBooleanFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherNAryBooleanFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterOtherNAryBooleanFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitOtherNAryBooleanFormula(this);
		}
	}

	public final OtherNAryBooleanFormulaContext otherNAryBooleanFormula() throws RecognitionException {
		OtherNAryBooleanFormulaContext _localctx = new OtherNAryBooleanFormulaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_otherNAryBooleanFormula);
		try {
			setState(99);
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
				setState(96);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				disjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				disjointUnionFormula();
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
			setState(101);
			formula();
			setState(102);
			match(T__4);
			setState(103);
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
			setState(105);
			formula();
			setState(106);
			match(T__5);
			setState(107);
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
		enterRule(_localctx, 24, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			formula();
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(T__6);
				setState(111);
				formula();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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
		enterRule(_localctx, 26, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			formula();
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				match(T__7);
				setState(118);
				formula();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class DisjointUnionFormulaContext extends ParserRuleContext {
		public List<PropositionContext> proposition() {
			return getRuleContexts(PropositionContext.class);
		}
		public PropositionContext proposition(int i) {
			return getRuleContext(PropositionContext.class,i);
		}
		public DisjointUnionFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjointUnionFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterDisjointUnionFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitDisjointUnionFormula(this);
		}
	}

	public final DisjointUnionFormulaContext disjointUnionFormula() throws RecognitionException {
		DisjointUnionFormulaContext _localctx = new DisjointUnionFormulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_disjointUnionFormula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__8);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				proposition();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(129);
			match(T__9);
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
		enterRule(_localctx, 30, RULE_quantification);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				existentialQuantification();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
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
		enterRule(_localctx, 32, RULE_existentialQuantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__10);
			setState(137);
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
		enterRule(_localctx, 34, RULE_universalQuantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__11);
			setState(140);
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
		enterRule(_localctx, 36, RULE_temporalFormula);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				unaryTemporalFormula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
		enterRule(_localctx, 38, RULE_unaryTemporalFormula);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				always();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				eventually();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
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
		enterRule(_localctx, 40, RULE_always);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__12);
			setState(154);
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
		enterRule(_localctx, 42, RULE_eventually);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__13);
			setState(157);
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
		enterRule(_localctx, 44, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__14);
			setState(160);
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
		enterRule(_localctx, 46, RULE_enclosedBinaryTemporalFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__2);
			setState(163);
			binaryTemporalFormula();
			setState(164);
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
		enterRule(_localctx, 48, RULE_binaryTemporalFormula);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				until();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
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
		enterRule(_localctx, 50, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			formula();
			setState(172);
			match(T__15);
			setState(173);
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
		enterRule(_localctx, 52, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			formula();
			setState(176);
			match(T__16);
			setState(177);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\6\2<\n\2\r\2\16\2=\3\3\3\3"+
		"\3\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\5\n`\n\n\3\13\3"+
		"\13\3\13\3\13\5\13f\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\6\16s\n\16\r\16\16\16t\3\17\3\17\3\17\6\17z\n\17\r\17\16\17{\3\20\3\20"+
		"\6\20\u0080\n\20\r\20\16\20\u0081\3\20\3\20\3\21\3\21\3\21\5\21\u0089"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0094\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u009a\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u00ac\n\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\2\2\u00b5\2;\3\2\2\2\4D\3\2\2\2\6F\3\2\2"+
		"\2\bL\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16S\3\2\2\2\20Z\3\2\2\2\22_\3\2\2"+
		"\2\24e\3\2\2\2\26g\3\2\2\2\30k\3\2\2\2\32o\3\2\2\2\34v\3\2\2\2\36}\3\2"+
		"\2\2 \u0088\3\2\2\2\"\u008a\3\2\2\2$\u008d\3\2\2\2&\u0093\3\2\2\2(\u0099"+
		"\3\2\2\2*\u009b\3\2\2\2,\u009e\3\2\2\2.\u00a1\3\2\2\2\60\u00a4\3\2\2\2"+
		"\62\u00ab\3\2\2\2\64\u00ad\3\2\2\2\66\u00b1\3\2\2\289\5\4\3\29:\7\3\2"+
		"\2:<\3\2\2\2;8\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?E\3\2"+
		"\2\2@E\5\6\4\2AE\5\b\5\2BE\5&\24\2CE\5 \21\2D?\3\2\2\2D@\3\2\2\2DA\3\2"+
		"\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\24\2\2G\7\3\2\2\2HM\3\2\2\2IM"+
		"\5\n\6\2JM\5\36\20\2KM\5\16\b\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2"+
		"\2M\t\3\2\2\2NO\5\f\7\2O\13\3\2\2\2PQ\7\4\2\2QR\5\4\3\2R\r\3\2\2\2ST\7"+
		"\5\2\2TU\5\20\t\2UV\7\6\2\2V\17\3\2\2\2W[\3\2\2\2X[\5\22\n\2Y[\5\24\13"+
		"\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\21\3\2\2\2\\`\3\2\2\2]`\5\26\f\2^`\5"+
		"\30\r\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\23\3\2\2\2af\3\2\2\2bf\5\32\16"+
		"\2cf\5\34\17\2df\5\36\20\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\25"+
		"\3\2\2\2gh\5\4\3\2hi\7\7\2\2ij\5\4\3\2j\27\3\2\2\2kl\5\4\3\2lm\7\b\2\2"+
		"mn\5\4\3\2n\31\3\2\2\2or\5\4\3\2pq\7\t\2\2qs\5\4\3\2rp\3\2\2\2st\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2u\33\3\2\2\2vy\5\4\3\2wx\7\n\2\2xz\5\4\3\2yw\3\2"+
		"\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\35\3\2\2\2}\177\7\13\2\2~\u0080\5"+
		"\6\4\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\f\2\2\u0084\37\3\2\2\2\u0085"+
		"\u0089\3\2\2\2\u0086\u0089\5\"\22\2\u0087\u0089\5$\23\2\u0088\u0085\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089!\3\2\2\2\u008a\u008b"+
		"\7\r\2\2\u008b\u008c\5&\24\2\u008c#\3\2\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\5&\24\2\u008f%\3\2\2\2\u0090\u0094\3\2\2\2\u0091\u0094\5(\25\2"+
		"\u0092\u0094\5\60\31\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\'\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u009a\5*\26\2\u0097"+
		"\u009a\5,\27\2\u0098\u009a\5.\30\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a)\3\2\2\2\u009b\u009c"+
		"\7\17\2\2\u009c\u009d\5\4\3\2\u009d+\3\2\2\2\u009e\u009f\7\20\2\2\u009f"+
		"\u00a0\5\4\3\2\u00a0-\3\2\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5\4\3\2"+
		"\u00a3/\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5\62\32\2\u00a6\u00a7"+
		"\7\6\2\2\u00a7\61\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ac\5\64\33\2\u00aa"+
		"\u00ac\5\66\34\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\63\3\2\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\22\2\2\u00af"+
		"\u00b0\5\4\3\2\u00b0\65\3\2\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3\7\23\2"+
		"\2\u00b3\u00b4\5\4\3\2\u00b4\67\3\2\2\2\17=DLZ_et{\u0081\u0088\u0093\u0099"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}