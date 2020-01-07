import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static GeneradorDeMatriz gdm;

    private static AFD automata;

    private static VerificadorDeCadenas vdc;

    private static GeneradorDeCadenas gdc;


    public static void main(String[] args) throws IOException
    {
        // Cargo el generador de matriz con la ruta del fichero de JFLAP.
        gdm = new GeneradorDeMatriz("C:\\Users\\marco\\Desktop\\PDL\\Práctica 1\\ejemplo.jff");

        // Creo un nuevo autómata que carga la matriz de estados y transiciones,
        // alfabeto y saltos entre estados.
        automata = new AFD(gdm);

        // Creo verificador y generador.
        vdc = new VerificadorDeCadenas(automata);
        gdc = new GeneradorDeCadenas(automata);

        System.out.println("Autómata y verificadores creados con éxito. ");

        // Opcioens del menu
        int    opcion  = 0;

        // lectura
        String entrada;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (opcion != 4)
        {
            System.out.println("1) Verificar cadena");
            System.out.println("2) Generar cadenas legales");
            System.out.println("3) Dibujar matriz por pantalla");
            System.out.println("4) Salir");
            System.out.println("¿Qué desea hacer?");

            opcion = Integer.parseInt(bufferedReader.readLine());

            switch (opcion)
            {
                case 1:
                    System.out.println("Introduce cadena a verificar: ");
                    entrada = bufferedReader.readLine();
                    if ( vdc.esCadenaCorrecta(entrada) )
                    {
                        System.out.println("La cadena \"" + entrada + "\" es correcta. ");
                    } else
                    {
                        System.out.println("La cadena \"" + entrada + "\" es incorrecta. ");
                    }
                    break;
                case 2:
                    System.out.println("¿Cuántas cadenas quieres generar?: ");
                    int cuantas = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("¿De cuántos caracteres como máximo quieres que sean las cadenas?: ");
                    int longitudMaxima = Integer.parseInt(bufferedReader.readLine());
                    gdc.generaCadenas(cuantas, longitudMaxima);
                    break;
                case 3:
                    automata.pintaMatriz();
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Escribe el número de la opción para elegirla. ");
                    break;
            }

        }


    }

}
