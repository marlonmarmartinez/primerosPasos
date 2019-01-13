
package practica;

import java.io.File;


public class CreandoDirectorio {
    
    public static void main(String[] args) {
        File ruta=new File("D:/nuevo");
        ruta.mkdir();
        //ruta.createNewFile();
    }
}
