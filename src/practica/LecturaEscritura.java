
package practica;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaEscritura {
    
    public static void main(String[] args) {
        int contador=0;
        int []datosentrada=new int[74130];
        try {
            FileInputStream archivolectura=new FileInputStream("C:/Users/Lnv/Desktop/imagen.jpg");
            boolean finalr=false;
            while(!finalr){
                int byteentrada=archivolectura.read();
                if(byteentrada!=-1){
                    datosentrada[contador]=byteentrada;
                }
                else{
                    finalr=true;
                    System.out.println(datosentrada[contador]);
                    contador++;
                }
            }
            archivolectura.close();
        } catch (IOException ex) {
            System.out.println("error al leer la imagen");
        }
        System.out.println(contador);
        creaFichero(datosentrada);
    }
    static void creaFichero(int [] datosnuevofichero){
        try {
            FileOutputStream ficheronuevo=new FileOutputStream("C:/Users/Lnv/Desktop/imagencopia.jpg");
            for (int i = 0; i < datosnuevofichero.length; i++) {
                ficheronuevo.write(datosnuevofichero[i]);
                
            }
            ficheronuevo.close();
        } catch (IOException ex) {
            System.out.println("error al crear la imagen");
        }
    }
}
