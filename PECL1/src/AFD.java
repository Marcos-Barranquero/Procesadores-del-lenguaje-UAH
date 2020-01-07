import java.util.ArrayList;
import java.util.HashMap;

// TODO -> LEER NODOS INICIALES Y FINALES DEL ARCHIVO

public class AFD
{
    // Alfabeto del autómata
    private ArrayList<Character> alfabeto = new ArrayList<>();

    // Posibles estados del autómata
    private ArrayList<Integer> estados = new ArrayList<>();

    // Estado inicial
    private Integer estadoInicial;

    // Posibles estados finales
    private ArrayList<Integer> estadosFinales;

    // Matriz de estados del tipo <estado, <caracter recibido, estado>>
    private HashMap<Integer, HashMap<Character, Integer>> matrizEstados = new HashMap<>();

    /**
     * Dado un generador de matriz, carga la matriz generada.
     *
     * @param gdm -> generador de matriz.
     */
    public AFD(GeneradorDeMatriz gdm)
    {
        // cargo alfabeto.
        cargarAlfabeto();

        // Leo estados
        for ( int estado : gdm.getNodos() )
        {
            this.estados.add(estado);
            matrizEstados.put(estado, new HashMap<Character, Integer>());
        }

        // Leo transiciones
        for ( Transicion transicion : gdm.getTransiciones() )
        {
            matrizEstados.get(transicion.getOrigen()).put(transicion.getCaracter(), transicion.getDestino());
        }

        // Leo estado inicial
        this.estadoInicial = gdm.getNodoInicial();

        // Leo estados finales
        this.estadosFinales = gdm.getNodosFinales();

    }

    /**
     * Carga el elfabeto.
     */
    private void cargarAlfabeto()
    {
        char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        for ( char letra : abecedario )
        {
            alfabeto.add(letra);
        }
    }


    // Salto de estados

    /**
     * Dado un estado, recibe el siguiente estado al que se salta si se recibe el carácter pasado.
     *
     * @param estado           estado en el que se encuentra
     * @param caracterRecibido carácter que se recibe
     * @return estado al que se llega desde ese estado recibiendo ese carácter
     */
    public Integer getSiguienteEstado(int estado, char caracterRecibido)
    {
        return matrizEstados.get(estado).get(caracterRecibido);
    }

    // Getters

    /**
     * Devuelve true si el estado es un estado final.
     *
     * @param estado estado que se desea saber si es final o no
     * @return T si el estado es un estado final, si no F.
     */
    public boolean esEstadoFinal(int estado)
    {
        return estadosFinales.contains(estado);
    }

    public Integer getEstadoInicial()
    {
        return estadoInicial;
    }

    public HashMap<Integer, HashMap<Character, Integer>> getMatrizEstados()
    {
        return matrizEstados;
    }

    public ArrayList<Character> getAlfabeto()
    {
        return alfabeto;
    }


    // toString's

    /**
     * Saca por pantalla una representación gráfica de la matriz.
     */
    public void pintaMatriz()
    {
        System.out.println("EstadoAnterior\t-(char)->\tEstadoSiguiente");
        for ( Integer estado : matrizEstados.keySet() )
        {
            String nodoOrigen = estado.toString();
            for ( Character caracter : matrizEstados.get(estado).keySet() )
            {
                String caracterSalto = caracter.toString();
                String nodoDestino   = matrizEstados.get(estado).get(caracter).toString();
                System.out.println(nodoOrigen + "\t-(" + caracterSalto + ")->\t" + nodoDestino);
            }
        }

        System.out.println("Estado inicial: " + estadoInicial);
        System.out.println("Estado(s) final(es): " + estadosFinales.toString());
    }
}


