/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniconnect_tutorias;

/**
 *
 * @author brizi
 */
import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;

public class IU_Tutorias {
    private ControladorTutorias controladorTutorias;

    public IU_Tutorias(ControladorTutorias controladorTutorias) {
        this.controladorTutorias = controladorTutorias;
    }

    // Método para iniciar la vista
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    publicarTutoria();
                    break;
                case 2:
                    solicitarTutoria();
                    break;
                case 3:
                    confirmarTutoria();
                    break;
                case 4:
                    cancelarTutoria();
                    break;
                case 5:
                    modificarTutoria();
                    break;
                case 6:
                    eliminarTutoria();
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        }
    }

    // Método para mostrar el menú
    private void mostrarMenu() {
        System.out.println("---- Menú ----");
        System.out.println("1. Publicar Tutoría");
        System.out.println("2. Solicitar Tutoría");
        System.out.println("3. Confirmar Tutoría");
        System.out.println("4. Cancelar Tutoría");
        System.out.println("5. Modificar Tutoría");
        System.out.println("6. Eliminar Tutoría");
        System.out.println("7. Salir");
        System.out.println("Ingrese el número correspondiente a la opción que desea:");
    }


    // Método para modificar una tutoría
    public void modificarTutoria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tutoría que desea modificar:");
        int idTutoria = scanner.nextInt();
        Tutoria tutoria = obtenerTutoriaExistente(idTutoria);
        if (tutoria != null) {
            // Aquí se podrían solicitar los nuevos datos de la tutoría y actualizarla
            System.out.println("Tutoría modificada exitosamente.");
        } else {
            System.out.println("La tutoría con el ID especificado no existe.");
        }
    }

    // Método para publicar una tutoría
    public void publicarTutoria() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int idTutoria = rand.nextInt(1000); // Generar un ID de tutoría aleatorio
        System.out.println("Ingrese el ID del tutor:");
        int idTutor = scanner.nextInt();
        System.out.println("Ingrese el título de la tutoría:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String titulo = scanner.nextLine();
        System.out.println("Ingrese la descripción de la tutoría:");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese los días de la tutoría (1-Lunes, 2-Martes, etc.):");
        int dias = scanner.nextInt();
        System.out.println("Ingrese la hora de la tutoría (formato 24 horas):");
        int hora = scanner.nextInt();
        
        Tutoria nuevaTutoria = new Tutoria(idTutoria, idTutor, 0, dias, hora, descripcion, true, false, titulo);
        controladorTutorias.publicarTutoria(nuevaTutoria);
    }

    // Método para eliminar una tutoría
    public void eliminarTutoria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tutoría que desea eliminar:");
        int idTutoria = scanner.nextInt();
        controladorTutorias.eliminarTutoria(idTutoria);
    }

    // Método para solicitar una tutoría
    public void solicitarTutoria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tutoría que desea solicitar:");
        int idTutoria = scanner.nextInt();
        System.out.println("Ingrese su ID de alumno:");
        int idAlumno = scanner.nextInt();
        controladorTutorias.solicitarTutoria(idTutoria, idAlumno);
    }

    // Método para confirmar una tutoría
    public void confirmarTutoria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tutoría que desea confirmar:");
        int idTutoria = scanner.nextInt();
        controladorTutorias.confirmarTutoria(idTutoria);
    }

    // Método para cancelar una tutoría
    public void cancelarTutoria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la tutoría que desea cancelar:");
        int idTutoria = scanner.nextInt();
        controladorTutorias.cancelarTutoria(idTutoria);
    }

    // Método auxiliar para obtener una tutoría existente por su ID
    private Tutoria obtenerTutoriaExistente(int idTutoria) {
        for (Tutoria tutoria : controladorTutorias.getTablaTutorias().obtenerTutorias()) {
            if (tutoria.getIdTutoria() == idTutoria) {
                return tutoria;
            }
        }
        return null;
    }
}

