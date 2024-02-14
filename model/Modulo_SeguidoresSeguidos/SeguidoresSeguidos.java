package model.Modulo_SeguidoresSeguidos;

public class SeguidoresSeguidos {
    private Seguido seguidos;
    private Seguidor seguidores;

    // Constructor
    public SeguidoresSeguidos(Seguido seguidos, Seguidor seguidores) {
        this.seguidos = seguidos;
        this.seguidores = seguidores;
    }

    public SeguidoresSeguidos() {}

    // Getters
    public Seguido getSeguidos() {
        return seguidos;
    }

    public Seguidor getSeguidores() {
        return seguidores;
    }

    // Setters
    public void setSeguidos(Seguido seguidos) {
        this.seguidos = seguidos;
    }

    public void setSeguidores(Seguidor seguidores) {
        this.seguidores = seguidores;
    }
    public void elimina_seguidor() {
        // Código para eliminar seguidor
    }

    public void bloquea_seguidor() {
        // Código para bloquear seguidor
    }
}
