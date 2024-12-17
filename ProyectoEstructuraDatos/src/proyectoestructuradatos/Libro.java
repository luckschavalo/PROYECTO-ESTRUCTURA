package proyectoestructuradatos;

public class Libro {

    private String titulo;
    private String autor;
    private int Id;

    public Libro(String titulo, String autor, int Id) {
        this.titulo = titulo;
        this.autor = autor;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: " + "titulo: " + titulo + " autor: " + autor + " Id: " + Id;
    }
}
