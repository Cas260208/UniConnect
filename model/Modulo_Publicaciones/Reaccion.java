package model.Modulo_Publicaciones;
import java.util.Scanner;

public class Reaccion {
    private String datosReaccion;

    // Constructor vacío
    public Reaccion() {}

    // Constructor
    public Reaccion(String datosReaccion) {
        this.datosReaccion = datosReaccion;
    }

    // Getter and Setter
    public String getDatosReaccion() {
        return datosReaccion;
    }

    public void setDatosReaccion(String datosReaccion) {
        this.datosReaccion = datosReaccion;
    }

    // Método para recibir datos de la reacción desde el usuario
    public void recibeDatosReaccion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una reacción:");
        System.out.println("1. Like");
        System.out.println("2. Me divierte");
        System.out.println("3. Me encorazona");
        System.out.println("4. Me enoja");
        System.out.println("5. Me importa");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                datosReaccion = "Like";
                break;
            case 2:
                datosReaccion = "Me divierte";
                break;
            case 3:
                datosReaccion = "Me encorazona";
                break;
            case 4:
                datosReaccion = "Me enoja";
                break;
            case 5:
                datosReaccion = "Me importa";
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

 
    public void solicitaGuardado() {
     
        System.out.println("Reacción guardada: " + datosReaccion);
    }
}
