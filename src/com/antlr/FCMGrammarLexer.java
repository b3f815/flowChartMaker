// Generated from /Users/home/Documents/flowChartAST/FCMGrammar.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FCMGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ELSEIF=4, IF=5, ELSE=6, WHILE=7, PARAN_OPEN=8, 
		PARAN_CLOSE=9, STATEMENT=10, SPECIAL=11, WS=12, Newline=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ELSEIF", "IF", "ELSE", "WHILE", "PARAN_OPEN", 
			"PARAN_CLOSE", "STATEMENT", "SPECIAL", "WS", "Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "'else if'", "'if'", "'else'", "'while'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ELSEIF", "IF", "ELSE", "WHILE", "PARAN_OPEN", 
			"PARAN_CLOSE", "STATEMENT", "SPECIAL", "WS", "Newline"
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


	public FCMGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FCMGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\7\13?\n\13\f\13\16\13B\13\13\3\f\7\fE\n\f\f\f"+
		"\16\fH\13\f\3\r\6\rK\n\r\r\r\16\rL\3\r\3\r\3\16\3\16\5\16S\n\16\3\16\5"+
		"\16V\n\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\3\2\5\7\2\"\"$$\62;C\\c|\7\2##%\60<B``~~\5\2\13\f"+
		"\17\17\"\"\2]\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2"+
		"\2\2\t#\3\2\2\2\13+\3\2\2\2\r.\3\2\2\2\17\63\3\2\2\2\219\3\2\2\2\23;\3"+
		"\2\2\2\25@\3\2\2\2\27F\3\2\2\2\31J\3\2\2\2\33U\3\2\2\2\35\36\7*\2\2\36"+
		"\4\3\2\2\2\37 \7+\2\2 \6\3\2\2\2!\"\7=\2\2\"\b\3\2\2\2#$\7g\2\2$%\7n\2"+
		"\2%&\7u\2\2&\'\7g\2\2\'(\7\"\2\2()\7k\2\2)*\7h\2\2*\n\3\2\2\2+,\7k\2\2"+
		",-\7h\2\2-\f\3\2\2\2./\7g\2\2/\60\7n\2\2\60\61\7u\2\2\61\62\7g\2\2\62"+
		"\16\3\2\2\2\63\64\7y\2\2\64\65\7j\2\2\65\66\7k\2\2\66\67\7n\2\2\678\7"+
		"g\2\28\20\3\2\2\29:\7}\2\2:\22\3\2\2\2;<\7\177\2\2<\24\3\2\2\2=?\t\2\2"+
		"\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\26\3\2\2\2B@\3\2\2\2CE\t\3"+
		"\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\30\3\2\2\2HF\3\2\2\2IK\t"+
		"\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\r\2\2O\32"+
		"\3\2\2\2PR\7\17\2\2QS\7\f\2\2RQ\3\2\2\2RS\3\2\2\2SV\3\2\2\2TV\7\f\2\2"+
		"UP\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\b\16\2\2X\34\3\2\2\2\b\2@FLRU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}