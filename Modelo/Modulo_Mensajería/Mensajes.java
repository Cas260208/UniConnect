package Modelo.Modulo_Mensajería;

public class Mensajes {
    private String contenidoMensaje;
    private int hora;
    private String userUsuario;

    public Mensajes(String contenidoMensaje, int hora, String userUsuario) {
        this.contenidoMensaje = contenidoMensaje;
        this.hora = hora;
        this.userUsuario = userUsuario;
    }

    public Mensajes() {}

    public void setContenidoMensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setUserUsuario(String userUsuario) {
        this.userUsuario = userUsuario;
    }

    public String getUserUsuario() {
        return userUsuario;
    }

    // Funcion 
    public void recibeObjeto() {
        
    }

}
