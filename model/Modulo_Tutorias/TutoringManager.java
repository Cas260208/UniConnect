/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniconnect_tutorias;

/**
 *
 * @author brizi
 */
public class TutoringManager {
    private TablaTutorias tablaTutorias;

    public TutoringManager(TablaTutorias tablaTutorias) {
        this.tablaTutorias = tablaTutorias;
    }

    // Método para publicar una nueva tutoría
    public void publicarTutoria(Tutoria tutoria) {
        tablaTutorias.agregarTutoria(tutoria);
    }

    // Método para eliminar una tutoría por su ID
    public void eliminarTutoria(int idTutoria) {
        tablaTutorias.eliminarTutoriaPorId(idTutoria);
    }

    // Método para modificar una tutoría por su ID
    public void modificarTutoria(int idTutoria, Tutoria nuevaTutoria) {
        eliminarTutoria(idTutoria); // Eliminar la tutoría existente con el ID especificado
        tablaTutorias.agregarTutoria(nuevaTutoria); // Agregar la nueva tutoría con los datos actualizados
    }
}

