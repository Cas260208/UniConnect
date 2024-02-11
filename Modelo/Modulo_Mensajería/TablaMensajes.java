package Modelo.Modulo_Mensajería;

import java.util.ArrayList;

public class TablaMensajes {
    private ArrayList<Mensajeria> chat = new ArrayList<>();
    private ArrayList<Mensajes> mensajes = new ArrayList<>();

    public TablaMensajes() {
        chat = new ArrayList<>();
        mensajes = new ArrayList<>();
    }

    // Almacena un mensaje en la lista de mensajes
    public void almacenaMensaje(Mensajes mensaje) {
        mensajes.add(mensaje);
    }

    // Elimina un mensaje o un chat
    public void eliminaMensajeOChat(int index, boolean esChat) {
        if (esChat) {
            chat.remove(index);
        } else {
            mensajes.remove(index);
        }
    }

    // Actualiza un mensaje
    public void actualizaMensaje(int index, Mensajes nuevoMensaje) {
        mensajes.set(index, nuevoMensaje);
    }

    // Busca un mensaje o un chat
    public Object buscaMensajeOChat(int index, boolean esChat) {
        if (esChat) {
            return chat.get(index);
        } else {
            return mensajes.get(index);
        }
    }
}
