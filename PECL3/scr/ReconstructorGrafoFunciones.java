import java.util.ArrayList;

public class ReconstructorGrafoFunciones {
    private Funcion funcionPrincipal;

    private TablaDeSimbolos tablaDeSimbolos;

    private GestorGrafo grafoFuncion;

    public ReconstructorGrafoFunciones(Funcion funcionPrincipal, TablaDeSimbolos tablaDeSimbolos) {
        this.funcionPrincipal = funcionPrincipal;
        this.tablaDeSimbolos = tablaDeSimbolos;
        this.grafoFuncion = new GestorGrafo(funcionPrincipal.getNombre());
    }

    /**
     * Dada una función asociada, reconstruye el grafo de funciones llamadas.
     * Si encuentra una llamada a una función definida por el usuario,
     * la busca en la tabla de símbolos e incluye también las llamadas
     * de esa función.
     */
    public void reconstruirGrafo() {
        reconstruirGrafo(this.funcionPrincipal);
        grafoFuncion.cerrar();
    }

    /**
     * Dada una función, reconstruye el grafo de funciones llamadas.
     * Si encuentra una llamada a una función definida por el usuario,
     * la busca en la tabla de símbolos e incluye también las llamadas
     * de esa función.
     * @param funcion
     */
    private void reconstruirGrafo(Funcion funcion) {
        grafoFuncion.addNodoLlamadaFuncion(funcion.getNombre());
        ArrayList<String> comandos = funcion.getGestorGrafo().getComandosEjecutados();

        ArrayList<String> comandosIgnorados = new ArrayList<>();
        comandosIgnorados.add("enterIf");
        comandosIgnorados.add("exitIf");
        comandosIgnorados.add("enterElse");
        comandosIgnorados.add("exitElse");
        comandosIgnorados.add("enterBucle");
        comandosIgnorados.add("exitBucle");

        for (String comando : comandos) {
            // Si no está en comandos ignorados, es una llamada a una función
            if (!comandosIgnorados.contains(comando)) {
                Funcion funcionContenida = tablaDeSimbolos.getFuncionConcreta(comando);
                // Si es funcion del lenguaje, pongo un nodo con su nombre
                if (funcionContenida == null) {
                    grafoFuncion.addNodoLlamadaFuncion(comando);
                }
                // Si es función definida por el usuario, recreo la función en base a sus comandos
                else {
                    // Compruebo recursividad:
                    if(comando.equals(funcion.getNombre()) // Si llama a la función estudiada
                            || funcionContenida.getGestorGrafo().getComandosEjecutados().contains(comando) // Contiene misma func.
                            || funcionContenida.getGestorGrafo().getComandosEjecutados().contains(funcion.getNombre()) // contiene func. estudiada
                    )
                    {
                        grafoFuncion.nuevoColor();
                        grafoFuncion.enterRecursion(comando);
                    }
                    else
                    {
                        grafoFuncion.nuevoColor();
                        reconstruirGrafo(funcionContenida);
                    }

                }

            }

        }
    }

    public GestorGrafo getGrafoFuncion() {
        return grafoFuncion;
    }
}
