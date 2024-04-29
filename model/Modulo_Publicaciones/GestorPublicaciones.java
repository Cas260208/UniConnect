package model.Modulo_Publicaciones;

import java.util.Scanner;

public class GestorPublicaciones {
    private TablaPublicaciones tablaPublicaciones;
    private TablaComentario tablaComentarios;
    private TablaReaccion tablaReacciones;

    public GestorPublicaciones() {
        tablaPublicaciones = new TablaPublicaciones();
        tablaComentarios = new TablaComentario();
        tablaReacciones = new TablaReaccion();
    }

    public void recibirDatosPublicacion(String contenido, String autor) {
        Publicacion nuevaPublicacion = new Publicacion(contenido, obtenerFechaActual(), obtenerHoraActual(), autor);
        tablaPublicaciones.agregarPublicacion(nuevaPublicacion);
    }

    public void recibirDatosComentario(String comentario, String autor, int idPublicacion) {
        Comentario nuevoComentario = new Comentario(comentario, obtenerFechaActual(), obtenerHoraActual(), autor);
        tablaComentarios.agregarComentario(nuevoComentario, idPublicacion);
    }

    public void recibirDatosReaccion(String reaccion, String autor, int idPublicacion) {
        Reaccion nuevaReaccion = new Reaccion(reaccion, obtenerFechaActual(), obtenerHoraActual(), autor);
        tablaReacciones.agregarReaccion(nuevaReaccion, idPublicacion);
    }

    public void compartirPublicacion(String autor, int idPublicacion) {
        
        System.out.println(autor + " compartió la publicación " + idPublicacion);
    }

    private String obtenerFechaActual() {
        
        return "Fecha";
    }

    private String obtenerHoraActual() {
        
        return "Hora";
    }
}
