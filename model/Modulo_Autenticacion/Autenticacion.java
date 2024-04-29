package model.Modulo_Autenticacion

public class Autenticacion {
	
	private RegistroUsuario registro;
	private InicioSesión inicio;
	
	
	// Constructor vacío
    public Autenticacion() {
    }
    // Constructor vacío
    public Autenticacion() {
    }


    public Autenticacion(RegistroUsuario registro, InicioSesion inicio) {
        this.registro = registro;
        this.inicio = inicio;
    }

 
    public RegistroUsuario getRegistro() {
        return registro;
    }

    
    public void setRegistro(RegistroUsuario registro) {
        this.registro = registro;
    }

    
    public InicioSesion getInicio() {
        return inicio;
    }

   
    public void setInicio(InicioSesion inicio) {
        this.inicio = inicio;
    }
}

	
    public boolean validarDatosRegistro() {
   
    if (registro != null && registro.getCorreo() != null && registro.getContrasenia() != null) {
        // Si el correo y la contraseña tienen al menos un carácter, se consideran válidos
        return !registro.getCorreo().isEmpty() && !registro.getContrasenia().isEmpty();
    }
   
    return false;
    }

     // Método para validar los datos de inicio de sesión
   public boolean validarDatosInicioSesion() {
   
    if (inicio != null) {
        // Verificar si el usuario y la contraseña están presentes en el inicio de sesión
        return inicio.getUserName() != null && inicio.getPassword() != null &&
               !inicio.getUserName().isEmpty() && !inicio.getPassword().isEmpty();
    }
  
    return false;
   }

    
 }
