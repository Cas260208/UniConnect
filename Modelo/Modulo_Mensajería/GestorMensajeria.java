package Modelo.Modulo_Mensajería;


public class GestorMensajeria {
    private Mensajes mensaje;
    private TablaMensajes tablaMensajes;

    public GestorMensajeria(Mensajes mensaje, TablaMensajes tablaMensajes) {
        this.mensaje = mensaje;
        this.tablaMensajes = tablaMensajes;
    }

    public GestorMensajeria() {}

    public void setMensaje(Mensajes mensaje) {
        this.mensaje = mensaje;
    }

    public Mensajes getMensaje() {
        return mensaje;
    }

    public void setTablaMensajes(TablaMensajes tablaMensajes) {
        this.tablaMensajes = tablaMensajes;
    }

    public TablaMensajes getTablaMensajes() {
        return tablaMensajes;
    }

    // Actualiza un mensaje existente
    public void actualizaMensaje(int index, Mensajes nuevoMensaje) {
        tablaMensajes.actualizaMensaje(index, nuevoMensaje);
    }

    // Elimina un mensaje o un chat
    public void mensajeEliminar(int index, boolean esChat) {
        tablaMensajes.eliminaMensajeOChat(index, esChat);
    }

    // Recibe un chat seleccionado
    public Mensajeria recibeChatSeleccionado(int index) {
        return (Mensajeria) tablaMensajes.buscaMensajeOChat(index, true);
    }

    // Recibe un mensaje para enviar
    public void recibeMensajeAEnviar(Mensajes mensaje) {
        tablaMensajes.almacenaMensaje(mensaje);
    }

    // Recibe un nuevo mensaje
    public void recibeNuevoMensaje(Mensajes mensaje) {
        tablaMensajes.almacenaMensaje(mensaje);
    }

    // Prepara un mensaje editado
    public void preparaMensajeEditado(int index, Mensajes mensajeEditado) {
        tablaMensajes.actualizaMensaje(index, mensajeEditado);
    }

    // Recibe un mensaje seleccionado
    public Mensajes recibeMensajeSeleccionado(int index) {
        return (Mensajes) tablaMensajes.buscaMensajeOChat(index, false);
    }

    // Escribe un mensaje
    public void escribeMensaje(Mensajes mensaje) {
        tablaMensajes.almacenaMensaje(mensaje);
    }

    // Elimina un chat seleccionado
    public void deleteChatSeleccionado(int index) {
        tablaMensajes.eliminaMensajeOChat(index, true);
    }

}
