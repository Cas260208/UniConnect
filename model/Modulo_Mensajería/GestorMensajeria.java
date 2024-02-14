package model.Modulo_Mensajería;


public class GestorMensajeria {
    // Atributos
    private Mensajeria chat;
    private Mensajes mensajes;
    private boolean editMensaje;
    private boolean eliminarMensaje;

    // Constructores
    public GestorMensajeria(Mensajeria chat, Mensajes mensajes, boolean editMensaje, boolean eliminarMensaje) {
        this.chat = chat;
        this.mensajes = mensajes;
        this.editMensaje = editMensaje;
        this.eliminarMensaje = eliminarMensaje;
    }

    public GestorMensajeria() {}

    // Setters y getters
    public Mensajeria getChat() {
        return chat;
    }

    public Mensajes getMensajes() {
        return mensajes;
    }

    public boolean isEditMensaje() {
        return editMensaje;
    }

    public boolean isEliminarMensaje() {
        return eliminarMensaje;
    }

    // Setters
    public void setChat(Mensajeria chat) {
        this.chat = chat;
    }

    public void setMensajes(Mensajes mensajes) {
        this.mensajes = mensajes;
    }

    public void setEditMensaje(boolean editMensaje) {
        this.editMensaje = editMensaje;
    }

    public void setEliminarMensaje(boolean eliminarMensaje) {
        this.eliminarMensaje = eliminarMensaje;
    }

    // Metodos
    public void recibeSolicitud() {
       
    }

    public void recibeMensaje() {
    
    }

    public void preparaMensaje() {

    }

    public void recibeConfirmacion() {

    }
}
