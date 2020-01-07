import java.io.*;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creo lectura del documento.
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);
        FiboLexer lexer = new FiboLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FiboParser parser = new FiboParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.programa();

        // Creamos listener propio
        Listener listener = new Listener();
        // Y recorremos el árbol con nuestro listener y el walker
        new ParseTreeWalker().walk(listener, tree);


        // Imprimimos el árbol
        ArrayList<String> arbol = listener.getArbol();
        for ( int i = 0; i < arbol.size(); i++ )
        {
            System.out.println(arbol.get(i));

        }

        // Y lo escribimos en el txt
        dumpTxt(arbol);
    }


    public static void dumpTxt(ArrayList<String> arbol)
    {
        try
        {
        File           f         = new File("arbol.txt");
        FileWriter     fw        = new FileWriter(f);
        BufferedWriter escritura = new BufferedWriter(fw);
        for(int i=0;i<arbol.size();i++){
            escritura.write(arbol.get(i));
            escritura.newLine();

        }
        escritura.close();
        } catch (Exception e)
        {
            System.out.println("Error en la escritura del archivo. ");
        }
    }
    }

