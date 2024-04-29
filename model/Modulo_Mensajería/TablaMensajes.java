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
    
    public Mensajes buscaMensajeChat(String contenido) {
        for (Mensajes mensaje : mensajesChat) {
            if (mensaje.getDatosMensaje().contains(contenido)) {
                return mensaje;
            }
        }
        return null;
    }

    // Método para actualizar un mensaje de chat
    public void actualizaMensajeChat(Mensajes mensaje, String nuevoContenido) {
        if (mensajesChat.contains(mensaje)) {
            mensaje.setDatosMensaje(nuevoContenido);
            System.out.println("Mensaje de chat actualizado correctamente.");
        } else {
            System.out.println("El mensaje de chat no existe en la lista.");
        }

    // Método para eliminar un mensaje de chat
    public void eliminaMensajeChat(Mensajes mensaje) {
        if (mensajesChat.remove(mensaje)) {
            System.out.println("Mensaje de chat eliminado correctamente.");
        } else {
            System.out.println("El mensaje de chat no existe en la lista.");
        }

    // Método para agregar un mensaje de chat
    public void agregaMensajeChat(Mensajes mensaje) {
        mensajesChat.add(mensaje);
        System.out.println("Mensaje de chat agregado correctamente.");
    }

    
}
