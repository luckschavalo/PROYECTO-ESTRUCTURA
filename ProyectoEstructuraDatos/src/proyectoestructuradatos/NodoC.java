
package proyectoestructuradatos;


public class NodoC {
    private String libro;
    private NodoC atras; // Cambiar Reserva por NodoC

    public NodoC(String libro) {
        this.libro = libro;
        this.atras = null;  
    }

    public String getLibro() {
        return libro;
    }

    public NodoC getAtras() {
        return atras; // Debe retornar NodoC
    }

    public void setAtras(NodoC atras) {
        this.atras = atras; // Debe aceptar NodoC
    }

    @Override
    public String toString() {
        return "Reserva de libro: " + libro;
    }
}
