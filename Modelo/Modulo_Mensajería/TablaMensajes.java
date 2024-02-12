package Modelo.Modulo_Mensajería;

public class TablaMensajes {
    // Atributos
    private String[] mensajesEnviados;
    private String[] mensajesRecibidos;
    private String[] conversaciones;

    // Constructores
    public TablaMensajes(String[] mensajesEnviados, String[] mensajesRecibidos, String[] conversaciones){
        this.mensajesEnviados = mensajesEnviados;
        this.mensajesRecibidos = mensajesRecibidos;
        this.conversaciones = conversaciones;
    }

    public TablaMensajes() {}

    // Setters y getters
    public void setMensajesEnviados(String[] mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public String[] getMensajesEnviado() {
        return mensajesEnviados;
    }

    public void setMensajesRecibidos(String[]mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    public String[] getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setConversaciones(String[]conversaciones) {
        this.conversaciones = conversaciones;
    }

    public String[] getConversaciones() {
        return conversaciones;
    }

    // Metodos
    public void buscaChatSeleccionado() {
        
    }

    public void almacenaMensajeEnviado(String mensaje) {
        
    }

    public void actualizaElMensajeEditado(String mensajeEditado) {
        
    }

    public void eliminaMensaje(int indice) {
        
    }

    public void eliminaChat(int indice) {
        
    }

     public void almacenaMensajeRecibido(String mensaje) {
         
     }

    
}
