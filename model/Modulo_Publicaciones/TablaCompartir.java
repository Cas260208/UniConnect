


import java.util.ArrayList;
import java.util.List;

public class TablaCompartir {
    private List<Compartir> listaCompartidos;

    // Constructor vacío
    public TablaCompartir() {
        listaCompartidos = new ArrayList<>();
    }

    // Método para agregar un registro de compartido a la lista
    public void agregarCompartido(Compartir compartido) {
        listaCompartidos.add(compartido);
    }

    public void eliminarCompartido(Compartir compartido) {
        listaCompartidos.remove(compartido);
    }

    public List<Compartir> obtenerCompartidos() {
        return listaCompartidos;
    }

   
}
