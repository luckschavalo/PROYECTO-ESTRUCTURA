
package proyectoestructuradatos;


public class Main {
    public static void main(String[] args) {
        ColaReservas cola = new ColaReservas();

        cola.encolar("El Principito");
        cola.encolar("1984");
        cola.encolar("Cien anios de soledad");

        System.out.println(cola.toString());

        String libroAtendido = cola.atender();
        if (libroAtendido != null) {
            System.out.println("Reserva atendida: " + libroAtendido);
        }

        System.out.println(cola.toString());
        PilaHistorial historial = new PilaHistorial();

        historial.agregarAlHistorial("El Principito");
        historial.agregarAlHistorial("1984");
        historial.agregarAlHistorial("Cien anios de soledad");

        System.out.println("Historial de libros prestados:\n" + historial.toString());

        System.out.println("Ultimo libro prestado: " + historial.verUltimoPrestado());

        String libroEliminado = historial.eliminarDelHistorial();
        System.out.println("Libro eliminado del historial: " + libroEliminado);

        System.out.println("Historial actualizado de libros prestados:\n" + historial.toString());
    }
}
