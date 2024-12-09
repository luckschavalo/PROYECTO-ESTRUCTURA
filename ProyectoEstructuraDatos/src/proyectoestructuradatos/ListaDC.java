
package proyectoestructuradatos;

/**
 *
 * @author David
 */
public class ListaDC {
    private NodoDC cabeza;

    public ListaDC() {
        cabeza= null;
    }
    public void agregarLibro(String libro) {
        NodoDC nuevoNodo = new NodoDC(libro);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.setSiguiente(cabeza);
            nuevoNodo.setAnterior(cabeza);
        } else {
            NodoDC ultimo = cabeza.getAnterior();
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
        }
    }

    public String eliminarLibro() {
        if (cabeza == null) {
            System.out.println("La lista doble circular esta vacia.");
            return null;
        }

        String libroEliminado = cabeza.getLibro();

        if (cabeza.getSiguiente() == cabeza) {
            cabeza = null;
        } else {
            NodoDC ultimo = cabeza.getAnterior();
            cabeza.getSiguiente().setAnterior(ultimo);
            ultimo.setSiguiente(cabeza.getSiguiente());
            cabeza = cabeza.getSiguiente();
        }

        return libroEliminado;
    }

    @Override
    public String toString() {
        if (cabeza == null) {
            return "Lista doble circular vacia.";
        }

        StringBuilder sb = new StringBuilder("Lista Doble Circular de Libros: ");
        NodoDC actual = cabeza;
        do {
            sb.append(actual.getLibro()).append(" ");
            actual = actual.getSiguiente();
        } while (actual != cabeza);
        
        sb.setLength(sb.length() - 4);  
        return sb.toString();
    }
}
    

