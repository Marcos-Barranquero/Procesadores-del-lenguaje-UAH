import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class GestorGrafo
{

    private Grafo grafo;

    // Contadores para complejidad ciclomática
    private int contadorNodos   = 0;
    private int contadorAristas = 0;
    private int contadorSalidas = 0;

    // Elementos usados para construir el grafo
    private String        nodoActual;
    private Stack<String> anteriores = new Stack<>();
    private Stack<String> siguientes = new Stack<>();

    // Elementos asociados a la función
    private String            nombreFuncion;
    private ArrayList<String> nodosLeyenda = new ArrayList<>();

    // Elementos gráficos
    private String        color;
    private Stack<String> pilaColores = new Stack<>();

    // Array de comandos para reproducir el grafo a la hora de dibujar el grafo final:
    private ArrayList<String> comandosEjecutados = new ArrayList<>();

    public GestorGrafo(String nombreFuncion)
    {
        nuevoColor();
        this.nombreFuncion = nombreFuncion;
        // Creo grafo
        grafo = new Grafo("GrafoFuncion" + nombreFuncion);

        // Añado nodo inicial y final
        grafo.addNodo("Inicio", color);
        grafo.addNodo("Fin", color);

        // Pongo como actual el inicio
        this.nodoActual = "Inicio";

    }


    /**
     * 1) Crea nodo del if y lo linkea (actual->if) 2) Crea nodo del else y lo linkea (actual->else) 3) Pone como nodo
     * actual el nodo del if. 4) Añade a siguientes el nodo del else.
     */
    public void enterIf()
    {
        comandosEjecutados.add("enterIf");
        // Creo nodo inf
        contadorNodos += 1;
        String nodoIf = "IF" + contadorNodos;
        grafo.addNodo(nodoIf, color);
        // linkeo 1
        grafo.unir(nodoActual, nodoIf);
        contadorAristas += 1;

        // Creo nodo else:
        contadorNodos += 1;
        String nodoElse = "ELSE" + contadorNodos;
        grafo.addNodo(nodoElse, color);
        // linkeo 2
        grafo.unir(nodoActual, nodoElse);
        contadorAristas += 1;

        // pongo como actual el nodo del if
        nodoActual = nodoIf;

        // pongo como siguientes el nodo del else
        siguientes.push(nodoElse);
    }

    /**
     * Función que cierra el IF, solo si NO hay else. 1) Crea nodo de cierre 2) Lo linkea al actual (actual->cierre) 3)
     * Saca nodo de else de siguientes. 4) Linkea nodo de else al cierre (else->cierre) 5) Pone como actual el nodo de
     * cierre
     */
    public void exitIf()
    {
        comandosEjecutados.add("exitIf");
        // Creo nodo cierre
        contadorNodos += 1;
        String nodoCierre = Integer.toString(contadorNodos);
        grafo.addNodo(nodoCierre, color);

        // linkeo actual a cierre
        grafo.unir(nodoActual, nodoCierre);
        contadorAristas += 1;

        // linkeo el nodo del else con el cierre
        String nodoElse = siguientes.pop();
        grafo.unir(nodoElse, nodoCierre);
        contadorAristas += 1;

        // pongo como actual el nodo de cierre
        nodoActual = nodoCierre;
    }

    /**
     * Función que pone como actual el else. Llamar solo si hay else. 1) Carga en anteriores el actual 2) Saca el else
     * de siguientes 2) Pone como actual el else
     */
    public void enterElse()
    {
        comandosEjecutados.add("enterElse");
        // cargo en anteriores donde estuviese
        anteriores.push(nodoActual);

        nodoActual = siguientes.pop();
    }

    /**
     * Representa el cierre del ELSE. Llamar solo si SI hay else. 1) Crea nodo de cierre 2) Linkea actual y cierre
     * (actual->cierre) 3) Saca el if de anteriores 4) Linkea if y cierre (if->cierre) 5) Pone como actual el cierre.
     */
    public void exitElse()
    {
        comandosEjecutados.add("exitElse");
        // Creo nodo cierre
        contadorNodos += 1;
        String nodoCierre = Integer.toString(contadorNodos);
        grafo.addNodo(nodoCierre, color);

        // linkeo actual y cierre
        grafo.unir(nodoActual, nodoCierre);
        contadorAristas += 1;

        // linkeo el anterior y el cierre
        String ifAnterior = anteriores.pop();
        grafo.unir(ifAnterior, nodoCierre);
        contadorAristas += 1;
        // Establezco como actual el cierre
        nodoActual = nodoCierre;
    }

    public void enterRecursion(String nombeFuncion)
    {
        // Creo nodo inicio bucle
        contadorNodos += 1;
        String nodoInicioBucle = "RECURSION" + nombeFuncion + contadorNodos;
        grafo.addNodo(nodoInicioBucle, color);

        // Linkeo actual a nodoBucle
        grafo.unir(nodoActual, nodoInicioBucle);
        contadorAristas += 1;

        // establezco actual como el nuevo creado
        nodoActual = nodoInicioBucle;

        // creo nodo del contenido del bucle
        contadorNodos += 1;
        String nodoInterno = "CONTENIDORECURSION" + contadorNodos;
        grafo.addNodo(nodoInterno, color);

        // linkeo
        grafo.unir(nodoActual, nodoInterno);
        contadorAristas += 1;

        // guardo el anterior
        anteriores.push(nodoActual);

        // establezco ocmo actual el nuevo
        nodoActual = nodoInterno;

        // saco el nodo inicial del bucle
        String anteriorBucle = anteriores.pop();

        // linkeo la salida del bucle
        grafo.unir(nodoActual, anteriorBucle);
        contadorAristas += 1;

        // creo nodo siguiente
        contadorNodos += 1;
        String nodoFinBucle = "FINRECURSION" + nombeFuncion + contadorNodos;
        grafo.addNodo(nodoFinBucle, color);

        // linkeo
        grafo.unir(anteriorBucle, nodoFinBucle);
        contadorAristas += 1;

        // y establezco como actual el fin de bucle
        nodoActual = nodoFinBucle;
    }

    /**
     * Función que añade la estructura del bucle. 1) Crea nodo de inicio de bucle 2) Linkea actual (actual->inicioBucle)
     * 3) Pone como actual el inicio del bucle 4) Crea nodo del contenido del bucle 5) Linkea actual a contenido del
     * bucle 6) Pone como actual el contenido del bucle.
     */
    public void enterBucle()
    {
        comandosEjecutados.add("enterBucle");
        // Creo nodo inicio bucle
        contadorNodos += 1;
        String nodoInicioBucle = "FOROWHILE" + contadorNodos;
        grafo.addNodo(nodoInicioBucle, color);

        // Linkeo actual a nodoBucle
        grafo.unir(nodoActual, nodoInicioBucle);
        contadorAristas += 1;

        // establezco actual como el nuevo creado
        nodoActual = nodoInicioBucle;

        // creo nodo del contenido del bucle
        contadorNodos += 1;
        String nodoInterno = "CONTENIDOBUCLE" + contadorNodos;
        grafo.addNodo(nodoInterno, color);

        // linkeo
        grafo.unir(nodoActual, nodoInterno);
        contadorAristas += 1;

        // guardo el anterior
        anteriores.push(nodoActual);

        // establezco ocmo actual el nuevo
        nodoActual = nodoInterno;
    }

    /**
     * Función que añade la salida del bucle. 1) Saca el nodo inicial del bucle de anteriores. 2) Linkea actual con el
     * nodo inicial. 3) Crea el nodo siguiente. 4) Linkea inicial con siguiente. 5) Pone como actual el siguiente.
     */
    public void exitBucle()
    {
        comandosEjecutados.add("exitBucle");
        // saco el nodo inicial del bucle
        String anteriorBucle = anteriores.pop();

        // linkeo la salida del bucle
        grafo.unir(nodoActual, anteriorBucle);
        contadorAristas += 1;

        // creo nodo siguiente
        contadorNodos += 1;
        String nodoFinBucle = "FINBUCLE" + contadorNodos;
        grafo.addNodo(nodoFinBucle, color);

        // linkeo
        grafo.unir(anteriorBucle, nodoFinBucle);
        contadorAristas += 1;

        // y establezco como actual el fin de bucle
        nodoActual = nodoFinBucle;

    }

    /**
     * Concatena en comandos la llamada a la función.
     */
    public void enterLlamadaFuncion(String nombreFuncion)
    {
        comandosEjecutados.add(nombreFuncion);
    }

    /**
     * Añade un nodo no conectado a nada que sirve para indicar la función asociada al color.
     *
     * @param nombre -> nombre de la función.
     */
    public void addNodoLeyenda(String nombre)
    {
        if ( !nodosLeyenda.contains(nombre) )
        {
            grafo.addNodo(nombre, color);
            nodosLeyenda.add(nombre);
        }
    }

    /**
     * Añade un nodo con la llamada a la función.
     *
     * @param nombreFuncion
     */
    public void addNodoLlamadaFuncion(String nombreFuncion)
    {
        // Creo nodo con nombreFuncion
        contadorNodos += 1;
        String nodoFuncion = nombreFuncion + contadorNodos;
        grafo.addNodo(nodoFuncion, color);

        // linkeo con actual
        grafo.unir(nodoActual, nodoFuncion);
        contadorAristas += 1;

        // establezco funcion como actual
        nodoActual = nodoFuncion;
    }

    /**
     * Cierra el grafo: cualquier nodo que no tenga hijos lo manda a Fin.
     */
    public void cerrar()
    {
        for ( Nodo nodoLeido : grafo.getNodos() )
        {
            if ( nodoLeido.getNodosHijos().size() == 0 && nodoLeido.getIdNodo() != "Fin" && !(nodosLeyenda.contains(
                    nodoLeido.getIdNodo())) )
            {
                grafo.unir(nodoLeido.getIdNodo(), "Fin");
                contadorAristas += 1;
            }
        }
    }

    /**
     * Crea un .dot con el nombre de la función recorriendo el grafo.
     */
    public void crearDibujo()
    {
        grafo.generarDot(nombreFuncion + ".dot");

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("powershell.exe", "dot -Tsvg " + nombreFuncion + ".dot -o " + nombreFuncion + ".svg");
        try
        {
            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null)
            {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if ( exitVal != 0 )
                System.out.println("Error al generar el grafo");
        }
        catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Crea un .dot con el nombre de la función y el complemento pasado.
     *
     * @param complemento
     */
    public void crearDibujo(String complemento)
    {
        grafo.generarDot(nombreFuncion + ".dot");

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("powershell.exe",
                               "dot -Tsvg " + nombreFuncion + ".dot -o " + nombreFuncion + complemento + ".svg");
        try
        {
            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null)
            {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if ( exitVal != 0 )
                System.out.println("Error al generar el grafo");
        }
        catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    // Getters
    public ArrayList<String> getComandosEjecutados()
    {
        return comandosEjecutados;
    }

    public Grafo getGrafo()
    {
        return grafo;
    }

    public String getColor()
    {
        return color;
    }

    // Complejidad

    public int getComplejidad()
    {
        // mínimo nº de salidas
        if(contadorSalidas==0) contadorSalidas+=1;

        int complejidad = contadorAristas - contadorNodos - 2 * contadorSalidas;
        // Minimo valor de complejidad posible
        if ( complejidad < 1 ) complejidad = 1;
        return complejidad;
    }

    public void incrementarSalidas()
    {
        contadorSalidas+=1;
    }


    // Gestión de color

    public void nuevoColor()
    {
        String[] colores = { "antiquewhite4",
                "aquamarine",
                "aquamarine1",
                "aquamarine2",
                "azure",
                "azure1",
                "azure2",
                "beige",
                "bisque",
                "bisque1",
                "bisque4",
                "blanchedalmond",
                "blue2",
                "blue3",
                "blue4",
                "brown1",
                "brown2",
                "burlywood1",
                "burlywood2",
                "burlywood3",
                "cadetblue1",
                "cadetblue2",
                "chartreuse1",
                "chartreuse2",
                "chocolate1",
                "coral1",
                "coral2",
                "cornsilk",
                "cornsilk1",
                "cornsilk2",
                "crimson",
                "cyan",
                "cyan1",
                "cyan4",
                "deeppink2",
                "deeppink3",
                "deeppink4",
                "deepskyblue2",
                "deepskyblue4",
                "dodgerblue",
                "dodgerblue1",
                "dodgerblue2",
                "firebrick",
                "firebrick1",
                "firebrick2",
                "floralwhite",
                "forestgreen",
                "gainsboro",
                "gold1",
                "gold2",
                "gold3",
                "goldenrod1",
                "goldenrod2",
                "goldenrod3",
                "gray0",
                "gray1",
                "gray10",
                "honeydew1",
                "honeydew2",
                "honeydew3",
                "hotpink1",
                "hotpink2",
                "hotpink3",
                "indianred1",
                "indianred2",
                "indianred3",
                "ivory",
                "ivory1",
                "ivory4",
                "khaki",
                "khaki1",
                "khaki4",
                "lavender",
                "lavenderblush",
                "lavenderblush3",
                "lavenderblush4",
                "lawngreen",
                "lemonchiffon2",
                "lemonchiffon3",
                "lemonchiffon4",
                "lightblue2",
                "lightblue3",
                "lightblue4",
                "lightcyan1",
                "lightcyan2",
                "lightcyan3",
                "lightgoldenrod1",
                "lightgoldenrod2",
                "lightgoldenrod3",
                "lightgray",
                "lightgrey",
                "lightpink",
                "lightpink3",
                "lightpink4",
                "lightsalmon",
                "lightsalmon3",
                "lightsalmon4",
                "lightseagreen",
                "lightskyblue2",
                "lightskyblue3",
                "lightskyblue4",
                "lightslategrey",
                "lightsteelblue",
                "lightsteelblue1",
                "lightsteelblue4",
                "lightyellow",
                "lightyellow1",
                "lightyellow4",
                "limegreen",
                "linen",
                "magenta2",
                "magenta3",
                "magenta4",
                "maroon2",
                "maroon3",
                "maroon4",
                "mediumorchid",
                "mediumorchid1",
                "mediumorchid2",
                "mediumpurple",
                "mediumpurple1",
                "mediumpurple2",
                "mediumseagreen",
                "mediumslateblue",
                "mediumspringgreen",
                "midnightblue",
                "mintcream",
                "mistyrose",
                "mistyrose3",
                "mistyrose4",
                "moccasin",
                "navajowhite2",
                "navajowhite3",
                "navajowhite4",
                "oldlace",
                "olivedrab",
                "olivedrab3",
                "olivedrab4",
                "orange",
                "orange3",
                "orange4",
                "orangered",
                "orangered3",
                "orangered4",
                "orchid",
                "orchid3",
                "orchid4",
                "palegoldenrod",
                "palegreen2",
                "palegreen3",
                "palegreen4",
                "paleturquoise2",
                "paleturquoise3",
                "paleturquoise4",
                "palevioletred2",
                "palevioletred3",
                "palevioletred4",
                "peachpuff1",
                "peachpuff2",
                "peachpuff3",
                "pink",
                "pink1",
                "pink2",
                "plum",
                "plum1",
                "plum2",
                "powderblue",
                "purple",
                "purple1",
                "purple4",
                "red",
                "red1",
                "red4",
                "rosybrown",
                "rosybrown1",
                "rosybrown4",
                "royalblue",
                "royalblue1",
                "royalblue4",
                "saddlebrown",
                "salmon",
                "salmon3",
                "salmon4",
                "sandybrown",
                "seagreen2",
                "seagreen3",
                "seagreen4",
                "seashell2",
                "seashell3",
                "seashell4",
                "sienna2",
                "sienna3",
                "sienna4",
                "skyblue2",
                "skyblue3",
                "skyblue4",
                "slateblue2",
                "slateblue3",
                "slateblue4",
                "slategray2",
                "slategray3",
                "slategray4",
                "snow1",
                "snow2",
                "snow3",
                "springgreen1",
                "springgreen2",
                "springgreen3",
                "steelblue1",
                "steelblue2",
                "steelblue3",
                "tan1",
                "tan2",
                "tan3",
                "thistle1",
                "thistle2",
                "thistle3",
                "tomato1",
                "tomato2",
                "tomato3",
                "turquoise",
                "turquoise1",
                "turquoise2",
                "violet",
                "violetred",
                "violetred1",
                "violetred4",
                "wheat",
                "wheat1",
                "wheat4",
                "white",
                "whitesmoke",
                "yellow2",
                "yellow3",
                "yellow4",
                "yellowgreen" };
        int rnd = new Random().nextInt(colores.length);
        this.color = colores[rnd];
        pilaColores.push(colores[rnd]);
    }

    public void viejoColor()
    {
        pilaColores.pop();
        this.color = pilaColores.peek();
    }
}
