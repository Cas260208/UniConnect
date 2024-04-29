package model.Modulo_Autenticacion;

public class RegistroUsuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasenia;
    private String genero; 
    private FechaNac feNac; 

    public Usuario(String nombre, String apellidos, String correo, String contrasenia, String genero, FechaNac feNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.genero = genero;
        this.feNac = feNac;
    }

    public Usuario(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo; 
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setFeNac(FechaNac feNac) {
        this.feNac = feNac;
    }

    public FechaNac getFeNac() {
        return feNac;
    }

}
