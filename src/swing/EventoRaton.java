
package swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;


public class EventoRaton {
    
    public static void main(String[] args) {
        Raton marco=new Raton();
       
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Raton extends JFrame{

    public Raton() {
       
      setBounds(500,300,250,250);  
      setVisible(true);
       EvenRaton er=new EvenRaton();
        addMouseListener(er);
        ev e=new ev();
        addMouseMotionListener(e);
    }
}
class EvenRaton implements MouseListener{//extends MouseAdapter

  
    public void mouseClicked(MouseEvent me) {
        System.out.println("has hecho click");
        System.out.println("coordenada x "+me.getX()+" coordenada y "+me.getY());
        System.out.println(me.getClickCount());
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("has presionado ");
        //System.out.println(me.getModifiersEx());
        if(me.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("has pulsado el boton izquierdo");
        }else if(me.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("has pulsado la rueda del raton");
        }else if(me.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("has pulsado el boton derecho");
        }
    }

   
    public void mouseReleased(MouseEvent me) {
        System.out.println("has levantado el raton");
    }

   
    public void mouseEntered(MouseEvent me) {
        System.out.println("acabas de entrar");
    }

   
    public void mouseExited(MouseEvent me) {
        System.out.println("acabas de salir");
    }
    
}
class ev implements MouseMotionListener{

   
    public void mouseDragged(MouseEvent me) {
        System.out.println("estas arrastrando el raton");
    }

    
    public void mouseMoved(MouseEvent me) {
        System.out.println("estas moviendo el raton");
    }
    
}