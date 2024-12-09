
package proyectoestructuradatos;


class ColaReservas {
   private NodoC frente;
    private NodoC ultimo;

    public ColaReservas() {
        frente = null;
        ultimo = null;
    }

    public void encolar(String libro) {
        NodoC nuevoNodo = new NodoC(libro);
        
        if (frente == null) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public String atender() {
        if (frente == null) {
            System.out.println("No hay reservas pendientes. ");
            return null;
        }

        String libroAtendido = frente.getLibro();
        frente = frente.getAtras();
        
        if (frente == null) { 
            ultimo = null; 
        }
        
        return libroAtendido;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cola de reservas: ");
        NodoC actual = frente;
        while (actual != null) {
            sb.append(actual.getLibro()).append(" ");
            actual = actual.getAtras();
        }
        return sb.toString();
    }
}
