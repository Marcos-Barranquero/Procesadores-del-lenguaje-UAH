import java.util.ArrayList;

class Nodo {
    private String idNodo;
    private String color;
    private ArrayList<Nodo> nodosHijos = new ArrayList<>();

    public Nodo(String idNodo, String color) {
        this.idNodo = idNodo;
        this.color = color;
    }

    public void addHijo(Nodo hijo) {
        this.nodosHijos.add(hijo);
    }


    public ArrayList<Nodo> getNodosHijos() {
        return nodosHijos;
    }

    public String getIdNodo() {
        return idNodo;
    }

    public String getColor() {
        return color;
    }

}
