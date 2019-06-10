/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GestorArchivos.GestorCelulares;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Nadie
 */
public class testGestorCelulares {

    private GestorCelulares gestor;

    @Before
    public void setUp() {
        gestor = new GestorCelulares();
    }

    /*
    Se pone a prueba el método extraer datos con un archivo que no existe.
     */
    @Test
    public void testExtraerDatos() throws IOException {
        ArrayList<String[]> resultadoConseguido = gestor.extraerDatos("No existo.csv");
        ArrayList<String[]> resultadoEsperado = null;
        assertEquals(resultadoEsperado, resultadoConseguido);
    }
}
