package modAcces;

public class Libro {
    private String titulo;

    // Constructor
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    // Método para obtener el título
    public String obtenerTitulo() {
        return titulo;
    }
}