/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatos;

/**
 *
 * @author fran1
 */
public class NodoHistorial {

    private String libro;
    private NodoHistorial siguiente;

    public NodoHistorial(String libro) {
        this.libro = libro;
        this.siguiente = null;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public NodoHistorial getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHistorial siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Libro prestado: " + libro;
    }
}
