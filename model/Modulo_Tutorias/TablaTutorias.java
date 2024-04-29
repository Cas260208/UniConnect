/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniconnect_tutorias;

/**
 *
 * @author brizi
 */
import java.io.*;
import java.util.ArrayList;

public class TablaTutorias {
    private ArrayList<Tutoria> tutorias;

    public TablaTutorias() {
        tutorias = new ArrayList<>();
    }

    // Método para agregar una tutoría
    public void agregarTutoria(Tutoria tutoria) {
        tutorias.add(tutoria);
    }

    // Método para eliminar una tutoría por su ID
    public void eliminarTutoriaPorId(int idTutoria) {
        Tutoria tutoriaAEliminar = null;
        for (Tutoria tutoria : tutorias) {
            if (tutoria.getIdTutoria() == idTutoria) {
                tutoriaAEliminar = tutoria;
                break;
            }
        }
        if (tutoriaAEliminar != null) {
            tutorias.remove(tutoriaAEliminar);
            System.out.println("Tutoría eliminada correctamente.");
        } else {
            System.out.println("No se encontró ninguna tutoría con el ID especificado.");
        }
    }

    // Método para obtener todas las tutorías
    public ArrayList<Tutoria> obtenerTutorias() {
        return tutorias;
    }

    // Método para cargar las tutorías desde un archivo
    public void cargarTutoriasDesdeArchivo(String nombreArchivo) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            tutorias = (ArrayList<Tutoria>) entrada.readObject();
            System.out.println("Tutorías cargadas desde el archivo correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar las tutorías desde el archivo: " + e.getMessage());
        }
    }

    // Método para guardar las tutorías en un archivo
    public void guardarTutoriasEnArchivo(String nombreArchivo) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeObject(tutorias);
            System.out.println("Tutorías guardadas en el archivo correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar las tutorías en el archivo: " + e.getMessage());
        }
    }
}
