
package swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;


public class FocusVentana extends JFrame implements WindowFocusListener{
    
    public static void main(String[] args) {
        FocusVentana nuevo=new FocusVentana();
        nuevo.iniciar();
    }

    public void iniciar(){
        marco1=new FocusVentana();
        marco2=new FocusVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(300, 100, 600, 350);
        marco2.setBounds(1200, 100, 600, 350);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
        
    }
    
    public void windowGainedFocus(WindowEvent we) {
        if(we.getSource()==marco1){
            marco1.setTitle("tengo el focus");
        }else{
            marco2.setTitle("tengo el focus");
        }
    }

    public void windowLostFocus(WindowEvent we) {
        if(we.getSource()==marco1){
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }
    }
    FocusVentana marco1;
    FocusVentana marco2;
}
