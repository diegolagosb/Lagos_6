package Controlador;

import java.io.IOException;

public final class Ordenador {

    private String[] marcas_iniciales;
    private double[] tamaniosPantallas_iniciales;

    public Ordenador() throws IOException {
        AdministradorCelulares adm = new AdministradorCelulares();
        asignarMarcas_iniciales(adm);
        asignarTamPant_iniciales(adm);
    }

    /*
    Extrae y almacena solo las marcas de los celulares almacenados en otro objeto.
    @param Objeto usado para acceder a los celulares creados. (AdministradorCelulares)
    @return void.
     */
    public void asignarMarcas_iniciales(AdministradorCelulares adm) {
        marcas_iniciales = new String[adm.getCelulares().size()];
        for (int i = 0; i < adm.getCelulares().size(); i++) {
            marcas_iniciales[i] = adm.getCelulares().get(i).getModelo();
        }
    }

    /*
    Extrae y almacena solo los tamaños de pantalla de los celulares almacenados en otro objeto.
    @param Objeto usado para acceder a los celulares creados. (AdministradorCelulares)
    @return void.
     */
    public void asignarTamPant_iniciales(AdministradorCelulares adm) {
        tamaniosPantallas_iniciales = new double[adm.getCelulares().size()];
        for (int i = 0; i < adm.getCelulares().size(); i++) {
            tamaniosPantallas_iniciales[i] = adm.getCelulares().get(i).getTamanioPantalla();
        }
    }

    /*
    Ordena un arreglo de números de menor a mayor basándose en el algoritmo sort selection.
    @param Arreglo de números a ordenar. (double[])
    @return Arreglo de números ya ordenados. (double[])
     */
    public double[] ordenamientoSeleccion(double[] arreglo) {
        if (arreglo != null) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                int minimo = i;
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] < arreglo[minimo]) {
                        minimo = j;
                    }
                }
                double aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
            return arreglo;
        } else {
            double[] arregloMalo = new double[]{-1, 0};
            return arregloMalo;
        }
    }

    /*
    Convierte un conjunto de letras en número, siendo los números la posición que usan las letras en el abecedario.
    @param Conjunto de letras a convertir. (char[])
    @return Conjunto de números. (double[])
     */
    public double[] convertirLetrasEnNumeros(char[] letras) {
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        double[] numDeCaracteres = new double[letras.length];
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if (letras[i] == alfabeto.charAt(j)) {
                    numDeCaracteres[i] = j;
                }
            }
        }
        return numDeCaracteres;
    }

    /*
    Extrae y retorna en el mismo orden las primeras letras de un conjunto de cadenas.
    @param Conjunto de cadenas. (String[])
    @return Conjunto de letras. (char[])
     */
    public char[] extraerPrimeraLetraMarcas(String[] cadenas) {
        try {
            char[] letras = new char[cadenas.length];
            for (int i = 0; i < cadenas.length; i++) {
                letras[i] = cadenas[i].charAt(0);
            }
            return letras;
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("Introduzca un grupo de cadenas existentes por favor");
            char[] arregloMalo = new char[]{'n'};
            return arregloMalo;
        }
    }

    public String[] getMarcas_iniciales() {
        return this.marcas_iniciales;
    }

    public void setMarcas_iniciales(String[] marcas_iniciales) {
        this.marcas_iniciales = marcas_iniciales;
    }

    public double[] getTamanosPantallas_iniciales() {
        return this.tamaniosPantallas_iniciales;
    }

    public void setTamanosPantallas_iniciales(double[] tamanosPantallas_iniciales) {
        this.tamaniosPantallas_iniciales = tamanosPantallas_iniciales;
    }

    /*
    Ordena un arreglo de números de menor a mayor basándose en el algoritmo sort insertion.
    @param Arreglo de números a ordenar. (double[])
    @return Arreglo de números ya ordenados. (double[])
     */
    public double[] ordenamientoInsercion(double[] arreglo) {
        if (arreglo != null) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (arreglo[j] > arreglo[i + 1]) {
                        double aux = arreglo[j];
                        arreglo[j] = arreglo[i + 1];
                        arreglo[i + 1] = aux;
                    }
                }
            }
            return arreglo;
        } else {
            double[] arregloMalo = new double[]{-1, 0};
            return arregloMalo;
        }
    }

    /*
    Convierte números en letras basándose en la posición que usan estos en el alfabeto.
    @param Arreglo de números a convertir. (double[])
    @return Arreglo de letras correspondientes a casa número. (char[])
     */
    public char[] convertirNumerosEnLetras(double[] arreglo) {
        try {
            String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            char[] letras = new char[arreglo.length];
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < alfabeto.length(); j++) {
                    if (arreglo[i] == j) {
                        letras[i] = alfabeto.charAt(j);
                    }
                }
            }
            return letras;
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("Introduzca un grupo de cadenas existentes por favor");
            char[] arregloMalo = new char[]{'n'};
            return arregloMalo;
        }
    }

    /*
    Le asigna una palabra de las que se encuentran almacenadas en el objeto a cada letra y las retorna.
    @param conjunto de letras. (char [])
    @return palabras ya asignadas. (String [])
     */
    public String[] asignarCadenaPorLetra(char[] letras) {
        String[] nuevasCadenas = new String[letras.length];
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < marcas_iniciales.length; j++) {
                if (letras[i] == marcas_iniciales[j].charAt(0)) {
                    nuevasCadenas[i] = marcas_iniciales[j];
                }
            }
        }
        return nuevasCadenas;
    }

    /*
    Muestra por consola los arreglos ingresados como parámetros.
    @param Arraglo de cadenas (String[]), Arreglo de números (double[]).
    @return void.
     */
    public void mostrarDatos(String[] marcas, double[] tamanoPantalla) {
        System.out.println("Marcas:");
        for (int i = 0; i < marcas.length; i++) {
            System.out.print(marcas[i] + " ");
        }
        System.out.println();
        System.out.println("Tamaño pantallas");
        for (int i = 0; i < tamanoPantalla.length; i++) {
            System.out.print(tamanoPantalla[i] + " ");
        }
    }
}
