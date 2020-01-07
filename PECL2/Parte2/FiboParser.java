// Generated from FiboParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FiboParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_return_val = 1, RULE_while_op = 2, RULE_if_op = 3, 
		RULE_else_op = 4, RULE_for_op = 5, RULE_for_eval = 6, RULE_funcionalidad_basica = 7, 
		RULE_asignacion = 8, RULE_libreria = 9, RULE_def_funcion = 10, RULE_def_variable = 11, 
		RULE_funcion = 12, RULE_expr = 13, RULE_exp = 14, RULE_exp_logica = 15, 
		RULE_suma = 16, RULE_resta = 17, RULE_mul = 18, RULE_div = 19, RULE_menor = 20, 
		RULE_mayor = 21, RULE_menorigual = 22, RULE_mayorigual = 23, RULE_igual = 24, 
		RULE_noigual = 25, RULE_bit_and = 26, RULE_and = 27, RULE_bit_or = 28, 
		RULE_or = 29, RULE_funcion_id = 30, RULE_variable_id = 31, RULE_identificador = 32, 
		RULE_asignar = 33, RULE_a_parentesis = 34, RULE_c_parentesis = 35, RULE_coma = 36, 
		RULE_dospuntos = 37, RULE_puntoycoma = 38, RULE_saltolinea = 39, RULE_begin = 40, 
		RULE_end = 41, RULE_end_if = 42, RULE_include = 43, RULE_function = 44, 
		RULE_in = 45, RULE_if_ = 46, RULE_else_ = 47, RULE_while_ = 48, RULE_for_ = 49, 
		RULE_return_ = 50, RULE_string = 51, RULE_numero = 52, RULE_valor = 53, 
		RULE_r_string = 54, RULE_r_number = 55, RULE_r_void = 56, RULE_r_variable = 57, 
		RULE_retorno = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "return_val", "while_op", "if_op", "else_op", "for_op", "for_eval", 
			"funcionalidad_basica", "asignacion", "libreria", "def_funcion", "def_variable", 
			"funcion", "expr", "exp", "exp_logica", "suma", "resta", "mul", "div", 
			"menor", "mayor", "menorigual", "mayorigual", "igual", "noigual", "bit_and", 
			"and", "bit_or", "or", "funcion_id", "variable_id", "identificador", 
			"asignar", "a_parentesis", "c_parentesis", "coma", "dospuntos", "puntoycoma", 
			"saltolinea", "begin", "end", "end_if", "include", "function", "in", 
			"if_", "else_", "while_", "for_", "return_", "string", "numero", "valor", 
			"r_string", "r_number", "r_void", "r_variable", "retorno"
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

	@Override
	public String getGrammarFileName() { return "FiboParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FiboParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public List<Def_funcionContext> def_funcion() {
			return getRuleContexts(Def_funcionContext.class);
		}
		public Def_funcionContext def_funcion(int i) {
			return getRuleContext(Def_funcionContext.class,i);
		}
		public List<LibreriaContext> libreria() {
			return getRuleContexts(LibreriaContext.class);
		}
		public LibreriaContext libreria(int i) {
			return getRuleContext(LibreriaContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALTOLINEA) | (1L << R_STRING) | (1L << R_NUMBER) | (1L << R_VOID) | (1L << INCLUDE) | (1L << FUNCTION) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SALTOLINEA) {
					{
					{
					setState(118);
					saltolinea();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(124);
					def_variable();
					}
					break;
				case 2:
					{
					setState(125);
					def_funcion();
					}
					break;
				case 3:
					{
					setState(126);
					libreria();
					}
					break;
				case 4:
					{
					setState(127);
					asignacion();
					}
					break;
				case 5:
					{
					setState(128);
					funcion();
					}
					break;
				}
				setState(131);
				saltolinea();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Return_valContext extends ParserRuleContext {
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public PuntoycomaContext puntoycoma() {
			return getRuleContext(PuntoycomaContext.class,0);
		}
		public Return_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterReturn_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitReturn_val(this);
		}
	}

	public final Return_valContext return_val() throws RecognitionException {
		Return_valContext _localctx = new Return_valContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_return_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			return_();
			setState(139);
			a_parentesis();
			setState(140);
			exp(0);
			setState(141);
			c_parentesis();
			setState(142);
			puntoycoma();
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

	public static class While_opContext extends ParserRuleContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public Exp_logicaContext exp_logica() {
			return getRuleContext(Exp_logicaContext.class,0);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<Funcionalidad_basicaContext> funcionalidad_basica() {
			return getRuleContexts(Funcionalidad_basicaContext.class);
		}
		public Funcionalidad_basicaContext funcionalidad_basica(int i) {
			return getRuleContext(Funcionalidad_basicaContext.class,i);
		}
		public While_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterWhile_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitWhile_op(this);
		}
	}

	public final While_opContext while_op() throws RecognitionException {
		While_opContext _localctx = new While_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_while_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			while_();
			setState(145);
			a_parentesis();
			setState(146);
			exp_logica();
			setState(147);
			c_parentesis();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(148);
				saltolinea();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			begin();
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					saltolinea();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_PARENTESIS) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << R_STRING) | (1L << R_NUMBER) | (1L << R_VOID) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ELSE) | (1L << FOR) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(161);
					expr();
					}
					break;
				case 2:
					{
					setState(162);
					def_variable();
					}
					break;
				case 3:
					{
					setState(163);
					asignacion();
					}
					break;
				case 4:
					{
					setState(164);
					funcionalidad_basica();
					}
					break;
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(170);
				saltolinea();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			end();
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

	public static class If_opContext extends ParserRuleContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public Exp_logicaContext exp_logica() {
			return getRuleContext(Exp_logicaContext.class,0);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<Funcionalidad_basicaContext> funcionalidad_basica() {
			return getRuleContexts(Funcionalidad_basicaContext.class);
		}
		public Funcionalidad_basicaContext funcionalidad_basica(int i) {
			return getRuleContext(Funcionalidad_basicaContext.class,i);
		}
		public If_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterIf_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitIf_op(this);
		}
	}

	public final If_opContext if_op() throws RecognitionException {
		If_opContext _localctx = new If_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			if_();
			setState(179);
			a_parentesis();
			setState(180);
			exp_logica();
			setState(181);
			c_parentesis();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					saltolinea();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_PARENTESIS) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << R_STRING) | (1L << R_NUMBER) | (1L << R_VOID) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ELSE) | (1L << FOR) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(188);
					expr();
					}
					break;
				case 2:
					{
					setState(189);
					def_variable();
					}
					break;
				case 3:
					{
					setState(190);
					asignacion();
					}
					break;
				case 4:
					{
					setState(191);
					funcionalidad_basica();
					}
					break;
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(197);
				saltolinea();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			end_if();
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

	public static class Else_opContext extends ParserRuleContext {
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<Funcionalidad_basicaContext> funcionalidad_basica() {
			return getRuleContexts(Funcionalidad_basicaContext.class);
		}
		public Funcionalidad_basicaContext funcionalidad_basica(int i) {
			return getRuleContext(Funcionalidad_basicaContext.class,i);
		}
		public Else_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterElse_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitElse_op(this);
		}
	}

	public final Else_opContext else_op() throws RecognitionException {
		Else_opContext _localctx = new Else_opContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			else_();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					saltolinea();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_PARENTESIS) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << R_STRING) | (1L << R_NUMBER) | (1L << R_VOID) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ELSE) | (1L << FOR) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(212);
					expr();
					}
					break;
				case 2:
					{
					setState(213);
					def_variable();
					}
					break;
				case 3:
					{
					setState(214);
					asignacion();
					}
					break;
				case 4:
					{
					setState(215);
					funcionalidad_basica();
					}
					break;
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(221);
				saltolinea();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			end_if();
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

	public static class For_opContext extends ParserRuleContext {
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public For_evalContext for_eval() {
			return getRuleContext(For_evalContext.class,0);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<Funcionalidad_basicaContext> funcionalidad_basica() {
			return getRuleContexts(Funcionalidad_basicaContext.class);
		}
		public Funcionalidad_basicaContext funcionalidad_basica(int i) {
			return getRuleContext(Funcionalidad_basicaContext.class,i);
		}
		public For_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFor_op(this);
		}
	}

	public final For_opContext for_op() throws RecognitionException {
		For_opContext _localctx = new For_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			for_();
			setState(230);
			a_parentesis();
			setState(231);
			for_eval();
			setState(232);
			c_parentesis();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(233);
				saltolinea();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			begin();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					saltolinea();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_PARENTESIS) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << R_STRING) | (1L << R_NUMBER) | (1L << R_VOID) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << ELSE) | (1L << FOR) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(246);
					expr();
					}
					break;
				case 2:
					{
					setState(247);
					def_variable();
					}
					break;
				case 3:
					{
					setState(248);
					asignacion();
					}
					break;
				case 4:
					{
					setState(249);
					funcionalidad_basica();
					}
					break;
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(255);
				saltolinea();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			end();
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

	public static class For_evalContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
		}
		public List<Variable_idContext> variable_id() {
			return getRuleContexts(Variable_idContext.class);
		}
		public Variable_idContext variable_id(int i) {
			return getRuleContext(Variable_idContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public For_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFor_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFor_eval(this);
		}
	}

	public final For_evalContext for_eval() throws RecognitionException {
		For_evalContext _localctx = new For_evalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			identificador();
			setState(264);
			in();
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				{
				setState(265);
				variable_id();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(266);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			dospuntos();
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				{
				setState(270);
				variable_id();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(271);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Funcionalidad_basicaContext extends ParserRuleContext {
		public While_opContext while_op() {
			return getRuleContext(While_opContext.class,0);
		}
		public If_opContext if_op() {
			return getRuleContext(If_opContext.class,0);
		}
		public Else_opContext else_op() {
			return getRuleContext(Else_opContext.class,0);
		}
		public For_opContext for_op() {
			return getRuleContext(For_opContext.class,0);
		}
		public Return_valContext return_val() {
			return getRuleContext(Return_valContext.class,0);
		}
		public Funcionalidad_basicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionalidad_basica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFuncionalidad_basica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFuncionalidad_basica(this);
		}
	}

	public final Funcionalidad_basicaContext funcionalidad_basica() throws RecognitionException {
		Funcionalidad_basicaContext _localctx = new Funcionalidad_basicaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcionalidad_basica);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				while_op();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				if_op();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				else_op();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				for_op();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				return_val();
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

	public static class AsignacionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			identificador();
			setState(282);
			asignar();
			setState(283);
			expr();
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

	public static class LibreriaContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PuntoycomaContext puntoycoma() {
			return getRuleContext(PuntoycomaContext.class,0);
		}
		public LibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libreria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterLibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitLibreria(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_libreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			include();
			setState(286);
			identificador();
			setState(287);
			puntoycoma();
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

	public static class Def_funcionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<R_variableContext> r_variable() {
			return getRuleContexts(R_variableContext.class);
		}
		public R_variableContext r_variable(int i) {
			return getRuleContext(R_variableContext.class,i);
		}
		public List<SaltolineaContext> saltolinea() {
			return getRuleContexts(SaltolineaContext.class);
		}
		public SaltolineaContext saltolinea(int i) {
			return getRuleContext(SaltolineaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<Funcionalidad_basicaContext> funcionalidad_basica() {
			return getRuleContexts(Funcionalidad_basicaContext.class);
		}
		public Funcionalidad_basicaContext funcionalidad_basica(int i) {
			return getRuleContext(Funcionalidad_basicaContext.class,i);
		}
		public List<Return_valContext> return_val() {
			return getRuleContexts(Return_valContext.class);
		}
		public Return_valContext return_val(int i) {
			return getRuleContext(Return_valContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Def_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterDef_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitDef_funcion(this);
		}
	}

	public final Def_funcionContext def_funcion() throws RecognitionException {
		Def_funcionContext _localctx = new Def_funcionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_funcion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			function();
			setState(290);
			identificador();
			setState(291);
			a_parentesis();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==R_STRING || _la==R_NUMBER) {
				{
				{
				setState(292);
				r_variable();
				setState(293);
				identificador();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(294);
					coma();
					setState(295);
					r_variable();
					setState(296);
					identificador();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			c_parentesis();
			setState(309);
			dospuntos();
			setState(310);
			retorno();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(311);
				saltolinea();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			begin();
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					saltolinea();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(324);
						expr();
						}
						break;
					case 2:
						{
						setState(325);
						def_variable();
						}
						break;
					case 3:
						{
						setState(326);
						asignacion();
						}
						break;
					case 4:
						{
						setState(327);
						funcionalidad_basica();
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN) {
				{
				{
				setState(333);
				return_val();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(339);
				saltolinea();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			end();
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

	public static class Def_variableContext extends ParserRuleContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PuntoycomaContext puntoycoma() {
			return getRuleContext(PuntoycomaContext.class,0);
		}
		public Def_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterDef_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitDef_variable(this);
		}
	}

	public final Def_variableContext def_variable() throws RecognitionException {
		Def_variableContext _localctx = new Def_variableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_def_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			retorno();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				{
				setState(348);
				identificador();
				setState(349);
				puntoycoma();
				}
				}
				break;
			case 2:
				{
				setState(351);
				asignacion();
				}
				break;
			}
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

	public static class FuncionContext extends ParserRuleContext {
		public Funcion_idContext funcion_id() {
			return getRuleContext(Funcion_idContext.class,0);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			funcion_id();
			setState(355);
			a_parentesis();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A_PARENTESIS) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(356);
				exp(0);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(357);
					coma();
					setState(358);
					exp(0);
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			c_parentesis();
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

	public static class ExprContext extends ParserRuleContext {
		public PuntoycomaContext puntoycoma() {
			return getRuleContext(PuntoycomaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_logicaContext exp_logica() {
			return getRuleContext(Exp_logicaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(372);
				exp(0);
				}
				break;
			case 2:
				{
				setState(373);
				exp_logica();
				}
				break;
			}
			setState(376);
			puntoycoma();
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

	public static class ExpContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public A_parentesisContext a_parentesis() {
			return getRuleContext(A_parentesisContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public C_parentesisContext c_parentesis() {
			return getRuleContext(C_parentesisContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Variable_idContext variable_id() {
			return getRuleContext(Variable_idContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(379);
				valor();
				}
				break;
			case 2:
				{
				setState(380);
				a_parentesis();
				setState(381);
				exp(0);
				setState(382);
				c_parentesis();
				}
				break;
			case 3:
				{
				setState(384);
				funcion();
				}
				break;
			case 4:
				{
				setState(385);
				variable_id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(388);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(391);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(389);
							mul();
							}
							break;
						case DIV:
							{
							setState(390);
							div();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(393);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(395);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(398);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SUMA:
							{
							setState(396);
							suma();
							}
							break;
						case RESTA:
							{
							setState(397);
							resta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(400);
						exp(6);
						}
						break;
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class Exp_logicaContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<MenorContext> menor() {
			return getRuleContexts(MenorContext.class);
		}
		public MenorContext menor(int i) {
			return getRuleContext(MenorContext.class,i);
		}
		public List<MayorContext> mayor() {
			return getRuleContexts(MayorContext.class);
		}
		public MayorContext mayor(int i) {
			return getRuleContext(MayorContext.class,i);
		}
		public List<MenorigualContext> menorigual() {
			return getRuleContexts(MenorigualContext.class);
		}
		public MenorigualContext menorigual(int i) {
			return getRuleContext(MenorigualContext.class,i);
		}
		public List<MayorigualContext> mayorigual() {
			return getRuleContexts(MayorigualContext.class);
		}
		public MayorigualContext mayorigual(int i) {
			return getRuleContext(MayorigualContext.class,i);
		}
		public List<IgualContext> igual() {
			return getRuleContexts(IgualContext.class);
		}
		public IgualContext igual(int i) {
			return getRuleContext(IgualContext.class,i);
		}
		public List<NoigualContext> noigual() {
			return getRuleContexts(NoigualContext.class);
		}
		public NoigualContext noigual(int i) {
			return getRuleContext(NoigualContext.class,i);
		}
		public List<Bit_andContext> bit_and() {
			return getRuleContexts(Bit_andContext.class);
		}
		public Bit_andContext bit_and(int i) {
			return getRuleContext(Bit_andContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<Bit_orContext> bit_or() {
			return getRuleContexts(Bit_orContext.class);
		}
		public Bit_orContext bit_or(int i) {
			return getRuleContext(Bit_orContext.class,i);
		}
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public Exp_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterExp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitExp_logica(this);
		}
	}

	public final Exp_logicaContext exp_logica() throws RecognitionException {
		Exp_logicaContext _localctx = new Exp_logicaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			exp(0);
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
				{
				setState(408);
				menor();
				}
				break;
			case MAYOR:
				{
				setState(409);
				mayor();
				}
				break;
			case MENORIGUAL:
				{
				setState(410);
				menorigual();
				}
				break;
			case MAYORIGUAL:
				{
				setState(411);
				mayorigual();
				}
				break;
			case IGUAL:
				{
				setState(412);
				igual();
				}
				break;
			case NOIGUAL:
				{
				setState(413);
				noigual();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(416);
			exp(0);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << AND) | (1L << BIT_OR) | (1L << OR))) != 0)) {
				{
				{
				setState(421);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BIT_AND:
					{
					setState(417);
					bit_and();
					}
					break;
				case AND:
					{
					setState(418);
					and();
					}
					break;
				case BIT_OR:
					{
					setState(419);
					bit_or();
					}
					break;
				case OR:
					{
					setState(420);
					or();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(423);
				exp(0);
				setState(430);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MENOR:
					{
					setState(424);
					menor();
					}
					break;
				case MAYOR:
					{
					setState(425);
					mayor();
					}
					break;
				case MENORIGUAL:
					{
					setState(426);
					menorigual();
					}
					break;
				case MAYORIGUAL:
					{
					setState(427);
					mayorigual();
					}
					break;
				case IGUAL:
					{
					setState(428);
					igual();
					}
					break;
				case NOIGUAL:
					{
					setState(429);
					noigual();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(432);
				exp(0);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(FiboParser.SUMA, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(SUMA);
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

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(FiboParser.RESTA, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(RESTA);
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

	public static class MulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(FiboParser.MUL, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(MUL);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(FiboParser.DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(DIV);
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

	public static class MenorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(FiboParser.MENOR, 0); }
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitMenor(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(MENOR);
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

	public static class MayorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(FiboParser.MAYOR, 0); }
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitMayor(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(MAYOR);
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

	public static class MenorigualContext extends ParserRuleContext {
		public TerminalNode MENORIGUAL() { return getToken(FiboParser.MENORIGUAL, 0); }
		public MenorigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterMenorigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitMenorigual(this);
		}
	}

	public final MenorigualContext menorigual() throws RecognitionException {
		MenorigualContext _localctx = new MenorigualContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_menorigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(MENORIGUAL);
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

	public static class MayorigualContext extends ParserRuleContext {
		public TerminalNode MAYORIGUAL() { return getToken(FiboParser.MAYORIGUAL, 0); }
		public MayorigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterMayorigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitMayorigual(this);
		}
	}

	public final MayorigualContext mayorigual() throws RecognitionException {
		MayorigualContext _localctx = new MayorigualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mayorigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(MAYORIGUAL);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(FiboParser.IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(IGUAL);
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

	public static class NoigualContext extends ParserRuleContext {
		public TerminalNode NOIGUAL() { return getToken(FiboParser.NOIGUAL, 0); }
		public NoigualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noigual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterNoigual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitNoigual(this);
		}
	}

	public final NoigualContext noigual() throws RecognitionException {
		NoigualContext _localctx = new NoigualContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_noigual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(NOIGUAL);
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

	public static class Bit_andContext extends ParserRuleContext {
		public TerminalNode BIT_AND() { return getToken(FiboParser.BIT_AND, 0); }
		public Bit_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterBit_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitBit_and(this);
		}
	}

	public final Bit_andContext bit_and() throws RecognitionException {
		Bit_andContext _localctx = new Bit_andContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bit_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(BIT_AND);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FiboParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(AND);
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

	public static class Bit_orContext extends ParserRuleContext {
		public TerminalNode BIT_OR() { return getToken(FiboParser.BIT_OR, 0); }
		public Bit_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterBit_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitBit_or(this);
		}
	}

	public final Bit_orContext bit_or() throws RecognitionException {
		Bit_orContext _localctx = new Bit_orContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bit_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(BIT_OR);
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FiboParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(OR);
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

	public static class Funcion_idContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Funcion_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFuncion_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFuncion_id(this);
		}
	}

	public final Funcion_idContext funcion_id() throws RecognitionException {
		Funcion_idContext _localctx = new Funcion_idContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funcion_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			identificador();
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

	public static class Variable_idContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Variable_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterVariable_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitVariable_id(this);
		}
	}

	public final Variable_idContext variable_id() throws RecognitionException {
		Variable_idContext _localctx = new Variable_idContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			identificador();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(FiboParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(IDENTIFICADOR);
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

	public static class AsignarContext extends ParserRuleContext {
		public TerminalNode ASIGNAR() { return getToken(FiboParser.ASIGNAR, 0); }
		public AsignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterAsignar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitAsignar(this);
		}
	}

	public final AsignarContext asignar() throws RecognitionException {
		AsignarContext _localctx = new AsignarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_asignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(ASIGNAR);
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

	public static class A_parentesisContext extends ParserRuleContext {
		public TerminalNode A_PARENTESIS() { return getToken(FiboParser.A_PARENTESIS, 0); }
		public A_parentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterA_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitA_parentesis(this);
		}
	}

	public final A_parentesisContext a_parentesis() throws RecognitionException {
		A_parentesisContext _localctx = new A_parentesisContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_a_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(A_PARENTESIS);
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

	public static class C_parentesisContext extends ParserRuleContext {
		public TerminalNode C_PARENTESIS() { return getToken(FiboParser.C_PARENTESIS, 0); }
		public C_parentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterC_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitC_parentesis(this);
		}
	}

	public final C_parentesisContext c_parentesis() throws RecognitionException {
		C_parentesisContext _localctx = new C_parentesisContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_c_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(C_PARENTESIS);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(FiboParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(COMA);
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

	public static class DospuntosContext extends ParserRuleContext {
		public TerminalNode DOSPUNTOS() { return getToken(FiboParser.DOSPUNTOS, 0); }
		public DospuntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dospuntos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterDospuntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitDospuntos(this);
		}
	}

	public final DospuntosContext dospuntos() throws RecognitionException {
		DospuntosContext _localctx = new DospuntosContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(DOSPUNTOS);
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

	public static class PuntoycomaContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(FiboParser.PUNTOCOMA, 0); }
		public PuntoycomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntoycoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterPuntoycoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitPuntoycoma(this);
		}
	}

	public final PuntoycomaContext puntoycoma() throws RecognitionException {
		PuntoycomaContext _localctx = new PuntoycomaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_puntoycoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(PUNTOCOMA);
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

	public static class SaltolineaContext extends ParserRuleContext {
		public TerminalNode SALTOLINEA() { return getToken(FiboParser.SALTOLINEA, 0); }
		public SaltolineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saltolinea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterSaltolinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitSaltolinea(this);
		}
	}

	public final SaltolineaContext saltolinea() throws RecognitionException {
		SaltolineaContext _localctx = new SaltolineaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_saltolinea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(SALTOLINEA);
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

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(FiboParser.BEGIN, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(BEGIN);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(FiboParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(END);
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

	public static class End_ifContext extends ParserRuleContext {
		public TerminalNode END_IF() { return getToken(FiboParser.END_IF, 0); }
		public End_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterEnd_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitEnd_if(this);
		}
	}

	public final End_ifContext end_if() throws RecognitionException {
		End_ifContext _localctx = new End_ifContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_end_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(END_IF);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(FiboParser.INCLUDE, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(INCLUDE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FiboParser.FUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(FUNCTION);
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

	public static class InContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(FiboParser.IN, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitIn(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(IN);
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FiboParser.IF, 0); }
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(IF);
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

	public static class Else_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FiboParser.ELSE, 0); }
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitElse_(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(ELSE);
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FiboParser.WHILE, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(WHILE);
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

	public static class For_Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FiboParser.FOR, 0); }
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitFor_(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(FOR);
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

	public static class Return_Context extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FiboParser.RETURN, 0); }
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitReturn_(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(RETURN);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FiboParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(STRING);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FiboParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(FiboParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ValorContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_valor);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				numero();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				string();
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

	public static class R_stringContext extends ParserRuleContext {
		public TerminalNode R_STRING() { return getToken(FiboParser.R_STRING, 0); }
		public R_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterR_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitR_string(this);
		}
	}

	public final R_stringContext r_string() throws RecognitionException {
		R_stringContext _localctx = new R_stringContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_r_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(R_STRING);
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

	public static class R_numberContext extends ParserRuleContext {
		public TerminalNode R_NUMBER() { return getToken(FiboParser.R_NUMBER, 0); }
		public R_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterR_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitR_number(this);
		}
	}

	public final R_numberContext r_number() throws RecognitionException {
		R_numberContext _localctx = new R_numberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_r_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(R_NUMBER);
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

	public static class R_voidContext extends ParserRuleContext {
		public TerminalNode R_VOID() { return getToken(FiboParser.R_VOID, 0); }
		public R_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterR_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitR_void(this);
		}
	}

	public final R_voidContext r_void() throws RecognitionException {
		R_voidContext _localctx = new R_voidContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_r_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(R_VOID);
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

	public static class R_variableContext extends ParserRuleContext {
		public R_stringContext r_string() {
			return getRuleContext(R_stringContext.class,0);
		}
		public R_numberContext r_number() {
			return getRuleContext(R_numberContext.class,0);
		}
		public R_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterR_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitR_variable(this);
		}
	}

	public final R_variableContext r_variable() throws RecognitionException {
		R_variableContext _localctx = new R_variableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_r_variable);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				r_string();
				}
				break;
			case R_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				r_number();
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

	public static class RetornoContext extends ParserRuleContext {
		public R_variableContext r_variable() {
			return getRuleContext(R_variableContext.class,0);
		}
		public R_voidContext r_void() {
			return getRuleContext(R_voidContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiboParserListener ) ((FiboParserListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_retorno);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_STRING:
			case R_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				r_variable();
				}
				break;
			case R_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				r_void();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0216\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\2\3\2\3\2\3\2\3\2\5\2\u0084\n\2\3\2\3\2\7\2\u0088"+
		"\n\2\f\2\16\2\u008b\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u0098\n\4\f\4\16\4\u009b\13\4\3\4\3\4\7\4\u009f\n\4\f\4\16\4\u00a2"+
		"\13\4\3\4\3\4\3\4\3\4\7\4\u00a8\n\4\f\4\16\4\u00ab\13\4\3\4\7\4\u00ae"+
		"\n\4\f\4\16\4\u00b1\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u00ba\n\5\f\5"+
		"\16\5\u00bd\13\5\3\5\3\5\3\5\3\5\7\5\u00c3\n\5\f\5\16\5\u00c6\13\5\3\5"+
		"\7\5\u00c9\n\5\f\5\16\5\u00cc\13\5\3\5\3\5\3\6\3\6\7\6\u00d2\n\6\f\6\16"+
		"\6\u00d5\13\6\3\6\3\6\3\6\3\6\7\6\u00db\n\6\f\6\16\6\u00de\13\6\3\6\7"+
		"\6\u00e1\n\6\f\6\16\6\u00e4\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7\u00ed"+
		"\n\7\f\7\16\7\u00f0\13\7\3\7\3\7\7\7\u00f4\n\7\f\7\16\7\u00f7\13\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00fd\n\7\f\7\16\7\u0100\13\7\3\7\7\7\u0103\n\7\f\7\16"+
		"\7\u0106\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u010e\n\b\3\b\3\b\3\b\5\b\u0113"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u011a\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u012d\n\f\f\f\16\f\u0130"+
		"\13\f\7\f\u0132\n\f\f\f\16\f\u0135\13\f\3\f\3\f\3\f\3\f\7\f\u013b\n\f"+
		"\f\f\16\f\u013e\13\f\3\f\3\f\7\f\u0142\n\f\f\f\16\f\u0145\13\f\3\f\3\f"+
		"\3\f\3\f\7\f\u014b\n\f\f\f\16\f\u014e\13\f\3\f\7\f\u0151\n\f\f\f\16\f"+
		"\u0154\13\f\3\f\7\f\u0157\n\f\f\f\16\f\u015a\13\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0163\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u016b\n\16\f"+
		"\16\16\16\u016e\13\16\7\16\u0170\n\16\f\16\16\16\u0173\13\16\3\16\3\16"+
		"\3\17\3\17\5\17\u0179\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0185\n\20\3\20\3\20\3\20\5\20\u018a\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0191\n\20\3\20\3\20\7\20\u0195\n\20\f\20\16\20\u0198\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01a1\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u01a8\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01b1"+
		"\n\21\3\21\3\21\7\21\u01b5\n\21\f\21\16\21\u01b8\13\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\5\67\u0206\n\67\38\38\39\39\3:\3:\3;\3;\5;\u0210"+
		"\n;\3<\3<\5<\u0214\n<\3<\2\3\36=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\3\3\2\33\34\2"+
		"\u0226\2\u0089\3\2\2\2\4\u008c\3\2\2\2\6\u0092\3\2\2\2\b\u00b4\3\2\2\2"+
		"\n\u00cf\3\2\2\2\f\u00e7\3\2\2\2\16\u0109\3\2\2\2\20\u0119\3\2\2\2\22"+
		"\u011b\3\2\2\2\24\u011f\3\2\2\2\26\u0123\3\2\2\2\30\u015d\3\2\2\2\32\u0164"+
		"\3\2\2\2\34\u0178\3\2\2\2\36\u0184\3\2\2\2 \u0199\3\2\2\2\"\u01b9\3\2"+
		"\2\2$\u01bb\3\2\2\2&\u01bd\3\2\2\2(\u01bf\3\2\2\2*\u01c1\3\2\2\2,\u01c3"+
		"\3\2\2\2.\u01c5\3\2\2\2\60\u01c7\3\2\2\2\62\u01c9\3\2\2\2\64\u01cb\3\2"+
		"\2\2\66\u01cd\3\2\2\28\u01cf\3\2\2\2:\u01d1\3\2\2\2<\u01d3\3\2\2\2>\u01d5"+
		"\3\2\2\2@\u01d7\3\2\2\2B\u01d9\3\2\2\2D\u01db\3\2\2\2F\u01dd\3\2\2\2H"+
		"\u01df\3\2\2\2J\u01e1\3\2\2\2L\u01e3\3\2\2\2N\u01e5\3\2\2\2P\u01e7\3\2"+
		"\2\2R\u01e9\3\2\2\2T\u01eb\3\2\2\2V\u01ed\3\2\2\2X\u01ef\3\2\2\2Z\u01f1"+
		"\3\2\2\2\\\u01f3\3\2\2\2^\u01f5\3\2\2\2`\u01f7\3\2\2\2b\u01f9\3\2\2\2"+
		"d\u01fb\3\2\2\2f\u01fd\3\2\2\2h\u01ff\3\2\2\2j\u0201\3\2\2\2l\u0205\3"+
		"\2\2\2n\u0207\3\2\2\2p\u0209\3\2\2\2r\u020b\3\2\2\2t\u020f\3\2\2\2v\u0213"+
		"\3\2\2\2xz\5P)\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0083\3\2\2"+
		"\2}{\3\2\2\2~\u0084\5\30\r\2\177\u0084\5\26\f\2\u0080\u0084\5\24\13\2"+
		"\u0081\u0084\5\22\n\2\u0082\u0084\5\32\16\2\u0083~\3\2\2\2\u0083\177\3"+
		"\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\5P)\2\u0086\u0088\3\2\2\2\u0087{\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\3\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008d\5f\64\2\u008d\u008e\5F$\2\u008e\u008f"+
		"\5\36\20\2\u008f\u0090\5H%\2\u0090\u0091\5N(\2\u0091\5\3\2\2\2\u0092\u0093"+
		"\5b\62\2\u0093\u0094\5F$\2\u0094\u0095\5 \21\2\u0095\u0099\5H%\2\u0096"+
		"\u0098\5P)\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0"+
		"\5R*\2\u009d\u009f\5P)\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a9\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a8\5\34\17\2\u00a4\u00a8\5\30\r\2\u00a5\u00a8\5\22\n\2\u00a6"+
		"\u00a8\5\20\t\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5P"+
		")\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5T"+
		"+\2\u00b3\7\3\2\2\2\u00b4\u00b5\5^\60\2\u00b5\u00b6\5F$\2\u00b6\u00b7"+
		"\5 \21\2\u00b7\u00bb\5H%\2\u00b8\u00ba\5P)\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c4\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c3\5\34\17\2\u00bf\u00c3\5\30\r\2\u00c0"+
		"\u00c3\5\22\n\2\u00c1\u00c3\5\20\t\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\5P)\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\5V,\2\u00ce\t\3\2\2\2\u00cf\u00d3\5`\61\2\u00d0\u00d2\5P)\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00dc\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\34\17\2\u00d7"+
		"\u00db\5\30\r\2\u00d8\u00db\5\22\n\2\u00d9\u00db\5\20\t\2\u00da\u00d6"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e2\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5P)\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5V,\2\u00e6\13\3\2\2\2\u00e7\u00e8\5d\63\2"+
		"\u00e8\u00e9\5F$\2\u00e9\u00ea\5\16\b\2\u00ea\u00ee\5H%\2\u00eb\u00ed"+
		"\5P)\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\5R"+
		"*\2\u00f2\u00f4\5P)\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fe\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fd\5\34\17\2\u00f9\u00fd\5\30\r\2\u00fa\u00fd\5\22\n\2\u00fb\u00fd"+
		"\5\20\t\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5P)\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5T+\2\u0108\r"+
		"\3\2\2\2\u0109\u010a\5B\"\2\u010a\u010d\5\\/\2\u010b\u010e\5@!\2\u010c"+
		"\u010e\5j\66\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0112\5L\'\2\u0110\u0113\5@!\2\u0111\u0113\5j\66\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113\17\3\2\2\2\u0114\u011a\5\6\4\2\u0115"+
		"\u011a\5\b\5\2\u0116\u011a\5\n\6\2\u0117\u011a\5\f\7\2\u0118\u011a\5\4"+
		"\3\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\21\3\2\2\2\u011b\u011c\5B\"\2"+
		"\u011c\u011d\5D#\2\u011d\u011e\5\34\17\2\u011e\23\3\2\2\2\u011f\u0120"+
		"\5X-\2\u0120\u0121\5B\"\2\u0121\u0122\5N(\2\u0122\25\3\2\2\2\u0123\u0124"+
		"\5Z.\2\u0124\u0125\5B\"\2\u0125\u0133\5F$\2\u0126\u0127\5t;\2\u0127\u012e"+
		"\5B\"\2\u0128\u0129\5J&\2\u0129\u012a\5t;\2\u012a\u012b\5B\"\2\u012b\u012d"+
		"\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0126\3\2"+
		"\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5H%\2\u0137\u0138\5L\'"+
		"\2\u0138\u013c\5v<\2\u0139\u013b\5P)\2\u013a\u0139\3\2\2\2\u013b\u013e"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0143\5R*\2\u0140\u0142\5P)\2\u0141\u0140\3\2\2\2"+
		"\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014c"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u014b\5\34\17\2\u0147\u014b\5\30\r"+
		"\2\u0148\u014b\5\22\n\2\u0149\u014b\5\20\t\2\u014a\u0146\3\2\2\2\u014a"+
		"\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0151\5\4\3\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0158\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0157\5P)\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2"+
		"\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015c\5T+\2\u015c\27\3\2\2\2\u015d\u0162\5v<\2\u015e\u015f"+
		"\5B\"\2\u015f\u0160\5N(\2\u0160\u0163\3\2\2\2\u0161\u0163\5\22\n\2\u0162"+
		"\u015e\3\2\2\2\u0162\u0161\3\2\2\2\u0163\31\3\2\2\2\u0164\u0165\5> \2"+
		"\u0165\u0171\5F$\2\u0166\u016c\5\36\20\2\u0167\u0168\5J&\2\u0168\u0169"+
		"\5\36\20\2\u0169\u016b\3\2\2\2\u016a\u0167\3\2\2\2\u016b\u016e\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016f\u0166\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5H"+
		"%\2\u0175\33\3\2\2\2\u0176\u0179\5\36\20\2\u0177\u0179\5 \21\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\5N(\2\u017b"+
		"\35\3\2\2\2\u017c\u017d\b\20\1\2\u017d\u0185\5l\67\2\u017e\u017f\5F$\2"+
		"\u017f\u0180\5\36\20\2\u0180\u0181\5H%\2\u0181\u0185\3\2\2\2\u0182\u0185"+
		"\5\32\16\2\u0183\u0185\5@!\2\u0184\u017c\3\2\2\2\u0184\u017e\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0196\3\2\2\2\u0186\u0189\f\b"+
		"\2\2\u0187\u018a\5&\24\2\u0188\u018a\5(\25\2\u0189\u0187\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5\36\20\t\u018c\u0195\3"+
		"\2\2\2\u018d\u0190\f\7\2\2\u018e\u0191\5\"\22\2\u018f\u0191\5$\23\2\u0190"+
		"\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\5\36"+
		"\20\b\u0193\u0195\3\2\2\2\u0194\u0186\3\2\2\2\u0194\u018d\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\37\3\2\2"+
		"\2\u0198\u0196\3\2\2\2\u0199\u01a0\5\36\20\2\u019a\u01a1\5*\26\2\u019b"+
		"\u01a1\5,\27\2\u019c\u01a1\5.\30\2\u019d\u01a1\5\60\31\2\u019e\u01a1\5"+
		"\62\32\2\u019f\u01a1\5\64\33\2\u01a0\u019a\3\2\2\2\u01a0\u019b\3\2\2\2"+
		"\u01a0\u019c\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01b6\5\36\20\2\u01a3\u01a8\5\66\34"+
		"\2\u01a4\u01a8\58\35\2\u01a5\u01a8\5:\36\2\u01a6\u01a8\5<\37\2\u01a7\u01a3"+
		"\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01b0\5\36\20\2\u01aa\u01b1\5*\26\2\u01ab\u01b1\5"+
		",\27\2\u01ac\u01b1\5.\30\2\u01ad\u01b1\5\60\31\2\u01ae\u01b1\5\62\32\2"+
		"\u01af\u01b1\5\64\33\2\u01b0\u01aa\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ac"+
		"\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\5\36\20\2\u01b3\u01b5\3\2\2\2\u01b4\u01a7\3"+
		"\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"!\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7\27\2\2\u01ba#\3\2\2\2\u01bb"+
		"\u01bc\7\30\2\2\u01bc%\3\2\2\2\u01bd\u01be\7\31\2\2\u01be\'\3\2\2\2\u01bf"+
		"\u01c0\7\32\2\2\u01c0)\3\2\2\2\u01c1\u01c2\7\r\2\2\u01c2+\3\2\2\2\u01c3"+
		"\u01c4\7\16\2\2\u01c4-\3\2\2\2\u01c5\u01c6\7\17\2\2\u01c6/\3\2\2\2\u01c7"+
		"\u01c8\7\20\2\2\u01c8\61\3\2\2\2\u01c9\u01ca\7\21\2\2\u01ca\63\3\2\2\2"+
		"\u01cb\u01cc\7\22\2\2\u01cc\65\3\2\2\2\u01cd\u01ce\7\23\2\2\u01ce\67\3"+
		"\2\2\2\u01cf\u01d0\7\24\2\2\u01d09\3\2\2\2\u01d1\u01d2\7\25\2\2\u01d2"+
		";\3\2\2\2\u01d3\u01d4\7\26\2\2\u01d4=\3\2\2\2\u01d5\u01d6\5B\"\2\u01d6"+
		"?\3\2\2\2\u01d7\u01d8\5B\"\2\u01d8A\3\2\2\2\u01d9\u01da\7,\2\2\u01daC"+
		"\3\2\2\2\u01db\u01dc\7\6\2\2\u01dcE\3\2\2\2\u01dd\u01de\7\7\2\2\u01de"+
		"G\3\2\2\2\u01df\u01e0\7\b\2\2\u01e0I\3\2\2\2\u01e1\u01e2\7\t\2\2\u01e2"+
		"K\3\2\2\2\u01e3\u01e4\7\n\2\2\u01e4M\3\2\2\2\u01e5\u01e6\7\13\2\2\u01e6"+
		"O\3\2\2\2\u01e7\u01e8\7\f\2\2\u01e8Q\3\2\2\2\u01e9\u01ea\7%\2\2\u01ea"+
		"S\3\2\2\2\u01eb\u01ec\7&\2\2\u01ecU\3\2\2\2\u01ed\u01ee\7\'\2\2\u01ee"+
		"W\3\2\2\2\u01ef\u01f0\7!\2\2\u01f0Y\3\2\2\2\u01f1\u01f2\7$\2\2\u01f2["+
		"\3\2\2\2\u01f3\u01f4\7+\2\2\u01f4]\3\2\2\2\u01f5\u01f6\7\"\2\2\u01f6_"+
		"\3\2\2\2\u01f7\u01f8\7)\2\2\u01f8a\3\2\2\2\u01f9\u01fa\7#\2\2\u01fac\3"+
		"\2\2\2\u01fb\u01fc\7*\2\2\u01fce\3\2\2\2\u01fd\u01fe\7(\2\2\u01feg\3\2"+
		"\2\2\u01ff\u0200\7\35\2\2\u0200i\3\2\2\2\u0201\u0202\t\2\2\2\u0202k\3"+
		"\2\2\2\u0203\u0206\5j\66\2\u0204\u0206\5h\65\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206m\3\2\2\2\u0207\u0208\7\36\2\2\u0208o\3\2\2\2\u0209"+
		"\u020a\7\37\2\2\u020aq\3\2\2\2\u020b\u020c\7 \2\2\u020cs\3\2\2\2\u020d"+
		"\u0210\5n8\2\u020e\u0210\5p9\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2"+
		"\u0210u\3\2\2\2\u0211\u0214\5t;\2\u0212\u0214\5r:\2\u0213\u0211\3\2\2"+
		"\2\u0213\u0212\3\2\2\2\u0214w\3\2\2\2\62{\u0083\u0089\u0099\u00a0\u00a7"+
		"\u00a9\u00af\u00bb\u00c2\u00c4\u00ca\u00d3\u00da\u00dc\u00e2\u00ee\u00f5"+
		"\u00fc\u00fe\u0104\u010d\u0112\u0119\u012e\u0133\u013c\u0143\u014a\u014c"+
		"\u0152\u0158\u0162\u016c\u0171\u0178\u0184\u0189\u0190\u0194\u0196\u01a0"+
		"\u01a7\u01b0\u01b6\u0205\u020f\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}