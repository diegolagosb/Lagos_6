package Controlador;

public class Celular {

    private String modelo;
    private double tamanioPantalla;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanioPantalla() {
        return this.tamanioPantalla;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public Celular(String modelo, double tamanioPantalla) {
        this.modelo = modelo;
        this.tamanioPantalla = tamanioPantalla;
    }
}
