package model.Modulo_Perfil;

public class Perfil {
    private String usuario;
    private int num_seguidores;
    private Cuenta cuenta;

     // Constructor
     public Perfil(String usuario, int num_seguidores, Cuenta cuenta) {
        this.usuario = usuario;
        this.num_seguidores = num_seguidores;
        this.cuenta = cuenta;
    }

    public Perfil() {}

    // Getters and Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNum_seguidores() {
        return num_seguidores;
    }

    public void setNum_seguidores(int num_seguidores) {
        this.num_seguidores = num_seguidores;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    // Metodos
    public String get_usuario() {
        return usuario;
    }

    public void set_usuario(String usuario) {
        this.usuario = usuario;
    }

    public int get_seguidores() {
        return num_seguidores;
    }

    public void set_seguidores(int num_seguidores) {
        this.num_seguidores = num_seguidores;
    }
}
