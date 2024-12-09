
package proyectoestructuradatos;


public class NodoSimple {
    private String libro;
    private NodoSimple siguiente;

    public NodoSimple(String libro) {
        this.libro = libro;
        this.siguiente = null;
    }

    public String getLibro() {
        return libro;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
