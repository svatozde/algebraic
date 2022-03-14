// Generated from Polynomial.g4 by ANTLR 4.9.3
package com.svatozde.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolynomialParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CP=1, OP=2, ABS=3, LEN=4, PLUS=5, MINUS=6, PROD=7, DIV=8, POWER=9, NUM=10, 
		QOT=11, VAR=12, STR=13, WS=14;
	public static final int
		RULE_expr = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "')'", "'('", "'ABS('", "'LEN('", "'+'", "'-'", "'*'", "'/'", "'^'", 
			null, "'''", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CP", "OP", "ABS", "LEN", "PLUS", "MINUS", "PROD", "DIV", "POWER", 
			"NUM", "QOT", "VAR", "STR", "WS"
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
	public String getGrammarFileName() { return "Polynomial.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolynomialParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode DIV() { return getToken(PolynomialParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusminusContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PolynomialParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PolynomialParser.MINUS, 0); }
		public PlusminusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterPlusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitPlusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitPlusminus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(PolynomialParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsContext extends ExprContext {
		public TerminalNode ABS() { return getToken(PolynomialParser.ABS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(PolynomialParser.CP, 0); }
		public AbsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitAbs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitAbs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProdContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode PROD() { return getToken(PolynomialParser.PROD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitProd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LenContext extends ExprContext {
		public TerminalNode LEN() { return getToken(PolynomialParser.LEN, 0); }
		public TerminalNode STR() { return getToken(PolynomialParser.STR, 0); }
		public TerminalNode CP() { return getToken(PolynomialParser.CP, 0); }
		public LenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public TerminalNode NUM() { return getToken(PolynomialParser.NUM, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(PolynomialParser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExprContext {
		public TerminalNode OP() { return getToken(PolynomialParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(PolynomialParser.CP, 0); }
		public ParenExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode POWER() { return getToken(PolynomialParser.POWER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomialListener ) ((PolynomialListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolynomialVisitor ) return ((PolynomialVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(3);
				match(MINUS);
				setState(4);
				expr(10);
				}
				break;
			case OP:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(5);
				match(OP);
				setState(6);
				expr(0);
				setState(7);
				match(CP);
				}
				break;
			case ABS:
				{
				_localctx = new AbsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(ABS);
				setState(10);
				expr(0);
				setState(11);
				match(CP);
				}
				break;
			case LEN:
				{
				_localctx = new LenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(LEN);
				setState(14);
				match(STR);
				setState(15);
				match(CP);
				}
				break;
			case VAR:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(VAR);
				}
				break;
			case NUM:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(20);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(21);
						match(POWER);
						setState(22);
						((PowerContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(23);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(24);
						match(DIV);
						setState(25);
						((DivContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ProdContext(new ExprContext(_parentctx, _parentState));
						((ProdContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(26);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						match(PROD);
						setState(28);
						((ProdContext)_localctx).right = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new PlusminusContext(new ExprContext(_parentctx, _parentState));
						((PlusminusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						((PlusminusContext)_localctx).right = expr(5);
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20(\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16\2&\13"+
		"\2\3\2\2\3\2\3\2\2\3\3\2\7\b\2/\2\24\3\2\2\2\4\5\b\2\1\2\5\6\7\b\2\2\6"+
		"\25\5\2\2\f\7\b\7\4\2\2\b\t\5\2\2\2\t\n\7\3\2\2\n\25\3\2\2\2\13\f\7\5"+
		"\2\2\f\r\5\2\2\2\r\16\7\3\2\2\16\25\3\2\2\2\17\20\7\6\2\2\20\21\7\17\2"+
		"\2\21\25\7\3\2\2\22\25\7\16\2\2\23\25\7\f\2\2\24\4\3\2\2\2\24\7\3\2\2"+
		"\2\24\13\3\2\2\2\24\17\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25$\3\2\2\2"+
		"\26\27\f\t\2\2\27\30\7\13\2\2\30#\5\2\2\n\31\32\f\b\2\2\32\33\7\n\2\2"+
		"\33#\5\2\2\t\34\35\f\7\2\2\35\36\7\t\2\2\36#\5\2\2\b\37 \f\6\2\2 !\t\2"+
		"\2\2!#\5\2\2\7\"\26\3\2\2\2\"\31\3\2\2\2\"\34\3\2\2\2\"\37\3\2\2\2#&\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2\2\2\5\24\"$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}