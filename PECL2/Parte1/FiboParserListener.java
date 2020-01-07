// Generated from FiboParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FiboParser}.
 */
public interface FiboParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FiboParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(FiboParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(FiboParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#return_val}.
	 * @param ctx the parse tree
	 */
	void enterReturn_val(FiboParser.Return_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#return_val}.
	 * @param ctx the parse tree
	 */
	void exitReturn_val(FiboParser.Return_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#while_op}.
	 * @param ctx the parse tree
	 */
	void enterWhile_op(FiboParser.While_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#while_op}.
	 * @param ctx the parse tree
	 */
	void exitWhile_op(FiboParser.While_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#if_op}.
	 * @param ctx the parse tree
	 */
	void enterIf_op(FiboParser.If_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#if_op}.
	 * @param ctx the parse tree
	 */
	void exitIf_op(FiboParser.If_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#else_op}.
	 * @param ctx the parse tree
	 */
	void enterElse_op(FiboParser.Else_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#else_op}.
	 * @param ctx the parse tree
	 */
	void exitElse_op(FiboParser.Else_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#for_op}.
	 * @param ctx the parse tree
	 */
	void enterFor_op(FiboParser.For_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#for_op}.
	 * @param ctx the parse tree
	 */
	void exitFor_op(FiboParser.For_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#for_eval}.
	 * @param ctx the parse tree
	 */
	void enterFor_eval(FiboParser.For_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#for_eval}.
	 * @param ctx the parse tree
	 */
	void exitFor_eval(FiboParser.For_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#funcionalidad_basica}.
	 * @param ctx the parse tree
	 */
	void enterFuncionalidad_basica(FiboParser.Funcionalidad_basicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#funcionalidad_basica}.
	 * @param ctx the parse tree
	 */
	void exitFuncionalidad_basica(FiboParser.Funcionalidad_basicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(FiboParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(FiboParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#libreria}.
	 * @param ctx the parse tree
	 */
	void enterLibreria(FiboParser.LibreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#libreria}.
	 * @param ctx the parse tree
	 */
	void exitLibreria(FiboParser.LibreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#def_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDef_funcion(FiboParser.Def_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#def_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDef_funcion(FiboParser.Def_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#def_variable}.
	 * @param ctx the parse tree
	 */
	void enterDef_variable(FiboParser.Def_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#def_variable}.
	 * @param ctx the parse tree
	 */
	void exitDef_variable(FiboParser.Def_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(FiboParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(FiboParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FiboParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FiboParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FiboParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FiboParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#exp_logica}.
	 * @param ctx the parse tree
	 */
	void enterExp_logica(FiboParser.Exp_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#exp_logica}.
	 * @param ctx the parse tree
	 */
	void exitExp_logica(FiboParser.Exp_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(FiboParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(FiboParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(FiboParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(FiboParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(FiboParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(FiboParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(FiboParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(FiboParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(FiboParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(FiboParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(FiboParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(FiboParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#menorigual}.
	 * @param ctx the parse tree
	 */
	void enterMenorigual(FiboParser.MenorigualContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#menorigual}.
	 * @param ctx the parse tree
	 */
	void exitMenorigual(FiboParser.MenorigualContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#mayorigual}.
	 * @param ctx the parse tree
	 */
	void enterMayorigual(FiboParser.MayorigualContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#mayorigual}.
	 * @param ctx the parse tree
	 */
	void exitMayorigual(FiboParser.MayorigualContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(FiboParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(FiboParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#noigual}.
	 * @param ctx the parse tree
	 */
	void enterNoigual(FiboParser.NoigualContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#noigual}.
	 * @param ctx the parse tree
	 */
	void exitNoigual(FiboParser.NoigualContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#bit_and}.
	 * @param ctx the parse tree
	 */
	void enterBit_and(FiboParser.Bit_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#bit_and}.
	 * @param ctx the parse tree
	 */
	void exitBit_and(FiboParser.Bit_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FiboParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FiboParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#bit_or}.
	 * @param ctx the parse tree
	 */
	void enterBit_or(FiboParser.Bit_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#bit_or}.
	 * @param ctx the parse tree
	 */
	void exitBit_or(FiboParser.Bit_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(FiboParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(FiboParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#funcion_id}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_id(FiboParser.Funcion_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#funcion_id}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_id(FiboParser.Funcion_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#variable_id}.
	 * @param ctx the parse tree
	 */
	void enterVariable_id(FiboParser.Variable_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#variable_id}.
	 * @param ctx the parse tree
	 */
	void exitVariable_id(FiboParser.Variable_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(FiboParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(FiboParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(FiboParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(FiboParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#a_parentesis}.
	 * @param ctx the parse tree
	 */
	void enterA_parentesis(FiboParser.A_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#a_parentesis}.
	 * @param ctx the parse tree
	 */
	void exitA_parentesis(FiboParser.A_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#c_parentesis}.
	 * @param ctx the parse tree
	 */
	void enterC_parentesis(FiboParser.C_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#c_parentesis}.
	 * @param ctx the parse tree
	 */
	void exitC_parentesis(FiboParser.C_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(FiboParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(FiboParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#dospuntos}.
	 * @param ctx the parse tree
	 */
	void enterDospuntos(FiboParser.DospuntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#dospuntos}.
	 * @param ctx the parse tree
	 */
	void exitDospuntos(FiboParser.DospuntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#puntoycoma}.
	 * @param ctx the parse tree
	 */
	void enterPuntoycoma(FiboParser.PuntoycomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#puntoycoma}.
	 * @param ctx the parse tree
	 */
	void exitPuntoycoma(FiboParser.PuntoycomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#saltolinea}.
	 * @param ctx the parse tree
	 */
	void enterSaltolinea(FiboParser.SaltolineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#saltolinea}.
	 * @param ctx the parse tree
	 */
	void exitSaltolinea(FiboParser.SaltolineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(FiboParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(FiboParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(FiboParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(FiboParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#end_if}.
	 * @param ctx the parse tree
	 */
	void enterEnd_if(FiboParser.End_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#end_if}.
	 * @param ctx the parse tree
	 */
	void exitEnd_if(FiboParser.End_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(FiboParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(FiboParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FiboParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FiboParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(FiboParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(FiboParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(FiboParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(FiboParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(FiboParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(FiboParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(FiboParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(FiboParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(FiboParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(FiboParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(FiboParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(FiboParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(FiboParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(FiboParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(FiboParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(FiboParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(FiboParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(FiboParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#r_string}.
	 * @param ctx the parse tree
	 */
	void enterR_string(FiboParser.R_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#r_string}.
	 * @param ctx the parse tree
	 */
	void exitR_string(FiboParser.R_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#r_number}.
	 * @param ctx the parse tree
	 */
	void enterR_number(FiboParser.R_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#r_number}.
	 * @param ctx the parse tree
	 */
	void exitR_number(FiboParser.R_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#r_void}.
	 * @param ctx the parse tree
	 */
	void enterR_void(FiboParser.R_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#r_void}.
	 * @param ctx the parse tree
	 */
	void exitR_void(FiboParser.R_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#r_variable}.
	 * @param ctx the parse tree
	 */
	void enterR_variable(FiboParser.R_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#r_variable}.
	 * @param ctx the parse tree
	 */
	void exitR_variable(FiboParser.R_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FiboParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(FiboParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FiboParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(FiboParser.RetornoContext ctx);
}