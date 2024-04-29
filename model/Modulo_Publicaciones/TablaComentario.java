import java.util.ArrayList;
import java.util.List;

public class TablaComentario {
    private List<Comentario> listaComentarios;

    // Constructor vacío
    public TablaComentario() {
        listaComentarios = new ArrayList<>();
    }

    // Método para agregar un comentario a la lista
    public void agregarComentario(Comentario comentario) {
        listaComentarios.add(comentario);
    }

    // Método para eliminar un comentario de la lista
    public void eliminarComentario(Comentario comentario) {
        listaComentarios.remove(comentario);
    }

    // Método para obtener todos los comentarios de la lista
    public List<Comentario> obtenerComentarios() {
        return listaComentarios;
    }

    // Otros métodos para manipular la lista de comentarios si es necesario
}