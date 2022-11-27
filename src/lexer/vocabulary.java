package lexer;

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
public class vocabulary extends Lexer {
    static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            REAL=1, BOOL=2, STRING=3, SEPARATOR=4, TXT=5, INT=6, HEX=7, FLOAT=8, WS=9,
            PLUS=10, MINUS=11, MULT=12, Div=13, POW=14, FAC=15, ASSIGN=16, AND=17,
            OR=18, NOT=19, XOR=20, REMAIN=21, COND_IF=22, COND_ELSE=23, EQUAL=24,
            GREQUAL=25, LEEQUAL=26, NOTEQUAL=27, GREATER=28, LESS=29, PARENTHESIS_OPEN=30,
            PARENTHESIS_CLOSE=31, OLCOMMENT=32, MLCOMMENT=33, TRUE=34, FALSE=35, IF=36,
            THEN=37, BEGIN=38, END=39, WHILE=40, ELSE=41, READ=42, WRITE=43, MODULE=44,
            INPUT=45, OUTPUT=46, IDENTIFIER=47;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[] {
                "REAL", "BOOL", "STRING", "SEPARATOR", "TXT", "INT", "HEX", "FLOAT",
                "WS", "PLUS", "MINUS", "MULT", "Div", "POW", "FAC", "ASSIGN", "AND",
                "OR", "NOT", "XOR", "REMAIN", "COND_IF", "COND_ELSE", "EQUAL", "GREQUAL",
                "LEEQUAL", "NOTEQUAL", "GREATER", "LESS", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE",
                "OLCOMMENT", "MLCOMMENT", "TRUE", "FALSE", "IF", "THEN", "BEGIN", "END",
                "WHILE", "ELSE", "READ", "WRITE", "MODULE", "INPUT", "OUTPUT", "IDENTIFIER"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
                null, "'Real'", "'Bool'", "'string'", "';'", null, null, null, null,
                null, "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'='", "'and'", "'or'",
                "'not'", "'xor'", "'%'", "'?'", "':'", "'=='", "'>='", "'<='", "'<>'",
                "'>'", "'<'", "'('", "')'", "'%% ~[\\r\\n]*'", "'%%%'", "'true'", "'false'",
                "'if'", "'then'", "'Begin'", "'End'", "'While'", "'Else'", "'read'",
                "'write'", "'Module'", "'Input'", "'Output'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static String[] makeSymbolicNames() {
        return new String[] {
                null, "REAL", "BOOL", "STRING", "SEPARATOR", "TXT", "INT", "HEX", "FLOAT",
                "WS", "PLUS", "MINUS", "MULT", "Div", "POW", "FAC", "ASSIGN", "AND",
                "OR", "NOT", "XOR", "REMAIN", "COND_IF", "COND_ELSE", "EQUAL", "GREQUAL",
                "LEEQUAL", "NOTEQUAL", "GREATER", "LESS", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE",
                "OLCOMMENT", "MLCOMMENT", "TRUE", "FALSE", "IF", "THEN", "BEGIN", "END",
                "WHILE", "ELSE", "READ", "WRITE", "MODULE", "INPUT", "OUTPUT", "IDENTIFIER"
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


    public vocabulary(CharStream input) {
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
            "\u0004\u0000/\u012e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
                    "+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001"+
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
                    "\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
                    "\u0004\u0005\u0004u\b\u0004\n\u0004\f\u0004x\t\u0004\u0001\u0004\u0001"+
                    "\u0004\u0001\u0005\u0004\u0005}\b\u0005\u000b\u0005\f\u0005~\u0001\u0006"+
                    "\u0001\u0006\u0001\u0006\u0004\u0006\u0084\b\u0006\u000b\u0006\f\u0006"+
                    "\u0085\u0001\u0007\u0004\u0007\u0089\b\u0007\u000b\u0007\f\u0007\u008a"+
                    "\u0001\u0007\u0001\u0007\u0004\u0007\u008f\b\u0007\u000b\u0007\f\u0007"+
                    "\u0090\u0001\b\u0004\b\u0094\b\b\u000b\b\f\b\u0095\u0001\b\u0001\b\u0001"+
                    "\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
                    "\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
                    "\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
                    "\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
                    "\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
                    "\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
                    "\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
                    "\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
                    "\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
                    "\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
                    "!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
                    "\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
                    "%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
                    "\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
                    "(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
                    "*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
                    ",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
                    "-\u0001-\u0001-\u0001.\u0001.\u0005.\u012a\b.\n.\f.\u012d\t.\u0001v\u0000"+
                    "/\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
                    "\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
                    "\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
                    "/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
                    "K&M\'O(Q)S*U+W,Y-[.]/\u0001\u0000\u0006\u0002\u0000XXxx\u0003\u000009"+
                    "AFaf\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0005\u0000."+
                    ".09AZ__az\u0134\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
                    "\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
                    "\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
                    "\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
                    "\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
                    "\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
                    "\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
                    "\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
                    "\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
                    "%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
                    "\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
                    "\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
                    "3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
                    "\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
                    "\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
                    "A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
                    "\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
                    "\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
                    "O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
                    "\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
                    "\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
                    "]\u0001\u0000\u0000\u0000\u0001_\u0001\u0000\u0000\u0000\u0003d\u0001"+
                    "\u0000\u0000\u0000\u0005i\u0001\u0000\u0000\u0000\u0007p\u0001\u0000\u0000"+
                    "\u0000\tr\u0001\u0000\u0000\u0000\u000b|\u0001\u0000\u0000\u0000\r\u0080"+
                    "\u0001\u0000\u0000\u0000\u000f\u0088\u0001\u0000\u0000\u0000\u0011\u0093"+
                    "\u0001\u0000\u0000\u0000\u0013\u0099\u0001\u0000\u0000\u0000\u0015\u009b"+
                    "\u0001\u0000\u0000\u0000\u0017\u009d\u0001\u0000\u0000\u0000\u0019\u009f"+
                    "\u0001\u0000\u0000\u0000\u001b\u00a1\u0001\u0000\u0000\u0000\u001d\u00a3"+
                    "\u0001\u0000\u0000\u0000\u001f\u00a5\u0001\u0000\u0000\u0000!\u00a7\u0001"+
                    "\u0000\u0000\u0000#\u00ab\u0001\u0000\u0000\u0000%\u00ae\u0001\u0000\u0000"+
                    "\u0000\'\u00b2\u0001\u0000\u0000\u0000)\u00b6\u0001\u0000\u0000\u0000"+
                    "+\u00b8\u0001\u0000\u0000\u0000-\u00ba\u0001\u0000\u0000\u0000/\u00bc"+
                    "\u0001\u0000\u0000\u00001\u00bf\u0001\u0000\u0000\u00003\u00c2\u0001\u0000"+
                    "\u0000\u00005\u00c5\u0001\u0000\u0000\u00007\u00c8\u0001\u0000\u0000\u0000"+
                    "9\u00ca\u0001\u0000\u0000\u0000;\u00cc\u0001\u0000\u0000\u0000=\u00ce"+
                    "\u0001\u0000\u0000\u0000?\u00d0\u0001\u0000\u0000\u0000A\u00da\u0001\u0000"+
                    "\u0000\u0000C\u00e0\u0001\u0000\u0000\u0000E\u00e5\u0001\u0000\u0000\u0000"+
                    "G\u00eb\u0001\u0000\u0000\u0000I\u00ee\u0001\u0000\u0000\u0000K\u00f3"+
                    "\u0001\u0000\u0000\u0000M\u00f9\u0001\u0000\u0000\u0000O\u00fd\u0001\u0000"+
                    "\u0000\u0000Q\u0103\u0001\u0000\u0000\u0000S\u0108\u0001\u0000\u0000\u0000"+
                    "U\u010d\u0001\u0000\u0000\u0000W\u0113\u0001\u0000\u0000\u0000Y\u011a"+
                    "\u0001\u0000\u0000\u0000[\u0120\u0001\u0000\u0000\u0000]\u0127\u0001\u0000"+
                    "\u0000\u0000_`\u0005R\u0000\u0000`a\u0005e\u0000\u0000ab\u0005a\u0000"+
                    "\u0000bc\u0005l\u0000\u0000c\u0002\u0001\u0000\u0000\u0000de\u0005B\u0000"+
                    "\u0000ef\u0005o\u0000\u0000fg\u0005o\u0000\u0000gh\u0005l\u0000\u0000"+
                    "h\u0004\u0001\u0000\u0000\u0000ij\u0005s\u0000\u0000jk\u0005t\u0000\u0000"+
                    "kl\u0005r\u0000\u0000lm\u0005i\u0000\u0000mn\u0005n\u0000\u0000no\u0005"+
                    "g\u0000\u0000o\u0006\u0001\u0000\u0000\u0000pq\u0005;\u0000\u0000q\b\u0001"+
                    "\u0000\u0000\u0000rv\u0005\"\u0000\u0000su\t\u0000\u0000\u0000ts\u0001"+
                    "\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
                    "vt\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
                    "\u0000yz\u0005\"\u0000\u0000z\n\u0001\u0000\u0000\u0000{}\u000209\u0000"+
                    "|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
                    "\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\f\u0001\u0000\u0000\u0000"+
                    "\u0080\u0081\u00050\u0000\u0000\u0081\u0083\u0007\u0000\u0000\u0000\u0082"+
                    "\u0084\u0007\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
                    "\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
                    "\u0086\u0001\u0000\u0000\u0000\u0086\u000e\u0001\u0000\u0000\u0000\u0087"+
                    "\u0089\u0007\u0002\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
                    "\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
                    "\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
                    "\u008e\u0005.\u0000\u0000\u008d\u008f\u0007\u0002\u0000\u0000\u008e\u008d"+
                    "\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e"+
                    "\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0010"+
                    "\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u0003\u0000\u0000\u0093\u0092"+
                    "\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093"+
                    "\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
                    "\u0001\u0000\u0000\u0000\u0097\u0098\u0006\b\u0000\u0000\u0098\u0012\u0001"+
                    "\u0000\u0000\u0000\u0099\u009a\u0005+\u0000\u0000\u009a\u0014\u0001\u0000"+
                    "\u0000\u0000\u009b\u009c\u0005-\u0000\u0000\u009c\u0016\u0001\u0000\u0000"+
                    "\u0000\u009d\u009e\u0005*\u0000\u0000\u009e\u0018\u0001\u0000\u0000\u0000"+
                    "\u009f\u00a0\u0005/\u0000\u0000\u00a0\u001a\u0001\u0000\u0000\u0000\u00a1"+
                    "\u00a2\u0005^\u0000\u0000\u00a2\u001c\u0001\u0000\u0000\u0000\u00a3\u00a4"+
                    "\u0005!\u0000\u0000\u00a4\u001e\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
                    "=\u0000\u0000\u00a6 \u0001\u0000\u0000\u0000\u00a7\u00a8\u0005a\u0000"+
                    "\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00aa\u0005d\u0000\u0000\u00aa"+
                    "\"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005o\u0000\u0000\u00ac\u00ad"+
                    "\u0005r\u0000\u0000\u00ad$\u0001\u0000\u0000\u0000\u00ae\u00af\u0005n"+
                    "\u0000\u0000\u00af\u00b0\u0005o\u0000\u0000\u00b0\u00b1\u0005t\u0000\u0000"+
                    "\u00b1&\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005x\u0000\u0000\u00b3\u00b4"+
                    "\u0005o\u0000\u0000\u00b4\u00b5\u0005r\u0000\u0000\u00b5(\u0001\u0000"+
                    "\u0000\u0000\u00b6\u00b7\u0005%\u0000\u0000\u00b7*\u0001\u0000\u0000\u0000"+
                    "\u00b8\u00b9\u0005?\u0000\u0000\u00b9,\u0001\u0000\u0000\u0000\u00ba\u00bb"+
                    "\u0005:\u0000\u0000\u00bb.\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005="+
                    "\u0000\u0000\u00bd\u00be\u0005=\u0000\u0000\u00be0\u0001\u0000\u0000\u0000"+
                    "\u00bf\u00c0\u0005>\u0000\u0000\u00c0\u00c1\u0005=\u0000\u0000\u00c12"+
                    "\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005<\u0000\u0000\u00c3\u00c4\u0005"+
                    "=\u0000\u0000\u00c44\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005<\u0000"+
                    "\u0000\u00c6\u00c7\u0005>\u0000\u0000\u00c76\u0001\u0000\u0000\u0000\u00c8"+
                    "\u00c9\u0005>\u0000\u0000\u00c98\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
                    "<\u0000\u0000\u00cb:\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005(\u0000"+
                    "\u0000\u00cd<\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005)\u0000\u0000\u00cf"+
                    ">\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005%\u0000\u0000\u00d1\u00d2\u0005"+
                    "%\u0000\u0000\u00d2\u00d3\u0005 \u0000\u0000\u00d3\u00d4\u0005~\u0000"+
                    "\u0000\u00d4\u00d5\u0005[\u0000\u0000\u00d5\u00d6\u0005\r\u0000\u0000"+
                    "\u00d6\u00d7\u0005\n\u0000\u0000\u00d7\u00d8\u0005]\u0000\u0000\u00d8"+
                    "\u00d9\u0005*\u0000\u0000\u00d9@\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
                    "%\u0000\u0000\u00db\u00dc\u0005%\u0000\u0000\u00dc\u00dd\u0005%\u0000"+
                    "\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0006 \u0000\u0000"+
                    "\u00dfB\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005t\u0000\u0000\u00e1\u00e2"+
                    "\u0005r\u0000\u0000\u00e2\u00e3\u0005u\u0000\u0000\u00e3\u00e4\u0005e"+
                    "\u0000\u0000\u00e4D\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005f\u0000\u0000"+
                    "\u00e6\u00e7\u0005a\u0000\u0000\u00e7\u00e8\u0005l\u0000\u0000\u00e8\u00e9"+
                    "\u0005s\u0000\u0000\u00e9\u00ea\u0005e\u0000\u0000\u00eaF\u0001\u0000"+
                    "\u0000\u0000\u00eb\u00ec\u0005i\u0000\u0000\u00ec\u00ed\u0005f\u0000\u0000"+
                    "\u00edH\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005t\u0000\u0000\u00ef\u00f0"+
                    "\u0005h\u0000\u0000\u00f0\u00f1\u0005e\u0000\u0000\u00f1\u00f2\u0005n"+
                    "\u0000\u0000\u00f2J\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005B\u0000\u0000"+
                    "\u00f4\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005g\u0000\u0000\u00f6\u00f7"+
                    "\u0005i\u0000\u0000\u00f7\u00f8\u0005n\u0000\u0000\u00f8L\u0001\u0000"+
                    "\u0000\u0000\u00f9\u00fa\u0005E\u0000\u0000\u00fa\u00fb\u0005n\u0000\u0000"+
                    "\u00fb\u00fc\u0005d\u0000\u0000\u00fcN\u0001\u0000\u0000\u0000\u00fd\u00fe"+
                    "\u0005W\u0000\u0000\u00fe\u00ff\u0005h\u0000\u0000\u00ff\u0100\u0005i"+
                    "\u0000\u0000\u0100\u0101\u0005l\u0000\u0000\u0101\u0102\u0005e\u0000\u0000"+
                    "\u0102P\u0001\u0000\u0000\u0000\u0103\u0104\u0005E\u0000\u0000\u0104\u0105"+
                    "\u0005l\u0000\u0000\u0105\u0106\u0005s\u0000\u0000\u0106\u0107\u0005e"+
                    "\u0000\u0000\u0107R\u0001\u0000\u0000\u0000\u0108\u0109\u0005r\u0000\u0000"+
                    "\u0109\u010a\u0005e\u0000\u0000\u010a\u010b\u0005a\u0000\u0000\u010b\u010c"+
                    "\u0005d\u0000\u0000\u010cT\u0001\u0000\u0000\u0000\u010d\u010e\u0005w"+
                    "\u0000\u0000\u010e\u010f\u0005r\u0000\u0000\u010f\u0110\u0005i\u0000\u0000"+
                    "\u0110\u0111\u0005t\u0000\u0000\u0111\u0112\u0005e\u0000\u0000\u0112V"+
                    "\u0001\u0000\u0000\u0000\u0113\u0114\u0005M\u0000\u0000\u0114\u0115\u0005"+
                    "o\u0000\u0000\u0115\u0116\u0005d\u0000\u0000\u0116\u0117\u0005u\u0000"+
                    "\u0000\u0117\u0118\u0005l\u0000\u0000\u0118\u0119\u0005e\u0000\u0000\u0119"+
                    "X\u0001\u0000\u0000\u0000\u011a\u011b\u0005I\u0000\u0000\u011b\u011c\u0005"+
                    "n\u0000\u0000\u011c\u011d\u0005p\u0000\u0000\u011d\u011e\u0005u\u0000"+
                    "\u0000\u011e\u011f\u0005t\u0000\u0000\u011fZ\u0001\u0000\u0000\u0000\u0120"+
                    "\u0121\u0005O\u0000\u0000\u0121\u0122\u0005u\u0000\u0000\u0122\u0123\u0005"+
                    "t\u0000\u0000\u0123\u0124\u0005p\u0000\u0000\u0124\u0125\u0005u\u0000"+
                    "\u0000\u0125\u0126\u0005t\u0000\u0000\u0126\\\u0001\u0000\u0000\u0000"+
                    "\u0127\u012b\u0007\u0004\u0000\u0000\u0128\u012a\u0007\u0005\u0000\u0000"+
                    "\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
                    "\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
                    "\u012c^\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\t"+
                    "\u0000v~\u0085\u008a\u0090\u0095\u0129\u012b\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}