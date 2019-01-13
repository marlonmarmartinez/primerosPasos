
package swing;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;


public class EvEstados {
    
       public static void main(String[] args) {
        MiM marco=new MiM();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MiM extends JFrame{

    public MiM() {
       
        setBounds(500,300,250,250);
        setTitle("mi ventana");
       CambiaEstado ces=new CambiaEstado();
       addWindowStateListener(ces);
    }
}
class CambiaEstado implements WindowStateListener{

   
    public void windowStateChanged(WindowEvent we) {
        System.out.println("la ventana ha cambiado de estado");
        //System.out.println(we.getNewState());
        if(we.getNewState()==6){
            System.out.println("pantalla completa");
        }else if(we.getNewState()==Frame.NORMAL){
            System.out.println("la pantalla esta normal");
        }else if(we.getNewState()==Frame.ICONIFIED){
            System.out.println("esta minimizada");
        }
    }
    
}