package model.Modulo_Notificaciones;

public class GestorNotificaciones {
    // Atributos 
    private Notificaciones notificaciones;
    private TablaNotificaciones solicitudNotificacion;

    // Constructores 
    public GestorNotificaciones(Notificaciones notificaciones, TablaNotificaciones solicitudNotificacion) {
        this.notificaciones = notificaciones;
        this.solicitudNotificacion = solicitudNotificacion;
    }

    public GestorNotificaciones() {}

    // Setter y getters 
    public void setNotificaciones(Notificaciones notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Notificaciones getNotificaciones() {
        return notificaciones;
    }

    public void setSolicitudNotificacion(TablaNotificaciones solicitudNotificaciones) {
        this.solicitudNotificacion = solicitudNotificaciones;
    }

    public TablaNotificaciones getSolicitudNotificacion() {
        return solicitudNotificacion;
    }

    // Metodos 
    public void solicitudDeVerNotificaciones() {
    
    }

    public void recibeNotificaciones() {
    
    }

    public void preparaNotificaciones() {
    
    }

    public void recibirSolicitudSeguimiento() {
    
    }

    public void recibeSolicitud() {
    
    }

    public void preparaSolicitud() {
    
    }

    public void recibeSolSilenciarNotificaciones() {
        
     }
 
     public void recibeConfirmacionDeSilenciar() {
        
     }
 
     public void recibeNotificacionSeleccionada() {
        
     }
 
     public void recibeNotificacion(){
          //Implementacion de metodo.
         
      }
      
      public void preparaNotificacion(){
          //Implementacion de metodo.
         
      }  
}
