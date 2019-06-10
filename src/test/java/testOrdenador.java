/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.Ordenador;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Nadie
 */
public class testOrdenador {

    private Ordenador ord;

    @Before
    public void setUp() throws IOException {
        ord = new Ordenador();
    }

    /*
    Se pone a prueba el ordenamiento por selección con algunos elementos del arreglo iguales.
     */
    @Test
    public void testSeleccion() {
        double[] arreglo = new double[]{2.0, 1.0, 4.0, 3.0, 5.0, 3.0};
        double[] resultadoConseguido = ord.ordenamientoSeleccion(arreglo);
        double[] resultadoEsperado = new double[]{1.0, 2.0, 3.0, 3.0, 4.0, 5.0};
        assertTrue(Arrays.equals(resultadoEsperado, resultadoConseguido));
    }

    /*
    Se le pide al ordenamiento por selección que ordene un arreglo vacío.
     */
    @Test
    public void testSeleccion2() {
        double[] arreglo = null;
        double[] resultadoConseguido = ord.ordenamientoSeleccion(arreglo);
        double[] resultadoEsperado = new double[]{-1, 0};
        assertTrue(Arrays.equals(resultadoEsperado, resultadoConseguido));
    }

    /*
    Se pone a prueba el ordenamiento por insercion con algunos elementos del arreglo iguales y otros negativos.
     */
    @Test
    public void testInsercion() {
        double[] arreglo = new double[]{1.0, 1.0, 4.0, 4.0, -1.0};
        double[] resultadoConseguido = ord.ordenamientoInsercion(arreglo);
        double[] resultadoEsperado = new double[]{-1.0, 1.0, 1.0, 4.0, 4.0};
        assertTrue(Arrays.equals(resultadoEsperado, resultadoConseguido));
    }

    /*
    Se le pide al ordenamiento por inserción que ordene un arreglo vacío.
     */
    @Test
    public void testInsercion2() {
        double[] arreglo = null;
        double[] resultadoConseguido = ord.ordenamientoInsercion(arreglo);
        double[] resultadoEsperado = new double[]{-1, 0};
        assertTrue(Arrays.equals(resultadoEsperado, resultadoConseguido));
    }

    /*
    Se trata de extraer las primeras letras de un arreglo de cadenas vacío.
     */
    @Test
    public void testExtraerPrimeraLetraMarcas() {
        String[] cadenas = null;
        char[] resultadoConseguido = ord.extraerPrimeraLetraMarcas(cadenas);
        char[] resultadoEsperado = new char[]{'n'};
        assertTrue(Arrays.equals(resultadoEsperado, resultadoConseguido));
    }

    /*
    Se trata de convertir a letras un conjunto de números vacío.
     */
    @Test
    public void testConvertirNumerosEnLetras() {
        double[] arregloNumeros = null;
        char[] resultadoConseguido = ord.convertirNumerosEnLetras(arregloNumeros);
        char[] resultadoEsperado = new char[]{'n'};
        assertTrue(Arrays.equals(resultadoEsperado, resultadoConseguido));
    }
}
