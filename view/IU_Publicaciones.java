package view;
import javax.swing.*;
public class IU_Publicaciones {
    private GestorPublicaciones gestorPublicaciones;
    private Scanner scanner;

    public IU_Publicaciones() {
        gestorPublicaciones = new GestorPublicaciones();
        scanner = new Scanner(System.in);
    }

    public void recibirDatosPublicacion() {
        System.out.print("Escribe la publicación: ");
        String contenido = scanner.nextLine();
        System.out.print("Escribe el autor de la publicación: ");
        String autor = scanner.nextLine();

     
        gestorPublicaciones.recibeDatosPublicacion(contenido, autor);
    }

    public void recibirDatosComentario() {
        System.out.print("Escribe un comentaro: ");
        String comentario = scanner.nextLine();
        System.out.print("Escribe el autor del comentario: ");
        String autor = scanner.nextLine();
       // System.out.print("Ingresa el ID de la publicación relacionada: ");
        //int idPublicacion = scanner.nextInt();
        //scanner.nextLine(); 

    
        gestorPublicaciones.recibeDatosComentario(comentario, autor, idPublicacion);
    }

    public void compartirPublicacion(String autor, int idPublicacion) {
     
        gestorPublicaciones.compartirPublicacion(autor, idPublicacion);
    }
}
