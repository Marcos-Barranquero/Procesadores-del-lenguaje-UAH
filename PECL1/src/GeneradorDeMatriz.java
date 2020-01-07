import java.io.*;
import java.util.ArrayList;

public class GeneradorDeMatriz
{
    File                  archivo;
    ArrayList<Integer>    nodos        = new ArrayList<>();
    ArrayList<Transicion> transiciones = new ArrayList<>();
    int nodoInicial = -1;
    ArrayList<Integer> nodosFinales = new ArrayList<>();

    public GeneradorDeMatriz(String ruta)
    {
        archivo = new File(ruta);
        generarNodos();
        generarTransiciones();
    }

    // Métodos principales

    /**
     * Lee el archivo y captura los nodos.
     */
    private void generarNodos()
    {
        int nodo = -1;

        BufferedReader buffer = null;
        try
        {
            buffer = new BufferedReader(new FileReader(archivo));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        String cadenaLeida = "";
        while (true)
        {
            try
            {
                if ( !((cadenaLeida = buffer.readLine()) != null) ) break;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if ( cadenaLeida.contains("id=") )
            {
                nodo = capturaNodo(cadenaLeida);
                nodos.add(nodo);
            }
            else if ( cadenaLeida.contains("initial"))
            {
                nodoInicial = nodo;
            }
            else if (cadenaLeida.contains("final"))
            {
                nodosFinales.add(nodo);
            }
        }
    }

    /**
     * Lee el archivo y captura las transiciones de un nodo a otro.
     */
    private void generarTransiciones()
    {
        int origenTemporal = 0;
        int destinoTemporal = 0;
        char caracterTemporal = ' ';

        // Lectura de archivo

        BufferedReader buffer = null;
        try
        {
            buffer = new BufferedReader(new FileReader(archivo));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // Leo línea a línea
        String cadenaLeida = "";
        while (true)
        {
            try
            {
                if ( !((cadenaLeida = buffer.readLine()) != null) ) break;
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if ( cadenaLeida.contains("<from>") )
            {
                origenTemporal = capturaNodoTransicion(cadenaLeida);
            }
            else if(cadenaLeida.contains("<to>"))
            {
                destinoTemporal = capturaNodoTransicion(cadenaLeida);
            }
            else if(cadenaLeida.contains("<read>"))
            {
                caracterTemporal = capturaCaracter(cadenaLeida);

                // Como he leído origen, destino y caracter, puedo crear la nueva transición.
                transiciones.add(new Transicion(origenTemporal, destinoTemporal, caracterTemporal));
            }
        }

    }

    // Capturadores auxiliares

    /**
     * Dada una línea que contiene un número de nodo, devuelve el número del nodo.
     *
     * @param cadena -> cadena con el número del nodo.
     * @return número id del nodo.
     */
    private int capturaNodo(String cadena)
    {
        String[] x = cadena.split(" ")[1].split("\"");
        return Integer.parseInt(x[1]);

    }

    /**
     * Lee de una línea el carácter de salto.
     * @param entrada -> línea leída del archivo.
     * @return el caracter.
     */
    private char capturaCaracter(String entrada)
    {
        String[] x = entrada.split("<")[1].split(">");
        return x[1].toCharArray()[0];
    }

    /**
     * Lee de una línea el origen/destino del salto.
     * @param entrada -> línea leída del archivo.
     * @return el destino.
     */
    private int capturaNodoTransicion(String entrada)
    {
        String[] x = entrada.split("<")[1].split(">");
        return Integer.parseInt(x[1]);
    }


    // Getters

    /**
     * Devuelve el array de nodos o estados.
     * @return el array de nodos.
     */
    public ArrayList<Integer> getNodos()
    {
        return nodos;
    }

    /**
     * Devuelve el array de transiciones.
     * @return el array de transiciones.
     */
    public ArrayList<Transicion> getTransiciones()
    {
        return transiciones;
    }

    public int getNodoInicial()
    {
        return nodoInicial;
    }

    public ArrayList<Integer> getNodosFinales()
    {
        return nodosFinales;
    }
}