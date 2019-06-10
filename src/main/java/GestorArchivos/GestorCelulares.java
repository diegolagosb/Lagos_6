package GestorArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorCelulares {

    /*
    Se encarga de leer un archivo excell y retornar sus datos.
    @param La ubicación del archivo a leer. (String)
    @return Los datos del archivo leído. (ArrayList<String[]>)
     */
    public ArrayList<String[]> extraerDatos(String ubicacionTexto) throws FileNotFoundException, IOException {
        File f = new File(ubicacionTexto);
        if (f.exists()) {
            ArrayList<String[]> datos = new ArrayList<String[]>();
            String linea;
            FileReader fr = new FileReader(ubicacionTexto);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            while ((linea = br.readLine()) != null) {
                datos.add(linea.split(";"));
            }
            return datos;
        } else {
            return null;
        }
    }
}
