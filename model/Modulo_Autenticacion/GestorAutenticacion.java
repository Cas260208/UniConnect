package model.Modulo_Autenticacion;
import java.util.Scanner;

public class GestorAutenticacion {

    private Autenticacion autenticacion;

    public GestorAutenticacion() {
        autenticacion = new Autenticacion();
    }

    public void recibirDatosRegistro(String nombre, String apellidos, String correo, String contrasenia) {
        RegistroUsuario registro = new RegistroUsuario(nombre, apellidos, correo, contrasenia);
        autenticacion.setRegistro(registro);
    }

   
    public void recibirDatosInicioSesion(String userName, String password) {
        InicioSesion inicio = new InicioSesion(userName, password);
        autenticacion.setInicio(inicio);
    }

    public void solicitarValidacionDatos() {
        boolean resultRegistro = autenticacion.validarDatosRegistro();
        boolean resultInicioSesion = autenticacion.validarDatosInicioSesion();

        if (resultRegistro && resultInicioSesion) {
            System.out.println("Los datos son válidos para registro e inicio de sesión.");
        } else if (resultRegistro) {
            System.out.println("Los datos son válidos para registro, pero no para inicio de sesión.");
        } else if (resultInicioSesion) {
            System.out.println("Los datos son válidos para inicio de sesión, pero no para registro.");
        } else {
            System.out.println("Los datos no son válidos ni para registro ni para inicio de sesión.");
        }
    }

    
    public void invalidarDatos() {
        autenticacion.setRegistro(null);
        autenticacion.setInicio(null);
        System.out.println("Datos de registro e inicio de sesión invalidados.");
    }

    
}
