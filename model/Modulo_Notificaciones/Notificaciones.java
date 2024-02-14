package model.Modulo_Notificaciones;

public class Notificaciones {
    // Atributos 
    private int interaccion;
    private String solicitud; 
    private Boolean notificacion;

    // Constructores 
    public Notificaciones(int interaccion, String solicitud, Boolean notificacion) {
        this.interaccion = interaccion;
        this.solicitud = solicitud;
        this.notificacion = notificacion; 
    }

    public Notificaciones() {}

    // Setters y getters 
    public void setInteraccion(int interaccion) {
        this.interaccion = interaccion;
    }

    public int getInteraccion() {
        return interaccion;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setNotificacion(Boolean notificacion) {
        this.notificacion = notificacion;
    }

    public Boolean getNotificacion() {
        return notificacion; 
    }

    // Metodos 
    public void buscaInteracciones() {

    }

    public void buscaNuevaSolictud() {

    }

    public void buscaNotificacion() {

    }

}
