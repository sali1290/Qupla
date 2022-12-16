// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class vocabularyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REAL=1, BOOL=2, STRING=3, SEPARATOR=4, TXT=5, REAL_INT=6, REAL_HEX=7, 
		REAL_FLOAT=8, ONCOMMENT=9, MLCOMMENT=10, WS=11, PLUS=12, MINUS=13, MULT=14, 
		DIV=15, POW=16, FAC=17, ASSIGN=18, AND=19, OR=20, NOT=21, XOR=22, REMAIN=23, 
		COND_IF=24, COLON=25, EQUAL=26, GREQUAL=27, LEEQUAL=28, NOTEQUAL=29, GREATER=30, 
		LESS=31, PARENTHESIS_OPEN=32, PARENTHESIS_CLOSE=33, COMMA=34, TRUE=35, 
		FALSE=36, IF=37, THEN=38, ELSE=39, BEGIN=40, END=41, WHILE=42, READ=43, 
		WRITE=44, MODULE=45, INPUT=46, OUTPUT=47, RETURN=48, IDENTIFIER=49, OTHER=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REAL", "BOOL", "STRING", "SEPARATOR", "TXT", "REAL_INT", "REAL_HEX", 
			"REAL_FLOAT", "ONCOMMENT", "MLCOMMENT", "WS", "PLUS", "MINUS", "MULT", 
			"DIV", "POW", "FAC", "ASSIGN", "AND", "OR", "NOT", "XOR", "REMAIN", "COND_IF", 
			"COLON", "EQUAL", "GREQUAL", "LEEQUAL", "NOTEQUAL", "GREATER", "LESS", 
			"PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "COMMA", "TRUE", "FALSE", "IF", 
			"THEN", "ELSE", "BEGIN", "END", "WHILE", "READ", "WRITE", "MODULE", "INPUT", 
			"OUTPUT", "RETURN", "IDENTIFIER", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'='", null, null, null, null, 
			"'%'", "'?'", "':'", "'=='", "'>='", "'<='", "'<>'", "'>'", "'<'", "'('", 
			"')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REAL", "BOOL", "STRING", "SEPARATOR", "TXT", "REAL_INT", "REAL_HEX", 
			"REAL_FLOAT", "ONCOMMENT", "MLCOMMENT", "WS", "PLUS", "MINUS", "MULT", 
			"DIV", "POW", "FAC", "ASSIGN", "AND", "OR", "NOT", "XOR", "REMAIN", "COND_IF", 
			"COLON", "EQUAL", "GREQUAL", "LEEQUAL", "NOTEQUAL", "GREATER", "LESS", 
			"PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "COMMA", "TRUE", "FALSE", "IF", 
			"THEN", "ELSE", "BEGIN", "END", "WHILE", "READ", "WRITE", "MODULE", "INPUT", 
			"OUTPUT", "RETURN", "IDENTIFIER", "OTHER"
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


	public vocabularyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vocabulary.g4"; }

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
		"\u0004\u00002\u0147\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004{\b"+
		"\u0004\n\u0004\f\u0004~\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004"+
		"\u0005\u0083\b\u0005\u000b\u0005\f\u0005\u0084\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006\u008a\b\u0006\u000b\u0006\f\u0006\u008b\u0001"+
		"\u0007\u0005\u0007\u008f\b\u0007\n\u0007\f\u0007\u0092\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0096\b\u0007\u000b\u0007\f\u0007\u0097\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u009e\b\b\n\b\f\b\u00a1\t\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n\u00b2\b\n\u000b\n\f\n\u00b3"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00050\u0141\b0\n0\f0\u0144\t0\u00011\u00011\u0002"+
		"|\u00a9\u00002\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2\u0001\u0000\u001a\u0002\u0000"+
		"RRrr\u0002\u0000EEee\u0002\u0000AAaa\u0002\u0000LLll\u0002\u0000BBbb\u0002"+
		"\u0000OOoo\u0002\u0000SSss\u0002\u0000TTtt\u0002\u0000IIii\u0002\u0000"+
		"NNnn\u0002\u0000GGgg\u0001\u0000\n\n\u0002\u0000XXxx\u0003\u000009AFa"+
		"f\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"DDdd\u0002\u0000UUuu\u0002\u0000FFff\u0002\u0000HHhh\u0002\u0000WWww\u0002"+
		"\u0000MMmm\u0002\u0000PPpp\u0003\u0000AZ__az\u0004\u000009AZ__az\u014f"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0001e\u0001\u0000\u0000\u0000\u0003j"+
		"\u0001\u0000\u0000\u0000\u0005o\u0001\u0000\u0000\u0000\u0007v\u0001\u0000"+
		"\u0000\u0000\tx\u0001\u0000\u0000\u0000\u000b\u0082\u0001\u0000\u0000"+
		"\u0000\r\u0086\u0001\u0000\u0000\u0000\u000f\u0090\u0001\u0000\u0000\u0000"+
		"\u0011\u0099\u0001\u0000\u0000\u0000\u0013\u00a2\u0001\u0000\u0000\u0000"+
		"\u0015\u00b1\u0001\u0000\u0000\u0000\u0017\u00b7\u0001\u0000\u0000\u0000"+
		"\u0019\u00b9\u0001\u0000\u0000\u0000\u001b\u00bb\u0001\u0000\u0000\u0000"+
		"\u001d\u00bd\u0001\u0000\u0000\u0000\u001f\u00bf\u0001\u0000\u0000\u0000"+
		"!\u00c1\u0001\u0000\u0000\u0000#\u00c3\u0001\u0000\u0000\u0000%\u00c5"+
		"\u0001\u0000\u0000\u0000\'\u00c9\u0001\u0000\u0000\u0000)\u00cc\u0001"+
		"\u0000\u0000\u0000+\u00d0\u0001\u0000\u0000\u0000-\u00d4\u0001\u0000\u0000"+
		"\u0000/\u00d6\u0001\u0000\u0000\u00001\u00d8\u0001\u0000\u0000\u00003"+
		"\u00da\u0001\u0000\u0000\u00005\u00dd\u0001\u0000\u0000\u00007\u00e0\u0001"+
		"\u0000\u0000\u00009\u00e3\u0001\u0000\u0000\u0000;\u00e6\u0001\u0000\u0000"+
		"\u0000=\u00e8\u0001\u0000\u0000\u0000?\u00ea\u0001\u0000\u0000\u0000A"+
		"\u00ec\u0001\u0000\u0000\u0000C\u00ee\u0001\u0000\u0000\u0000E\u00f0\u0001"+
		"\u0000\u0000\u0000G\u00f5\u0001\u0000\u0000\u0000I\u00fb\u0001\u0000\u0000"+
		"\u0000K\u00fe\u0001\u0000\u0000\u0000M\u0103\u0001\u0000\u0000\u0000O"+
		"\u0108\u0001\u0000\u0000\u0000Q\u010e\u0001\u0000\u0000\u0000S\u0112\u0001"+
		"\u0000\u0000\u0000U\u0118\u0001\u0000\u0000\u0000W\u011d\u0001\u0000\u0000"+
		"\u0000Y\u0123\u0001\u0000\u0000\u0000[\u012a\u0001\u0000\u0000\u0000]"+
		"\u0130\u0001\u0000\u0000\u0000_\u0137\u0001\u0000\u0000\u0000a\u013e\u0001"+
		"\u0000\u0000\u0000c\u0145\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000"+
		"\u0000fg\u0007\u0001\u0000\u0000gh\u0007\u0002\u0000\u0000hi\u0007\u0003"+
		"\u0000\u0000i\u0002\u0001\u0000\u0000\u0000jk\u0007\u0004\u0000\u0000"+
		"kl\u0007\u0005\u0000\u0000lm\u0007\u0005\u0000\u0000mn\u0007\u0003\u0000"+
		"\u0000n\u0004\u0001\u0000\u0000\u0000op\u0007\u0006\u0000\u0000pq\u0007"+
		"\u0007\u0000\u0000qr\u0007\u0000\u0000\u0000rs\u0007\b\u0000\u0000st\u0007"+
		"\t\u0000\u0000tu\u0007\n\u0000\u0000u\u0006\u0001\u0000\u0000\u0000vw"+
		"\u0005;\u0000\u0000w\b\u0001\u0000\u0000\u0000x|\u0005\"\u0000\u0000y"+
		"{\b\u000b\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\"\u0000\u0000"+
		"\u0080\n\u0001\u0000\u0000\u0000\u0081\u0083\u000209\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\f\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u00050\u0000\u0000\u0087\u0089\u0007\f"+
		"\u0000\u0000\u0088\u008a\u0007\r\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u000e\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0007\u000e\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0005.\u0000\u0000"+
		"\u0094\u0096\u0007\u000e\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0010\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005%\u0000\u0000\u009a\u009b\u0005%\u0000\u0000\u009b\u009f"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\b\u000f\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0012\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"%\u0000\u0000\u00a3\u00a4\u0005%\u0000\u0000\u00a4\u00a5\u0005%\u0000"+
		"\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000\u00a6\u00a8\t\u0000\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005%\u0000\u0000\u00ad\u00ae\u0005%\u0000\u0000\u00ae\u00af"+
		"\u0005%\u0000\u0000\u00af\u0014\u0001\u0000\u0000\u0000\u00b0\u00b2\u0007"+
		"\u0010\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0006"+
		"\n\u0000\u0000\u00b6\u0016\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005+"+
		"\u0000\u0000\u00b8\u0018\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005-\u0000"+
		"\u0000\u00ba\u001a\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005*\u0000\u0000"+
		"\u00bc\u001c\u0001\u0000\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be"+
		"\u001e\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005^\u0000\u0000\u00c0 \u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2\"\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005=\u0000\u0000\u00c4$\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0007\u0002\u0000\u0000\u00c6\u00c7\u0007\t\u0000\u0000\u00c7"+
		"\u00c8\u0007\u0011\u0000\u0000\u00c8&\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0007\u0005\u0000\u0000\u00ca\u00cb\u0007\u0000\u0000\u0000\u00cb(\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0007\t\u0000\u0000\u00cd\u00ce\u0007\u0005"+
		"\u0000\u0000\u00ce\u00cf\u0007\u0007\u0000\u0000\u00cf*\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0007\f\u0000\u0000\u00d1\u00d2\u0007\u0005\u0000\u0000"+
		"\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d3,\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005%\u0000\u0000\u00d5.\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"?\u0000\u0000\u00d70\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005:\u0000"+
		"\u0000\u00d92\u0001\u0000\u0000\u0000\u00da\u00db\u0005=\u0000\u0000\u00db"+
		"\u00dc\u0005=\u0000\u0000\u00dc4\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		">\u0000\u0000\u00de\u00df\u0005=\u0000\u0000\u00df6\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005<\u0000\u0000\u00e1\u00e2\u0005=\u0000\u0000\u00e2"+
		"8\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005<\u0000\u0000\u00e4\u00e5\u0005"+
		">\u0000\u0000\u00e5:\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005>\u0000"+
		"\u0000\u00e7<\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005<\u0000\u0000\u00e9"+
		">\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005(\u0000\u0000\u00eb@\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005)\u0000\u0000\u00edB\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005,\u0000\u0000\u00efD\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0007\u0007\u0000\u0000\u00f1\u00f2\u0007\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0007\u0012\u0000\u0000\u00f3\u00f4\u0007\u0001\u0000\u0000\u00f4"+
		"F\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007\u0013\u0000\u0000\u00f6\u00f7"+
		"\u0007\u0002\u0000\u0000\u00f7\u00f8\u0007\u0003\u0000\u0000\u00f8\u00f9"+
		"\u0007\u0006\u0000\u0000\u00f9\u00fa\u0007\u0001\u0000\u0000\u00faH\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0007\b\u0000\u0000\u00fc\u00fd\u0007\u0013"+
		"\u0000\u0000\u00fdJ\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0007\u0000"+
		"\u0000\u00ff\u0100\u0007\u0014\u0000\u0000\u0100\u0101\u0007\u0001\u0000"+
		"\u0000\u0101\u0102\u0007\t\u0000\u0000\u0102L\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0007\u0001\u0000\u0000\u0104\u0105\u0007\u0003\u0000\u0000"+
		"\u0105\u0106\u0007\u0006\u0000\u0000\u0106\u0107\u0007\u0001\u0000\u0000"+
		"\u0107N\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0004\u0000\u0000\u0109"+
		"\u010a\u0007\u0001\u0000\u0000\u010a\u010b\u0007\n\u0000\u0000\u010b\u010c"+
		"\u0007\b\u0000\u0000\u010c\u010d\u0007\t\u0000\u0000\u010dP\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0007\u0001\u0000\u0000\u010f\u0110\u0007\t\u0000"+
		"\u0000\u0110\u0111\u0007\u0011\u0000\u0000\u0111R\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0007\u0015\u0000\u0000\u0113\u0114\u0007\u0014\u0000\u0000"+
		"\u0114\u0115\u0007\b\u0000\u0000\u0115\u0116\u0007\u0003\u0000\u0000\u0116"+
		"\u0117\u0007\u0001\u0000\u0000\u0117T\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0007\u0000\u0000\u0000\u0119\u011a\u0007\u0001\u0000\u0000\u011a\u011b"+
		"\u0007\u0002\u0000\u0000\u011b\u011c\u0007\u0011\u0000\u0000\u011cV\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0007\u0015\u0000\u0000\u011e\u011f\u0007"+
		"\u0000\u0000\u0000\u011f\u0120\u0007\b\u0000\u0000\u0120\u0121\u0007\u0007"+
		"\u0000\u0000\u0121\u0122\u0007\u0001\u0000\u0000\u0122X\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0007\u0016\u0000\u0000\u0124\u0125\u0007\u0005\u0000"+
		"\u0000\u0125\u0126\u0007\u0011\u0000\u0000\u0126\u0127\u0007\u0012\u0000"+
		"\u0000\u0127\u0128\u0007\u0003\u0000\u0000\u0128\u0129\u0007\u0001\u0000"+
		"\u0000\u0129Z\u0001\u0000\u0000\u0000\u012a\u012b\u0007\b\u0000\u0000"+
		"\u012b\u012c\u0007\t\u0000\u0000\u012c\u012d\u0007\u0017\u0000\u0000\u012d"+
		"\u012e\u0007\u0012\u0000\u0000\u012e\u012f\u0007\u0007\u0000\u0000\u012f"+
		"\\\u0001\u0000\u0000\u0000\u0130\u0131\u0007\u0005\u0000\u0000\u0131\u0132"+
		"\u0007\u0012\u0000\u0000\u0132\u0133\u0007\u0007\u0000\u0000\u0133\u0134"+
		"\u0007\u0017\u0000\u0000\u0134\u0135\u0007\u0012\u0000\u0000\u0135\u0136"+
		"\u0007\u0007\u0000\u0000\u0136^\u0001\u0000\u0000\u0000\u0137\u0138\u0007"+
		"\u0000\u0000\u0000\u0138\u0139\u0007\u0001\u0000\u0000\u0139\u013a\u0007"+
		"\u0007\u0000\u0000\u013a\u013b\u0007\u0012\u0000\u0000\u013b\u013c\u0007"+
		"\u0000\u0000\u0000\u013c\u013d\u0007\t\u0000\u0000\u013d`\u0001\u0000"+
		"\u0000\u0000\u013e\u0142\u0007\u0018\u0000\u0000\u013f\u0141\u0007\u0019"+
		"\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143b\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\t\u0000\u0000\u0000\u0146d\u0001\u0000\u0000\u0000"+
		"\n\u0000|\u0084\u008b\u0090\u0097\u009f\u00a9\u00b3\u0142\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}