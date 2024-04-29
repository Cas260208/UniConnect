package model.Modulo_Publicaciones;
import java.util.ArrayList;
import java.util.List;

public class TablaPublicaciones {
    private List<Publicacion> listaPublicaciones;

    // Constructor vacío
    public TablaPublicaciones() {
        listaPublicaciones = new ArrayList<>();
    }

    // Método para agregar una nueva publicación a la lista
    public void agregarPublicacion(Publicacion publicacion) {
        listaPublicaciones.add(publicacion);
    }

    // Getters y Setters para la lista de publicaciones (opcional)
    public List<Publicacion> getListaPublicaciones() {
    	return listaPublicaciones;
        return listaPublicaciones;
    }

    public void setListaPublicaciones(List<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

   
}
