package proyectoestructuradatos;

public class PosicionR {
    private int fila;
    private int columna;
    private String nombreLibro;

    public PosicionR(int fila, int columna, String nombreLibro) {
        this.fila = fila;
        this.columna = columna;
        this.nombreLibro = nombreLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean esIgual(PosicionR otra) {
        return this.fila == otra.fila && this.columna == otra.columna;
    }

    @Override
    public String toString() {
        return "Posicion: " + "fila: " + fila + " columna: "  + columna + " libro: " + nombreLibro ;
    }
}
