
package primerospasos;
import javax.swing.*;

public class EntradaDatos {
    
    public static void main(String[] args) {
        String nom=JOptionPane.showInputDialog("introduce tu nombre"); 
        String edad=JOptionPane.showInputDialog("introduce la edad");
        int edadu=Integer.parseInt(edad);
        System.out.println("hola "+nom+" tienes "+(edadu+1)+" años");
        System.out.println("");
        double x=10000;
        System.out.printf("%1.2f",x/3);
        System.out.println("");
        String num1=JOptionPane.showInputDialog("introduce un numero ");
        double num2=Double.parseDouble(num1);
        System.out.print("la raiz de "+num2+" es");
        System.out.printf("%1.2f",Math.sqrt(num2));
    }
}
