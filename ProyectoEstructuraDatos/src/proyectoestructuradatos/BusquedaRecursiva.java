package proyectoestructuradatos;

public class BusquedaRecursiva {

    public PosicionR buscarLibroRecursivo(PosicionR[] posiciones, String libroBuscado, int indice) {
        if (indice >= posiciones.length) {
            return null;
        }

        if (posiciones[indice].getNombreLibro().equals(libroBuscado)) {
            return posiciones[indice];
        }

        return buscarLibroRecursivo(posiciones, libroBuscado, indice + 1);
    }
}
