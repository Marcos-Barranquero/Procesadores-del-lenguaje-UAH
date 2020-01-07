import java.util.ArrayList;
import java.util.HashMap;

public class GeneradorDeCadenas
{

    private int cuantasCadenas;

    private AFD automata;

    private ArrayList<String> cadenasGeneradas = new ArrayList<>();

    public GeneradorDeCadenas(AFD automata)
    {
        this.automata = automata;
        this.cuantasCadenas = 0;
    }


    /**
     * Método envoltorio del generador de cadenas.
     *
     * @param numeroCadenas -> cantidad de cadenas válidas que el usuario quiere.
     */
    public void generaCadenas(int numeroCadenas, int longitud)
    {
        // Reseteo el contador de cadenas a 0
        cuantasCadenas = 0;

        // Reseteo arrayList de cadenas generadas:
        cadenasGeneradas.clear();

        // Llamo pidiendo el número de cadenas que quiera el usuario
        generaCadenasAux(numeroCadenas, automata.getEstadoInicial(), "", longitud);

    }

    /**
     * Método auxiliar generador de cadenas. Para cada estado, si es un estado final, lo imprime. Si no lo es, se llama
     * recursivamente saltando a todos los estados posibles desde el estado en el que se estaba. Si el contador de
     * cadenas generadas alcanza el numero de cadenas que pide el usuario, se detiene la recursión. Si no consigue
     * generar el número especificado porque sea imposible, generará la máxima cantidad de cadenas posible.
     *
     * @param numeroCadenas  -> número de cadenas que quiere el usuario.
     * @param estado         -> estado en el que se encuentra en ese paso.
     * @param cadena         -> cadena legal acumulada de los pasos anteriores.
     * @param longitudMaxima -> longitud máxima de las cadenas que queremos generar.
     */
    private void generaCadenasAux(int numeroCadenas, int estado, String cadena, int longitudMaxima)
    {
        // Si es un estado final, imprimo y sumo al contador de cadenas generadas.
        if ( automata.esEstadoFinal(estado) && cuantasCadenas < numeroCadenas && !cadenasGeneradas.contains(cadena) )
        {

            System.out.println("C[" + (cuantasCadenas + 1) + "]: " + cadena);
            this.cuantasCadenas += 1;
            cadenasGeneradas.add(cadena);

        }
        // Si no lo es, llamo recursivamente con todos los saltos posibles desde ese estado.
        // Es importante comprobar que no se ha sobrepasado el máximo, si no lo hacemos
        // caeremos en un stack overflow.
        if ( this.cuantasCadenas < numeroCadenas && cadena.length() < longitudMaxima )
        {

            HashMap<Character, Integer> saltos = automata.getMatrizEstados().get(estado);
            for ( Character caracter : saltos.keySet() )
            {
                generaCadenasAux(numeroCadenas, saltos.get(caracter), cadena + caracter, longitudMaxima);
            }
        }

    }
}
