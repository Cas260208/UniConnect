package Modelo.Modulo_Mensajería;

public class Mensajes {
    // Atributos
    private String datosMensaje;
    private String mensaje;
    
    // Constructores
    public Mensajes(String datosMensaje, String mensaje){
        this.datosMensaje = datosMensaje;
        this.mensaje = mensaje;
    }

    public Mensajes() {}

    // Setters y getters
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setDatosMensaje(String datosMensaje) {
        this.datosMensaje = datosMensaje;
    }

    public String getDatosMensaje() {
        return datosMensaje;
    }

    // Métodos
    public void recibeDatosDeMnesaje(String datosMensaje){

    }

    public void recibeMensajeEditado(){

    }

    public void recibeMensajeEliminado(){

    }
}
