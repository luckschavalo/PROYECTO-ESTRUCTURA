/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuradatos;

/**
 *
 * @author fran1
 */
public class NodoLC {
    private String dato;
    private NodoLC siguiente; 

    public NodoLC(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoLC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLC siguiente) {
        this.siguiente = siguiente;
    }
}