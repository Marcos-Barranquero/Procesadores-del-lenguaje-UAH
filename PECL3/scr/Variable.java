public class Variable {
    private String tipo;
    private String nombre;


    public Variable(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ClasesBase.Variable{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
