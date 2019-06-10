package Lanzador;

import Controlador.Ordenador;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Ordenador orde = new Ordenador();
        System.out.println("Atributos originales");
        orde.mostrarDatos(orde.getMarcas_iniciales(), orde.getTamanosPantallas_iniciales());
        System.out.println();
        System.out.println("Ordenamiento con selección");
        String[] modelosSeleccion =orde.asignarCadenaPorLetra(orde.convertirNumerosEnLetras(orde.ordenamientoSeleccion(orde.convertirLetrasEnNumeros(orde.extraerPrimeraLetraMarcas(orde.getMarcas_iniciales())))));
        double [] pantallasSeleccion = orde.ordenamientoSeleccion(orde.getTamanosPantallas_iniciales());
        orde.mostrarDatos(modelosSeleccion, pantallasSeleccion);
        System.out.println();
        System.out.println("Ordenamiento con inserción");
        String[] modelosInsercion =orde.asignarCadenaPorLetra(orde.convertirNumerosEnLetras(orde.ordenamientoInsercion(orde.convertirLetrasEnNumeros(orde.extraerPrimeraLetraMarcas(orde.getMarcas_iniciales())))));
        double [] pantallasInsercion = orde.ordenamientoInsercion(orde.getTamanosPantallas_iniciales());
        orde.mostrarDatos(modelosInsercion, pantallasInsercion);
    }
}
