package model.Modulo_Notificaciones;

public class TablaNotificaciones {
    // Atributos 
    private String[] interacciones;
    private String[] solicitudes;
    private String[] notificaciones;

    // Constructores 
    public TablaNotificaciones(String[] interacciones, String[] solicitudes, String[] notificaciones) {
        this.interacciones = interacciones;
        this.notificaciones = notificaciones;
        this.solicitudes = solicitudes;
    }

    public TablaNotificaciones() {}

    // Setters y getters 
    public void setInteracciones(String[] interacciones) {
        this.interacciones = interacciones;
    }

    public String[] getInteracciones() {
        return interacciones;
    }

    public void setSolicitudes(String[] solicitudes) {
        this.solicitudes = solicitudes;
    }

    public String[] getSolicitudes() {
        return solicitudes;
    }

    public void setNotificaciones(String[] notificaciones) {
        this.notificaciones = notificaciones;
    }

    public String[] getNotificaciones() {
        return notificaciones;
    }

    //  Metodos 
    public void buscaInteracciones() {

    }

    public void alamacenaSolicitud() {

    }

    public void buscaNotificacionEspecifica() {
        
    }
}
