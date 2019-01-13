
package swing;

import java.awt.Frame;
import javax.swing.*;

public class CreandoMarco {
    
    public static void main(String[] args) {
        MiMarco marco=new MiMarco();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MiMarco extends JFrame{

    public MiMarco() {
        //setSize(500, 300);
        //setLocation(500, 300);
        setBounds(500,300,250,250);
        setResizable(false);
        setTitle("mi ventana");
        //setExtendedState(Frame.MAXIMIZED_BOTH);
    }
    
}