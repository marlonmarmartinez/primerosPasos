
package swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class Eventosventana {
    
    public static void main(String[] args) {
        Evenven d=new Evenven();
        
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Evenven marco=new Evenven();
        marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       d.setTitle("eventos");
       marco.setTitle("eventos1");
       marco.setLocation(200, 200);
    }
}
class Evenven extends JFrame{

    public Evenven() {
        
        setSize(400, 400);
        setVisible(true);
        Lamiven ven=new Lamiven();
        addWindowListener(ven);
        
    }
    
}
class Lamiven implements WindowListener {//windowadapter

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("ventana desactivada");
    }
    
}
    