
package swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class EventosTeclado {
    
     public static void main(String[] args) {
        Teclado marco=new Teclado();
       
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Teclado extends JFrame{

    public Teclado() {
       
        setBounds(500,300,250,250);
        
      setVisible(true);
       EventoTeclado et=new EventoTeclado();
        addKeyListener(et);
    }
}
class EventoTeclado implements KeyListener{

   
    public void keyTyped(KeyEvent ke) {
       char tec=ke.getKeyChar();
        System.out.println(tec);
    }

    public void keyPressed(KeyEvent ke) {
      // int codigo=ke.getKeyCode();
       // System.out.println(codigo);
    }

    public void keyReleased(KeyEvent ke) {
       
    }
    
}