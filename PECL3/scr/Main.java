import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        <% session.setAtribute("nombre","Bachatas"); %>
        <% session.removeAttribute("nombre"); %>

        if (args.length != 3) {
            System.out.println("Argumentos no válidos, la llamada es: \"java Main fichero.prog nombrefuncionprincipal nombreficheroinforme.html\"\n");
            System.exit(-1);
        }
        InputStream is = new FileInputStream(args[0]);
        String funcionPrincipal = args[1];
        String nombreInforme = args[2];

        ANTLRInputStream input = new ANTLRInputStream(is);
        PECL3Lexer lexer = new PECL3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PECL3Parser parser = new PECL3Parser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        // Creamos nuestro listener con la implementación del árbol y llamamos al walker
        Listener listener = new Listener(parser, lexer);
        new ParseTreeWalker().walk(listener, tree);

        String customTree = listener.getTree();
        TablaDeSimbolos tabla = listener.getTabla();

        writeToTxt(customTree, args[0]);
        funcionalidadPECL3(tabla, nombreInforme, funcionPrincipal, args[0]);
    }

    public static void funcionalidadPECL3(TablaDeSimbolos tabla, String nombreInforme, String funcionPrincipal, String nombrePrograma) {
        EscribeHTML output = new EscribeHTML(nombreInforme, tabla, funcionPrincipal);
        output.crearInicio(nombrePrograma);
        for (Funcion funcion : tabla.getFunciones()) {
            output.addFuncion(funcion);
        }
        output.imprimeResumenPrograma();
        output.finFichero();
    }

    public static void writeToTxt(String customTree, String inputFile) {
        // Crea el txt en la misma ruta que el fichero que se le pasa para analizar
        try (PrintWriter out = new PrintWriter(inputFile + "_customTree.txt")) {
            out.print("File: " + inputFile + "\n\n" + customTree);
            System.out.println("Árbol de sintaxis generado en: " + inputFile + "_customTree.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
