import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Stack;

public class Listener extends PECL3ParserBaseListener {
    // Atributo String en el que se almacena el árbol con el formato dado
    private String tree = "";
    private int numeroFunciones = 0;

    private Stack<Boolean> pilaElse = new Stack<>();

    // Lexer asociado
    private PECL3Lexer lexer;

    // Parser asociado
    private PECL3Parser parser;

    // Tabla de simbolos
    private TablaDeSimbolos tablaSimbolos = new TablaDeSimbolos();

    public Listener(PECL3Parser parser, PECL3Lexer lexer) {
        this.lexer = lexer;
        this.parser = parser;
    }

    public TablaDeSimbolos getTabla() {
        return this.tablaSimbolos;
    }

    /**
     * Getter del arbol de llamadas
     */
    public String getTree() {
        return this.tree;
    }

    /**
     * Añadimos la función que se define a la tabla de símbolos y la marcamos como función sobre la que se trabajará.
     *
     * @param ctx <- contexto de definición de función
     */
    @Override
    public void enterDef_func(PECL3Parser.Def_funcContext ctx) {
        numeroFunciones+=1;
        ArrayList<Variable> parametros = new ArrayList<>();
        for (int i = 1; i < ctx.identifier().size(); i++) {
            parametros.add(new Variable(ctx.as_var_type(i - 1).getText(), ctx.identifier(i).getText()));
        }
        Funcion nuevaFuncion = new Funcion(numeroFunciones ,ctx.identifier(0).getText(), parametros, ctx.as_type().getText());
        this.tablaSimbolos.addFuncion(nuevaFuncion);

        // Añado línea efectiva:
        tablaSimbolos.addLineaEfectiva();

        this.tablaSimbolos.setFuncionActual(nuevaFuncion);
    }

    @Override
    public void exitDef_func(PECL3Parser.Def_funcContext ctx) {
        this.tablaSimbolos.getFuncionActual().getGestorGrafo().cerrar();
        this.tablaSimbolos.addPuntosFinales();
        this.tablaSimbolos.setFuncionActual(null);
    }

    @Override
    public void enterDef_var(PECL3Parser.Def_varContext ctx) {
        String tipo = ctx.as_type().as_var_type().getText();

        // TODO: sacar el valor del assign para añadirlo al valor de la variable
        for (PECL3Parser.AssignContext assign : ctx.assign()) {
            this.tablaSimbolos.addVariable(new Variable(tipo + (assign.op_bracket() != null ? "_array" : ""),
                    assign.identifier(0).getText())); // Si hay brackets, se esta definiendo
            // un array
            this.tablaSimbolos.addComplejidad(1);
            this.tablaSimbolos.addLineaEfectiva(); // Se añade una linea de la declaracion
        }

        for (PECL3Parser.Var_definitionContext var_def : ctx.var_definition()) {
            this.tablaSimbolos.addVariable(new Variable(tipo + (var_def.op_bracket() != null ? "_array" : ""),
                    var_def.identifier(0).getText())); // Si hay brackets, se esta definiendo un array
            this.tablaSimbolos.addComplejidad(1);
            this.tablaSimbolos.addLineaEfectiva(); // Se añade una linea por declaracion
        }
    }

    @Override
    public void enterAssign(PECL3Parser.AssignContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
        this.tablaSimbolos.addLineaEfectiva();
    }

    @Override
    public void enterFunc_call(PECL3Parser.Func_callContext ctx) {
        tablaSimbolos.getFuncionActual().getGestorGrafo().enterLlamadaFuncion(ctx.func_id().getText());
        this.tablaSimbolos.addComplejidad(2 + ctx.expr_content().size());
        numeroFunciones+=1;
        this.tablaSimbolos.addFuncionLlamada(new Funcion(numeroFunciones, ctx.func_id().getText(), ctx.expr_content().size()));
    }

    @Override
    public void enterFor_op(PECL3Parser.For_opContext ctx) {
        this.tablaSimbolos.addComplejidad(2); // Se añade 1 punto de complejidad por la evaluacion del for
        enterBucle();
    }

    @Override
    public void enterReturn_val(PECL3Parser.Return_valContext ctx) {
        this.tablaSimbolos.getFuncionActual().getGestorGrafo().incrementarSalidas();
    }

    @Override
    public void enterAdd(PECL3Parser.AddContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterSub(PECL3Parser.SubContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterMult(PECL3Parser.MultContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterQuotient(PECL3Parser.QuotientContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterLesser(PECL3Parser.LesserContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterGreater(PECL3Parser.GreaterContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterLesser_eq(PECL3Parser.Lesser_eqContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterGreater_eq(PECL3Parser.Greater_eqContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterEq(PECL3Parser.EqContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterNot_eq(PECL3Parser.Not_eqContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterBit_and(PECL3Parser.Bit_andContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterAnd(PECL3Parser.AndContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterBit_or(PECL3Parser.Bit_orContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterOr(PECL3Parser.OrContext ctx) {
        this.tablaSimbolos.addComplejidad(1);
    }

    @Override
    public void enterBasic_func(PECL3Parser.Basic_funcContext ctx) {
        if (!ctx.children.get(0).getChild(0).getText().equals("devolver")) // Si la operacion básica no es un return...
            this.tablaSimbolos.entraBifurcacion();

        // Añado línea efectiva:
        tablaSimbolos.addLineaEfectiva();
    }

    @Override
    public void enterLib(PECL3Parser.LibContext ctx) {
        this.tablaSimbolos.addLibreria(ctx.identifier().getText());
        // Añado línea efectiva:
        tablaSimbolos.addLineaEfectiva();
    }

    @Override
    public void exitBasic_func(PECL3Parser.Basic_funcContext ctx) {
        if (!ctx.children.get(0)
                .getChild(0)
                .getText()
                .equals("devolver")) // Si la operacion básica no es un return...
            this.tablaSimbolos.saleBifurcacion();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // Listado de reglas de este contexto
        String listado = "/" + getRegla(ctx);

        // Mientras haya padres, añado sus reglas para construir el árbol de llamadas.
        ParserRuleContext padre = ctx.getParent();
        while (padre != null) {
            listado = "/" + getRegla(padre) + listado;
            padre = padre.getParent();

        }

        // Obtengo nombre del simbolo terminal:
        String nombre = getUnidadSintaxis(ctx);

        // Si no es un espacio o un salto de linea, lo añado al árbol.
        this.tree += (!nombre.equals("")) ? listado + ": " + '"' + nombre + '"' + "\n" : listado + "\n";
    }

    /**
     * Dado un contexto, retorno su regla del parser asociada.
     *
     * @param ctx -> contexto
     * @return -> regla del ctx.
     */
    public String getRegla(ParserRuleContext ctx) {
        return parser.getRuleNames()[ctx.getRuleIndex()];
    }

    /**
     * Dado un contexto, devuelvo el símbolo terminal del lexer.
     *
     * @param ctx -> contexto.
     * @return -> símbolo terminal.
     */
    public String getSymbol(ParserRuleContext ctx) {
        ctx.getStart().getType();
        return lexer.getVocabulary().getSymbolicName(ctx.getStart().getType());
    }

    /**
     * Dado un contexto, obtengo sus nodos terminales.
     *
     * @param ctx -> contexto.
     * @return -> arrayList de nodos terminales.
     */
    public ArrayList<TerminalNode> getNodosTerminales(ParserRuleContext ctx) {
        ArrayList<TerminalNode> terminalNodes = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof TerminalNode) {
                terminalNodes.add((TerminalNode) ctx.getChild(i));
            }
        }

        return terminalNodes;
    }

    /**
     * Dado un contexto, devuelve su unidad sintáctica (el texto del código) siempre que sea un nodo terminal.
     *
     * @param ctx -> contexto terminal
     * @return -> texto del código terminal, o cadena vacía si no es terminal.
     */
    public String getUnidadSintaxis(ParserRuleContext ctx) {
        ArrayList<TerminalNode> nodosTerminales = getNodosTerminales(ctx);
        String nombre = "";

        // Si hay nodo terminal, saco su nombre.
        if (nodosTerminales.size() == 1) {
            nombre = nodosTerminales.get(0).getText();
        }

        return nombre.strip();
    }

    @Override
    public void enterExpr_total(PECL3Parser.Expr_totalContext ctx) {
        this.tablaSimbolos.addLineaEfectiva();
    }

    @Override
    public void enterLogic_expr(PECL3Parser.Logic_exprContext ctx) {
        this.tablaSimbolos.addLineaEfectiva();
    }

    /* Gestión de bifurcaciones */

    @Override
    public void enterIf_op(PECL3Parser.If_opContext ctx) {
        // Si hay un else, pongo hayElse a true para sacar la bifurcación en el enterElse.
        boolean hayElse = (ctx.else_op() != null);

        pilaElse.add(hayElse);
        tablaSimbolos.getFuncionActual().getGestorGrafo().enterIf();
    }

    @Override
    public void exitIf_op(PECL3Parser.If_opContext ctx) {
        boolean hayElse = pilaElse.pop();

        // Si había un else, no cierro el if del grafo
        if (!hayElse) {
            tablaSimbolos.getFuncionActual().getGestorGrafo().exitIf();
        }
    }

    @Override
    public void enterElse_op(PECL3Parser.Else_opContext ctx) {
        tablaSimbolos.getFuncionActual().getGestorGrafo().enterElse();
    }

    @Override
    public void exitElse_op(PECL3Parser.Else_opContext ctx) {
        tablaSimbolos.getFuncionActual().getGestorGrafo().exitElse();
    }

    @Override
    public void enterWhile_op(PECL3Parser.While_opContext ctx) {
        enterBucle();
    }

    @Override
    public void exitWhile_op(PECL3Parser.While_opContext ctx) {
        exitBucle();
    }

    @Override
    public void exitFor_op(PECL3Parser.For_opContext ctx) {
        exitBucle();
    }

    public void enterBucle() {
        tablaSimbolos.getFuncionActual().getGestorGrafo().enterBucle();
    }

    public void exitBucle() {
        tablaSimbolos.getFuncionActual().getGestorGrafo().exitBucle();
    }
}