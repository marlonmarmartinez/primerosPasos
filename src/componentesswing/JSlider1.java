
package componentesswing;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class JSlider1 {
public static void main(String[] args) {
        
  
     MarcoSl marco1=new  MarcoSl();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoSl extends JFrame{
  
    public MarcoSl() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
      LamiSl la=new LamiSl();
      add(la);
    }
}
class LamiSl extends JPanel {

    public LamiSl() {
        JSlider control=new JSlider(0,100,50);
        control.setMajorTickSpacing(50);
        control.setMinorTickSpacing(25);
        control.setPaintTicks(true);
        control.setFont(new Font("Serif",Font.ITALIC,12));
        control.setPaintLabels(true);
        control.setSnapToTicks(true);
        add(control);
        
    }
}
