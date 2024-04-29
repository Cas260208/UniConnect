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

    // Método para recibir una solicitud
    public void recibirSolicitud(String solicitud) {
        System.out.println("Solicitud recibida: " + solicitud);
        // Lógica adicional para procesar la solicitud
    }

    // Método para recibir un mensaje
    public void recibirMensaje(String mensaje) {
        System.out.println("Mensaje recibido: " + mensaje);
        // Lógica adicional para procesar el mensaje recibido
    }

    // Método para preparar un mensaje
    public void prepararMensaje(String contenido) {
        System.out.println("Preparando mensaje...");
        mensajes.crearMensaje(contenido);
        System.out.println("Mensaje preparado: " + mensajes.getDatosMensaje());
        // Lógica adicional para preparar el mensaje
    }

    // Método para editar un mensaje ya enviado
    public void editarMensajeEnviado(Mensajes mensaje, String nuevoContenido) {
        if (chat.getChat().getMensajesEnviados().contains(mensaje)) {
            mensaje.setDatosMensaje(nuevoContenido);
            System.out.println("Mensaje editado correctamente.");
        } else {
            System.out.println("No se puede editar el mensaje. El mensaje no existe en la lista de enviados.");
        }

        // Método para eliminar un mensaje enviado
    public void eliminarMensajeEnviado(Mensajes mensaje) {
        if (chat.getChat().getMensajesEnviados().contains(mensaje)) {
            chat.getChat().getMensajesEnviados().remove(mensaje);
            System.out.println("Mensaje eliminado correctamente.");
        } else {
            System.out.println("No se puede eliminar el mensaje. El mensaje no existe en la lista de enviados.");
        }
    }


}
