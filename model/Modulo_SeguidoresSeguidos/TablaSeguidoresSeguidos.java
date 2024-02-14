package model.Modulo_SeguidoresSeguidos;

public class TablaSeguidoresSeguidos {
    private Seguidor seguidores;
    private SeguidoresSeguidos seguidor_seguidores;

    // Constructor
    public TablaSeguidoresSeguidos(Seguidor seguidores, SeguidoresSeguidos seguidor_seguidores) {
        this.seguidores = seguidores;
        this.seguidor_seguidores = seguidor_seguidores;
    }

    public TablaSeguidoresSeguidos() {}

    // Getters
    public Seguidor getSeguidores() {
        return seguidores;
    }

    public SeguidoresSeguidos getSeguidor_seguidores() {
        return seguidor_seguidores;
    }

    // Setters
    public void setSeguidores(Seguidor seguidores) {
        this.seguidores = seguidores;
    }

    public void setSeguidor_seguidores(SeguidoresSeguidos seguidor_seguidores) {
        this.seguidor_seguidores = seguidor_seguidores;
    }

    // Metodos
    public void busca_seguidor() {
        // Código para buscar seguidor
    }

    public void busca_seguido() {
        // Código para buscar seguido
    }
}
