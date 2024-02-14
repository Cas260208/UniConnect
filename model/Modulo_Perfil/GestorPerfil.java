package model.Modulo_Perfil;

public class GestorPerfil {
    private Perfil perfil;
    private Cuenta cuenta;
    private String dato;

    // Constructor
    public GestorPerfil(Perfil perfil, Cuenta cuenta, String dato) {
        this.perfil = perfil;
        this.cuenta = cuenta;
        this.dato = dato;
    }

    public GestorPerfil(){}

    // Getters and Setters
    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    // Metodos
    public void recibe_dato() {
        // Implementación
    }

    public void relacion_dato() {
        // Implementación
    }

    public void notif_datos() {
        // Implementación
    }

    public void muestra_datos() {
        // Implementación
    }

    public Object regresa_objeto() {
        // Implementación
        return null;
    }

}
