package Modelo.Modulo_Autenticacion;

public class FechaNac {
    private int dia;
    private String mes; 
    private int anio;

    public FechaNac(int dia, String mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public FechaNac() {}

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }
}
