import java.util.Arrays;
import java.util.HashMap;

public class VerificadorDeCadenas
{
    /* Estado en el que nos encontramos */
    private int estadoActual;

    /* Autómata asociado */
    private AFD automata;

    /**
     * Constructor de la máquina verificadora de cadenas.
     *
     * @param automata -> autómata asociado con la Regex a verificar.
     */
    public VerificadorDeCadenas(AFD automata)
    {
        this.automata = automata;
        this.estadoActual = automata.getEstadoInicial();
    }


    /**
     * Dada una cadena, devuelve si es correcta o no para el autómata asociado.
     * @param cadena -> cadena que se quiere verificar.
     * @return T si es correcta, si no F.
     */
    public boolean esCadenaCorrecta(String cadena)
    {
        estadoActual = automata.getEstadoInicial();
        return esCadenaCorrectaAux(cadena.toCharArray());
    }


    /**
     * Método recursivo para verificar cadenas. Dada una cadena, hay 4 casos:
     * 1) Si no quedan caracteres y es un estado final, devuelve True.
     * 2) Si no quedan caracteres y no es un estado final, devuelve False.
     * 3) Si quedan caracteres y no se puede saltar a un estado, devuelve False.
     * 4) Si quedan caracteres y se puede saltar al siguiente estado, se llama
     *    recursivamente con el resto de la cadena y avanzando a ese estado.
     * @param cadena
     * @return T si la cadena es correcta, si no, F.
     */
    private boolean esCadenaCorrectaAux(char[] cadena)
    {
        if ( cadena.length == 0 )
        {
            // Caso 1
            if ( automata.esEstadoFinal(estadoActual) )
            {
                return true;
            }
            // Caso 2
            else
            {
                return false;
            }
        } else
        {

            char   caracter = cadena[0];

            char[] resto    = Arrays.copyOfRange(cadena, 1, cadena.length);

            // Si el caracter no se encuentra en el alfabeto del autómata,
            // no se puede procesar la cadena y por tanto retorna false.
            if(!automata.getAlfabeto().contains(caracter))
            {
                return false;
            }

            // Hashmap de posibles saltos desde el estado actual.
            HashMap<Character, Integer> posiblesSaltos = automata.getMatrizEstados().get(estadoActual);

            // Caso 3
            if ( posiblesSaltos.keySet().contains(caracter) )
            {
                estadoActual = automata.getSiguienteEstado(estadoActual, caracter);
                return esCadenaCorrectaAux(resto);
            }
            // Caso 4
            else
            {
                return false;
            }
        }
    }
}