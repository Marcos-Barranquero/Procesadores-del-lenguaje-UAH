import java.math.BigInteger;
import java.util.ArrayList;

public class Funcion {
    private final String nombre;
    private final int numParametros;
    private final ArrayList<Variable> variables = new ArrayList<>();
    private final ArrayList<Funcion> funcionesLlamadas = new ArrayList<>();
    private String tipoRetorno;
    private BigInteger complejidadPuntosFuncion = new BigInteger("0");
    private ArrayList<Variable> parametros;
    private int lineasEfectivas = 0;
    private GestorGrafo gestorGrafo;
    private int idFuncion;

    // Constructor para funciones externas
    public Funcion(int idFuncion, String nombre, int numParametros) {
        this.nombre = nombre;
        this.numParametros = numParametros;
        this.complejidadPuntosFuncion = this.complejidadPuntosFuncion.add(BigInteger.valueOf(numParametros));
        this.gestorGrafo = new GestorGrafo(nombre);
        this.idFuncion = idFuncion;
    }

    // Constructor para funciones definidas en el archivo de código
    public Funcion(int idFuncion, String nombre, ArrayList<Variable> parametros, String tipoRetorno) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.numParametros = parametros.size();
        this.tipoRetorno = tipoRetorno;
        this.gestorGrafo = new GestorGrafo(nombre);
        this.idFuncion = idFuncion;
    
    }

    public BigInteger getComplejidadPuntosFuncion() {
        return complejidadPuntosFuncion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Funcion> getFuncionesLlamadas() {
        return funcionesLlamadas;
    }

    public int getNumParametros() {
        return numParametros;
    }

    public ArrayList<Variable> getParametros() {
        return parametros;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public String getTipoRetorno() {
        return tipoRetorno;
    }

    public void addComplejidadPuntosFuncion(BigInteger complejidadPuntosFuncion) {
        this.complejidadPuntosFuncion = this.complejidadPuntosFuncion.add(complejidadPuntosFuncion);
    }

    public void addFuncionLlamada(Funcion funcion) {
        this.funcionesLlamadas.add(funcion);
    }

    public void addVariable(Variable variable) {
        this.variables.add(variable);
    }

    @Override
    public String toString() {
        return "ClasesBase.Funcion{" +
                "nombre='" + nombre + '\'' +
                ", numParametros=" + numParametros +
                ", complejidadPuntosFuncion=" + complejidadPuntosFuncion +
                '}';
    }

    public void addLineaEfectiva() {
        this.lineasEfectivas += 1;
    }

    public int getLineasEfectivas() {
        return this.lineasEfectivas;
    }

    public GestorGrafo getGestorGrafo() {
        return gestorGrafo;
    }

    public int getIdFuncion()
    {
        return this.idFuncion;
    }
}
