import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Grafo {
    private String nombreGrafo;
    private ArrayList<Nodo> nodos = new ArrayList<>();

    public Grafo(String nombreGrafo) {
        this.nombreGrafo = nombreGrafo;
    }

    public Grafo addNodo(String idNodo, String color) {
        if (existeNodo(idNodo)) {
            System.out.println("Error: Nodo " + idNodo + " ya existe.");
        }
        Nodo nodo = new Nodo(idNodo, color);
        nodos.add(nodo);
        return this;
    }

    public boolean existeNodo(String idNodo) {
        for (Nodo n : nodos) {
            if (n.getIdNodo().equals(idNodo)) {
                return true;
            }
        }
        return false;
    }

    public Nodo getNodo(String idNodo) {
        for (Nodo n : nodos) {
            if (n.getIdNodo().equals(idNodo)) {
                return n;
            }
        }
        return null;
    }

    public Nodo unir(String idNodoPadre, String idNodoHijo) {
        Nodo parent = getNodo(idNodoPadre);
        if (parent == null) {
            System.out.print("Error: " + idNodoPadre + " no existe. ");
        }
        Nodo hijo = getNodo(idNodoHijo);
        if (hijo == null) {
            System.out.print("Error: " + idNodoHijo + " no existe. ");
        }
        parent.addHijo(hijo);
        return hijo;
    }


    public void generarDot(String nombreArchivo) {
        try {
            PrintWriter writer = new PrintWriter(nombreArchivo, StandardCharsets.UTF_8);
            writer.println("digraph " + nombreGrafo + " {");
            for (Nodo n : nodos) {
                writer.println("ID" + n.getIdNodo() + " [label=\"" + n.getIdNodo() + "\" fillcolor=\"" + n.getColor() + "\" style=filled];");
            }
            for (Nodo n : nodos) {
                if (n.getNodosHijos().size() > 0) {
                    for (Nodo c : n.getNodosHijos()) {
                        writer.println("ID" + n.getIdNodo() + " -> ID" + c.getIdNodo() + ";");
                    }
                }
            }
            writer.println("}");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + nombreArchivo + " no existe.");
        } catch (UnsupportedEncodingException e) {
            System.out.print("Error: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }


}



