
package practica;

import javax.swing.JOptionPane;


public class Excepciones1 {
    
    public static void main(String[] args) {
        int []matriz=new int[3];
        matriz[0]=2;
         matriz[1]=4;
          matriz[2]=6;
          for (int i = 0; i < matriz.length; i++) {
              System.out.println("mi matriz "+i+" "+matriz[i]);
            
        }
          String nombre=JOptionPane.showInputDialog("introduce nombre");
          int edad=Integer.parseInt(JOptionPane.showInputDialog("introduce la edad"));
          System.out.println("el nombre es "+nombre+" y tiene "+edad+" años");
    }
}
