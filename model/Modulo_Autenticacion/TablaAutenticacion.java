package model.Modulo_Autenticacion;
import java.util.ArrayList;
import java.util.List;

public class TablaAutenticacion {

    private List<RegistroUsuario> tablaAutenticacion;

    // Constructor que inicializa la tabla de autenticación
    public TablaAutenticacion() {
        tablaAutenticacion = new ArrayList<>();
        inicializaTablaUsuarios();
    }

    // Método para inicializar la tabla de autenticación con registros simulados
    private void inicializaTablaUsuarios() {
        RegistroUsuario usuario = new RegistroUsuario(
            "Italia",
            "Barrón Reyes",
            "italia_br2002@gmail.com",
            "firenze2002",
            "Femenino",
            new FechaNac("23", "04", "2002")
        );
        agregarUsuario(usuario);

        usuario = new RegistroUsuario(
            "Fernando",
            "Rico Arellano",
            "fer_2000@gmail.com",
            "ferzia2000",
            "Masculino",
            new FechaNac("18", "12", "2000")
        );
        agregarUsuario(usuario);

        usuario = new RegistroUsuario(
            "Marcos",
            "González Hernández",
            "marcos_gb2001@gmail.com",
            "mkghli2001",
            "Masculino",
            new FechaNac("09", "10", "2001")
        );
        agregarUsuario(usuario);
    }

    // Método para agregar nuevos usuarios a la tabla de autenticación
    public void agregarUsuario(RegistroUsuario usuario) {
        tablaAutenticacion.add(usuario);
    }

    // Método para validar la existencia de un usuario en la tabla
    public boolean validarUsuario(String correo, String contraseña) {
        for (RegistroUsuario usuario : tablaAutenticacion) {
            String email = usuario.getCorreo();
            String contra = usuario.getContrasenia();
            if (correo.equals(email) && contraseña.equals(contra)) {
                return true;
            }
        }
        return false;
    }
    public RegistroUsuario buscarUsuario(String correo) {
        for (RegistroUsuario usuario : tablaAutenticacion) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }

    // Método para mostrar la información de la tabla de autenticación
    // excluyendo la contraseña para cada usuario
    public void mostrarInfoTablaUsuarios() {
        for (RegistroUsuario usuario : tablaAutenticacion) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellidos: " + usuario.getApellidos());
            System.out.println("Fecha de nacimiento: " + usuario.getFeNac());
            System.out.println("Dirección email: " + usuario.getCorreo());
            System.out.println("Password: **********\n");
        }
    }
}
