
package componentesswing;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSlider2 {
public static void main(String[] args) {
        
  
     MarcoS2 marco1=new  MarcoS2();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoS2 extends JFrame{
  
    public MarcoS2() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
      LamiS2 la=new LamiS2();
      add(la);
    }
}
class LamiS2 extends JPanel {

    public LamiS2() {
        setLayout(new BorderLayout());
        rotulo=new JLabel();
        add(rotulo,BorderLayout.CENTER);
        control=new JSlider(8,50,2);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif",Font.ITALIC,10));
        control.addChangeListener(new EventoSL());
        JPanel laminas=new JPanel();
        laminas.add(control);
        add(laminas,BorderLayout.NORTH);
        
        
    }
    private class EventoSL implements ChangeListener{

        public void stateChanged(ChangeEvent ce) {
           // contador++;
            //System.out.println("estas manipulando el deslizador "+control.getValue());
            rotulo.setFont(new Font("Serif",Font.PLAIN,control.getValue()));
        }
        
    }
    private JLabel rotulo;
    private JSlider control;
    private static int contador;
}
