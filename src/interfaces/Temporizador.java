
package interfaces;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class Temporizador {
    
    public static void main(String[] args) {
        
        Reloj mire=new Reloj();
        mire.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
        System.exit(0);
    }
}
class Reloj{

   /* public Reloj(int intervalo,boolean sonido) {
        this.intervalo=intervalo;
        this.sonido=sonido;
    }*/
    public void enMarcha(int intervalo,final boolean sonido){
       
        class DameLaHora implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
            Date ahora=new Date();
            System.out.println("te pongo la hora cada 3 seg "+ahora);
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
    }
        ActionListener oyente=new DameLaHora();
        Timer mitem=new Timer(intervalo,oyente);
        mitem.start();
    }
    
    
    
   /* private int intervalo;
    private boolean sonido;*/
}