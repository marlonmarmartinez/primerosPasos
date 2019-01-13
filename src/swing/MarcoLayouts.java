
package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoLayouts {
    
    public static void main(String[] args) {
        LA marco=new LA();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class LA extends JFrame{
  
    public LA() {
      setTitle("prueba");
      setBounds(500,300,500,250);  
     
      LamiLA la=new LamiLA();
      LamiLA2 la2=new LamiLA2();
      add(la,BorderLayout.NORTH);
      add(la2,BorderLayout.SOUTH);
    }
}
class LamiLA extends JPanel {

    public LamiLA() {
        //setLayout(new FlowLayout(FlowLayout.CENTER,70,90));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("amarillo"));
        add(new JButton("azul"));
        
    }
}
class LamiLA2 extends JPanel{

    public LamiLA2() {
        setLayout(new BorderLayout());
        add(new JButton("rojo"),BorderLayout.WEST);
        add(new JButton("verde"),BorderLayout.EAST);
        add(new JButton("negro"),BorderLayout.CENTER);
    }
    
}