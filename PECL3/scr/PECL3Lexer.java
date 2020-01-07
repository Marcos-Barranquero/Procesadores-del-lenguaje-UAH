// Generated from .\src\PECL3Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PECL3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, DOC_COMMENT=3, ASSIGN=4, OP=5, CP=6, 
		COMMA=7, COLON=8, SEMI_COLON=9, NEWLINE=10, LESSER=11, GREATER=12, LESSER_EQ=13, 
		GREATER_EQ=14, EQ=15, NOT_EQ=16, BIT_AND=17, AND=18, BIT_OR=19, OR=20, 
		ADD=21, SUB=22, MULT=23, QUOTIENT=24, UNDER_SCORE=25, OP_BRACKET=26, CL_BRACKET=27, 
		NOT=28, INT=29, FLOAT=30, STRING=31, BOOLEAN=32, AS_STRING=33, AS_NUMBER=34, 
		AS_VOID=35, AS_BOOLEAN=36, INCLUDE=37, IF=38, WHILE=39, FUNC=40, ST_BLOCK=41, 
		END_BLOCK=42, END_IF=43, ST_DO=44, END_DO=45, RETURN=46, FROM=47, TO=48, 
		STEP=49, ELSE=50, FOR=51, IN=52, THEN=53, TRUE=54, FALSE=55, ID=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "ESC", "LINE_COMMENT", "BLOCK_COMMENT", "DOC_COMMENT", 
			"ASSIGN", "OP", "CP", "COMMA", "COLON", "SEMI_COLON", "NEWLINE", "LESSER", 
			"GREATER", "LESSER_EQ", "GREATER_EQ", "EQ", "NOT_EQ", "BIT_AND", "AND", 
			"BIT_OR", "OR", "ADD", "SUB", "MULT", "QUOTIENT", "UNDER_SCORE", "OP_BRACKET", 
			"CL_BRACKET", "NOT", "INT", "FLOAT", "STRING", "BOOLEAN", "AS_STRING", 
			"AS_NUMBER", "AS_VOID", "AS_BOOLEAN", "INCLUDE", "IF", "WHILE", "FUNC", 
			"ST_BLOCK", "END_BLOCK", "END_IF", "ST_DO", "END_DO", "RETURN", "FROM", 
			"TO", "STEP", "ELSE", "FOR", "IN", "THEN", "TRUE", "FALSE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "':='", "'('", "')'", "','", "':'", "';'", null, 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'&&'", "'|'", "'||'", 
			"'+'", "'-'", "'*'", "'/'", "'_'", "'['", "']'", "'!'", null, null, null, 
			null, "'cadena'", "'numero'", "'void'", "'booleano'", "'include'", "'if'", 
			"'while'", "'function'", "'begin'", "'end'", "'endif'", "'do'", "'enddo'", 
			"'devolver'", "'from'", "'to'", "'step'", "'else'", "'for'", "'in'", 
			"'then'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "BLOCK_COMMENT", "DOC_COMMENT", "ASSIGN", "OP", 
			"CP", "COMMA", "COLON", "SEMI_COLON", "NEWLINE", "LESSER", "GREATER", 
			"LESSER_EQ", "GREATER_EQ", "EQ", "NOT_EQ", "BIT_AND", "AND", "BIT_OR", 
			"OR", "ADD", "SUB", "MULT", "QUOTIENT", "UNDER_SCORE", "OP_BRACKET", 
			"CL_BRACKET", "NOT", "INT", "FLOAT", "STRING", "BOOLEAN", "AS_STRING", 
			"AS_NUMBER", "AS_VOID", "AS_BOOLEAN", "INCLUDE", "IF", "WHILE", "FUNC", 
			"ST_BLOCK", "END_BLOCK", "END_IF", "ST_DO", "END_DO", "RETURN", "FROM", 
			"TO", "STEP", "ELSE", "FOR", "IN", "THEN", "TRUE", "FALSE", "ID", "WS"
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


	public PECL3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PECL3Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0087\n\5\f\5\16\5\u008a"+
		"\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7"+
		"\u00a7\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u00be\n\16\r\16\16\16\u00bf\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\5!\u00ed"+
		"\n!\3!\6!\u00f0\n!\r!\16!\u00f1\3\"\5\"\u00f5\n\"\3\"\6\"\u00f8\n\"\r"+
		"\"\16\"\u00f9\3\"\3\"\7\"\u00fe\n\"\f\"\16\"\u0101\13\"\3#\3#\3#\7#\u0106"+
		"\n#\f#\16#\u0109\13#\3#\3#\3$\3$\5$\u010f\n$\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\5<\u0194\n<\3<\3<\3<\7<\u0199\n<\f"+
		"<\16<\u019c\13<\3=\6=\u019f\n=\r=\16=\u01a0\3=\3=\6\u0088\u0095\u00a5"+
		"\u0107\2>\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f"+
		"\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329"+
		"\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63"+
		"k\64m\65o\66q\67s8u9w:y;\3\2\7\4\2C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2\u01b1\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{"+
		"\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0082\3\2\2\2\13\u008f\3\2\2\2\r\u009d"+
		"\3\2\2\2\17\u00af\3\2\2\2\21\u00b2\3\2\2\2\23\u00b4\3\2\2\2\25\u00b6\3"+
		"\2\2\2\27\u00b8\3\2\2\2\31\u00ba\3\2\2\2\33\u00bd\3\2\2\2\35\u00c1\3\2"+
		"\2\2\37\u00c3\3\2\2\2!\u00c5\3\2\2\2#\u00c8\3\2\2\2%\u00cb\3\2\2\2\'\u00ce"+
		"\3\2\2\2)\u00d1\3\2\2\2+\u00d3\3\2\2\2-\u00d6\3\2\2\2/\u00d8\3\2\2\2\61"+
		"\u00db\3\2\2\2\63\u00dd\3\2\2\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00e3"+
		"\3\2\2\2;\u00e5\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C"+
		"\u00f4\3\2\2\2E\u0102\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u0117\3\2"+
		"\2\2M\u011e\3\2\2\2O\u0123\3\2\2\2Q\u012c\3\2\2\2S\u0134\3\2\2\2U\u0137"+
		"\3\2\2\2W\u013d\3\2\2\2Y\u0146\3\2\2\2[\u014c\3\2\2\2]\u0150\3\2\2\2_"+
		"\u0156\3\2\2\2a\u0159\3\2\2\2c\u015f\3\2\2\2e\u0168\3\2\2\2g\u016d\3\2"+
		"\2\2i\u0170\3\2\2\2k\u0175\3\2\2\2m\u017a\3\2\2\2o\u017e\3\2\2\2q\u0181"+
		"\3\2\2\2s\u0186\3\2\2\2u\u018b\3\2\2\2w\u0193\3\2\2\2y\u019e\3\2\2\2{"+
		"|\t\2\2\2|\4\3\2\2\2}~\t\3\2\2~\6\3\2\2\2\177\u0080\7^\2\2\u0080\u0081"+
		"\t\4\2\2\u0081\b\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\5\33\16\2\u008c\u008d\3\2\2\2\u008d\u008e\b"+
		"\5\2\2\u008e\n\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0095"+
		"\3\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7\61\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\b\6\2\2\u009c\f\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7,\2\2"+
		"\u009f\u00a0\7,\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4"+
		"\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\7,\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ac\7\61\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\7\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7<\2\2"+
		"\u00b0\u00b1\7?\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\22\3\2\2"+
		"\2\u00b4\u00b5\7+\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\26\3\2"+
		"\2\2\u00b8\u00b9\7<\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7=\2\2\u00bb\32\3"+
		"\2\2\2\u00bc\u00be\t\5\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7>\2\2"+
		"\u00c2\36\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7>\2\2"+
		"\u00c6\u00c7\7?\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9\u00ca\7?"+
		"\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7?\2\2\u00cd&\3\2\2"+
		"\2\u00ce\u00cf\7#\2\2\u00cf\u00d0\7?\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7"+
		"(\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\7(\2\2\u00d5,\3\2"+
		"\2\2\u00d6\u00d7\7~\2\2\u00d7.\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da"+
		"\7~\2\2\u00da\60\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\62\3\2\2\2\u00dd\u00de"+
		"\7/\2\2\u00de\64\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\66\3\2\2\2\u00e1\u00e2"+
		"\7\61\2\2\u00e28\3\2\2\2\u00e3\u00e4\7a\2\2\u00e4:\3\2\2\2\u00e5\u00e6"+
		"\7]\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7"+
		"#\2\2\u00ea@\3\2\2\2\u00eb\u00ed\7/\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\5\5\3\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2B\3\2\2\2"+
		"\u00f3\u00f5\7/\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f8\5\5\3\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00ff\7\60"+
		"\2\2\u00fc\u00fe\5\5\3\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100D\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0102\u0107\7$\2\2\u0103\u0106\5\7\4\2\u0104\u0106\13\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7$"+
		"\2\2\u010bF\3\2\2\2\u010c\u010f\5s:\2\u010d\u010f\5u;\2\u010e\u010c\3"+
		"\2\2\2\u010e\u010d\3\2\2\2\u010fH\3\2\2\2\u0110\u0111\7e\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7f\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7c\2\2\u0116J\3\2\2\2\u0117\u0118\7p\2\2\u0118\u0119\7w\2\2\u0119"+
		"\u011a\7o\2\2\u011a\u011b\7g\2\2\u011b\u011c\7t\2\2\u011c\u011d\7q\2\2"+
		"\u011dL\3\2\2\2\u011e\u011f\7x\2\2\u011f\u0120\7q\2\2\u0120\u0121\7k\2"+
		"\2\u0121\u0122\7f\2\2\u0122N\3\2\2\2\u0123\u0124\7d\2\2\u0124\u0125\7"+
		"q\2\2\u0125\u0126\7q\2\2\u0126\u0127\7n\2\2\u0127\u0128\7g\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7p\2\2\u012a\u012b\7q\2\2\u012bP\3\2\2\2\u012c\u012d"+
		"\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7e\2\2\u012f\u0130\7n\2\2\u0130"+
		"\u0131\7w\2\2\u0131\u0132\7f\2\2\u0132\u0133\7g\2\2\u0133R\3\2\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7h\2\2\u0136T\3\2\2\2\u0137\u0138\7y\2\2\u0138"+
		"\u0139\7j\2\2\u0139\u013a\7k\2\2\u013a\u013b\7n\2\2\u013b\u013c\7g\2\2"+
		"\u013cV\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f\7w\2\2\u013f\u0140\7p\2"+
		"\2\u0140\u0141\7e\2\2\u0141\u0142\7v\2\2\u0142\u0143\7k\2\2\u0143\u0144"+
		"\7q\2\2\u0144\u0145\7p\2\2\u0145X\3\2\2\2\u0146\u0147\7d\2\2\u0147\u0148"+
		"\7g\2\2\u0148\u0149\7i\2\2\u0149\u014a\7k\2\2\u014a\u014b\7p\2\2\u014b"+
		"Z\3\2\2\2\u014c\u014d\7g\2\2\u014d\u014e\7p\2\2\u014e\u014f\7f\2\2\u014f"+
		"\\\3\2\2\2\u0150\u0151\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7f\2\2\u0153"+
		"\u0154\7k\2\2\u0154\u0155\7h\2\2\u0155^\3\2\2\2\u0156\u0157\7f\2\2\u0157"+
		"\u0158\7q\2\2\u0158`\3\2\2\2\u0159\u015a\7g\2\2\u015a\u015b\7p\2\2\u015b"+
		"\u015c\7f\2\2\u015c\u015d\7f\2\2\u015d\u015e\7q\2\2\u015eb\3\2\2\2\u015f"+
		"\u0160\7f\2\2\u0160\u0161\7g\2\2\u0161\u0162\7x\2\2\u0162\u0163\7q\2\2"+
		"\u0163\u0164\7n\2\2\u0164\u0165\7x\2\2\u0165\u0166\7g\2\2\u0166\u0167"+
		"\7t\2\2\u0167d\3\2\2\2\u0168\u0169\7h\2\2\u0169\u016a\7t\2\2\u016a\u016b"+
		"\7q\2\2\u016b\u016c\7o\2\2\u016cf\3\2\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7q\2\2\u016fh\3\2\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2\u0172\u0173"+
		"\7g\2\2\u0173\u0174\7r\2\2\u0174j\3\2\2\2\u0175\u0176\7g\2\2\u0176\u0177"+
		"\7n\2\2\u0177\u0178\7u\2\2\u0178\u0179\7g\2\2\u0179l\3\2\2\2\u017a\u017b"+
		"\7h\2\2\u017b\u017c\7q\2\2\u017c\u017d\7t\2\2\u017dn\3\2\2\2\u017e\u017f"+
		"\7k\2\2\u017f\u0180\7p\2\2\u0180p\3\2\2\2\u0181\u0182\7v\2\2\u0182\u0183"+
		"\7j\2\2\u0183\u0184\7g\2\2\u0184\u0185\7p\2\2\u0185r\3\2\2\2\u0186\u0187"+
		"\7v\2\2\u0187\u0188\7t\2\2\u0188\u0189\7w\2\2\u0189\u018a\7g\2\2\u018a"+
		"t\3\2\2\2\u018b\u018c\7h\2\2\u018c\u018d\7c\2\2\u018d\u018e\7n\2\2\u018e"+
		"\u018f\7u\2\2\u018f\u0190\7g\2\2\u0190v\3\2\2\2\u0191\u0194\59\35\2\u0192"+
		"\u0194\5\3\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u019a\3\2"+
		"\2\2\u0195\u0199\5\3\2\2\u0196\u0199\5\5\3\2\u0197\u0199\59\35\2\u0198"+
		"\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019bx\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019f\t\6\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b="+
		"\2\2\u01a3z\3\2\2\2\23\2\u0088\u0095\u00a5\u00bf\u00ec\u00f1\u00f4\u00f9"+
		"\u00ff\u0105\u0107\u010e\u0193\u0198\u019a\u01a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}