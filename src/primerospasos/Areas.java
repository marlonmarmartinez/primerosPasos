
package primerospasos;

import javax.swing.*;
import java.util.*;
public class Areas {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: cuadrado \n2: rectangulo \n3: triangulo \n4: circulo");
        int op=entrada.nextInt();
        
        switch(op){
            case 1: int lado=Integer.parseInt(JOptionPane.showInputDialog("introduce el lado "));
                System.out.println("el area del cuadrado es "+Math.pow(lado, 2));break;
            
            case 2: int base=Integer.parseInt(JOptionPane.showInputDialog("introduzca la base "));
                    int altura=Integer.parseInt(JOptionPane.showInputDialog("introduzca la altura "));
                System.out.println("el area del rectangulo es "+base*altura);break;
            
            case 3:base=Integer.parseInt(JOptionPane.showInputDialog("introduzca la base "));
                   altura=Integer.parseInt(JOptionPane.showInputDialog("introduzca la altura "));
                 System.out.println("el area del rectangulo es "+(base*altura)/2);break;
            
            case 4: int radio=Integer.parseInt(JOptionPane.showInputDialog("introduzca el radio "));
                System.out.print("el area del circulo es ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));break;
            
            default: System.out.println("la opcion no se encuentra eliga otra");
        }
    }
}
