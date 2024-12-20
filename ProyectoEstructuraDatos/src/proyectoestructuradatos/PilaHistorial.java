package proyectoestructuradatos;

public class PilaHistorial {

    private NodoHistorial cima;

    public PilaHistorial() {
        cima = null;
    }

    public void agregarAlHistorial(String libro) {
        NodoHistorial nuevoNodo = new NodoHistorial(libro);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
    }

    public String eliminarDelHistorial() {
        if (cima == null) {
            System.out.println("El historial esta vacio.");
            return null;
        }
        String libro = cima.getLibro();
        cima = cima.getSiguiente();
        return libro;
    }

    public String verUltimoPrestado() {
        return cima != null ? cima.getLibro() : "No hay libros en el historial.";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NodoHistorial actual = cima;
        while (actual != null) {
            sb.append("Libro prestado: ").append(actual.getLibro()).append("\n");
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }
}
