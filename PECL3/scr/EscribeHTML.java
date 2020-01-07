import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class EscribeHTML {
    private final String colores =
            "<style>\r\n\t\t\t"
                    + "body{\r\n\t\t\t\t"
                    + "background:lightgray;\r\n\t\t\t"
                    + "}\r\n\t\t\t"
                    + "img{\r\n\t\t\t\t"
                    + "max-height: 900px;\r\n\t\t\t"
                    + "max-width: 450px;\r\n\t\t\t"
                    + "}\r\n\t\t\t"
                    + "</style>\r\n\t";
    private TablaDeSimbolos tablaDeSimbolos;
    private PrintWriter archivoHTML;
    private String nombreFuncionPrincipal;


    public EscribeHTML(String nombreFichero, TablaDeSimbolos tablaDeSimbolos, String nombreFuncionPrincipal) {
        this.tablaDeSimbolos = tablaDeSimbolos;
        this.nombreFuncionPrincipal=nombreFuncionPrincipal;
        try {
            archivoHTML = new PrintWriter(nombreFichero);
            // Crea el html en la misma ruta que el fichero que se le pasa para analizar
            System.out.println("Archivo HTML generado en: " + nombreFichero);
        } catch (FileNotFoundException e) { }
    }

    public void crearInicio(String nombrePrograma) {
        String htmlInicio = "<html>\r\n"
                + "<head>\r\n\t"
                + "<meta charset=\"UTF-8\">\r\n\t\t "
                + "<title>Fichero " + nombrePrograma + "</title>\r\n\r\n\t\t"
                + "</head>\r\n\t"
                + "<body>\r\n\t\t"
                + "<h1> Código de " + nombrePrograma + "</h1>\r\n\t\t";
        archivoHTML.write(htmlInicio);
        archivoHTML.write(colores);
    }

    public void addFuncion(Funcion funcion) {
        String encabezado = funcion.getNombre() + "(";
        funcion.getGestorGrafo().crearDibujo(String.valueOf(funcion.getIdFuncion()));

        if (funcion.getNumParametros() == 0) {
            encabezado += "): " + funcion.getTipoRetorno();
        } else {
            for (int i = 0; i < funcion.getNumParametros() - 1; i++) {
                encabezado += funcion.getParametros().get(i).getNombre() + ", ";
            }
            encabezado += funcion.getParametros().get(funcion.getNumParametros() - 1).getNombre() + "): " + funcion.getTipoRetorno();
        }

        archivoHTML.write("<hr>");
        archivoHTML.write("<h2 class=\"nombreFuncion\">Función: " + encabezado + "</h2>");
        archivoHTML.write("<li>Complejidad ciclomática:  <strong>" + funcion.getGestorGrafo()
                .getComplejidad() + "</strong></li>");
        archivoHTML.write(
                "<li>Puntos de función: <strong>" + funcion.getComplejidadPuntosFuncion() + " </strong></li>");
        archivoHTML.write("<h3>Resumen: </h3> <ul> ");
        archivoHTML.write("<li>Variables declaradas: <strong> " + funcion.getVariables().size() + "</strong> </li>");
        archivoHTML.write(
                "<li>Líneas de código efectivas: <strong>" + funcion.getLineasEfectivas() + "</strong> </li>");
        archivoHTML.write(
                "<li>Número de parámetros esperados: <strong>" + funcion.getNumParametros() + " </strong> </li>");
        archivoHTML.write("<li>Número de llamadas a funciones: <strong>" + funcion.getFuncionesLlamadas()
                .size() + " </strong> </li></ul>");
        archivoHTML.write("<h3>Grafo de complejidad ciclomática:</h3>");
        archivoHTML.write("<ul><img src=\"" + funcion.getNombre() + funcion.getIdFuncion() + ".svg\" >");
        archivoHTML.write("</ul>");
    }

    public void imprimeResumenPrograma() {
        // Cambiar si necesario;
        Funcion funcionPrincipal = tablaDeSimbolos.getFuncionConcreta(nombreFuncionPrincipal);

        archivoHTML.write("<hr>");
        archivoHTML.write("<h2>Resumen del programa</h2>");
        archivoHTML.write("<ul><li>Número total de líneas efectivas: ");
        int contadorLineasEfectivas = 0, contadorComplejidadCiclomatica = 0, sumaComplejidadesFunciones = 0;
        BigInteger contadorPuntosFuncion = new BigInteger("0");
        ArrayList<Funcion> funciones = tablaDeSimbolos.getFunciones();

        ReconstructorGrafoCiclomatico grafoCiclomatico = new ReconstructorGrafoCiclomatico(funcionPrincipal,
                tablaDeSimbolos);
        grafoCiclomatico.reconstruirGrafo();
        grafoCiclomatico.getGrafoFuncion().crearDibujo("-global");
        contadorComplejidadCiclomatica = grafoCiclomatico.getGrafoFuncion().getComplejidad();

        ReconstructorGrafoFunciones grafoFunciones = new ReconstructorGrafoFunciones(funcionPrincipal, tablaDeSimbolos);
        grafoFunciones.reconstruirGrafo();
        grafoFunciones.getGrafoFuncion().crearDibujo("-llamadas");

        for (Funcion funcion : funciones) {
            sumaComplejidadesFunciones+=funcion.getGestorGrafo().getComplejidad();
            contadorLineasEfectivas += funcion.getLineasEfectivas();
            contadorPuntosFuncion = contadorPuntosFuncion.add(funcion.getComplejidadPuntosFuncion());
            archivoHTML.write(funcion.getLineasEfectivas() + " + ");
        }
        contadorLineasEfectivas += tablaDeSimbolos.getLineasEfectivasTotales();
        archivoHTML.write(
                tablaDeSimbolos.getLineasEfectivasTotales() + " de librerías y declaraciones de funciones = <strong>" + contadorLineasEfectivas + "</strong></li>");

        archivoHTML.write("<li>Suma de puntos de complejidad: ");
        archivoHTML.write("<strong>" + contadorPuntosFuncion.toString() + "</strong></li>");

        archivoHTML.write("<li>Suma de complejidad ciclomática de todas las funciones: ");
        archivoHTML.write("<strong>" + sumaComplejidadesFunciones + "</strong></li>");

        archivoHTML.write("<li>Complejidad ciclomática de la llamada principal: ");
        archivoHTML.write("<strong>" + contadorComplejidadCiclomatica + "</strong></li>");
        archivoHTML.write("</ul>");
        archivoHTML.write("<h3>Grafo de complejidad ciclomática de la llamada principal:</h3>");
        archivoHTML.write("<ul><img src=\""+nombreFuncionPrincipal+"-global.svg\" ></ul>");
        archivoHTML.write(
                "<h3>Grafo de llamadas a funciones desde la función \"" + funcionPrincipal.getNombre() + "\":</h3>");
        archivoHTML.write("<ul><img src=\""+nombreFuncionPrincipal+"-llamadas.svg\" ></ul>");
    }

    public void finFichero() {
        String htmlFinal = "</body>\r\n" + "</html>";
        archivoHTML.write(htmlFinal);
        archivoHTML.close();
    }
}
