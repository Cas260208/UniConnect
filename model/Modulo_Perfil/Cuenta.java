package model.Modulo_Perfil;

public class Cuenta {
    private String nombre;
    private String correo;
    private String sexo;

    // Constructor
    public Cuenta(String nombre, String correo, String sexo) {
        this.nombre = nombre;
        this.correo = correo;
        this.sexo = sexo;
    }

    public Cuenta() {}
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Metodos
    public void editar_datos() {
        // Implementación
    }
}
