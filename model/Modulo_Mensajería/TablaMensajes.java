package model.Modulo_Mensajería;

public class TablaMensajes {
    // Atributos
    private Mensajes mensajesEnviados;
    private String[] mensajesRecibidos;
    private String[] conversaciones;

    // Constructores
    public TablaMensajes(Mensajes mensajesEnviados, String[] mensajesRecibidos, String[] conversaciones) {
        this.mensajesEnviados = mensajesEnviados;
        this.mensajesRecibidos = mensajesRecibidos;
        this.conversaciones = conversaciones;
    }

    // Getters
    public Mensajes getMensajesEnviados() {
        return mensajesEnviados;
    }

    public String[] getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public String[] getConversaciones() {
        return conversaciones;
    }

    // Setters
    public void setMensajesEnviados(Mensajes mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public void setMensajesRecibidos(String[] mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    public void setConversaciones(String[] conversaciones) {
        this.conversaciones = conversaciones;
    }
    
    public void buscaMensajeChat() {
        // Código para buscar un mensaje de chat
    }

    public void actualizaMensajeChat() {
        // Código para actualizar un mensaje de chat
    }

    public void eliminaMensajeChat() {
        // Código para eliminar un mensaje de chat
    }

    public void agregaMensajeChat() {
        // Código para agregar un mensaje de chat
    }

    
}
