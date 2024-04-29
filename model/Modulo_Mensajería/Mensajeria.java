package model.Modulo_Mensajería;

import model.Modulo_Autenticacion.Usuario;

public class Mensajeria {
    // Atributos
    private Mensajes mensaje;
    private String[] chats;
    private Usuario usuarioActual;
    private Boolean chatActivo;

    //Constructores
    public Mensajeria(Mensajes mensaje, String[] chats, Usuario usuarioActual, Boolean chatActivo) {
        this.mensaje = mensaje;
        this.chats = chats;
        this.usuarioActual = usuarioActual;
        this.chatActivo = chatActivo;
    }

    public Mensajeria() {}

    // Getters
    public Mensajes getMensaje() {
        return mensaje;
    }

    public String[] getChats() {
        return chats;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public Boolean getChatActivo() {
        return chatActivo;
    }

    // Setters
    public void setMensaje(Mensajes mensaje) {
        this.mensaje = mensaje;
    }

    public void setChats(String[] chats) {
        this.chats = chats;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public void setChatActivo(Boolean chatActivo) {
        this.chatActivo = chatActivo;
    }

    public void buscarChatSeleccionado(String chat) {
        // Lógica para buscar un chat seleccionado
        System.out.println("Buscando chat seleccionado: " + chat);
    }

    // Método para recibir un nuevo mensaje de chat
    public void recibirChatDeNuevoMensaje() {
        // Lógica para recibir un nuevo mensaje de chat
        System.out.println("Recibiendo nuevo mensaje de chat...");
    }

}
