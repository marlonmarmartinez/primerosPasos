
package interfaces;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class PruebaTemporizador {
    
    public static void main(String[] args) {
        DameHora oyente=new DameHora();
        Timer mitemporizador=new Timer(5000, oyente);
        mitemporizador.start();
        JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
        System.exit(0);
    }
}
class DameHora implements ActionListener{

    public void actionPerformed(ActionEvent ae) {
        Date ahora=new Date();
        System.out.println("te pongo la hora cada 5 seg "+ahora);
        Toolkit.getDefaultToolkit().beep();
    }
    
}