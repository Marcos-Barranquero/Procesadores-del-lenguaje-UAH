// Generated from FiboLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FiboLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO_LINEA=1, COMENTARIO_BLOQUE=2, COMENTARIO_DOCUMENTACION=3, ASIGNAR=4, 
		A_PARENTESIS=5, C_PARENTESIS=6, COMA=7, DOSPUNTOS=8, PUNTOCOMA=9, SALTOLINEA=10, 
		MENOR=11, MAYOR=12, MENORIGUAL=13, MAYORIGUAL=14, IGUAL=15, NOIGUAL=16, 
		BIT_AND=17, AND=18, BIT_OR=19, OR=20, SUMA=21, RESTA=22, MUL=23, DIV=24, 
		INT=25, FLOAT=26, STRING=27, R_STRING=28, R_NUMBER=29, R_VOID=30, INCLUDE=31, 
		IF=32, WHILE=33, FUNCTION=34, BEGIN=35, END=36, END_IF=37, RETURN=38, 
		ELSE=39, FOR=40, IN=41, IDENTIFICADOR=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "ESCAPE", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
			"COMENTARIO_DOCUMENTACION", "ASIGNAR", "A_PARENTESIS", "C_PARENTESIS", 
			"COMA", "DOSPUNTOS", "PUNTOCOMA", "SALTOLINEA", "MENOR", "MAYOR", "MENORIGUAL", 
			"MAYORIGUAL", "IGUAL", "NOIGUAL", "BIT_AND", "AND", "BIT_OR", "OR", "SUMA", 
			"RESTA", "MUL", "DIV", "INT", "FLOAT", "STRING", "R_STRING", "R_NUMBER", 
			"R_VOID", "INCLUDE", "IF", "WHILE", "FUNCTION", "BEGIN", "END", "END_IF", 
			"RETURN", "ELSE", "FOR", "IN", "IDENTIFICADOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "':='", "'('", "')'", "','", "':'", "';'", null, 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'&&'", "'|'", "'||'", 
			"'+'", "'-'", "'*'", "'/'", null, null, null, "'cadena'", "'numero'", 
			"'void'", "'include'", "'if'", "'while'", "'function'", "'begin'", "'end'", 
			"'endif'", "'devolver'", "'else'", "'for'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "COMENTARIO_DOCUMENTACION", 
			"ASIGNAR", "A_PARENTESIS", "C_PARENTESIS", "COMA", "DOSPUNTOS", "PUNTOCOMA", 
			"SALTOLINEA", "MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUAL", 
			"NOIGUAL", "BIT_AND", "AND", "BIT_OR", "OR", "SUMA", "RESTA", "MUL", 
			"DIV", "INT", "FLOAT", "STRING", "R_STRING", "R_NUMBER", "R_VOID", "INCLUDE", 
			"IF", "WHILE", "FUNCTION", "BEGIN", "END", "END_IF", "RETURN", "ELSE", 
			"FOR", "IN", "IDENTIFICADOR", "WS"
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


	public FiboLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FiboLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5"+
		"k\n\5\f\5\16\5n\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6x\n\6\f\6\16\6"+
		"{\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0088\n\7\f\7\16"+
		"\7\u008b\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u00a2\n\16\r\16\16\16\u00a3\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00c9\n\35\r\35\16\35\u00ca\3\36\6"+
		"\36\u00ce\n\36\r\36\16\36\u00cf\3\36\3\36\6\36\u00d4\n\36\r\36\16\36\u00d5"+
		"\3\37\3\37\3\37\7\37\u00db\n\37\f\37\16\37\u00de\13\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\7.\u0137\n.\f.\16"+
		".\u013a\13.\3/\6/\u013d\n/\r/\16/\u013e\3/\3/\6ly\u0089\u00dc\2\60\3\2"+
		"\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!"+
		"\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?"+
		"\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-\3\2\7\3\2C|\3\2\62;\b\2$$^^ddpp"+
		"ttvv\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u014a\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2"+
		"\2\2\5a\3\2\2\2\7c\3\2\2\2\tf\3\2\2\2\13s\3\2\2\2\r\u0081\3\2\2\2\17\u0093"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2\2\27\u009c\3"+
		"\2\2\2\31\u009e\3\2\2\2\33\u00a1\3\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2"+
		"\2\2!\u00a9\3\2\2\2#\u00ac\3\2\2\2%\u00af\3\2\2\2\'\u00b2\3\2\2\2)\u00b5"+
		"\3\2\2\2+\u00b7\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61\u00bf\3\2\2\2"+
		"\63\u00c1\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c8\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00d7\3\2\2\2?\u00e1\3\2\2\2A\u00e8\3\2\2\2C\u00ef\3\2\2\2E"+
		"\u00f4\3\2\2\2G\u00fc\3\2\2\2I\u00ff\3\2\2\2K\u0105\3\2\2\2M\u010e\3\2"+
		"\2\2O\u0114\3\2\2\2Q\u0118\3\2\2\2S\u011e\3\2\2\2U\u0127\3\2\2\2W\u012c"+
		"\3\2\2\2Y\u0130\3\2\2\2[\u0133\3\2\2\2]\u013c\3\2\2\2_`\t\2\2\2`\4\3\2"+
		"\2\2ab\t\3\2\2b\6\3\2\2\2cd\7^\2\2de\t\4\2\2e\b\3\2\2\2fg\7\61\2\2gh\7"+
		"\61\2\2hl\3\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2m"+
		"o\3\2\2\2nl\3\2\2\2op\5\33\16\2pq\3\2\2\2qr\b\5\2\2r\n\3\2\2\2st\7\61"+
		"\2\2tu\7,\2\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2\2yz\3\2\2\2yw\3\2"+
		"\2\2z|\3\2\2\2{y\3\2\2\2|}\7,\2\2}~\7\61\2\2~\177\3\2\2\2\177\u0080\b"+
		"\6\2\2\u0080\f\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2\2\u0083\u0084"+
		"\7,\2\2\u0084\u0085\7,\2\2\u0085\u0089\3\2\2\2\u0086\u0088\13\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7,\2\2\u008d"+
		"\u008e\7,\2\2\u008e\u008f\7,\2\2\u008f\u0090\7\61\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\b\7\2\2\u0092\16\3\2\2\2\u0093\u0094\7<\2\2\u0094\u0095"+
		"\7?\2\2\u0095\20\3\2\2\2\u0096\u0097\7*\2\2\u0097\22\3\2\2\2\u0098\u0099"+
		"\7+\2\2\u0099\24\3\2\2\2\u009a\u009b\7.\2\2\u009b\26\3\2\2\2\u009c\u009d"+
		"\7<\2\2\u009d\30\3\2\2\2\u009e\u009f\7=\2\2\u009f\32\3\2\2\2\u00a0\u00a2"+
		"\t\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\36\3\2\2\2\u00a7"+
		"\u00a8\7@\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"\"\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad\u00ae\7?\2\2\u00ae$\3\2\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\u00b1\7?\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3"+
		"\u00b4\7?\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6*\3\2\2\2\u00b7\u00b8"+
		"\7(\2\2\u00b8\u00b9\7(\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7~\2\2\u00bb.\3"+
		"\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be\7~\2\2\u00be\60\3\2\2\2\u00bf\u00c0"+
		"\7-\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2\64\3\2\2\2\u00c3\u00c4"+
		"\7,\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c68\3\2\2\2\u00c7\u00c9"+
		"\5\5\3\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb:\3\2\2\2\u00cc\u00ce\5\5\3\2\u00cd\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d3\7\60\2\2\u00d2\u00d4\5\5\3\2\u00d3\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6<\3"+
		"\2\2\2\u00d7\u00dc\7$\2\2\u00d8\u00db\5\7\4\2\u00d9\u00db\13\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7$\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7f\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7@\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7o\2"+
		"\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00eeB\3\2"+
		"\2\2\u00ef\u00f0\7x\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3"+
		"\7f\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7"+
		"\7e\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7f\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7h\2\2\u00fe"+
		"H\3\2\2\2\u00ff\u0100\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7g\2\2\u0104J\3\2\2\2\u0105\u0106\7h\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u0108\7p\2\2\u0108\u0109\7e\2\2\u0109\u010a\7v\2\2"+
		"\u010a\u010b\7k\2\2\u010b\u010c\7q\2\2\u010c\u010d\7p\2\2\u010dL\3\2\2"+
		"\2\u010e\u010f\7d\2\2\u010f\u0110\7g\2\2\u0110\u0111\7i\2\2\u0111\u0112"+
		"\7k\2\2\u0112\u0113\7p\2\2\u0113N\3\2\2\2\u0114\u0115\7g\2\2\u0115\u0116"+
		"\7p\2\2\u0116\u0117\7f\2\2\u0117P\3\2\2\2\u0118\u0119\7g\2\2\u0119\u011a"+
		"\7p\2\2\u011a\u011b\7f\2\2\u011b\u011c\7k\2\2\u011c\u011d\7h\2\2\u011d"+
		"R\3\2\2\2\u011e\u011f\7f\2\2\u011f\u0120\7g\2\2\u0120\u0121\7x\2\2\u0121"+
		"\u0122\7q\2\2\u0122\u0123\7n\2\2\u0123\u0124\7x\2\2\u0124\u0125\7g\2\2"+
		"\u0125\u0126\7t\2\2\u0126T\3\2\2\2\u0127\u0128\7g\2\2\u0128\u0129\7n\2"+
		"\2\u0129\u012a\7u\2\2\u012a\u012b\7g\2\2\u012bV\3\2\2\2\u012c\u012d\7"+
		"h\2\2\u012d\u012e\7q\2\2\u012e\u012f\7t\2\2\u012fX\3\2\2\2\u0130\u0131"+
		"\7k\2\2\u0131\u0132\7p\2\2\u0132Z\3\2\2\2\u0133\u0138\5\3\2\2\u0134\u0137"+
		"\5\3\2\2\u0135\u0137\5\5\3\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\\\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013d\t\6\2\2\u013c\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b/\2\2\u0141^\3\2\2\2\17\2ly\u0089\u00a3\u00ca\u00cf\u00d5\u00da"+
		"\u00dc\u0136\u0138\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}