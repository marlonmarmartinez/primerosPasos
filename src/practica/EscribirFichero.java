
package practica;

import java.io.*;

public class EscribirFichero {
    
    public static void main(String[] args) {
        Escribiendo escri=new Escribiendo();
        escri.escribir();
    }
}
class Escribiendo{
    
    public void escribir(){
        String frase="esto es un prueba";
        try {
            FileWriter escritura=new FileWriter("C:/Users/Lnv/Desktop/escribir.txt",true);
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
                
            }
            escritura.close();
        } catch (IOException ex) {
            System.out.println("no se encontro la ruta");
        }
    }
}