package proyectoestructuradatos;

public class ListaSimple {

    private NodoSimple cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void agregarLibro(String libro) {
        NodoSimple nuevoNodo = new NodoSimple(libro);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoSimple actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public String eliminarLibro() {
        if (cabeza == null) {
            System.out.println("No hay libros en la lista.");
            return null;
        }
        String libroEliminado = cabeza.getLibro();
        cabeza = cabeza.getSiguiente();
        return libroEliminado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de libros: ");
        NodoSimple actual = cabeza;
        while (actual != null) {
            sb.append(actual.getLibro()).append(" ");
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }
}
