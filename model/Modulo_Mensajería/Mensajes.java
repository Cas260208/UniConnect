package model.Modulo_Mensajería;

public class Mensajes {
    // Atributos
    private String datosMensaje;
    private int hora;
    private int entregado;

    // Constructores
    public Mensajes(String datosMensaje, int hora, int entregado) {
        this.datosMensaje = datosMensaje;
        this.hora = hora;
        this.entregado = entregado;
    }

    // Getters
    public String getDatosMensaje() {
        return datosMensaje;
    }

    public int getHora() {
        return hora;
    }

    public int getEntregado() {
        return entregado;
    }

    // Setters
    public void setDatosMensaje(String datosMensaje) {
        this.datosMensaje = datosMensaje;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setEntregado(int entregado) {
        this.entregado = entregado;
    }
    
    // Metodos
    public void objetomensaje(String datosMensaje) {
        // Código para crear un nuevo mensaje con el contenido dado
    }

    public void llamaMensajes() {
        // Código para recuperar mensajes
    }

    public void insertaMensaje() {
        // Código para enviar o agregar un nuevo mensaje
    }

    public void enviaMensaje() {
        // Código para enviar un mensaje
    }
}
