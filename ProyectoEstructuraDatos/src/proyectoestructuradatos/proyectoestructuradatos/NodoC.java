
package proyectoestructuradatos;


public class NodoC {
    private String libro;
    private NodoC atras; 

    public NodoC(String libro) {
        this.libro = libro;
        this.atras = null;  
    }

    public String getLibro() {
        return libro;
    }

    public NodoC getAtras() {
        return atras; 
    }

    public void setAtras(NodoC atras) {
        this.atras = atras; 
    }

    @Override
    public String toString() {
        return "Reserva de libro: " + libro;
    }
}
