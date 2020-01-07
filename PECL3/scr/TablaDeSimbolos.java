import java.math.BigInteger;
import java.util.ArrayList;

public class TablaDeSimbolos {
    private final ArrayList<Funcion> funciones = new ArrayList<>();
    private final ArrayList<Variable> variablesGlobales = new ArrayList<>();
    private final ArrayList<String> librerias = new ArrayList<>();
    private ArrayList<Funcion> flujoLlamadas;
    private GestorPuntuacion gestorPuntuacion;
    private BigInteger complejidadGlobal = new BigInteger("0");
    private Funcion funcionActual;
    private int lineasEfectivasTotales = 0;

    public void addFuncion(Funcion funcion) {
        this.funciones.add(funcion);
    }

    public void addVariable(Variable variable) {
        if (this.funcionActual == null)
            // Si no nos encontramos dentro de ninguna función, es una variable global
            this.variablesGlobales.add(variable);
        else
            // Si nos encontramos en alguna función, la variable es propia de la función
            this.funcionActual.addVariable(variable);
    }

    public void addPuntosFinales() {
        this.funcionActual.addComplejidadPuntosFuncion(this.gestorPuntuacion.getPuntosFinales());
    }

    public void addLibreria(String nombre) {
        this.librerias.add(nombre);
    }

    public Funcion getFuncionActual() {
        return funcionActual;
    }

    public void setFuncionActual(Funcion funcionActual) {
        this.funcionActual = funcionActual;
        this.gestorPuntuacion = new GestorPuntuacion();
    }

    public void addComplejidad(int numPuntos) {
        if (this.funcionActual != null)
            this.gestorPuntuacion.sumarPuntos(new BigInteger(String.valueOf(numPuntos)));
        else
            this.complejidadGlobal = this.complejidadGlobal.add(new BigInteger(String.valueOf(numPuntos)));
    }

    public void addFuncionLlamada(Funcion funcion) {
        this.funcionActual.addFuncionLlamada(funcion);
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public ArrayList<Variable> getVariablesGlobales() {
        return variablesGlobales;
    }

    public void entraBifurcacion() {
        this.gestorPuntuacion.entraBifurcacion();
    }

    public void saleBifurcacion() {
        this.gestorPuntuacion.saleBifurcacion();
    }

    public Funcion getFuncionConcreta(String nombre) {
        for (Funcion funcion : this.funciones) {
            if (nombre.equals(funcion.getNombre()))
                return funcion;
        }
        return null;
    }

    public void calcularFlujoLlamadasAux(String nombre) {
        Funcion funcion = getFuncionConcreta(nombre);
        this.flujoLlamadas.add(funcion);
        for (Funcion funcionLlamada : funcion.getFuncionesLlamadas()) {
            if (getFuncionConcreta(funcionLlamada.getNombre()) != null)
                // Si es una funcion definida en nuestro programa, llamo a recursión
                calcularFlujoLlamadasAux(funcionLlamada.getNombre());
            else
                // Si es una funcion externa, la añado directamente
                this.flujoLlamadas.add(funcionLlamada);
        }
    }

    /* Gestión líneas efectivas */
    public void addLineaEfectiva() {
        if (funcionActual != null)
            this.funcionActual.addLineaEfectiva();
        else
            this.lineasEfectivasTotales += 1;
    }

    public int getLineasEfectivasTotales() {
        return lineasEfectivasTotales;
    }

    public ArrayList<Funcion> calcularFlujoLlamadas(String nombre) {
        this.flujoLlamadas = new ArrayList<>();
        calcularFlujoLlamadasAux(nombre);
        return this.flujoLlamadas;
    }
}