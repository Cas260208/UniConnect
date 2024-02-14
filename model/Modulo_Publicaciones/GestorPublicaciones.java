package model.Modulo_Publicaciones;

public class GestorPublicaciones {
    private String datosPublicacion;
    private String datosComentario;
    private String datosReaccion;

    // Constructor vacío
    public GestorPublicaciones() {}

    // Constructor
    public GestorPublicaciones(String datosPublicacion, String datosComentario, String datosReaccion) {
        this.datosPublicacion = datosPublicacion;
        this.datosComentario = datosComentario;
        this.datosReaccion = datosReaccion;
    }

    // Getters and Setters
    public String getDatosPublicacion() {
        return datosPublicacion;
    }

    public void setDatosPublicacion(String datosPublicacion) {
        this.datosPublicacion = datosPublicacion;
    }

    public String getDatosComentario() {
        return datosComentario;
    }

    public void setDatosComentario(String datosComentario) {
        this.datosComentario = datosComentario;
    }

    public String getDatosReaccion() {
        return datosReaccion;
    }

    public void setDatosReaccion(String datosReaccion) {
        this.datosReaccion = datosReaccion;
    }

    // Metodos
    public void recibeDatosPublicacion() {
        // Implementación
    }

    public void recibeDatosComentario() {
        // Implementación
    }

    public void recibeDatosReaccion() {
        // Implementación
    }

    public void informaCreacionPubli() {
        // Implementación
    }

    public void informaEdicionPubli() {
        // Implementación
    }

    public void informaReaccion() {
        // Implementación
    }

    public void muestraPublicacion() {
        // Implementación
    }

    public void muestraComentario() {
        // Implementación
    }

    public void muestraReaccion() {
        // Implementación
    }
}
