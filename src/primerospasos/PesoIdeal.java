
package primerospasos;

import javax.swing.*;
public class PesoIdeal {
    
    public static void main(String[] args) {
        String genero="";
        
        do{
            genero=JOptionPane.showInputDialog("introduce tu genero (h/m)");
        }while(genero.equalsIgnoreCase("h")==false && genero.equalsIgnoreCase("m")==false);
        
        int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm"));
        int pesoideal=0;
        if(genero.equalsIgnoreCase("h")){
            pesoideal=altura-110;
        }
        else if(genero.equalsIgnoreCase("m")){
            pesoideal=altura-120;
        }
        System.out.println("el peso ideal es "+pesoideal+" kg");
    }
}
