/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniconnect_tutorias;

/**
 *
 * @author brizi
 */
public class Tutoria {
    private int idTutoria;
    private int idTutor;
    private int idAlumno;
    private int dias;
    private int hora;
    private String descripcion;
    private boolean disponible;
    private boolean confirmada;
    private String titulo;

    // Constructor
    public Tutoria(int idTutoria, int idTutor, int idAlumno, int dias, int hora, String descripcion, boolean disponible, boolean confirmada, String titulo) {
        this.idTutoria = idTutoria;
        this.idTutor = idTutor;
        this.idAlumno = idAlumno;
        this.dias = dias;
        this.hora = hora;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.confirmada = confirmada;
        this.titulo = titulo;
    }

    // Getters y setters
    public int getIdTutoria() {
        return idTutoria;
    }

    public void setIdTutoria(int idTutoria) {
        this.idTutoria = idTutoria;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }
    
    // Método toString
    @Override
    public String toString() {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String diaSemana = (dias >= 1 && dias <= 7) ? diasSemana[dias - 1] : "Día no válido";
        String disponibleStr = disponible ? "Disponible" : "No disponible";
        return "Título: " + titulo + "\n" +
                "Día: " + diaSemana + "\n" +
                "Hora: " + hora + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Disponible: " + disponibleStr;
    }
}

