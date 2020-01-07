import java.util.ArrayList;

public class ReconstructorGrafoCiclomatico
{
    private Funcion funcionPrincipal;

    private TablaDeSimbolos tablaDeSimbolos;

    private GestorGrafo grafoFuncion;

    public ReconstructorGrafoCiclomatico(Funcion funcionPrincipal, TablaDeSimbolos tablaDeSimbolos)
    {
        this.funcionPrincipal = funcionPrincipal;
        this.tablaDeSimbolos = tablaDeSimbolos;
        this.grafoFuncion = new GestorGrafo(funcionPrincipal.getNombre());
    }

    /**
     * Dada una función asociada, reconstruye su grafo ciclomático. Cuando encuentra una llamda a una función, construye
     * recursivamente el grafo ciclomático de esa función llamada. En otras palabras, genera el grafo ciclomático de una
     * función incluyendo las llamadas a otras funciones.
     */
    public void reconstruirGrafo()
    {
        reconstruirGrafo(this.funcionPrincipal);
        grafoFuncion.cerrar();
    }

    /**
     * Dada una función, reconstruye su grafo ciclomático. Cuando encuentra una llamda a una función, construye
     * recursivamente el grafo ciclomático de esa función llamada. En otras palabras, genera el grafo ciclomático de una
     * función incluyendo las llamadas a otras funciones.
     *
     * @param funcion -> función asociada al grafo ciclomático.
     */
    private void reconstruirGrafo(Funcion funcion)
    {
        grafoFuncion.addNodoLeyenda(funcion.getNombre());
        ArrayList<String> comandos = funcion.getGestorGrafo().getComandosEjecutados();

        boolean volver = false;
        for ( String comando : comandos )
        {
            if ( volver )
            {
                grafoFuncion.viejoColor();
                volver = false;
            }

            switch (comando)
            {
                case "enterIf":
                    grafoFuncion.enterIf();
                    break;
                case "exitIf":
                    grafoFuncion.exitIf();
                    break;
                case "enterElse":
                    grafoFuncion.enterElse();
                    break;
                case "exitElse":
                    grafoFuncion.exitElse();
                    break;
                case "enterBucle":
                    grafoFuncion.enterBucle();
                    break;
                case "exitBucle":
                    grafoFuncion.exitBucle();
                    break;
                // Si es una función:
                default:
                    Funcion funcionContenida = tablaDeSimbolos.getFuncionConcreta(comando);
                    // Si es funcion del lenguaje, pongo un nodo con su nombre
                    if ( funcionContenida == null )
                    {
                        // grafoFuncion.addFuncionInterna(comando);
                    }
                    // Si es función definida por el usuario, recreo la función en base a sus comandos
                    else
                    {

                        // Compruebo recursividad:
                        if ( comando.equals(funcion.getNombre()) // Si llama a la función estudiada
                                || funcionContenida.getGestorGrafo()
                                .getComandosEjecutados()
                                .contains(comando) // Contiene misma func.
                                || funcionContenida.getGestorGrafo()
                                .getComandosEjecutados()
                                .contains(funcion.getNombre()) // contiene func. estudiada
                        )
                        {
                            grafoFuncion.nuevoColor();
                            grafoFuncion.enterRecursion(comando);
                            volver = true;
                        } else
                        {
                            grafoFuncion.nuevoColor();
                            reconstruirGrafo(funcionContenida);
                            volver = true;
                        }

                    }
            }
        }
    }

    public GestorGrafo getGrafoFuncion()
    {
        return grafoFuncion;
    }
}
