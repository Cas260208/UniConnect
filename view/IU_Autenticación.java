import java.util.Scanner;
public class IU_Autenticación {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registro");
            System.out.println("2. Inicio de Sesión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    realizarRegistro(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void realizarRegistro(Scanner scanner) {
        System.out.println("Ingrese su información de registro:");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Apellidos: ");
        String apellidos = scanner.next();
        System.out.print("User Name: ");
        String userName = scanner.next();
        System.out.print("Correo: ");
        String correo = scanner.next();
        System.out.print("Contraseña: ");
        String contrasenia = scanner.next();
        System.out.print("Día de Nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Mes de Nacimiento: ");
        String mes = scanner.next();
        System.out.print("Año de Nacimiento: ");
        int año = scanner.nextInt();
        System.out.print("Género: ");
        String genero = scanner.next();

        System.out.println("Registro exitoso!");
    }

    private static void iniciarSesion(Scanner scanner) {
        System.out.println("Ingrese su información de inicio de sesión:");
        System.out.print("User Name: ");
        String userName = scanner.next();
        System.out.print("Contraseña: ");
        String contrasenia = scanner.next();

        System.out.println("Inicio de sesión exitoso!");
    }
}