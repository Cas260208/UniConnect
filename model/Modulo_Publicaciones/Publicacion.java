package model.Modulo_Publicaciones;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Publicacion {
    private String datosPublicacion;
    private LocalDateTime fechaHora;
    private String autor;

    // Constructor vacío
    public Publicacion() {}

    // Constructor
    public Publicacion(String datosPublicacion, LocalDateTime fechaHora, String autor) {
        this.datosPublicacion = datosPublicacion;
        this.fechaHora = fechaHora;
        this.autor = autor;
    }

    // Getters and Setters
    public String getDatosPublicacion() {
        return datosPublicacion;
    }

    public void setDatosPublicacion(String datosPublicacion) {
        this.datosPublicacion = datosPublicacion;
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

    // Métodos
    public void recibeDatosPublicacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un comentario: ");
        String datos = scanner.nextLine();

      
        LocalDateTime fechaHoraActual = LocalDateTime.now();

       
        String autor = "Usuario"; 

     
        setDatosPublicacion(datos);
        setFechaHora(fechaHoraActual);
        setAutor(autor);

        System.out.println("Publicación recibida correctamente.");
    }

    public void solicitaGuardado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea guardar la publicación? (s/n)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            // Aquí iría la lógica para guardar la publicación
            System.out.println("Publicación guardada exitosamente.");
        } else {
            System.out.println("Publicación no guardada.");
        }
    } 
}
