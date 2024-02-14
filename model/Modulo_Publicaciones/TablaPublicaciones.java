package model.Modulo_Publicaciones;

public class TablaPublicaciones {
    private String publicacion;
    private String comentario;
    private String reaccion;

    // Constructor vacío
    public TablaPublicaciones() {}

    // Constructor
    public TablaPublicaciones(String publicacion, String comentario, String reaccion) {
        this.publicacion = publicacion;
        this.comentario = comentario;
        this.reaccion = reaccion;
    }

    // Getters and Setters
    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getReaccion() {
        return reaccion;
    }

    public void setReaccion(String reaccion) {
        this.reaccion = reaccion;
    }

    // metodos
    public void guardaPublicacion() {
        // Implementación
    }

    public void actualizaPublicacion() {
        // Implementación
    }

    public void guardarComentario() {
        // Implementación
    }

    public void regresaMsjCreacion() {
        // Implementación
    }

    public void regresaMsjEdicion() {
        // Implementación
    }

    public void regresaMsjComentario() {
        // Implementación
    }

    public void regresaMsjReaccion() {
        // Implementación
    }
}
