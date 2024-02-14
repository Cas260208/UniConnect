package model.Modulo_SeguidoresSeguidos;

import model.Modulo_Autenticacion.Usuario;

public class Seguido {
    // Atributo
    private Usuario usuario;
    // Constructor
    public Seguido(Usuario usuario) {
        this.usuario = usuario;
    }

    public Seguido() {}

    // Getter
    public Usuario getUsuario() {
        return usuario;
    }

    // Setter
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //Metodo
    public void instancia_objeto() {
        // Código para instanciar objeto
    }
}
