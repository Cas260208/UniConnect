package Modelo.Modulo_Mensajería;

public class Mensajeria {
    // Atributos
    private Mensajes mensaje;
    private String chats; 

    // Constructores
    public Mensajeria(Mensajes mensaje, String chats) {
        this.mensaje = mensaje;
        this.chats = chats;
    }

    public Mensajeria() {}

    // Setters y getters
    public void setMensaje(Mensajes mensaje) {
        this.mensaje = mensaje;
    }

    public Mensajes getMensajes() {
        return mensaje;
    }

    public void setChats(String chats) {
        this.chats = chats;
    }

    public String getChats() {
        return chats;
    }

    // Metodos 
    public void buscaChatSeleccionado() {

    }

    public void buscaChatAEliminar() {

    }

    public void recibeChatDeNuevoMensaje() {

    }

}
