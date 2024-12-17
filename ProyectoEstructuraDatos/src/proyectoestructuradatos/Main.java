
package proyectoestructuradatos;


public class Main {
    public static void main(String[] args) {
        System.out.println("Lista simple\n");
        ListaSimple ls = new ListaSimple();
        ls.agregarLibro("Don Quijote ");
        ls.agregarLibro("Matar a un ruisenor ");
        System.out.println(ls.toString());
        ls.eliminarLibro();
        System.out.println("Lista despues de eliminar un libro: " + ls.toString());
        
        System.out.println("Lista Doble circular\n");
        ListaDC ldc = new ListaDC();
        ldc.agregarLibro("Frankenstein ");
        ldc.agregarLibro("Dracula ");
        System.out.println(ldc.toString());
        ldc.eliminarLibro();
        System.out.println("Lista Doble Circular despues de eliminar un libro: " + ldc.toString());
        
        System.out.println("Colas\n");
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
        
        System.out.println("Lista Circular\n");
        ListaC listac = new ListaC();
        listac.agregar("Don Quijote");
        listac.agregar("El Principito");
        listac.agregar("Frankenstein");
        System.out.println("Elementos de la lista: ");
        listac.mostrarLista();
        System.out.println("Elementos de la lista despues de eliminar: ");
        listac.mostrarLista();
        
        
        System.out.println("Recursividad\n");
        PosicionR pos1 = new PosicionR(1, 1, "El Principito");
        PosicionR pos2 = new PosicionR(2, 3, "Cien Anios de Soledad");
        PosicionR pos3 = new PosicionR(3, 4, "Don Quijote");
        PosicionR pos4 = new PosicionR(1, 2, "Matar a un Ruisenor");
        PosicionR pos5 = new PosicionR(4, 5, "Frankenstein");
        PosicionR pos6 = new PosicionR(5, 1, "Dracula");

        PosicionR[] posiciones = { pos1, pos2, pos3, pos4, pos5, pos6 };

        BusquedaRecursiva busqueda = new BusquedaRecursiva();

        // Aca se pone el nombre del libro que se desea buscar
        String libroBuscado = "El Principito";
        PosicionR resultadoBusqueda = busqueda.buscarLibroRecursivo(posiciones, libroBuscado, 0);

        if (resultadoBusqueda != null) {
            System.out.println("Libro encontrado en: " + resultadoBusqueda);
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}
    
