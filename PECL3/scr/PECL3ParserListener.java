// Generated from .\src\PECL3Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PECL3Parser}.
 */
public interface PECL3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PECL3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PECL3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#return_val}.
	 * @param ctx the parse tree
	 */
	void enterReturn_val(PECL3Parser.Return_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#return_val}.
	 * @param ctx the parse tree
	 */
	void exitReturn_val(PECL3Parser.Return_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#while_op}.
	 * @param ctx the parse tree
	 */
	void enterWhile_op(PECL3Parser.While_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#while_op}.
	 * @param ctx the parse tree
	 */
	void exitWhile_op(PECL3Parser.While_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#if_op}.
	 * @param ctx the parse tree
	 */
	void enterIf_op(PECL3Parser.If_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#if_op}.
	 * @param ctx the parse tree
	 */
	void exitIf_op(PECL3Parser.If_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#else_op}.
	 * @param ctx the parse tree
	 */
	void enterElse_op(PECL3Parser.Else_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#else_op}.
	 * @param ctx the parse tree
	 */
	void exitElse_op(PECL3Parser.Else_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#for_op}.
	 * @param ctx the parse tree
	 */
	void enterFor_op(PECL3Parser.For_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#for_op}.
	 * @param ctx the parse tree
	 */
	void exitFor_op(PECL3Parser.For_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#step_op}.
	 * @param ctx the parse tree
	 */
	void enterStep_op(PECL3Parser.Step_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#step_op}.
	 * @param ctx the parse tree
	 */
	void exitStep_op(PECL3Parser.Step_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#basic_func}.
	 * @param ctx the parse tree
	 */
	void enterBasic_func(PECL3Parser.Basic_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#basic_func}.
	 * @param ctx the parse tree
	 */
	void exitBasic_func(PECL3Parser.Basic_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#assign_sc}.
	 * @param ctx the parse tree
	 */
	void enterAssign_sc(PECL3Parser.Assign_scContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#assign_sc}.
	 * @param ctx the parse tree
	 */
	void exitAssign_sc(PECL3Parser.Assign_scContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PECL3Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PECL3Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLib(PECL3Parser.LibContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLib(PECL3Parser.LibContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#def_func}.
	 * @param ctx the parse tree
	 */
	void enterDef_func(PECL3Parser.Def_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#def_func}.
	 * @param ctx the parse tree
	 */
	void exitDef_func(PECL3Parser.Def_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#def_var}.
	 * @param ctx the parse tree
	 */
	void enterDef_var(PECL3Parser.Def_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#def_var}.
	 * @param ctx the parse tree
	 */
	void exitDef_var(PECL3Parser.Def_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#var_definition}.
	 * @param ctx the parse tree
	 */
	void enterVar_definition(PECL3Parser.Var_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#var_definition}.
	 * @param ctx the parse tree
	 */
	void exitVar_definition(PECL3Parser.Var_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(PECL3Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(PECL3Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#func_sc}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sc(PECL3Parser.Func_scContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#func_sc}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sc(PECL3Parser.Func_scContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#expr_total}.
	 * @param ctx the parse tree
	 */
	void enterExpr_total(PECL3Parser.Expr_totalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#expr_total}.
	 * @param ctx the parse tree
	 */
	void exitExpr_total(PECL3Parser.Expr_totalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#expr_content}.
	 * @param ctx the parse tree
	 */
	void enterExpr_content(PECL3Parser.Expr_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#expr_content}.
	 * @param ctx the parse tree
	 */
	void exitExpr_content(PECL3Parser.Expr_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(PECL3Parser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(PECL3Parser.Logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PECL3Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PECL3Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(PECL3Parser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(PECL3Parser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(PECL3Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(PECL3Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#quotient}.
	 * @param ctx the parse tree
	 */
	void enterQuotient(PECL3Parser.QuotientContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#quotient}.
	 * @param ctx the parse tree
	 */
	void exitQuotient(PECL3Parser.QuotientContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#lesser}.
	 * @param ctx the parse tree
	 */
	void enterLesser(PECL3Parser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#lesser}.
	 * @param ctx the parse tree
	 */
	void exitLesser(PECL3Parser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(PECL3Parser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(PECL3Parser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#lesser_eq}.
	 * @param ctx the parse tree
	 */
	void enterLesser_eq(PECL3Parser.Lesser_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#lesser_eq}.
	 * @param ctx the parse tree
	 */
	void exitLesser_eq(PECL3Parser.Lesser_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#greater_eq}.
	 * @param ctx the parse tree
	 */
	void enterGreater_eq(PECL3Parser.Greater_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#greater_eq}.
	 * @param ctx the parse tree
	 */
	void exitGreater_eq(PECL3Parser.Greater_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(PECL3Parser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(PECL3Parser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#not_eq}.
	 * @param ctx the parse tree
	 */
	void enterNot_eq(PECL3Parser.Not_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#not_eq}.
	 * @param ctx the parse tree
	 */
	void exitNot_eq(PECL3Parser.Not_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#bit_and}.
	 * @param ctx the parse tree
	 */
	void enterBit_and(PECL3Parser.Bit_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#bit_and}.
	 * @param ctx the parse tree
	 */
	void exitBit_and(PECL3Parser.Bit_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(PECL3Parser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(PECL3Parser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#bit_or}.
	 * @param ctx the parse tree
	 */
	void enterBit_or(PECL3Parser.Bit_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#bit_or}.
	 * @param ctx the parse tree
	 */
	void exitBit_or(PECL3Parser.Bit_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(PECL3Parser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(PECL3Parser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#func_id}.
	 * @param ctx the parse tree
	 */
	void enterFunc_id(PECL3Parser.Func_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#func_id}.
	 * @param ctx the parse tree
	 */
	void exitFunc_id(PECL3Parser.Func_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(PECL3Parser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(PECL3Parser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PECL3Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PECL3Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#assign_value}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value(PECL3Parser.Assign_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#assign_value}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value(PECL3Parser.Assign_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#op_par}.
	 * @param ctx the parse tree
	 */
	void enterOp_par(PECL3Parser.Op_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#op_par}.
	 * @param ctx the parse tree
	 */
	void exitOp_par(PECL3Parser.Op_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#cl_par}.
	 * @param ctx the parse tree
	 */
	void enterCl_par(PECL3Parser.Cl_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#cl_par}.
	 * @param ctx the parse tree
	 */
	void exitCl_par(PECL3Parser.Cl_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(PECL3Parser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(PECL3Parser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(PECL3Parser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(PECL3Parser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#semi_colon}.
	 * @param ctx the parse tree
	 */
	void enterSemi_colon(PECL3Parser.Semi_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#semi_colon}.
	 * @param ctx the parse tree
	 */
	void exitSemi_colon(PECL3Parser.Semi_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(PECL3Parser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(PECL3Parser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#block_start}.
	 * @param ctx the parse tree
	 */
	void enterBlock_start(PECL3Parser.Block_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#block_start}.
	 * @param ctx the parse tree
	 */
	void exitBlock_start(PECL3Parser.Block_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#do_start}.
	 * @param ctx the parse tree
	 */
	void enterDo_start(PECL3Parser.Do_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#do_start}.
	 * @param ctx the parse tree
	 */
	void exitDo_start(PECL3Parser.Do_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#do_end}.
	 * @param ctx the parse tree
	 */
	void enterDo_end(PECL3Parser.Do_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#do_end}.
	 * @param ctx the parse tree
	 */
	void exitDo_end(PECL3Parser.Do_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(PECL3Parser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(PECL3Parser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#if_end}.
	 * @param ctx the parse tree
	 */
	void enterIf_end(PECL3Parser.If_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#if_end}.
	 * @param ctx the parse tree
	 */
	void exitIf_end(PECL3Parser.If_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#include_kw}.
	 * @param ctx the parse tree
	 */
	void enterInclude_kw(PECL3Parser.Include_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#include_kw}.
	 * @param ctx the parse tree
	 */
	void exitInclude_kw(PECL3Parser.Include_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#func_kw}.
	 * @param ctx the parse tree
	 */
	void enterFunc_kw(PECL3Parser.Func_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#func_kw}.
	 * @param ctx the parse tree
	 */
	void exitFunc_kw(PECL3Parser.Func_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#in_kw}.
	 * @param ctx the parse tree
	 */
	void enterIn_kw(PECL3Parser.In_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#in_kw}.
	 * @param ctx the parse tree
	 */
	void exitIn_kw(PECL3Parser.In_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#if_kw}.
	 * @param ctx the parse tree
	 */
	void enterIf_kw(PECL3Parser.If_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#if_kw}.
	 * @param ctx the parse tree
	 */
	void exitIf_kw(PECL3Parser.If_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#else_kw}.
	 * @param ctx the parse tree
	 */
	void enterElse_kw(PECL3Parser.Else_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#else_kw}.
	 * @param ctx the parse tree
	 */
	void exitElse_kw(PECL3Parser.Else_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#while_kw}.
	 * @param ctx the parse tree
	 */
	void enterWhile_kw(PECL3Parser.While_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#while_kw}.
	 * @param ctx the parse tree
	 */
	void exitWhile_kw(PECL3Parser.While_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#for_kw}.
	 * @param ctx the parse tree
	 */
	void enterFor_kw(PECL3Parser.For_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#for_kw}.
	 * @param ctx the parse tree
	 */
	void exitFor_kw(PECL3Parser.For_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#return_kw}.
	 * @param ctx the parse tree
	 */
	void enterReturn_kw(PECL3Parser.Return_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#return_kw}.
	 * @param ctx the parse tree
	 */
	void exitReturn_kw(PECL3Parser.Return_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#from_kw}.
	 * @param ctx the parse tree
	 */
	void enterFrom_kw(PECL3Parser.From_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#from_kw}.
	 * @param ctx the parse tree
	 */
	void exitFrom_kw(PECL3Parser.From_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#to_kw}.
	 * @param ctx the parse tree
	 */
	void enterTo_kw(PECL3Parser.To_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#to_kw}.
	 * @param ctx the parse tree
	 */
	void exitTo_kw(PECL3Parser.To_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#step_kw}.
	 * @param ctx the parse tree
	 */
	void enterStep_kw(PECL3Parser.Step_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#step_kw}.
	 * @param ctx the parse tree
	 */
	void exitStep_kw(PECL3Parser.Step_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#then_kw}.
	 * @param ctx the parse tree
	 */
	void enterThen_kw(PECL3Parser.Then_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#then_kw}.
	 * @param ctx the parse tree
	 */
	void exitThen_kw(PECL3Parser.Then_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#true_kw}.
	 * @param ctx the parse tree
	 */
	void enterTrue_kw(PECL3Parser.True_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#true_kw}.
	 * @param ctx the parse tree
	 */
	void exitTrue_kw(PECL3Parser.True_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#false_kw}.
	 * @param ctx the parse tree
	 */
	void enterFalse_kw(PECL3Parser.False_kwContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#false_kw}.
	 * @param ctx the parse tree
	 */
	void exitFalse_kw(PECL3Parser.False_kwContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#op_bracket}.
	 * @param ctx the parse tree
	 */
	void enterOp_bracket(PECL3Parser.Op_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#op_bracket}.
	 * @param ctx the parse tree
	 */
	void exitOp_bracket(PECL3Parser.Op_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#cl_bracket}.
	 * @param ctx the parse tree
	 */
	void enterCl_bracket(PECL3Parser.Cl_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#cl_bracket}.
	 * @param ctx the parse tree
	 */
	void exitCl_bracket(PECL3Parser.Cl_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(PECL3Parser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(PECL3Parser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PECL3Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PECL3Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#boolean_n}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_n(PECL3Parser.Boolean_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#boolean_n}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_n(PECL3Parser.Boolean_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#int_n}.
	 * @param ctx the parse tree
	 */
	void enterInt_n(PECL3Parser.Int_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#int_n}.
	 * @param ctx the parse tree
	 */
	void exitInt_n(PECL3Parser.Int_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#float_n}.
	 * @param ctx the parse tree
	 */
	void enterFloat_n(PECL3Parser.Float_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#float_n}.
	 * @param ctx the parse tree
	 */
	void exitFloat_n(PECL3Parser.Float_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PECL3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PECL3Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PECL3Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PECL3Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#type_string}.
	 * @param ctx the parse tree
	 */
	void enterType_string(PECL3Parser.Type_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#type_string}.
	 * @param ctx the parse tree
	 */
	void exitType_string(PECL3Parser.Type_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#type_number}.
	 * @param ctx the parse tree
	 */
	void enterType_number(PECL3Parser.Type_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#type_number}.
	 * @param ctx the parse tree
	 */
	void exitType_number(PECL3Parser.Type_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#type_void}.
	 * @param ctx the parse tree
	 */
	void enterType_void(PECL3Parser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#type_void}.
	 * @param ctx the parse tree
	 */
	void exitType_void(PECL3Parser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#type_boolean}.
	 * @param ctx the parse tree
	 */
	void enterType_boolean(PECL3Parser.Type_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#type_boolean}.
	 * @param ctx the parse tree
	 */
	void exitType_boolean(PECL3Parser.Type_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#as_var_type}.
	 * @param ctx the parse tree
	 */
	void enterAs_var_type(PECL3Parser.As_var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#as_var_type}.
	 * @param ctx the parse tree
	 */
	void exitAs_var_type(PECL3Parser.As_var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PECL3Parser#as_type}.
	 * @param ctx the parse tree
	 */
	void enterAs_type(PECL3Parser.As_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PECL3Parser#as_type}.
	 * @param ctx the parse tree
	 */
	void exitAs_type(PECL3Parser.As_typeContext ctx);
}