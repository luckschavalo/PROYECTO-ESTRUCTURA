
package proyectoestructuradatos;


public class Main {
    public static void main(String[] args) {
        ListaSimple ls = new ListaSimple();
        ls.agregarLibro("Don Quijote ");
        ls.agregarLibro("Matar a un ruiseñor ");
        System.out.println(ls.toString());
        ls.eliminarLibro();
        System.out.println("Lista despues de eliminar un libro: " + ls.toString());
        
        ListaDC ldc = new ListaDC();
        ldc.agregarLibro("Frankenstein ");
        ldc.agregarLibro("Dracula ");
        System.out.println(ldc.toString());
        ldc.eliminarLibro();
        System.out.println("Lista Doble Circular despues de eliminar un libro: " + ldc.toString());
        
        ColaReservas cola = new ColaReservas();

        cola.encolar("El Principito ");
        cola.encolar("1984 ");
        cola.encolar("Cien anios de soledad ");

        System.out.println(cola.toString());

        String libroAtendido = cola.atender();
        if (libroAtendido != null) {
            System.out.println("Reserva atendida: " + libroAtendido);
        }

        System.out.println(cola.toString());
        PilaHistorial historial = new PilaHistorial();

        historial.agregarAlHistorial("El Principito ");
        historial.agregarAlHistorial("1984 ");
        historial.agregarAlHistorial("Cien anios de soledad ");

        System.out.println("Historial de libros prestados:\n" + historial.toString());

        System.out.println("Ultimo libro prestado: " + historial.verUltimoPrestado());

        String libroEliminado = historial.eliminarDelHistorial();
        System.out.println("Libro eliminado del historial: " + libroEliminado);

        System.out.println("Historial actualizado de libros prestados:\n" + historial.toString());
        
        
     ListaC listac = new ListaC();
        
        listac.agregar("Don Quijote");
        listac.agregar("El Principito");
        listac.agregar("Frankenstein");

        System.out.println("Elementos de la lista: ");
        listac.mostrarLista();

        System.out.println("Eliminando un elemento ");
        listac.eliminar();

        System.out.println("Elementos de la lista despues de eliminar: ");
        listac.mostrarLista();
    }
}
