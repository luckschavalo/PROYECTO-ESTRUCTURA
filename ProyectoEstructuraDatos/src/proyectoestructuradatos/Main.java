
package proyectoestructuradatos;


public class Main {
    public static void main(String[] args) {
        ColaReservas cola = new ColaReservas();

        // Agregar reservas
        cola.encolar("El Principito");
        cola.encolar("1984");
        cola.encolar("Cien anios de soledad");

        // Mostrar reservas
        System.out.println(cola.toString());

        // Atender reservas
        String libroAtendido = cola.atender();
        if (libroAtendido != null) {
            System.out.println("Reserva atendida: " + libroAtendido);
        }

        // Mostrar reservas después de atender
        System.out.println(cola.toString());
    }
}