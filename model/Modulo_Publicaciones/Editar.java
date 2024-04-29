
public class Editar {

    // Método para editar una publicación
    public void editarPublicacion(Publicacion publicacion) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea editar la siguiente publicación?");
        System.out.println(publicacion.getDatosPublicacion());
        System.out.println("Autor: " + publicacion.getAutor());
        System.out.println("Fecha y hora: " + publicacion.getFechaHora());
        System.out.println("Respuesta (s/n):");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Ingrese los nuevos datos de la publicación:");
            String nuevosDatos = scanner.nextLine();
            publicacion.setDatosPublicacion(nuevosDatos);
            System.out.println("Publicación editada correctamente.");
        } else {
            System.out.println("La publicación no ha sido editada.");
        }
    }
}