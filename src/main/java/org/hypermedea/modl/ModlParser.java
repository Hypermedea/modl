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
		T__9=10, T__10=11, T__11=12, ID=13, WS=14, CRLF=15;
	public static final int
		RULE_formula = 0, RULE_singleFormula = 1, RULE_enclosedFormula = 2, RULE_negatedFormula = 3, 
		RULE_proposition = 4, RULE_booleanFormula = 5, RULE_conjunction = 6, RULE_disjunction = 7, 
		RULE_implication = 8, RULE_equivalence = 9, RULE_temporalFormula = 10, 
		RULE_always = 11, RULE_eventually = 12, RULE_next = 13, RULE_until = 14, 
		RULE_release = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"formula", "singleFormula", "enclosedFormula", "negatedFormula", "proposition", 
			"booleanFormula", "conjunction", "disjunction", "implication", "equivalence", 
			"temporalFormula", "always", "eventually", "next", "until", "release"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\u00AC'", "'\u2227'", "'\u2228'", "'\u2192'", "'\u2194'", 
			"'G'", "'F'", "'X'", "'U'", "'R'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "WS", "CRLF"
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
		public SingleFormulaContext singleFormula() {
			return getRuleContext(SingleFormulaContext.class,0);
		}
		public BooleanFormulaContext booleanFormula() {
			return getRuleContext(BooleanFormulaContext.class,0);
		}
		public TemporalFormulaContext temporalFormula() {
			return getRuleContext(TemporalFormulaContext.class,0);
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
			setState(36);
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
				setState(33);
				singleFormula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				booleanFormula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				temporalFormula();
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

	public static class SingleFormulaContext extends ParserRuleContext {
		public EnclosedFormulaContext enclosedFormula() {
			return getRuleContext(EnclosedFormulaContext.class,0);
		}
		public NegatedFormulaContext negatedFormula() {
			return getRuleContext(NegatedFormulaContext.class,0);
		}
		public PropositionContext proposition() {
			return getRuleContext(PropositionContext.class,0);
		}
		public SingleFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterSingleFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitSingleFormula(this);
		}
	}

	public final SingleFormulaContext singleFormula() throws RecognitionException {
		SingleFormulaContext _localctx = new SingleFormulaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleFormula);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				enclosedFormula();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				negatedFormula();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				proposition();
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

	public static class EnclosedFormulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public EnclosedFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterEnclosedFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitEnclosedFormula(this);
		}
	}

	public final EnclosedFormulaContext enclosedFormula() throws RecognitionException {
		EnclosedFormulaContext _localctx = new EnclosedFormulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enclosedFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			formula();
			setState(46);
			match(T__1);
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

	public static class NegatedFormulaContext extends ParserRuleContext {
		public SingleFormulaContext singleFormula() {
			return getRuleContext(SingleFormulaContext.class,0);
		}
		public NegatedFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatedFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).enterNegatedFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModlListener ) ((ModlListener)listener).exitNegatedFormula(this);
		}
	}

	public final NegatedFormulaContext negatedFormula() throws RecognitionException {
		NegatedFormulaContext _localctx = new NegatedFormulaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_negatedFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			singleFormula();
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
		enterRule(_localctx, 8, RULE_proposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		enterRule(_localctx, 10, RULE_booleanFormula);
		try {
			setState(58);
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
				setState(54);
				conjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				disjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				implication();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
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
		public List<SingleFormulaContext> singleFormula() {
			return getRuleContexts(SingleFormulaContext.class);
		}
		public SingleFormulaContext singleFormula(int i) {
			return getRuleContext(SingleFormulaContext.class,i);
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
		enterRule(_localctx, 12, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			singleFormula();
			setState(61);
			match(T__3);
			setState(62);
			singleFormula();
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
		public List<SingleFormulaContext> singleFormula() {
			return getRuleContexts(SingleFormulaContext.class);
		}
		public SingleFormulaContext singleFormula(int i) {
			return getRuleContext(SingleFormulaContext.class,i);
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
		enterRule(_localctx, 14, RULE_disjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			singleFormula();
			setState(65);
			match(T__4);
			setState(66);
			singleFormula();
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
		public List<SingleFormulaContext> singleFormula() {
			return getRuleContexts(SingleFormulaContext.class);
		}
		public SingleFormulaContext singleFormula(int i) {
			return getRuleContext(SingleFormulaContext.class,i);
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
		enterRule(_localctx, 16, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			singleFormula();
			setState(69);
			match(T__5);
			setState(70);
			singleFormula();
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
		public List<SingleFormulaContext> singleFormula() {
			return getRuleContexts(SingleFormulaContext.class);
		}
		public SingleFormulaContext singleFormula(int i) {
			return getRuleContext(SingleFormulaContext.class,i);
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
		enterRule(_localctx, 18, RULE_equivalence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			singleFormula();
			setState(73);
			match(T__6);
			setState(74);
			singleFormula();
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
		public AlwaysContext always() {
			return getRuleContext(AlwaysContext.class,0);
		}
		public EventuallyContext eventually() {
			return getRuleContext(EventuallyContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public ReleaseContext release() {
			return getRuleContext(ReleaseContext.class,0);
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
		enterRule(_localctx, 20, RULE_temporalFormula);
		try {
			setState(82);
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
				setState(77);
				always();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				eventually();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				next();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				until();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
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

	public static class AlwaysContext extends ParserRuleContext {
		public SingleFormulaContext singleFormula() {
			return getRuleContext(SingleFormulaContext.class,0);
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
		enterRule(_localctx, 22, RULE_always);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__7);
			setState(85);
			singleFormula();
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
		public SingleFormulaContext singleFormula() {
			return getRuleContext(SingleFormulaContext.class,0);
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
		enterRule(_localctx, 24, RULE_eventually);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__8);
			setState(88);
			singleFormula();
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
		public SingleFormulaContext singleFormula() {
			return getRuleContext(SingleFormulaContext.class,0);
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
		enterRule(_localctx, 26, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__9);
			setState(91);
			singleFormula();
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
		public List<SingleFormulaContext> singleFormula() {
			return getRuleContexts(SingleFormulaContext.class);
		}
		public SingleFormulaContext singleFormula(int i) {
			return getRuleContext(SingleFormulaContext.class,i);
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
		enterRule(_localctx, 28, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			singleFormula();
			setState(94);
			match(T__10);
			setState(95);
			singleFormula();
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
		public List<SingleFormulaContext> singleFormula() {
			return getRuleContexts(SingleFormulaContext.class);
		}
		public SingleFormulaContext singleFormula(int i) {
			return getRuleContext(SingleFormulaContext.class,i);
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
		enterRule(_localctx, 30, RULE_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			singleFormula();
			setState(98);
			match(T__11);
			setState(99);
			singleFormula();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\5\2\'\n\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fU\n\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2f\2&\3"+
		"\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\62\3\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16>"+
		"\3\2\2\2\20B\3\2\2\2\22F\3\2\2\2\24J\3\2\2\2\26T\3\2\2\2\30V\3\2\2\2\32"+
		"Y\3\2\2\2\34\\\3\2\2\2\36_\3\2\2\2 c\3\2\2\2\"\'\3\2\2\2#\'\5\4\3\2$\'"+
		"\5\f\7\2%\'\5\26\f\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\3\3\2"+
		"\2\2(-\3\2\2\2)-\5\6\4\2*-\5\b\5\2+-\5\n\6\2,(\3\2\2\2,)\3\2\2\2,*\3\2"+
		"\2\2,+\3\2\2\2-\5\3\2\2\2./\7\3\2\2/\60\5\2\2\2\60\61\7\4\2\2\61\7\3\2"+
		"\2\2\62\63\7\5\2\2\63\64\5\4\3\2\64\t\3\2\2\2\65\66\7\17\2\2\66\13\3\2"+
		"\2\2\67=\3\2\2\28=\5\16\b\29=\5\20\t\2:=\5\22\n\2;=\5\24\13\2<\67\3\2"+
		"\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\5\4\3\2?@\7"+
		"\6\2\2@A\5\4\3\2A\17\3\2\2\2BC\5\4\3\2CD\7\7\2\2DE\5\4\3\2E\21\3\2\2\2"+
		"FG\5\4\3\2GH\7\b\2\2HI\5\4\3\2I\23\3\2\2\2JK\5\4\3\2KL\7\t\2\2LM\5\4\3"+
		"\2M\25\3\2\2\2NU\3\2\2\2OU\5\30\r\2PU\5\32\16\2QU\5\34\17\2RU\5\36\20"+
		"\2SU\5 \21\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2"+
		"\2U\27\3\2\2\2VW\7\n\2\2WX\5\4\3\2X\31\3\2\2\2YZ\7\13\2\2Z[\5\4\3\2[\33"+
		"\3\2\2\2\\]\7\f\2\2]^\5\4\3\2^\35\3\2\2\2_`\5\4\3\2`a\7\r\2\2ab\5\4\3"+
		"\2b\37\3\2\2\2cd\5\4\3\2de\7\16\2\2ef\5\4\3\2f!\3\2\2\2\6&,<T";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}