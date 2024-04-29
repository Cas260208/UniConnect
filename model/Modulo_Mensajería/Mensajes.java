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
    
    // Métodos
    // Método para crear un nuevo mensaje con el contenido dado
    public void crearMensaje(String contenido) {
        this.datosMensaje = contenido;
        // Suponemos que la hora actual se establece automáticamente
        this.hora = obtenerHoraActual();
        this.entregado = 0; // 0 indica que el mensaje aún no ha sido entregado
    }

    // Método privado para obtener la hora actual (simulado)
    private int obtenerHoraActual() {
        // Aquí se simula obtener la hora actual
        // En un sistema real, se utilizaría la hora del sistema
        // Esta es solo una implementación de ejemplo
        return 14; // Supongamos que la hora actual es 14:00 (2:00 PM)
    }

    // Método para marcar el mensaje como entregado
    public void marcarComoEntregado() {
        this.entregado = 1; // 1 indica que el mensaje ha sido entregado
    }

    // Método para verificar si el mensaje ha sido entregado
    public boolean estaEntregado() {
        return this.entregado == 1;
    }

    // Método para obtener una representación del mensaje como cadena de texto
    @Override
    public String toString() {
        return "Mensaje: " + datosMensaje + ", Hora: " + hora + ", Entregado: " + (estaEntregado() ? "Sí" : "No");
    }
}
