package model.Modulo_Publicaciones;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Comentario {
    private String datosComentario;
    private LocalDateTime fechaHora;
    private String autor;

    // Constructor vacío
    public Comentario() {}

    // Constructor
    public Comentario(String datosComentario, LocalDateTime fechaHora, String autor) {
        this.datosComentario = datosComentario;
        this.fechaHora = fechaHora;
        this.autor = autor;
    }

    // Getters and Setters
    public String getDatosComentario() {
        return datosComentario;
    }

    public void setDatosComentario(String datosComentario) {
        this.datosComentario = datosComentario;
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

  
    public void recibeDatosComentario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el comentario:");
        String comentario = scanner.nextLine();

        
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        
        String autor = "Usuario"; 

      
        setDatosComentario(comentario);
        setFechaHora(fechaHoraActual);
        setAutor(autor);

        System.out.println("Comentario recibido correctamente.");
    }

    
    public void solicitaGuardado(TablaComentario tablaComentario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea guardar el comentario? (s/n)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
           
            tablaComentario.agregarComentario(new Comentario(datosComentario, fechaHora, autor));
            System.out.println("Comentario guardado exitosamente.");
        } else {
            System.out.println("Comentario no guardado.");
        }
    }
}
