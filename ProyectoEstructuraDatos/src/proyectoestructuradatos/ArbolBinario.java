
package arbolbinario1;

public class ArbolBinario {
    
    NodoArbol raiz; 

    public ArbolBinario() {
    }
 
    public ArbolBinario(NodoArbol raiz) {
        this.raiz = raiz;
    }
    
    public void insertar( Libro libro){
        raiz = inesertarRecurs(raiz, libro);
    }
    
    public NodoArbol inesertarRecurs(NodoArbol nodo, Libro libro){
        if (nodo ==  null){
            return new NodoArbol(libro);
        }
        if (libro.getTitulo().compareTo(nodo.getLibro().getTitulo()) < 0){
            nodo.setIzquierda(inesertarRecurs(nodo.getIzquierda(), libro));
        }else{
            if (libro.getTitulo().compareTo(nodo.getLibro().getTitulo()) > 0){
                nodo.setDerecha(inesertarRecurs(nodo.getDerecha(), libro));
            }
        } 
        return nodo; 
    }
    
    
    public void imprimirOrden(){
        if ( raiz == null){
            System.out.println("El arbol esta vacio");
        }else{
            imprimirOrdenRecurs(raiz); 
        }
    }
        
    public void imprimirOrdenRecurs(NodoArbol nodo){
        if (nodo != null){
            imprimirOrdenRecurs(nodo.getIzquierda());
            System.out.println(nodo.getLibro());
            imprimirOrdenRecurs(nodo.getDerecha());
        }
    }

    public Libro buscar(String titulo){
        return buscarRecurs(raiz,titulo);
    }
    
    public Libro buscarRecurs(NodoArbol nodo, String titulo){
        if (nodo == null){
            return null; 
        }
        if (titulo.equals(nodo.getLibro().getTitulo())){
            return nodo.getLibro();
        }
        if (titulo.compareTo(nodo.getLibro().getTitulo()) > 0){
            return buscarRecurs(nodo.getDerecha(), titulo);
        }else{ 
            return buscarRecurs(nodo.getDerecha(), titulo);
        }
    }
}
