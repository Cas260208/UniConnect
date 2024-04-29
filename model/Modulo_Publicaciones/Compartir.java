package model.Modulo_Publicaciones;
package model.Modulo_Publicaciones;

import java.time.LocalDateTime;

public class Compartir {
    private String mensaje;
    private LocalDateTime fechaHora;
    private String autor;

    // Constructor vacío
    public Compartir() {}

    // Constructor
    public Compartir(String mensaje, LocalDateTime fechaHora, String autor) {
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.autor = autor;
    }

    // Getters and Setters
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para compartir una publicación
    public void compartirPublicacion(Publicacion publicacion) {
        System.out.println("¿Desea compartir la siguiente publicación?");
        System.out.println(publicacion.getContenido());
        System.out.println("Compartido por: " + autor + " el " + fechaHora);
        

        
        
    }
}

