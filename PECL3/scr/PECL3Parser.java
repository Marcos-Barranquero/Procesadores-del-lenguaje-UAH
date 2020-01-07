// Generated from .\src\PECL3Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PECL3Parser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_return_val = 1, RULE_while_op = 2, RULE_if_op = 3, 
		RULE_else_op = 4, RULE_for_op = 5, RULE_step_op = 6, RULE_basic_func = 7, 
		RULE_assign_sc = 8, RULE_assign = 9, RULE_lib = 10, RULE_def_func = 11, 
		RULE_def_var = 12, RULE_var_definition = 13, RULE_func_call = 14, RULE_func_sc = 15, 
		RULE_expr_total = 16, RULE_expr_content = 17, RULE_logic_expr = 18, RULE_add = 19, 
		RULE_sub = 20, RULE_mult = 21, RULE_quotient = 22, RULE_lesser = 23, RULE_greater = 24, 
		RULE_lesser_eq = 25, RULE_greater_eq = 26, RULE_eq = 27, RULE_not_eq = 28, 
		RULE_bit_and = 29, RULE_and = 30, RULE_bit_or = 31, RULE_or = 32, RULE_func_id = 33, 
		RULE_var_id = 34, RULE_identifier = 35, RULE_assign_value = 36, RULE_op_par = 37, 
		RULE_cl_par = 38, RULE_comma = 39, RULE_colon = 40, RULE_semi_colon = 41, 
		RULE_newline = 42, RULE_block_start = 43, RULE_do_start = 44, RULE_do_end = 45, 
		RULE_block_end = 46, RULE_if_end = 47, RULE_include_kw = 48, RULE_func_kw = 49, 
		RULE_in_kw = 50, RULE_if_kw = 51, RULE_else_kw = 52, RULE_while_kw = 53, 
		RULE_for_kw = 54, RULE_return_kw = 55, RULE_from_kw = 56, RULE_to_kw = 57, 
		RULE_step_kw = 58, RULE_then_kw = 59, RULE_true_kw = 60, RULE_false_kw = 61, 
		RULE_op_bracket = 62, RULE_cl_bracket = 63, RULE_not = 64, RULE_string = 65, 
		RULE_boolean_n = 66, RULE_int_n = 67, RULE_float_n = 68, RULE_number = 69, 
		RULE_value = 70, RULE_type_string = 71, RULE_type_number = 72, RULE_type_void = 73, 
		RULE_type_boolean = 74, RULE_as_var_type = 75, RULE_as_type = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "return_val", "while_op", "if_op", "else_op", "for_op", "step_op", 
			"basic_func", "assign_sc", "assign", "lib", "def_func", "def_var", "var_definition", 
			"func_call", "func_sc", "expr_total", "expr_content", "logic_expr", "add", 
			"sub", "mult", "quotient", "lesser", "greater", "lesser_eq", "greater_eq", 
			"eq", "not_eq", "bit_and", "and", "bit_or", "or", "func_id", "var_id", 
			"identifier", "assign_value", "op_par", "cl_par", "comma", "colon", "semi_colon", 
			"newline", "block_start", "do_start", "do_end", "block_end", "if_end", 
			"include_kw", "func_kw", "in_kw", "if_kw", "else_kw", "while_kw", "for_kw", 
			"return_kw", "from_kw", "to_kw", "step_kw", "then_kw", "true_kw", "false_kw", 
			"op_bracket", "cl_bracket", "not", "string", "boolean_n", "int_n", "float_n", 
			"number", "value", "type_string", "type_number", "type_void", "type_boolean", 
			"as_var_type", "as_type"
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

	@Override
	public String getGrammarFileName() { return "PECL3Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PECL3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Def_funcContext> def_func() {
			return getRuleContexts(Def_funcContext.class);
		}
		public Def_funcContext def_func(int i) {
			return getRuleContext(Def_funcContext.class,i);
		}
		public List<LibContext> lib() {
			return getRuleContexts(LibContext.class);
		}
		public LibContext lib(int i) {
			return getRuleContext(LibContext.class,i);
		}
		public List<Assign_scContext> assign_sc() {
			return getRuleContexts(Assign_scContext.class);
		}
		public Assign_scContext assign_sc(int i) {
			return getRuleContext(Assign_scContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << AS_STRING) | (1L << AS_NUMBER) | (1L << AS_VOID) | (1L << AS_BOOLEAN) | (1L << INCLUDE) | (1L << FUNC) | (1L << ID))) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(154);
					newline();
					}
					break;
				case AS_STRING:
				case AS_NUMBER:
				case AS_VOID:
				case AS_BOOLEAN:
					{
					setState(155);
					def_var();
					}
					break;
				case FUNC:
					{
					setState(156);
					def_func();
					}
					break;
				case INCLUDE:
					{
					setState(157);
					lib();
					}
					break;
				case ID:
					{
					setState(158);
					assign_sc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
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
		public Return_kwContext return_kw() {
			return getRuleContext(Return_kwContext.class,0);
		}
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
		public Expr_contentContext expr_content() {
			return getRuleContext(Expr_contentContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public Return_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterReturn_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitReturn_val(this);
		}
	}

	public final Return_valContext return_val() throws RecognitionException {
		Return_valContext _localctx = new Return_valContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_return_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			return_kw();
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(165);
				op_par();
				}
				break;
			}
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(168);
				expr_content(0);
				}
				break;
			case 2:
				{
				setState(169);
				logic_expr();
				}
				break;
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CP) {
				{
				setState(172);
				cl_par();
				}
			}

			setState(175);
			semi_colon();
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
		public While_kwContext while_kw() {
			return getRuleContext(While_kwContext.class,0);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public Block_startContext block_start() {
			return getRuleContext(Block_startContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<Expr_totalContext> expr_total() {
			return getRuleContexts(Expr_totalContext.class);
		}
		public Expr_totalContext expr_total(int i) {
			return getRuleContext(Expr_totalContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Assign_scContext> assign_sc() {
			return getRuleContexts(Assign_scContext.class);
		}
		public Assign_scContext assign_sc(int i) {
			return getRuleContext(Assign_scContext.class,i);
		}
		public List<Basic_funcContext> basic_func() {
			return getRuleContexts(Basic_funcContext.class);
		}
		public Basic_funcContext basic_func(int i) {
			return getRuleContext(Basic_funcContext.class,i);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public While_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterWhile_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitWhile_op(this);
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
			setState(177);
			while_kw();
			setState(178);
			op_par();
			setState(179);
			logic_expr();
			setState(180);
			cl_par();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(181);
					newline();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(187);
					expr_total();
					}
					break;
				case 2:
					{
					setState(188);
					def_var();
					}
					break;
				case 3:
					{
					setState(189);
					assign_sc();
					}
					break;
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						newline();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				}
				break;
			case 2:
				{
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(198);
						newline();
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(204);
					block_start();
					}
					break;
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						newline();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(217);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(213);
							expr_total();
							}
							break;
						case 2:
							{
							setState(214);
							def_var();
							}
							break;
						case 3:
							{
							setState(215);
							assign_sc();
							}
							break;
						case 4:
							{
							setState(216);
							basic_func();
							}
							break;
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(222);
						newline();
						}
						}
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(228);
					block_end();
					}
					break;
				}
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

	public static class If_opContext extends ParserRuleContext {
		public If_kwContext if_kw() {
			return getRuleContext(If_kwContext.class,0);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public Then_kwContext then_kw() {
			return getRuleContext(Then_kwContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public If_endContext if_end() {
			return getRuleContext(If_endContext.class,0);
		}
		public Else_opContext else_op() {
			return getRuleContext(Else_opContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<Expr_totalContext> expr_total() {
			return getRuleContexts(Expr_totalContext.class);
		}
		public Expr_totalContext expr_total(int i) {
			return getRuleContext(Expr_totalContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Assign_scContext> assign_sc() {
			return getRuleContexts(Assign_scContext.class);
		}
		public Assign_scContext assign_sc(int i) {
			return getRuleContext(Assign_scContext.class,i);
		}
		public List<Basic_funcContext> basic_func() {
			return getRuleContexts(Basic_funcContext.class);
		}
		public Basic_funcContext basic_func(int i) {
			return getRuleContext(Basic_funcContext.class,i);
		}
		public If_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterIf_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitIf_op(this);
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
			setState(233);
			if_kw();
			setState(234);
			op_par();
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(235);
				logic_expr();
				}
				break;
			case 2:
				{
				setState(236);
				func_call();
				}
				break;
			}
			setState(239);
			cl_par();
			setState(240);
			then_kw();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					newline();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << AS_STRING) | (1L << AS_NUMBER) | (1L << AS_VOID) | (1L << AS_BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(247);
					expr_total();
					}
					break;
				case 2:
					{
					setState(248);
					def_var();
					}
					break;
				case 3:
					{
					setState(249);
					assign_sc();
					}
					break;
				case 4:
					{
					setState(250);
					basic_func();
					}
					break;
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(256);
				newline();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END_IF:
				{
				setState(262);
				if_end();
				}
				break;
			case ELSE:
				{
				setState(263);
				else_op();
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

	public static class Else_opContext extends ParserRuleContext {
		public Else_kwContext else_kw() {
			return getRuleContext(Else_kwContext.class,0);
		}
		public If_endContext if_end() {
			return getRuleContext(If_endContext.class,0);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<Expr_totalContext> expr_total() {
			return getRuleContexts(Expr_totalContext.class);
		}
		public Expr_totalContext expr_total(int i) {
			return getRuleContext(Expr_totalContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Assign_scContext> assign_sc() {
			return getRuleContexts(Assign_scContext.class);
		}
		public Assign_scContext assign_sc(int i) {
			return getRuleContext(Assign_scContext.class,i);
		}
		public List<Basic_funcContext> basic_func() {
			return getRuleContexts(Basic_funcContext.class);
		}
		public Basic_funcContext basic_func(int i) {
			return getRuleContext(Basic_funcContext.class,i);
		}
		public Else_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterElse_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitElse_op(this);
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
			setState(266);
			else_kw();
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					newline();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << AS_STRING) | (1L << AS_NUMBER) | (1L << AS_VOID) | (1L << AS_BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(273);
					expr_total();
					}
					break;
				case 2:
					{
					setState(274);
					def_var();
					}
					break;
				case 3:
					{
					setState(275);
					assign_sc();
					}
					break;
				case 4:
					{
					setState(276);
					basic_func();
					}
					break;
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(282);
				newline();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			if_end();
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
		public Do_endContext do_end() {
			return getRuleContext(Do_endContext.class,0);
		}
		public For_kwContext for_kw() {
			return getRuleContext(For_kwContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public From_kwContext from_kw() {
			return getRuleContext(From_kwContext.class,0);
		}
		public To_kwContext to_kw() {
			return getRuleContext(To_kwContext.class,0);
		}
		public Do_startContext do_start() {
			return getRuleContext(Do_startContext.class,0);
		}
		public List<Expr_totalContext> expr_total() {
			return getRuleContexts(Expr_totalContext.class);
		}
		public Expr_totalContext expr_total(int i) {
			return getRuleContext(Expr_totalContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Assign_scContext> assign_sc() {
			return getRuleContexts(Assign_scContext.class);
		}
		public Assign_scContext assign_sc(int i) {
			return getRuleContext(Assign_scContext.class,i);
		}
		public List<Basic_funcContext> basic_func() {
			return getRuleContexts(Basic_funcContext.class);
		}
		public Basic_funcContext basic_func(int i) {
			return getRuleContext(Basic_funcContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public List<Int_nContext> int_n() {
			return getRuleContexts(Int_nContext.class);
		}
		public Int_nContext int_n(int i) {
			return getRuleContext(Int_nContext.class,i);
		}
		public Step_opContext step_op() {
			return getRuleContext(Step_opContext.class,0);
		}
		public Block_startContext block_start() {
			return getRuleContext(Block_startContext.class,0);
		}
		public For_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFor_op(this);
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
			{
			setState(290);
			for_kw();
			setState(291);
			identifier();
			setState(292);
			from_kw();
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(293);
				identifier();
				}
				break;
			case INT:
				{
				setState(294);
				int_n();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(297);
			to_kw();
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(298);
				identifier();
				}
				break;
			case INT:
				{
				setState(299);
				int_n();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(302);
				step_op();
				}
			}

			setState(305);
			do_start();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					newline();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ST_BLOCK) {
				{
				setState(312);
				block_start();
				}
			}

			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					newline();
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << NOT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << AS_STRING) | (1L << AS_NUMBER) | (1L << AS_VOID) | (1L << AS_BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(321);
					expr_total();
					}
					break;
				case 2:
					{
					setState(322);
					def_var();
					}
					break;
				case 3:
					{
					setState(323);
					assign_sc();
					}
					break;
				case 4:
					{
					setState(324);
					basic_func();
					}
					break;
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(330);
				newline();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			do_end();
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(337);
				block_end();
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

	public static class Step_opContext extends ParserRuleContext {
		public Step_kwContext step_kw() {
			return getRuleContext(Step_kwContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Int_nContext int_n() {
			return getRuleContext(Int_nContext.class,0);
		}
		public Step_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterStep_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitStep_op(this);
		}
	}

	public final Step_opContext step_op() throws RecognitionException {
		Step_opContext _localctx = new Step_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_step_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			step_kw();
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(341);
				identifier();
				}
				break;
			case INT:
				{
				setState(342);
				int_n();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Basic_funcContext extends ParserRuleContext {
		public While_opContext while_op() {
			return getRuleContext(While_opContext.class,0);
		}
		public If_opContext if_op() {
			return getRuleContext(If_opContext.class,0);
		}
		public For_opContext for_op() {
			return getRuleContext(For_opContext.class,0);
		}
		public Return_valContext return_val() {
			return getRuleContext(Return_valContext.class,0);
		}
		public Basic_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterBasic_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitBasic_func(this);
		}
	}

	public final Basic_funcContext basic_func() throws RecognitionException {
		Basic_funcContext _localctx = new Basic_funcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basic_func);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				while_op();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				if_op();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				for_op();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
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

	public static class Assign_scContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
		public Assign_scContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_sc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAssign_sc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAssign_sc(this);
		}
	}

	public final Assign_scContext assign_sc() throws RecognitionException {
		Assign_scContext _localctx = new Assign_scContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_sc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			assign();
			setState(352);
			semi_colon();
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

	public static class AssignContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Assign_valueContext assign_value() {
			return getRuleContext(Assign_valueContext.class,0);
		}
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public List<Expr_contentContext> expr_content() {
			return getRuleContexts(Expr_contentContext.class);
		}
		public Expr_contentContext expr_content(int i) {
			return getRuleContext(Expr_contentContext.class,i);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Int_nContext int_n() {
			return getRuleContext(Int_nContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			identifier();
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(355);
				assign_value();
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(356);
					expr_content(0);
					}
					break;
				case 2:
					{
					setState(357);
					logic_expr();
					}
					break;
				}
				}
				}
				break;
			case OP_BRACKET:
				{
				{
				setState(360);
				op_bracket();
				setState(363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(361);
					int_n();
					}
					break;
				case ID:
					{
					setState(362);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				cl_bracket();
				setState(366);
				assign_value();
				setState(367);
				op_par();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(368);
					expr_content(0);
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(369);
						comma();
						setState(370);
						expr_content(0);
						}
						}
						setState(376);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(379);
				cl_par();
				}
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

	public static class LibContext extends ParserRuleContext {
		public Include_kwContext include_kw() {
			return getRuleContext(Include_kwContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
		public LibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterLib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitLib(this);
		}
	}

	public final LibContext lib() throws RecognitionException {
		LibContext _localctx = new LibContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			include_kw();
			setState(384);
			identifier();
			setState(385);
			semi_colon();
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

	public static class Def_funcContext extends ParserRuleContext {
		public Func_kwContext func_kw() {
			return getRuleContext(Func_kwContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public As_typeContext as_type() {
			return getRuleContext(As_typeContext.class,0);
		}
		public Block_startContext block_start() {
			return getRuleContext(Block_startContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public List<As_var_typeContext> as_var_type() {
			return getRuleContexts(As_var_typeContext.class);
		}
		public As_var_typeContext as_var_type(int i) {
			return getRuleContext(As_var_typeContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<Expr_totalContext> expr_total() {
			return getRuleContexts(Expr_totalContext.class);
		}
		public Expr_totalContext expr_total(int i) {
			return getRuleContext(Expr_totalContext.class,i);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<Assign_scContext> assign_sc() {
			return getRuleContexts(Assign_scContext.class);
		}
		public Assign_scContext assign_sc(int i) {
			return getRuleContext(Assign_scContext.class,i);
		}
		public List<Basic_funcContext> basic_func() {
			return getRuleContexts(Basic_funcContext.class);
		}
		public Basic_funcContext basic_func(int i) {
			return getRuleContext(Basic_funcContext.class,i);
		}
		public Return_valContext return_val() {
			return getRuleContext(Return_valContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitDef_func(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_def_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			func_kw();
			setState(388);
			identifier();
			setState(389);
			op_par();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS_STRING) | (1L << AS_NUMBER) | (1L << AS_BOOLEAN))) != 0)) {
				{
				{
				setState(390);
				as_var_type();
				setState(391);
				identifier();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(392);
					comma();
					setState(393);
					as_var_type();
					setState(394);
					identifier();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			cl_par();
			setState(407);
			colon();
			setState(408);
			as_type();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(409);
				newline();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			block_start();
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					newline();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(422);
						expr_total();
						}
						break;
					case 2:
						{
						setState(423);
						def_var();
						}
						break;
					case 3:
						{
						setState(424);
						assign_sc();
						}
						break;
					case 4:
						{
						setState(425);
						basic_func();
						}
						break;
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(431);
					newline();
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				return_val();
				}
				break;
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(440);
				newline();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			block_end();
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

	public static class Def_varContext extends ParserRuleContext {
		public As_typeContext as_type() {
			return getRuleContext(As_typeContext.class,0);
		}
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public Def_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterDef_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitDef_var(this);
		}
	}

	public final Def_varContext def_var() throws RecognitionException {
		Def_varContext _localctx = new Def_varContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_def_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			as_type();
			{
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(449);
						var_definition();
						}
						break;
					case 2:
						{
						setState(450);
						assign();
						}
						break;
					}
					setState(453);
					comma();
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(460);
				var_definition();
				}
				break;
			case 2:
				{
				setState(461);
				assign();
				}
				break;
			}
			setState(464);
			semi_colon();
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

	public static class Var_definitionContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Op_bracketContext op_bracket() {
			return getRuleContext(Op_bracketContext.class,0);
		}
		public Cl_bracketContext cl_bracket() {
			return getRuleContext(Cl_bracketContext.class,0);
		}
		public Int_nContext int_n() {
			return getRuleContext(Int_nContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterVar_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitVar_definition(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			identifier();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_BRACKET) {
				{
				setState(467);
				op_bracket();
				setState(470);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(468);
					int_n();
					}
					break;
				case ID:
					{
					setState(469);
					identifier();
					}
					break;
				case CL_BRACKET:
					break;
				default:
					break;
				}
				setState(472);
				cl_bracket();
				}
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

	public static class Func_callContext extends ParserRuleContext {
		public Func_idContext func_id() {
			return getRuleContext(Func_idContext.class,0);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public List<Expr_contentContext> expr_content() {
			return getRuleContexts(Expr_contentContext.class);
		}
		public Expr_contentContext expr_content(int i) {
			return getRuleContext(Expr_contentContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			func_id();
			setState(477);
			op_par();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(478);
				expr_content(0);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(479);
					comma();
					setState(480);
					expr_content(0);
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			cl_par();
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

	public static class Func_scContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
		public Func_scContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_sc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFunc_sc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFunc_sc(this);
		}
	}

	public final Func_scContext func_sc() throws RecognitionException {
		Func_scContext _localctx = new Func_scContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_sc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			func_call();
			setState(495);
			semi_colon();
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

	public static class Expr_totalContext extends ParserRuleContext {
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
		public Expr_contentContext expr_content() {
			return getRuleContext(Expr_contentContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Expr_totalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_total; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterExpr_total(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitExpr_total(this);
		}
	}

	public final Expr_totalContext expr_total() throws RecognitionException {
		Expr_totalContext _localctx = new Expr_totalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_total);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(497);
				expr_content(0);
				}
				break;
			case 2:
				{
				setState(498);
				logic_expr();
				}
				break;
			}
			setState(501);
			semi_colon();
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

	public static class Expr_contentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Op_parContext op_par() {
			return getRuleContext(Op_parContext.class,0);
		}
		public List<Expr_contentContext> expr_content() {
			return getRuleContexts(Expr_contentContext.class);
		}
		public Expr_contentContext expr_content(int i) {
			return getRuleContext(Expr_contentContext.class,i);
		}
		public Cl_parContext cl_par() {
			return getRuleContext(Cl_parContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public QuotientContext quotient() {
			return getRuleContext(QuotientContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public Expr_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterExpr_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitExpr_content(this);
		}
	}

	public final Expr_contentContext expr_content() throws RecognitionException {
		return expr_content(0);
	}

	private Expr_contentContext expr_content(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_contentContext _localctx = new Expr_contentContext(_ctx, _parentState);
		Expr_contentContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr_content, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(504);
				value();
				}
				break;
			case 2:
				{
				setState(505);
				op_par();
				setState(506);
				expr_content(0);
				setState(507);
				cl_par();
				}
				break;
			case 3:
				{
				setState(509);
				func_call();
				}
				break;
			case 4:
				{
				setState(510);
				var_id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_contentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_content);
						setState(513);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(516);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(514);
							mult();
							}
							break;
						case QUOTIENT:
							{
							setState(515);
							quotient();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(518);
						expr_content(7);
						}
						break;
					case 2:
						{
						_localctx = new Expr_contentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_content);
						setState(520);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(523);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(521);
							add();
							}
							break;
						case SUB:
							{
							setState(522);
							sub();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(525);
						expr_content(6);
						}
						break;
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public Boolean_nContext boolean_n() {
			return getRuleContext(Boolean_nContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Expr_contentContext> expr_content() {
			return getRuleContexts(Expr_contentContext.class);
		}
		public Expr_contentContext expr_content(int i) {
			return getRuleContext(Expr_contentContext.class,i);
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
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public Lesser_eqContext lesser_eq() {
			return getRuleContext(Lesser_eqContext.class,0);
		}
		public Greater_eqContext greater_eq() {
			return getRuleContext(Greater_eqContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public Not_eqContext not_eq() {
			return getRuleContext(Not_eqContext.class,0);
		}
		public List<NotContext> not() {
			return getRuleContexts(NotContext.class);
		}
		public NotContext not(int i) {
			return getRuleContext(NotContext.class,i);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitLogic_expr(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logic_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(532);
					not();
					}
				}

				setState(535);
				boolean_n();
				}
				}
				break;
			case 2:
				{
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(536);
					not();
					}
				}

				setState(539);
				identifier();
				}
				}
				break;
			case 3:
				{
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(540);
					not();
					}
				}

				setState(543);
				expr_content(0);
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESSER:
					{
					setState(544);
					lesser();
					}
					break;
				case GREATER:
					{
					setState(545);
					greater();
					}
					break;
				case LESSER_EQ:
					{
					setState(546);
					lesser_eq();
					}
					break;
				case GREATER_EQ:
					{
					setState(547);
					greater_eq();
					}
					break;
				case EQ:
					{
					setState(548);
					eq();
					}
					break;
				case NOT_EQ:
					{
					setState(549);
					not_eq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(552);
					not();
					}
				}

				setState(555);
				expr_content(0);
				}
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BIT_AND:
						{
						setState(559);
						bit_and();
						}
						break;
					case AND:
						{
						setState(560);
						and();
						}
						break;
					case BIT_OR:
						{
						setState(561);
						bit_or();
						}
						break;
					case OR:
						{
						setState(562);
						or();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(565);
					logic_expr();
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PECL3Parser.ADD, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(ADD);
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(PECL3Parser.SUB, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(SUB);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(PECL3Parser.MULT, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(MULT);
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

	public static class QuotientContext extends ParserRuleContext {
		public TerminalNode QUOTIENT() { return getToken(PECL3Parser.QUOTIENT, 0); }
		public QuotientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterQuotient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitQuotient(this);
		}
	}

	public final QuotientContext quotient() throws RecognitionException {
		QuotientContext _localctx = new QuotientContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_quotient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(QUOTIENT);
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

	public static class LesserContext extends ParserRuleContext {
		public TerminalNode LESSER() { return getToken(PECL3Parser.LESSER, 0); }
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitLesser(this);
		}
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(LESSER);
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

	public static class GreaterContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(PECL3Parser.GREATER, 0); }
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(GREATER);
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

	public static class Lesser_eqContext extends ParserRuleContext {
		public TerminalNode LESSER_EQ() { return getToken(PECL3Parser.LESSER_EQ, 0); }
		public Lesser_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterLesser_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitLesser_eq(this);
		}
	}

	public final Lesser_eqContext lesser_eq() throws RecognitionException {
		Lesser_eqContext _localctx = new Lesser_eqContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lesser_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(LESSER_EQ);
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

	public static class Greater_eqContext extends ParserRuleContext {
		public TerminalNode GREATER_EQ() { return getToken(PECL3Parser.GREATER_EQ, 0); }
		public Greater_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterGreater_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitGreater_eq(this);
		}
	}

	public final Greater_eqContext greater_eq() throws RecognitionException {
		Greater_eqContext _localctx = new Greater_eqContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_greater_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(GREATER_EQ);
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

	public static class EqContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PECL3Parser.EQ, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitEq(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(EQ);
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

	public static class Not_eqContext extends ParserRuleContext {
		public TerminalNode NOT_EQ() { return getToken(PECL3Parser.NOT_EQ, 0); }
		public Not_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterNot_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitNot_eq(this);
		}
	}

	public final Not_eqContext not_eq() throws RecognitionException {
		Not_eqContext _localctx = new Not_eqContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_not_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(NOT_EQ);
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
		public TerminalNode BIT_AND() { return getToken(PECL3Parser.BIT_AND, 0); }
		public Bit_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterBit_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitBit_and(this);
		}
	}

	public final Bit_andContext bit_and() throws RecognitionException {
		Bit_andContext _localctx = new Bit_andContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bit_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
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
		public TerminalNode AND() { return getToken(PECL3Parser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
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
		public TerminalNode BIT_OR() { return getToken(PECL3Parser.BIT_OR, 0); }
		public Bit_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterBit_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitBit_or(this);
		}
	}

	public final Bit_orContext bit_or() throws RecognitionException {
		Bit_orContext _localctx = new Bit_orContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bit_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
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
		public TerminalNode OR() { return getToken(PECL3Parser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
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

	public static class Func_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Func_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFunc_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFunc_id(this);
		}
	}

	public final Func_idContext func_id() throws RecognitionException {
		Func_idContext _localctx = new Func_idContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_func_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			identifier();
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

	public static class Var_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitVar_id(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PECL3Parser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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

	public static class Assign_valueContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PECL3Parser.ASSIGN, 0); }
		public Assign_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAssign_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAssign_value(this);
		}
	}

	public final Assign_valueContext assign_value() throws RecognitionException {
		Assign_valueContext _localctx = new Assign_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assign_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(ASSIGN);
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

	public static class Op_parContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(PECL3Parser.OP, 0); }
		public Op_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterOp_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitOp_par(this);
		}
	}

	public final Op_parContext op_par() throws RecognitionException {
		Op_parContext _localctx = new Op_parContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(OP);
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

	public static class Cl_parContext extends ParserRuleContext {
		public TerminalNode CP() { return getToken(PECL3Parser.CP, 0); }
		public Cl_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterCl_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitCl_par(this);
		}
	}

	public final Cl_parContext cl_par() throws RecognitionException {
		Cl_parContext _localctx = new Cl_parContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cl_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(CP);
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PECL3Parser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(COMMA);
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

	public static class ColonContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PECL3Parser.COLON, 0); }
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitColon(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(COLON);
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

	public static class Semi_colonContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(PECL3Parser.SEMI_COLON, 0); }
		public Semi_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterSemi_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitSemi_colon(this);
		}
	}

	public final Semi_colonContext semi_colon() throws RecognitionException {
		Semi_colonContext _localctx = new Semi_colonContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_semi_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(SEMI_COLON);
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PECL3Parser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(NEWLINE);
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

	public static class Block_startContext extends ParserRuleContext {
		public TerminalNode ST_BLOCK() { return getToken(PECL3Parser.ST_BLOCK, 0); }
		public Block_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterBlock_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitBlock_start(this);
		}
	}

	public final Block_startContext block_start() throws RecognitionException {
		Block_startContext _localctx = new Block_startContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_block_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(ST_BLOCK);
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

	public static class Do_startContext extends ParserRuleContext {
		public TerminalNode ST_DO() { return getToken(PECL3Parser.ST_DO, 0); }
		public Do_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterDo_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitDo_start(this);
		}
	}

	public final Do_startContext do_start() throws RecognitionException {
		Do_startContext _localctx = new Do_startContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_do_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(ST_DO);
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

	public static class Do_endContext extends ParserRuleContext {
		public TerminalNode END_DO() { return getToken(PECL3Parser.END_DO, 0); }
		public Do_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterDo_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitDo_end(this);
		}
	}

	public final Do_endContext do_end() throws RecognitionException {
		Do_endContext _localctx = new Do_endContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_do_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(END_DO);
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

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode END_BLOCK() { return getToken(PECL3Parser.END_BLOCK, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitBlock_end(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(END_BLOCK);
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

	public static class If_endContext extends ParserRuleContext {
		public TerminalNode END_IF() { return getToken(PECL3Parser.END_IF, 0); }
		public If_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterIf_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitIf_end(this);
		}
	}

	public final If_endContext if_end() throws RecognitionException {
		If_endContext _localctx = new If_endContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_if_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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

	public static class Include_kwContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(PECL3Parser.INCLUDE, 0); }
		public Include_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterInclude_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitInclude_kw(this);
		}
	}

	public final Include_kwContext include_kw() throws RecognitionException {
		Include_kwContext _localctx = new Include_kwContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_include_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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

	public static class Func_kwContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(PECL3Parser.FUNC, 0); }
		public Func_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFunc_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFunc_kw(this);
		}
	}

	public final Func_kwContext func_kw() throws RecognitionException {
		Func_kwContext _localctx = new Func_kwContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_func_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(FUNC);
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

	public static class In_kwContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PECL3Parser.IN, 0); }
		public In_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterIn_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitIn_kw(this);
		}
	}

	public final In_kwContext in_kw() throws RecognitionException {
		In_kwContext _localctx = new In_kwContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_in_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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

	public static class If_kwContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PECL3Parser.IF, 0); }
		public If_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterIf_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitIf_kw(this);
		}
	}

	public final If_kwContext if_kw() throws RecognitionException {
		If_kwContext _localctx = new If_kwContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_if_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
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

	public static class Else_kwContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PECL3Parser.ELSE, 0); }
		public Else_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterElse_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitElse_kw(this);
		}
	}

	public final Else_kwContext else_kw() throws RecognitionException {
		Else_kwContext _localctx = new Else_kwContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_else_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
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

	public static class While_kwContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PECL3Parser.WHILE, 0); }
		public While_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterWhile_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitWhile_kw(this);
		}
	}

	public final While_kwContext while_kw() throws RecognitionException {
		While_kwContext _localctx = new While_kwContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_while_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
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

	public static class For_kwContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PECL3Parser.FOR, 0); }
		public For_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFor_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFor_kw(this);
		}
	}

	public final For_kwContext for_kw() throws RecognitionException {
		For_kwContext _localctx = new For_kwContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_for_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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

	public static class Return_kwContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PECL3Parser.RETURN, 0); }
		public Return_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterReturn_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitReturn_kw(this);
		}
	}

	public final Return_kwContext return_kw() throws RecognitionException {
		Return_kwContext _localctx = new Return_kwContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_return_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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

	public static class From_kwContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PECL3Parser.FROM, 0); }
		public From_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFrom_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFrom_kw(this);
		}
	}

	public final From_kwContext from_kw() throws RecognitionException {
		From_kwContext _localctx = new From_kwContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_from_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(FROM);
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

	public static class To_kwContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(PECL3Parser.TO, 0); }
		public To_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterTo_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitTo_kw(this);
		}
	}

	public final To_kwContext to_kw() throws RecognitionException {
		To_kwContext _localctx = new To_kwContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_to_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(TO);
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

	public static class Step_kwContext extends ParserRuleContext {
		public TerminalNode STEP() { return getToken(PECL3Parser.STEP, 0); }
		public Step_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterStep_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitStep_kw(this);
		}
	}

	public final Step_kwContext step_kw() throws RecognitionException {
		Step_kwContext _localctx = new Step_kwContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_step_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(STEP);
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

	public static class Then_kwContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(PECL3Parser.THEN, 0); }
		public Then_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterThen_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitThen_kw(this);
		}
	}

	public final Then_kwContext then_kw() throws RecognitionException {
		Then_kwContext _localctx = new Then_kwContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_then_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(THEN);
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

	public static class True_kwContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PECL3Parser.TRUE, 0); }
		public True_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterTrue_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitTrue_kw(this);
		}
	}

	public final True_kwContext true_kw() throws RecognitionException {
		True_kwContext _localctx = new True_kwContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_true_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(TRUE);
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

	public static class False_kwContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(PECL3Parser.FALSE, 0); }
		public False_kwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_kw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFalse_kw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFalse_kw(this);
		}
	}

	public final False_kwContext false_kw() throws RecognitionException {
		False_kwContext _localctx = new False_kwContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_false_kw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(FALSE);
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

	public static class Op_bracketContext extends ParserRuleContext {
		public TerminalNode OP_BRACKET() { return getToken(PECL3Parser.OP_BRACKET, 0); }
		public Op_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterOp_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitOp_bracket(this);
		}
	}

	public final Op_bracketContext op_bracket() throws RecognitionException {
		Op_bracketContext _localctx = new Op_bracketContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_op_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(OP_BRACKET);
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

	public static class Cl_bracketContext extends ParserRuleContext {
		public TerminalNode CL_BRACKET() { return getToken(PECL3Parser.CL_BRACKET, 0); }
		public Cl_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterCl_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitCl_bracket(this);
		}
	}

	public final Cl_bracketContext cl_bracket() throws RecognitionException {
		Cl_bracketContext _localctx = new Cl_bracketContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cl_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(CL_BRACKET);
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PECL3Parser.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(NOT);
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
		public TerminalNode STRING() { return getToken(PECL3Parser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
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

	public static class Boolean_nContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PECL3Parser.BOOLEAN, 0); }
		public Boolean_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterBoolean_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitBoolean_n(this);
		}
	}

	public final Boolean_nContext boolean_n() throws RecognitionException {
		Boolean_nContext _localctx = new Boolean_nContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_boolean_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(BOOLEAN);
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

	public static class Int_nContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PECL3Parser.INT, 0); }
		public Int_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterInt_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitInt_n(this);
		}
	}

	public final Int_nContext int_n() throws RecognitionException {
		Int_nContext _localctx = new Int_nContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_int_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(INT);
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

	public static class Float_nContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PECL3Parser.FLOAT, 0); }
		public Float_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterFloat_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitFloat_n(this);
		}
	}

	public final Float_nContext float_n() throws RecognitionException {
		Float_nContext _localctx = new Float_nContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_float_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(FLOAT);
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

	public static class NumberContext extends ParserRuleContext {
		public Int_nContext int_n() {
			return getRuleContext(Int_nContext.class,0);
		}
		public Float_nContext float_n() {
			return getRuleContext(Float_nContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_number);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				int_n();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				float_n();
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_value);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
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

	public static class Type_stringContext extends ParserRuleContext {
		public TerminalNode AS_STRING() { return getToken(PECL3Parser.AS_STRING, 0); }
		public Type_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterType_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitType_string(this);
		}
	}

	public final Type_stringContext type_string() throws RecognitionException {
		Type_stringContext _localctx = new Type_stringContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_type_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(AS_STRING);
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

	public static class Type_numberContext extends ParserRuleContext {
		public TerminalNode AS_NUMBER() { return getToken(PECL3Parser.AS_NUMBER, 0); }
		public Type_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterType_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitType_number(this);
		}
	}

	public final Type_numberContext type_number() throws RecognitionException {
		Type_numberContext _localctx = new Type_numberContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_type_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(AS_NUMBER);
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

	public static class Type_voidContext extends ParserRuleContext {
		public TerminalNode AS_VOID() { return getToken(PECL3Parser.AS_VOID, 0); }
		public Type_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterType_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitType_void(this);
		}
	}

	public final Type_voidContext type_void() throws RecognitionException {
		Type_voidContext _localctx = new Type_voidContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_type_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(AS_VOID);
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

	public static class Type_booleanContext extends ParserRuleContext {
		public TerminalNode AS_BOOLEAN() { return getToken(PECL3Parser.AS_BOOLEAN, 0); }
		public Type_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterType_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitType_boolean(this);
		}
	}

	public final Type_booleanContext type_boolean() throws RecognitionException {
		Type_booleanContext _localctx = new Type_booleanContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(AS_BOOLEAN);
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

	public static class As_var_typeContext extends ParserRuleContext {
		public Type_stringContext type_string() {
			return getRuleContext(Type_stringContext.class,0);
		}
		public Type_numberContext type_number() {
			return getRuleContext(Type_numberContext.class,0);
		}
		public Type_booleanContext type_boolean() {
			return getRuleContext(Type_booleanContext.class,0);
		}
		public As_var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAs_var_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAs_var_type(this);
		}
	}

	public final As_var_typeContext as_var_type() throws RecognitionException {
		As_var_typeContext _localctx = new As_var_typeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_as_var_type);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				type_string();
				}
				break;
			case AS_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				type_number();
				}
				break;
			case AS_BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				type_boolean();
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

	public static class As_typeContext extends ParserRuleContext {
		public As_var_typeContext as_var_type() {
			return getRuleContext(As_var_typeContext.class,0);
		}
		public Type_voidContext type_void() {
			return getRuleContext(Type_voidContext.class,0);
		}
		public As_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).enterAs_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PECL3ParserListener ) ((PECL3ParserListener)listener).exitAs_type(this);
		}
	}

	public final As_typeContext as_type() throws RecognitionException {
		As_typeContext _localctx = new As_typeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_as_type);
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS_STRING:
			case AS_NUMBER:
			case AS_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				as_var_type();
				}
				break;
			case AS_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				type_void();
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
		case 17:
			return expr_content_sempred((Expr_contentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_content_sempred(Expr_contentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\7\2\u00a2\n\2\f"+
		"\2\16\2\u00a5\13\2\3\3\3\3\5\3\u00a9\n\3\3\3\3\3\5\3\u00ad\n\3\3\3\5\3"+
		"\u00b0\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\u00b9\n\4\f\4\16\4\u00bc\13"+
		"\4\3\4\3\4\3\4\5\4\u00c1\n\4\3\4\7\4\u00c4\n\4\f\4\16\4\u00c7\13\4\3\4"+
		"\7\4\u00ca\n\4\f\4\16\4\u00cd\13\4\3\4\5\4\u00d0\n\4\3\4\7\4\u00d3\n\4"+
		"\f\4\16\4\u00d6\13\4\3\4\3\4\3\4\3\4\7\4\u00dc\n\4\f\4\16\4\u00df\13\4"+
		"\3\4\7\4\u00e2\n\4\f\4\16\4\u00e5\13\4\3\4\5\4\u00e8\n\4\5\4\u00ea\n\4"+
		"\3\5\3\5\3\5\3\5\5\5\u00f0\n\5\3\5\3\5\3\5\7\5\u00f5\n\5\f\5\16\5\u00f8"+
		"\13\5\3\5\3\5\3\5\3\5\7\5\u00fe\n\5\f\5\16\5\u0101\13\5\3\5\7\5\u0104"+
		"\n\5\f\5\16\5\u0107\13\5\3\5\3\5\5\5\u010b\n\5\3\6\3\6\7\6\u010f\n\6\f"+
		"\6\16\6\u0112\13\6\3\6\3\6\3\6\3\6\7\6\u0118\n\6\f\6\16\6\u011b\13\6\3"+
		"\6\7\6\u011e\n\6\f\6\16\6\u0121\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u012a"+
		"\n\7\3\7\3\7\3\7\5\7\u012f\n\7\3\7\5\7\u0132\n\7\3\7\3\7\7\7\u0136\n\7"+
		"\f\7\16\7\u0139\13\7\3\7\5\7\u013c\n\7\3\7\7\7\u013f\n\7\f\7\16\7\u0142"+
		"\13\7\3\7\3\7\3\7\3\7\7\7\u0148\n\7\f\7\16\7\u014b\13\7\3\7\7\7\u014e"+
		"\n\7\f\7\16\7\u0151\13\7\3\7\3\7\5\7\u0155\n\7\3\b\3\b\3\b\5\b\u015a\n"+
		"\b\3\t\3\t\3\t\3\t\5\t\u0160\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"\u0169\n\13\3\13\3\13\3\13\5\13\u016e\n\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u0177\n\13\f\13\16\13\u017a\13\13\5\13\u017c\n\13\3\13\3"+
		"\13\5\13\u0180\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u018f\n\r\f\r\16\r\u0192\13\r\7\r\u0194\n\r\f\r\16\r\u0197\13\r"+
		"\3\r\3\r\3\r\3\r\7\r\u019d\n\r\f\r\16\r\u01a0\13\r\3\r\3\r\7\r\u01a4\n"+
		"\r\f\r\16\r\u01a7\13\r\3\r\3\r\3\r\3\r\7\r\u01ad\n\r\f\r\16\r\u01b0\13"+
		"\r\3\r\7\r\u01b3\n\r\f\r\16\r\u01b6\13\r\3\r\5\r\u01b9\n\r\3\r\7\r\u01bc"+
		"\n\r\f\r\16\r\u01bf\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u01c6\n\16\3\16\3"+
		"\16\7\16\u01ca\n\16\f\16\16\16\u01cd\13\16\3\16\3\16\5\16\u01d1\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\5\17\u01d9\n\17\3\17\3\17\5\17\u01dd\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01e5\n\20\f\20\16\20\u01e8\13\20"+
		"\7\20\u01ea\n\20\f\20\16\20\u01ed\13\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\5\22\u01f6\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0202\n\23\3\23\3\23\3\23\5\23\u0207\n\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u020e\n\23\3\23\3\23\7\23\u0212\n\23\f\23\16\23\u0215\13\23\3"+
		"\24\5\24\u0218\n\24\3\24\3\24\5\24\u021c\n\24\3\24\3\24\5\24\u0220\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0229\n\24\3\24\5\24\u022c\n"+
		"\24\3\24\3\24\5\24\u0230\n\24\3\24\3\24\3\24\3\24\5\24\u0236\n\24\3\24"+
		"\3\24\7\24\u023a\n\24\f\24\16\24\u023d\13\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3"+
		"E\3F\3F\3G\3G\5G\u02a5\nG\3H\3H\5H\u02a9\nH\3I\3I\3J\3J\3K\3K\3L\3L\3"+
		"M\3M\3M\5M\u02b6\nM\3N\3N\5N\u02ba\nN\3N\2\3$O\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\2\2\2\u02d6\2\u00a3\3\2\2\2\4\u00a6\3\2\2\2\6\u00b3"+
		"\3\2\2\2\b\u00eb\3\2\2\2\n\u010c\3\2\2\2\f\u0124\3\2\2\2\16\u0156\3\2"+
		"\2\2\20\u015f\3\2\2\2\22\u0161\3\2\2\2\24\u0164\3\2\2\2\26\u0181\3\2\2"+
		"\2\30\u0185\3\2\2\2\32\u01c2\3\2\2\2\34\u01d4\3\2\2\2\36\u01de\3\2\2\2"+
		" \u01f0\3\2\2\2\"\u01f5\3\2\2\2$\u0201\3\2\2\2&\u022f\3\2\2\2(\u023e\3"+
		"\2\2\2*\u0240\3\2\2\2,\u0242\3\2\2\2.\u0244\3\2\2\2\60\u0246\3\2\2\2\62"+
		"\u0248\3\2\2\2\64\u024a\3\2\2\2\66\u024c\3\2\2\28\u024e\3\2\2\2:\u0250"+
		"\3\2\2\2<\u0252\3\2\2\2>\u0254\3\2\2\2@\u0256\3\2\2\2B\u0258\3\2\2\2D"+
		"\u025a\3\2\2\2F\u025c\3\2\2\2H\u025e\3\2\2\2J\u0260\3\2\2\2L\u0262\3\2"+
		"\2\2N\u0264\3\2\2\2P\u0266\3\2\2\2R\u0268\3\2\2\2T\u026a\3\2\2\2V\u026c"+
		"\3\2\2\2X\u026e\3\2\2\2Z\u0270\3\2\2\2\\\u0272\3\2\2\2^\u0274\3\2\2\2"+
		"`\u0276\3\2\2\2b\u0278\3\2\2\2d\u027a\3\2\2\2f\u027c\3\2\2\2h\u027e\3"+
		"\2\2\2j\u0280\3\2\2\2l\u0282\3\2\2\2n\u0284\3\2\2\2p\u0286\3\2\2\2r\u0288"+
		"\3\2\2\2t\u028a\3\2\2\2v\u028c\3\2\2\2x\u028e\3\2\2\2z\u0290\3\2\2\2|"+
		"\u0292\3\2\2\2~\u0294\3\2\2\2\u0080\u0296\3\2\2\2\u0082\u0298\3\2\2\2"+
		"\u0084\u029a\3\2\2\2\u0086\u029c\3\2\2\2\u0088\u029e\3\2\2\2\u008a\u02a0"+
		"\3\2\2\2\u008c\u02a4\3\2\2\2\u008e\u02a8\3\2\2\2\u0090\u02aa\3\2\2\2\u0092"+
		"\u02ac\3\2\2\2\u0094\u02ae\3\2\2\2\u0096\u02b0\3\2\2\2\u0098\u02b5\3\2"+
		"\2\2\u009a\u02b9\3\2\2\2\u009c\u00a2\5V,\2\u009d\u00a2\5\32\16\2\u009e"+
		"\u00a2\5\30\r\2\u009f\u00a2\5\26\f\2\u00a0\u00a2\5\22\n\2\u00a1\u009c"+
		"\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\3\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5p9\2\u00a7\u00a9"+
		"\5L\'\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00ad\5$\23\2\u00ab\u00ad\5&\24\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5N(\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5T+\2\u00b2\5\3\2\2\2\u00b3\u00b4"+
		"\5l\67\2\u00b4\u00b5\5L\'\2\u00b5\u00b6\5&\24\2\u00b6\u00e9\5N(\2\u00b7"+
		"\u00b9\5V,\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1"+
		"\5\"\22\2\u00be\u00c1\5\32\16\2\u00bf\u00c1\5\22\n\2\u00c0\u00bd\3\2\2"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4"+
		"\5V,\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00ea\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5V"+
		",\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5X"+
		"-\2\u00cf\u00cb\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1"+
		"\u00d3\5V,\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00dd\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc"+
		"\5\"\22\2\u00d8\u00dc\5\32\16\2\u00d9\u00dc\5\22\n\2\u00da\u00dc\5\20"+
		"\t\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e7\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\5V,\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\5^\60\2\u00e7\u00e3\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00ba\3\2\2\2\u00e9"+
		"\u00cf\3\2\2\2\u00ea\7\3\2\2\2\u00eb\u00ec\5h\65\2\u00ec\u00ef\5L\'\2"+
		"\u00ed\u00f0\5&\24\2\u00ee\u00f0\5\36\20\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\5N(\2\u00f2\u00f6\5x=\2\u00f3"+
		"\u00f5\5V,\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2"+
		"\2\u00f6\u00f7\3\2\2\2\u00f7\u00ff\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fe"+
		"\5\"\22\2\u00fa\u00fe\5\32\16\2\u00fb\u00fe\5\22\n\2\u00fc\u00fe\5\20"+
		"\t\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0105\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5V,\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\5`\61\2\u0109\u010b\5\n"+
		"\6\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\t\3\2\2\2\u010c\u0110"+
		"\5j\66\2\u010d\u010f\5V,\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0119\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0118\5\"\22\2\u0114\u0118\5\32\16\2\u0115\u0118\5\22\n\2\u0116"+
		"\u0118\5\20\t\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011f\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\5V"+
		",\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\5`"+
		"\61\2\u0123\13\3\2\2\2\u0124\u0125\5n8\2\u0125\u0126\5H%\2\u0126\u0129"+
		"\5r:\2\u0127\u012a\5H%\2\u0128\u012a\5\u0088E\2\u0129\u0127\3\2\2\2\u0129"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\5t;\2\u012c\u012f\5H%\2"+
		"\u012d\u012f\5\u0088E\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0132\5\16\b\2\u0131\u0130\3\2\2\2\u0131\u0132\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\5Z.\2\u0134\u0136\5V,\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\5X-\2\u013b\u013a\3\2\2"+
		"\2\u013b\u013c\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013f\5V,\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0149\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0148\5\"\22\2\u0144\u0148\5"+
		"\32\16\2\u0145\u0148\5\22\n\2\u0146\u0148\5\20\t\2\u0147\u0143\3\2\2\2"+
		"\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014f\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014e\5V,\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2"+
		"\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\5\\/\2\u0153\u0155\5^\60\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\r\3\2\2\2\u0156\u0159\5v<\2\u0157\u015a\5H%\2\u0158"+
		"\u015a\5\u0088E\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\17\3\2"+
		"\2\2\u015b\u0160\5\6\4\2\u015c\u0160\5\b\5\2\u015d\u0160\5\f\7\2\u015e"+
		"\u0160\5\4\3\2\u015f\u015b\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u015e\3\2\2\2\u0160\21\3\2\2\2\u0161\u0162\5\24\13\2\u0162"+
		"\u0163\5T+\2\u0163\23\3\2\2\2\u0164\u017f\5H%\2\u0165\u0168\5J&\2\u0166"+
		"\u0169\5$\23\2\u0167\u0169\5&\24\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2"+
		"\2\2\u0169\u0180\3\2\2\2\u016a\u016d\5~@\2\u016b\u016e\5\u0088E\2\u016c"+
		"\u016e\5H%\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0170\5\u0080A\2\u0170\u0171\5J&\2\u0171\u017b\5L\'\2\u0172\u0178"+
		"\5$\23\2\u0173\u0174\5P)\2\u0174\u0175\5$\23\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0172\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5N(\2\u017e\u0180\3\2\2"+
		"\2\u017f\u0165\3\2\2\2\u017f\u016a\3\2\2\2\u0180\25\3\2\2\2\u0181\u0182"+
		"\5b\62\2\u0182\u0183\5H%\2\u0183\u0184\5T+\2\u0184\27\3\2\2\2\u0185\u0186"+
		"\5d\63\2\u0186\u0187\5H%\2\u0187\u0195\5L\'\2\u0188\u0189\5\u0098M\2\u0189"+
		"\u0190\5H%\2\u018a\u018b\5P)\2\u018b\u018c\5\u0098M\2\u018c\u018d\5H%"+
		"\2\u018d\u018f\3\2\2\2\u018e\u018a\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0188\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\5N(\2\u0199\u019a"+
		"\5R*\2\u019a\u019e\5\u009aN\2\u019b\u019d\5V,\2\u019c\u019b\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a5\5X-\2\u01a2\u01a4\5V,\2\u01a3\u01a2"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01ae\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ad\5\"\22\2\u01a9\u01ad\5"+
		"\32\16\2\u01aa\u01ad\5\22\n\2\u01ab\u01ad\5\20\t\2\u01ac\u01a8\3\2\2\2"+
		"\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b8\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b3\5V,\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2"+
		"\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01b9\5\4\3\2\u01b8\u01b4\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bd\3\2\2\2\u01ba\u01bc\5V,\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2"+
		"\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01c0\u01c1\5^\60\2\u01c1\31\3\2\2\2\u01c2\u01cb\5\u009aN\2\u01c3"+
		"\u01c6\5\34\17\2\u01c4\u01c6\5\24\13\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\5P)\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01c5\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\5\34\17\2\u01cf"+
		"\u01d1\5\24\13\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d2\u01d3\5T+\2\u01d3\33\3\2\2\2\u01d4\u01dc\5H%\2\u01d5\u01d8"+
		"\5~@\2\u01d6\u01d9\5\u0088E\2\u01d7\u01d9\5H%\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5\u0080"+
		"A\2\u01db\u01dd\3\2\2\2\u01dc\u01d5\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\35\3\2\2\2\u01de\u01df\5D#\2\u01df\u01eb\5L\'\2\u01e0\u01e6\5$\23\2\u01e1"+
		"\u01e2\5P)\2\u01e2\u01e3\5$\23\2\u01e3\u01e5\3\2\2\2\u01e4\u01e1\3\2\2"+
		"\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01e0\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ee\u01ef\5N(\2\u01ef\37\3\2\2\2\u01f0\u01f1\5\36\20\2\u01f1\u01f2"+
		"\5T+\2\u01f2!\3\2\2\2\u01f3\u01f6\5$\23\2\u01f4\u01f6\5&\24\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\5T+\2\u01f8"+
		"#\3\2\2\2\u01f9\u01fa\b\23\1\2\u01fa\u0202\5\u008eH\2\u01fb\u01fc\5L\'"+
		"\2\u01fc\u01fd\5$\23\2\u01fd\u01fe\5N(\2\u01fe\u0202\3\2\2\2\u01ff\u0202"+
		"\5\36\20\2\u0200\u0202\5F$\2\u0201\u01f9\3\2\2\2\u0201\u01fb\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0213\3\2\2\2\u0203\u0206\f\b"+
		"\2\2\u0204\u0207\5,\27\2\u0205\u0207\5.\30\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\5$\23\t\u0209\u0212\3\2"+
		"\2\2\u020a\u020d\f\7\2\2\u020b\u020e\5(\25\2\u020c\u020e\5*\26\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\5$"+
		"\23\b\u0210\u0212\3\2\2\2\u0211\u0203\3\2\2\2\u0211\u020a\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214%\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0216\u0218\5\u0082B\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0230\5\u0086D\2\u021a\u021c"+
		"\5\u0082B\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2"+
		"\2\u021d\u0230\5H%\2\u021e\u0220\5\u0082B\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0228\5$\23\2\u0222\u0229\5\60"+
		"\31\2\u0223\u0229\5\62\32\2\u0224\u0229\5\64\33\2\u0225\u0229\5\66\34"+
		"\2\u0226\u0229\58\35\2\u0227\u0229\5:\36\2\u0228\u0222\3\2\2\2\u0228\u0223"+
		"\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u022c\5\u0082B\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\5$\23\2\u022e"+
		"\u0230\3\2\2\2\u022f\u0217\3\2\2\2\u022f\u021b\3\2\2\2\u022f\u021f\3\2"+
		"\2\2\u0230\u023b\3\2\2\2\u0231\u0236\5<\37\2\u0232\u0236\5> \2\u0233\u0236"+
		"\5@!\2\u0234\u0236\5B\"\2\u0235\u0231\3\2\2\2\u0235\u0232\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\5&"+
		"\24\2\u0238\u023a\3\2\2\2\u0239\u0235\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\'\3\2\2\2\u023d\u023b\3\2\2\2"+
		"\u023e\u023f\7\27\2\2\u023f)\3\2\2\2\u0240\u0241\7\30\2\2\u0241+\3\2\2"+
		"\2\u0242\u0243\7\31\2\2\u0243-\3\2\2\2\u0244\u0245\7\32\2\2\u0245/\3\2"+
		"\2\2\u0246\u0247\7\r\2\2\u0247\61\3\2\2\2\u0248\u0249\7\16\2\2\u0249\63"+
		"\3\2\2\2\u024a\u024b\7\17\2\2\u024b\65\3\2\2\2\u024c\u024d\7\20\2\2\u024d"+
		"\67\3\2\2\2\u024e\u024f\7\21\2\2\u024f9\3\2\2\2\u0250\u0251\7\22\2\2\u0251"+
		";\3\2\2\2\u0252\u0253\7\23\2\2\u0253=\3\2\2\2\u0254\u0255\7\24\2\2\u0255"+
		"?\3\2\2\2\u0256\u0257\7\25\2\2\u0257A\3\2\2\2\u0258\u0259\7\26\2\2\u0259"+
		"C\3\2\2\2\u025a\u025b\5H%\2\u025bE\3\2\2\2\u025c\u025d\5H%\2\u025dG\3"+
		"\2\2\2\u025e\u025f\7:\2\2\u025fI\3\2\2\2\u0260\u0261\7\6\2\2\u0261K\3"+
		"\2\2\2\u0262\u0263\7\7\2\2\u0263M\3\2\2\2\u0264\u0265\7\b\2\2\u0265O\3"+
		"\2\2\2\u0266\u0267\7\t\2\2\u0267Q\3\2\2\2\u0268\u0269\7\n\2\2\u0269S\3"+
		"\2\2\2\u026a\u026b\7\13\2\2\u026bU\3\2\2\2\u026c\u026d\7\f\2\2\u026dW"+
		"\3\2\2\2\u026e\u026f\7+\2\2\u026fY\3\2\2\2\u0270\u0271\7.\2\2\u0271[\3"+
		"\2\2\2\u0272\u0273\7/\2\2\u0273]\3\2\2\2\u0274\u0275\7,\2\2\u0275_\3\2"+
		"\2\2\u0276\u0277\7-\2\2\u0277a\3\2\2\2\u0278\u0279\7\'\2\2\u0279c\3\2"+
		"\2\2\u027a\u027b\7*\2\2\u027be\3\2\2\2\u027c\u027d\7\66\2\2\u027dg\3\2"+
		"\2\2\u027e\u027f\7(\2\2\u027fi\3\2\2\2\u0280\u0281\7\64\2\2\u0281k\3\2"+
		"\2\2\u0282\u0283\7)\2\2\u0283m\3\2\2\2\u0284\u0285\7\65\2\2\u0285o\3\2"+
		"\2\2\u0286\u0287\7\60\2\2\u0287q\3\2\2\2\u0288\u0289\7\61\2\2\u0289s\3"+
		"\2\2\2\u028a\u028b\7\62\2\2\u028bu\3\2\2\2\u028c\u028d\7\63\2\2\u028d"+
		"w\3\2\2\2\u028e\u028f\7\67\2\2\u028fy\3\2\2\2\u0290\u0291\78\2\2\u0291"+
		"{\3\2\2\2\u0292\u0293\79\2\2\u0293}\3\2\2\2\u0294\u0295\7\34\2\2\u0295"+
		"\177\3\2\2\2\u0296\u0297\7\35\2\2\u0297\u0081\3\2\2\2\u0298\u0299\7\36"+
		"\2\2\u0299\u0083\3\2\2\2\u029a\u029b\7!\2\2\u029b\u0085\3\2\2\2\u029c"+
		"\u029d\7\"\2\2\u029d\u0087\3\2\2\2\u029e\u029f\7\37\2\2\u029f\u0089\3"+
		"\2\2\2\u02a0\u02a1\7 \2\2\u02a1\u008b\3\2\2\2\u02a2\u02a5\5\u0088E\2\u02a3"+
		"\u02a5\5\u008aF\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u008d"+
		"\3\2\2\2\u02a6\u02a9\5\u008cG\2\u02a7\u02a9\5\u0084C\2\u02a8\u02a6\3\2"+
		"\2\2\u02a8\u02a7\3\2\2\2\u02a9\u008f\3\2\2\2\u02aa\u02ab\7#\2\2\u02ab"+
		"\u0091\3\2\2\2\u02ac\u02ad\7$\2\2\u02ad\u0093\3\2\2\2\u02ae\u02af\7%\2"+
		"\2\u02af\u0095\3\2\2\2\u02b0\u02b1\7&\2\2\u02b1\u0097\3\2\2\2\u02b2\u02b6"+
		"\5\u0090I\2\u02b3\u02b6\5\u0092J\2\u02b4\u02b6\5\u0096L\2\u02b5\u02b2"+
		"\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u0099\3\2\2\2\u02b7"+
		"\u02ba\5\u0098M\2\u02b8\u02ba\5\u0094K\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8"+
		"\3\2\2\2\u02ba\u009b\3\2\2\2O\u00a1\u00a3\u00a8\u00ac\u00af\u00ba\u00c0"+
		"\u00c5\u00cb\u00cf\u00d4\u00db\u00dd\u00e3\u00e7\u00e9\u00ef\u00f6\u00fd"+
		"\u00ff\u0105\u010a\u0110\u0117\u0119\u011f\u0129\u012e\u0131\u0137\u013b"+
		"\u0140\u0147\u0149\u014f\u0154\u0159\u015f\u0168\u016d\u0178\u017b\u017f"+
		"\u0190\u0195\u019e\u01a5\u01ac\u01ae\u01b4\u01b8\u01bd\u01c5\u01cb\u01d0"+
		"\u01d8\u01dc\u01e6\u01eb\u01f5\u0201\u0206\u020d\u0211\u0213\u0217\u021b"+
		"\u021f\u0228\u022b\u022f\u0235\u023b\u02a4\u02a8\u02b5\u02b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}