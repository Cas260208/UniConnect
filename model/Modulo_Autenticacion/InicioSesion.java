

public class RegistroUsuario {
 
    private String correo;
    private String contrasenia;
   
    public Usuario(String correo, String contrasenia) {
       
        this.correo = correo;
        this.contrasenia = contrasenia;
     
    }

    public RegistroUsuario(){}


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
}