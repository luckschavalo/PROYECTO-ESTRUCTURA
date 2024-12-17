package proyectoestructuradatos;

public class ListaC {

    private NodoLC ultimo;

    public ListaC() {
        this.ultimo = null;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public void agregar(String dato) {
        NodoLC nuevo = new NodoLC(dato);

        if (estaVacia()) {
            ultimo = nuevo;
            ultimo.setSiguiente(ultimo);
        } else {
            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia.");
            return;
        }

        NodoLC actual = ultimo.getSiguiente();
        do {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        } while (actual != ultimo.getSiguiente());

        System.out.println("circular. ");
    }

    public void eliminar() {
        if (estaVacia()) {
            System.out.println("La lista ya esta vacia.");
            return;
        }

        if (ultimo.getSiguiente() == ultimo) {
            ultimo = null;
        } else {
            ultimo.setSiguiente(ultimo.getSiguiente().getSiguiente());
        }
    }
}
