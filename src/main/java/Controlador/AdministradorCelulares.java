package Controlador;

import java.util.ArrayList;
import GestorArchivos.GestorCelulares;
import java.io.IOException;

public final class AdministradorCelulares {

    private ArrayList<Celular> celulares = new ArrayList<>();

    /*
    Crear una cantidad de celulares según los datos obtenidos de un archivo por otra clase.
    @param Objeto para ser usado. (GestorCelulares)
    @return void
     */
    public void crearCelulares(GestorCelulares gestor) throws IOException {
        ArrayList<String[]> datos = gestor.extraerDatos("src\\main\\java\\Archivos\\celulares.csv");
        for (int i = 0; i < datos.size(); i++) {
            celulares.add(new Celular(datos.get(i)[0], Double.parseDouble(datos.get(i)[1])));
        }
    }

    public AdministradorCelulares() throws IOException {
        GestorCelulares gestor = new GestorCelulares();
        crearCelulares(gestor);
    }

    public ArrayList<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(ArrayList<Celular> celulares) {
        this.celulares = celulares;
    }

}
