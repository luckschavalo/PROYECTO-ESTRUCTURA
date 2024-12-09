
package proyectoestructuradatos;

/**
 *
 * @author David
 */
public class NodoDC {
    private String libro;
    private NodoDC siguiente;
    private NodoDC anterior;
    
 public NodoDC(String libro) {
        this.libro = libro;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public NodoDC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDC siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDC anterior) {
        this.anterior = anterior;
    }    
}
