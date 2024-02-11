package Modelo.Modulo_Mensajería;

public class Mensajeria {
    public String chat; 

    public Mensajeria(String chat){
        this.chat = chat;
    }

    public Mensajeria() {}

    public void setChat(String chat) { 
        this.chat = chat;
    }

    public String getChat(){
        return chat;
    }

    // Funciones
    public void buscarChatSeleccionado(String chatBuscado) {
        // Comparamos el chat buscado con el atributo chat de esta clase
        if (this.chat.equals(chatBuscado)) {
            // Si son iguales, significa que hemos encontrado el chat
            System.out.println("Chat encontrado: " + this.chat);
        } else {
            // Si no son iguales, significa que no hemos encontrado el chat
            System.out.println("Chat no encontrado");
        }
    }

    // Este método notificará de un nuevo mensaje al usuario
    public void recibirNuevoMensaje(Mensajes nuevoMensaje) {
        // Imprimimos el contenido del nuevo mensaje
        System.out.println("Nuevo mensaje recibido: " + nuevoMensaje.getContenidoMensaje());
    }

}
