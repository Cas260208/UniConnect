package Modelo.Modulo_Mensajería;


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
        this. eliminarMensaje = eliminarMensaje;
    }

    public GestorMensajeria() {}

    // setters y getters
    public void setChat(Mensajeria chat) {
        this.chat = chat;
    }

    public Mensajeria getChat() {
        return chat;
    }

    public void setMensaje(Mensajes mensajes) {
        this.mensajes = mensajes;
    }
    public Mensajes getMensajes() {
        return mensajes;
    }

    public void setEditMensaje(boolean editMensaje) {
        this.editMensaje = editMensaje;
    }

    public boolean getEditMensaje() {
        return editMensaje;
    }

    public void setEliminarMensaje(boolean eliminarMensaje) {
        this.eliminarMensaje = eliminarMensaje;
    }

    public boolean getEliminarMensaje() {
        return eliminarMensaje;
    }

    // Métodos
    public void recibeSeleccionChat() {
        
    }

    public void recibeChatConMensajes() {
        
    }

    public void recibeMensajeAEnviar() {
        
    }

    public void recibeInstanciaDatosMensaje() {
        
    }

    public void recibeMensajeAlmacenado() {
        
    }

    public void preparaMensaje() {
        
    }

    public void recibeEdicionDeMensaje() {
        
    }

    public void recibeMensajeEditado() {
        
    }

    public void preparaMensajeEditado() {
        
    }

    public void confirmaSelDeEliminarChat() {
        
    }
}
