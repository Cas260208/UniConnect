package model.Modulo_Publicaciones;

public class Comentario {
    private String datosComentario;
    private String fecha;
    private String hora;
    private String autor;

    // Constructor vacío
    public Comentario() {}

    // Constructor
    public Comentario(String datosComentario, String fecha, String hora, String autor) {
        this.datosComentario = datosComentario;
        this.fecha = fecha;
        this.hora = hora;
        this.autor = autor;
    }

    // Getters and Setters
    public String getDatosComentario() {
        return datosComentario;
    }

    public void setDatosComentario(String datosComentario) {
        this.datosComentario = datosComentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Metodos 
    public void recibeDatosComentario() {
        // Implementación
    }

    public String obtieneFecha() {
        // Implementación
        return null;
    }

    public String obtieneHora() {
        // Implementación
        return null;
    }

    public String obtieneAutor() {
        // Implementación
        return null;
    }

    public void solicitaGuardado() {
        // Implementación
    }
}
