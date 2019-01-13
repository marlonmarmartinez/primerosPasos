
package primerospasos;

import javax.swing.*;


public class UsobubleFor {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 2; i++) {
            System.out.println("marlon");
            
        }
        int arrabo=0;
        boolean punto=false;
        String mail=JOptionPane.showInputDialog("introduce mail");
        
        for (int i = 0; i < mail.length(); i++) {
           if(mail.charAt(i)=='@'){
               arrabo++;
           }
           if(mail.charAt(i)=='.'){
               punto=true;
           }
           if(arrabo==1 && punto==true){
               System.out.println("es correcto");
           }else{
               System.out.println("no es correcto");
           }
            
        }
        System.out.println("");
        long resultado=1l;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
        
        for (int i = 0; i>0; i--) {
           resultado=resultado*i;
            
        }
        System.out.println("el factorial del numero es "+resultado);
    }
}
