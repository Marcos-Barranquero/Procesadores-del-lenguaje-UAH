public class Transicion
{
    private int origen;
    private int destino;
    private char caracter;

    public Transicion(int origen, int destino, char caracter)
    {
        this.origen = origen;
        this.destino = destino;
        this.caracter = caracter;
    }

    @Override
    public String toString()
    {
        return "[" + origen + "-(" + caracter + ")->" + destino + "]";
    }

    public int getOrigen()
    {
        return origen;
    }

    public int getDestino()
    {
        return destino;
    }

    public char getCaracter()
    {
        return caracter;
    }
}
