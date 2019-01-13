
package practica;
import java.io.*;

public class PruebaRutas {
    
    public static void main(String[] args) {
        
        File archivo=new File("ejemplo");
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.exists());
        
        File ruta=new File("D:/CURSOJAVA");
        System.out.println(ruta.getAbsolutePath());
       
        String[]nombres=ruta.list();
        for (String nombre : nombres) {
            System.out.println(nombre);
            File f=new File(ruta.getAbsolutePath(),nombre);
            if(f.isDirectory()){
                String[] archivossubcarpeta=f.list();
                for (String archivossubcarpeta1 : archivossubcarpeta) {
                    System.out.println(archivossubcarpeta1);
                }
            }
        }
    }
}
