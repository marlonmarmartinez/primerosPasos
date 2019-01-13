
package practica;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecuenciasStreams {
    
    public static void main(String[] args) {
        LeerFiechero acceso=new LeerFiechero();
        acceso.lee();
    }
}
class LeerFiechero{
    
    public void lee(){
        try {
            entrada=new FileReader("C:/Users/Lnv/Desktop/accesofichero.txt");
            BufferedReader bu=new BufferedReader(entrada);
            String linea="";
            while(linea!=null){
                linea=bu.readLine();
                if(linea!=null)
                System.out.println(linea);
            }
            //entrada.close();
        } catch (IOException ex) {
            System.out.println("no se encontro el archivo");
        }finally{
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerFiechero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private  FileReader entrada;
}