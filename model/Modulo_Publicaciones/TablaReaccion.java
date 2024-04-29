

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TablaReaccion {
    private List<Reaccion> listaReacciones;

    // Constructor vacío
    public TablaReaccion() {
        listaReacciones = new ArrayList<>();
    }


    public void agregarReaccion(Reaccion reaccion) {
        listaReacciones.add(reaccion);
    }


    public void recibirDatosNuevaReaccion() {
        Reaccion nuevaReaccion = new Reaccion();
        nuevaReaccion.recibeDatosReaccion();
        agregarReaccion(nuevaReaccion);
    }


    public void solicitarGuardadoReacciones() {
        for (Reaccion reaccion : listaReacciones) {
            reaccion.solicitaGuardado();
        }
    }

    
}