import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class Listener extends FiboParserBaseListener
{

    // Texto a añadir por cada token encontrado
    private String textoNuevo = "";

    // Arbol de tokens
    private ArrayList<String> arbol = new ArrayList<>();

    /**
     * Devuelve el arbol de tokens.
     *
     * @return -> arbol de tokens.
     */
    public ArrayList<String> getArbol()
    {
        return this.arbol;
    }


    /**
     * Arbol de seguimiento de tokens.
     *
     * @param cadena -> cadena a añadir.
     */
    private void actualizarArbol(String cadena)
    {
        this.arbol.add(cadena);
    }


    /**
     * Añade un token a la cadena del arbol.
     * @param textoNuevo -> cadena a añadir.
     */
    private void setTextoNuevo(String textoNuevo)
    {
        this.textoNuevo = textoNuevo;
    }

    @Override
    public void enterPrograma(FiboParser.ProgramaContext ctx)
    {
        actualizarArbol(textoNuevo + "/programa");
        setTextoNuevo(textoNuevo + "/programa");
    }

    @Override
    public void exitPrograma(FiboParser.ProgramaContext ctx)
    {
        setTextoNuevo("");
    }

    /* Return */

    @Override
    public void enterReturn_val(FiboParser.Return_valContext ctx)
    {
        actualizarArbol(textoNuevo + "/return_val");
        setTextoNuevo(textoNuevo + "/return_val");
    }

    @Override
    public void exitReturn_val(FiboParser.Return_valContext ctx)
    {
        String texto = "";
        if ( textoNuevo != "" )
        {
            texto = textoNuevo.substring(0, textoNuevo.lastIndexOf("/return_val"));
        }
        setTextoNuevo(texto);
    }

    /* While */

    @Override
    public void enterWhile_op(FiboParser.While_opContext ctx)
    {
        actualizarArbol(textoNuevo + "/while_op");
        setTextoNuevo(textoNuevo + "/while_op");
    }

    @Override
    public void exitWhile_op(FiboParser.While_opContext ctx)
    {
        String texto = "";
        if ( textoNuevo != "" )
        {
            texto = textoNuevo.substring(0, textoNuevo.lastIndexOf("/while_op"));
        }
        setTextoNuevo(texto);
    }

    /* If */
    @Override
    public void enterIf_op(FiboParser.If_opContext ctx)
    {
        actualizarArbol(textoNuevo + "/if_op");
        setTextoNuevo(textoNuevo + "/if_op");
    }

    @Override
    public void exitIf_op(FiboParser.If_opContext ctx)
    {
        String texto = "";
        if ( textoNuevo != "" )
        {
            texto = textoNuevo.substring(0, textoNuevo.lastIndexOf("/if_op"));
        }
        setTextoNuevo(texto);
    }

    /* Else */
    @Override
    public void enterElse_op(FiboParser.Else_opContext ctx)
    {
        actualizarArbol(textoNuevo + "/else_op");
        setTextoNuevo(textoNuevo + "/else_op");
    }

    @Override
    public void exitElse_op(FiboParser.Else_opContext ctx)
    {
        String texto = "";
        if ( textoNuevo != "" )
        {
            texto = textoNuevo.substring(0, textoNuevo.lastIndexOf("/else_op"));
        }
        setTextoNuevo(texto);
    }

    @Override
    public void enterFor_op(FiboParser.For_opContext ctx)
    {
        actualizarArbol(textoNuevo + "/for_op");
        setTextoNuevo(textoNuevo + "/for_op");
    }

    @Override
    public void exitFor_op(FiboParser.For_opContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/for_op")) : "");
    }


    @Override
    public void enterFor_eval(FiboParser.For_evalContext ctx)
    {
        actualizarArbol(textoNuevo + "/for_eval");
        setTextoNuevo(textoNuevo + "/for_eval");
    }

    @Override
    public void exitFor_eval(FiboParser.For_evalContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/for_eval")) : "");
    }

    @Override
    public void enterFuncionalidad_basica(FiboParser.Funcionalidad_basicaContext ctx)
    {
        actualizarArbol(textoNuevo + "/funcionalidad_basica");
        setTextoNuevo(textoNuevo + "/funcionalidad_basica");
    }

    @Override
    public void exitFuncionalidad_basica(FiboParser.Funcionalidad_basicaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/funcionalidad_basica")) : "");
    }

    @Override
    public void enterAsignacion(FiboParser.AsignacionContext ctx)
    {
        actualizarArbol(textoNuevo + "/asignacion");
        setTextoNuevo(textoNuevo + "/asignacion");
    }

    @Override
    public void exitAsignacion(FiboParser.AsignacionContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/asignacion")) : "");
    }

    @Override
    public void enterLibreria(FiboParser.LibreriaContext ctx)
    {
        actualizarArbol(textoNuevo + "/libreria");
        setTextoNuevo(textoNuevo + "/libreria");
    }

    @Override
    public void exitLibreria(FiboParser.LibreriaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/lib")) : "");
    }

    @Override
    public void enterDef_funcion(FiboParser.Def_funcionContext ctx)
    {
        actualizarArbol(textoNuevo + "/def_funcion");
        setTextoNuevo(textoNuevo + "/def_funcion");
    }

    @Override
    public void exitDef_funcion(FiboParser.Def_funcionContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/def_funcion")) : "");
    }

    @Override
    public void enterDef_variable(FiboParser.Def_variableContext ctx)
    {
        actualizarArbol(textoNuevo + "/def_variable");
        setTextoNuevo(textoNuevo + "/def_variable");
    }

    @Override
    public void exitDef_variable(FiboParser.Def_variableContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/def_variable")) : "");
    }


    @Override
    public void enterFuncion(FiboParser.FuncionContext ctx)
    {
        actualizarArbol(textoNuevo + "/funcion");
        setTextoNuevo(textoNuevo + "/funcion");
    }

    @Override
    public void exitFuncion(FiboParser.FuncionContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/funcion")) : "");
    }

    @Override
    public void enterExp(FiboParser.ExpContext ctx)
    {
        actualizarArbol(textoNuevo + "/exp");
        setTextoNuevo(textoNuevo + "/exp");
    }

    @Override
    public void exitExp(FiboParser.ExpContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/exp")) : "");
    }

    @Override
    public void enterExpr(FiboParser.ExprContext ctx)
    {
        actualizarArbol(textoNuevo + "/expr");
        setTextoNuevo(textoNuevo + "/expr");
    }

    @Override
    public void exitExpr(FiboParser.ExprContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/expr")) : "");
    }

    @Override
    public void enterExp_logica(FiboParser.Exp_logicaContext ctx)
    {
        actualizarArbol(textoNuevo + "/exp_logica");
        setTextoNuevo(textoNuevo + "/exp_logica");
    }

    @Override
    public void exitExp_logica(FiboParser.Exp_logicaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/exp_logica")) : "");
    }

    @Override
    public void enterSuma(FiboParser.SumaContext ctx)
    {
        actualizarArbol(textoNuevo + "/suma:" + ctx.SUMA().getText());
        setTextoNuevo(textoNuevo + "/suma:");
    }

    @Override
    public void exitSuma(FiboParser.SumaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/suma:")) : "");
    }

    @Override
    public void enterResta(FiboParser.RestaContext ctx)
    {
        actualizarArbol(textoNuevo + "/resta:" + ctx.RESTA().getText());
        setTextoNuevo(textoNuevo + "/resta:");
    }

    @Override
    public void exitResta(FiboParser.RestaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/resta:")) : "");
    }

    @Override
    public void enterMul(FiboParser.MulContext ctx)
    {
        actualizarArbol(textoNuevo + "/mul:" + ctx.MUL().getText());
        setTextoNuevo(textoNuevo + "/mul:");
    }

    @Override
    public void exitMul(FiboParser.MulContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/mul:")) : "");
    }

    @Override
    public void enterDiv(FiboParser.DivContext ctx)
    {
        actualizarArbol(textoNuevo + "/div:" + ctx.DIV().getText());
        setTextoNuevo(textoNuevo + "/div:");
    }

    @Override
    public void exitDiv(FiboParser.DivContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/div:")) : "");
    }

    @Override
    public void enterMenor(FiboParser.MenorContext ctx)
    {
        actualizarArbol(textoNuevo + "/menor:" + ctx.MENOR().getText());
        setTextoNuevo(textoNuevo + "/menor:");
    }

    @Override
    public void exitMenor(FiboParser.MenorContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/menor:")) : "");
    }

    @Override
    public void enterMayor(FiboParser.MayorContext ctx)
    {
        actualizarArbol(textoNuevo + "/mayor:" + ctx.MAYOR().getText());
        setTextoNuevo(textoNuevo + "/mayor:");
    }

    @Override
    public void exitMayor(FiboParser.MayorContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/mayor:")) : "");
    }

    @Override
    public void enterMenorigual(FiboParser.MenorigualContext ctx)
    {
        actualizarArbol(textoNuevo + "/menorigual:" + ctx.MENORIGUAL().getText());
        setTextoNuevo(textoNuevo + "/menorigual:");
    }

    @Override
    public void exitMenorigual(FiboParser.MenorigualContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/menorigual:")) : "");
    }

    @Override
    public void enterMayorigual(FiboParser.MayorigualContext ctx)
    {
        actualizarArbol(textoNuevo + "/mayorigual:" + ctx.MAYORIGUAL().getText());
        setTextoNuevo(textoNuevo + "/mayorigual:");
    }

    @Override
    public void exitMayorigual(FiboParser.MayorigualContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/mayorigual:")) : "");
    }

    @Override
    public void enterIgual(FiboParser.IgualContext ctx)
    {
        actualizarArbol(textoNuevo + "/igual:" + ctx.IGUAL().getText());
        setTextoNuevo(textoNuevo + "/igual:");
    }

    @Override
    public void exitIgual(FiboParser.IgualContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/igual:")) : "");
    }

    @Override
    public void enterNoigual(FiboParser.NoigualContext ctx)
    {
        actualizarArbol(textoNuevo + "/noigual:" + ctx.NOIGUAL().getText());
        setTextoNuevo(textoNuevo + "/noigual:");
    }

    @Override
    public void exitNoigual(FiboParser.NoigualContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/noigual:")) : "");
    }

    @Override
    public void enterBit_and(FiboParser.Bit_andContext ctx)
    {
        actualizarArbol(textoNuevo + "/bit_and:" + ctx.BIT_AND().getText());
        setTextoNuevo(textoNuevo + "/bit_and:");
    }

    @Override
    public void exitBit_and(FiboParser.Bit_andContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/bit_and:")) : "");
    }

    @Override
    public void enterAnd(FiboParser.AndContext ctx)
    {
        actualizarArbol(textoNuevo + "/and" + ctx.AND().getText());
        setTextoNuevo(textoNuevo + "/and");
    }

    @Override
    public void exitAnd(FiboParser.AndContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/and")) : "");
    }

    @Override
    public void enterBit_or(FiboParser.Bit_orContext ctx)
    {
        actualizarArbol(textoNuevo + "/bit_or:" + ctx.BIT_OR().getText());
        setTextoNuevo(textoNuevo + "/bit_or:");
    }

    @Override
    public void exitBit_or(FiboParser.Bit_orContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/bit_or:")) : "");
    }

    @Override
    public void enterOr(FiboParser.OrContext ctx)
    {
        actualizarArbol(textoNuevo + "/or:" + ctx.OR().getText());
        setTextoNuevo(textoNuevo + "/or:");
    }

    @Override
    public void exitOr(FiboParser.OrContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/or:")) : "");
    }

    @Override
    public void enterFuncion_id(FiboParser.Funcion_idContext ctx)
    {
        actualizarArbol(textoNuevo + "/funcion_id");
        setTextoNuevo(textoNuevo + "/funcion_id");
    }

    @Override
    public void exitFuncion_id(FiboParser.Funcion_idContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/funcion_id")) : "");
    }

    @Override
    public void enterVariable_id(FiboParser.Variable_idContext ctx)
    {
        actualizarArbol(textoNuevo + "/variable_id");
        setTextoNuevo(textoNuevo + "/variable_id");
    }

    @Override
    public void exitVariable_id(FiboParser.Variable_idContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/variable_id")) : "");
    }

    @Override
    public void enterIdentificador(FiboParser.IdentificadorContext ctx)
    {
        actualizarArbol(textoNuevo + "/identificador:" + ctx.IDENTIFICADOR().getText());
        setTextoNuevo(textoNuevo + "/identificador:");
    }

    @Override
    public void exitIdentificador(FiboParser.IdentificadorContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/identificador:")) : "");
    }

    @Override
    public void enterAsignar(FiboParser.AsignarContext ctx)
    {
        actualizarArbol(textoNuevo + "/asignar:" + ctx.ASIGNAR().getText());
        setTextoNuevo(textoNuevo + "/asignar:");
    }

    @Override
    public void exitAsignar(FiboParser.AsignarContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/asignar:")) : "");
    }

    @Override
    public void enterA_parentesis(FiboParser.A_parentesisContext ctx)
    {
        actualizarArbol(textoNuevo + "/a_parentesis:" + ctx.A_PARENTESIS().getText());
        setTextoNuevo(textoNuevo + "/a_parentesis:");
    }

    @Override
    public void exitA_parentesis(FiboParser.A_parentesisContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/a_parentesis:")) : "");
    }

    @Override
    public void enterC_parentesis(FiboParser.C_parentesisContext ctx)
    {
        actualizarArbol(textoNuevo + "/c_parentesis:" + ctx.C_PARENTESIS().getText());
        setTextoNuevo(textoNuevo + "/c_parentesis:");
    }

    @Override
    public void exitC_parentesis(FiboParser.C_parentesisContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/c_parentesis:")) : "");
    }

    @Override
    public void enterComa(FiboParser.ComaContext ctx)
    {
        actualizarArbol(textoNuevo + "/coma:" + ctx.COMA().getText());
        setTextoNuevo(textoNuevo + "/coma:");
    }

    @Override
    public void exitComa(FiboParser.ComaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/coma:")) : "");
    }

    @Override
    public void enterDospuntos(FiboParser.DospuntosContext ctx)
    {
        actualizarArbol(textoNuevo + "/dospuntos:" + ctx.DOSPUNTOS().getText());
        setTextoNuevo(textoNuevo + "/dospuntos:");
    }

    @Override
    public void exitDospuntos(FiboParser.DospuntosContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/dospuntos:")) : "");
    }

    @Override
    public void enterPuntoycoma(FiboParser.PuntoycomaContext ctx)
    {
        actualizarArbol(textoNuevo + "/puntoycoma:" + ctx.PUNTOCOMA().getText());
        setTextoNuevo(textoNuevo + "/puntoycoma:");
    }

    @Override
    public void exitPuntoycoma(FiboParser.PuntoycomaContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/puntoycoma:")) : "");
    }

    @Override
    public void enterSaltolinea(FiboParser.SaltolineaContext ctx)
    {
    }

    @Override
    public void exitSaltolinea(FiboParser.SaltolineaContext ctx)
    {
    }

    @Override
    public void enterBegin(FiboParser.BeginContext ctx)
    {
        actualizarArbol(textoNuevo + "/begin:" + ctx.BEGIN().getText());
        setTextoNuevo(textoNuevo + "/begin:");
    }

    @Override
    public void exitBegin(FiboParser.BeginContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/begin:")) : "");
    }

    @Override
    public void enterEnd(FiboParser.EndContext ctx)
    {
        actualizarArbol(textoNuevo + "/end:" + ctx.END().getText());
        setTextoNuevo(textoNuevo + "/end:");
    }

    @Override
    public void exitEnd(FiboParser.EndContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/end:")) : "");
    }

    @Override
    public void enterEnd_if(FiboParser.End_ifContext ctx)
    {
        actualizarArbol(textoNuevo + "/end_if:" + ctx.END_IF().getText());
        setTextoNuevo(textoNuevo + "/end_if:");
    }

    @Override
    public void exitEnd_if(FiboParser.End_ifContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/end_if:")) : "");
    }

    @Override
    public void enterInclude(FiboParser.IncludeContext ctx)
    {
        actualizarArbol(textoNuevo + "/include:" + ctx.INCLUDE().getText());
        setTextoNuevo(textoNuevo + "/include:");
    }

    @Override
    public void exitInclude(FiboParser.IncludeContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/include:")) : "");
    }

    @Override
    public void enterFunction(FiboParser.FunctionContext ctx)
    {
        actualizarArbol(textoNuevo + "/function:" + ctx.FUNCTION().getText());
        setTextoNuevo(textoNuevo + "/function:");
    }

    @Override
    public void exitFunction(FiboParser.FunctionContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/function:")) : "");
    }

    @Override
    public void enterIn(FiboParser.InContext ctx)
    {
        actualizarArbol(textoNuevo + "/in:" + ctx.IN().getText());
        setTextoNuevo(textoNuevo + "/in:");
    }

    @Override
    public void exitIn(FiboParser.InContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/in:")) : "");
    }

    @Override
    public void enterIf_(FiboParser.If_Context ctx)
    {
        actualizarArbol(textoNuevo + "/if:" + ctx.IF().getText());
        setTextoNuevo(textoNuevo + "/if:");
    }

    @Override
    public void exitIf_(FiboParser.If_Context ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/if:")) : "");
    }

    @Override
    public void enterElse_(FiboParser.Else_Context ctx)
    {
        actualizarArbol(textoNuevo + "/else:" + ctx.ELSE().getText());
        setTextoNuevo(textoNuevo + "/else:");
    }

    @Override
    public void exitElse_(FiboParser.Else_Context ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/else:")) : "");
    }

    @Override
    public void enterWhile_(FiboParser.While_Context ctx)
    {
        actualizarArbol(textoNuevo + "/while:" + ctx.WHILE().getText());
        setTextoNuevo(textoNuevo + "/while:");
    }

    @Override
    public void exitWhile_(FiboParser.While_Context ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/while:")) : "");
    }

    @Override
    public void enterFor_(FiboParser.For_Context ctx)
    {
        actualizarArbol(textoNuevo + "/for:" + ctx.FOR().getText());
        setTextoNuevo(textoNuevo + "/for:");
    }

    @Override
    public void exitFor_(FiboParser.For_Context ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/for:")) : "");
    }

    @Override
    public void enterReturn_(FiboParser.Return_Context ctx)
    {
        actualizarArbol(textoNuevo + "/return:" + ctx.RETURN().getText());
        setTextoNuevo(textoNuevo + "/return:");
    }

    @Override
    public void exitReturn_(FiboParser.Return_Context ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/return:")) : "");
    }

    @Override
    public void enterString(FiboParser.StringContext ctx)
    {
        actualizarArbol(textoNuevo + "/string:" + ctx.STRING().getText());
        setTextoNuevo(textoNuevo + "/string:");
    }

    @Override
    public void exitString(FiboParser.StringContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/string:")) : "");
    }

    @Override
    public void enterNumero(FiboParser.NumeroContext ctx)
    {
        String entero   = "";
        String flotante = "";
        try
        {
            entero = ctx.INT().getText();
        }
        catch (Exception e)
        {

        }
        try
        {
            flotante = ctx.FLOAT().getText();
        }
        catch (Exception e)
        {
        }
        actualizarArbol(textoNuevo + "/numero: " + entero + flotante);
        setTextoNuevo(textoNuevo + "/numero");
    }

    @Override
    public void exitNumero(FiboParser.NumeroContext ctx)
    {
        try
        {
            String texto = "";
            if ( textoNuevo != "" )
            {
                texto = textoNuevo.substring(0, textoNuevo.lastIndexOf("/numero"));
            }
            setTextoNuevo(texto);
        }
        catch (Exception e)
        {
        }
        ;
    }

    @Override
    public void enterValor(FiboParser.ValorContext ctx)
    {
        actualizarArbol(textoNuevo + "/valor");
        setTextoNuevo(textoNuevo + "/valor");
    }

    @Override
    public void exitValor(FiboParser.ValorContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/valor")) : "");
    }

    @Override
    public void enterR_string(FiboParser.R_stringContext ctx)
    {
        actualizarArbol(textoNuevo + "/r_string:" + ctx.R_STRING().getText());
        setTextoNuevo(textoNuevo + "/r_string:");
    }

    @Override
    public void exitR_string(FiboParser.R_stringContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/r_string:")) : "");
    }

    @Override
    public void enterR_number(FiboParser.R_numberContext ctx)
    {
        actualizarArbol(textoNuevo + "/r_numero:" + ctx.R_NUMBER().getText());
        setTextoNuevo(textoNuevo + "/r_numero:");
    }

    @Override
    public void exitR_number(FiboParser.R_numberContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/r_numero:")) : "");
    }

    @Override
    public void enterR_void(FiboParser.R_voidContext ctx)
    {
        actualizarArbol(textoNuevo + "/r_void:" + ctx.R_VOID().getText());
        setTextoNuevo(textoNuevo + "/r_void:");
    }

    @Override
    public void exitR_void(FiboParser.R_voidContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/r_void:")) : "");
    }

    @Override
    public void enterR_variable(FiboParser.R_variableContext ctx)
    {
        actualizarArbol(textoNuevo + "/r_variable");
        setTextoNuevo(textoNuevo + "/r_variable");
    }

    @Override
    public void exitR_variable(FiboParser.R_variableContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/r_variable")) : "");
    }

    @Override
    public void enterRetorno(FiboParser.RetornoContext ctx)
    {
        actualizarArbol(textoNuevo + "/retorno");
        setTextoNuevo(textoNuevo + "/retorno");
    }

    @Override
    public void exitRetorno(FiboParser.RetornoContext ctx)
    {
        setTextoNuevo(textoNuevo != "" ? textoNuevo.substring(0, textoNuevo.lastIndexOf("/retorno")) : "");
    }

    @Override
    public void visitTerminal(TerminalNode node)
    {
    }

    @Override
    public void visitErrorNode(ErrorNode node)
    {
    }

}