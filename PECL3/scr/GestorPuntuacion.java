import java.math.BigInteger;
import java.util.Stack;

public class GestorPuntuacion {
    private final Stack<BigInteger> puntos;

    public GestorPuntuacion() {
        this.puntos = new Stack<>();
        this.puntos.push(new BigInteger("0"));
    }

    public void sumarPuntos(BigInteger puntos) {
        // Sumo los puntos pasados por argumento y vuelvo a insertar
        this.puntos.push(this.puntos.pop().add(puntos));
    }

    public void entraBifurcacion() {
        // Añado un nuevo nivel
        this.puntos.push(new BigInteger("0"));
    }

    public void saleBifurcacion() {
        // Extraigo primer nivel y elevo al cuadrado:
        BigInteger puntosBifurcacion = this.puntos.pop().pow(2);

        // Extraigo segundo nivel y sumo los puntos de la bifurcación, y vuelvo a ponerlo:
        this.puntos.push(this.puntos.pop().add(puntosBifurcacion));
    }

    public BigInteger getPuntosFinales() {
        return this.puntos.pop();
    }
}
