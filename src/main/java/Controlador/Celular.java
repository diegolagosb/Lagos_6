package Controlador;

public class Celular {

    private String modelo;
    private double tamanoPantalla;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanoPantalla() {
        return this.tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public Celular(String modelo, double tamanoPantalla) {
        this.modelo = modelo;
        this.tamanoPantalla = tamanoPantalla;
    }
}
