package model.Modulo_SeguidoresSeguidos;

import model.Modulo_Perfil.Perfil;

public class GestorSeguidoresSeguidos {
    private Perfil perfil_seguidor_seguidores;
    private SeguidoresSeguidos seguidores_seguidor_seguidores;

    // Constructor
    public GestorSeguidoresSeguidos(Perfil perfil_seguidor_seguidores, SeguidoresSeguidos seguidores_seguidor_seguidores) {
        this.perfil_seguidor_seguidores = perfil_seguidor_seguidores;
        this.seguidores_seguidor_seguidores = seguidores_seguidor_seguidores;
    }

    // Getters
    public Perfil getPerfil_seguidor_seguidores() {
        return perfil_seguidor_seguidores;
    }

    public SeguidoresSeguidos getSeguidores_seguidor_seguidores() {
        return seguidores_seguidor_seguidores;
    }

    // Setters
    public void setPerfil_seguidor_seguidores(Perfil perfil_seguidor_seguidores) {
        this.perfil_seguidor_seguidores = perfil_seguidor_seguidores;
    }

    public void setSeguidores_seguidor_seguidores(SeguidoresSeguidos seguidores_seguidor_seguidores) {
        this.seguidores_seguidor_seguidores = seguidores_seguidor_seguidores;
    }

    public void recibe_datos() {
        // Código para recibir datos
    }

    public void regresa_perfil() {
        // Código para regresar perfil
    }

    public void noti_eliminacion() {
        // Código para notificar eliminación
    }

    public void muestra_actualizacion() {
        // Código para mostrar actualización
    }

    public void noti_bloqueo() {
        // Código para notificar bloqueo
    }
}
