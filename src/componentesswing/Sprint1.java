
package componentesswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Sprint1 {
public static void main(String[] args) {
        
  
     MarcoSPR marco1=new  MarcoSPR();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco1.setVisible(true);
    }
}
class MarcoSPR extends JFrame{
  
    public MarcoSPR() {
        setTitle("dispocisiones avanzadas");
      setBounds(500,300,500,300); 
      LamiSPR la=new LamiSPR();
      add(la);
    }
}
class LamiSPR extends JPanel {

    public  LamiSPR() {
        JButton boton1=new JButton("boton 1");
         JButton boton2=new JButton("boton 2");
          JButton boton3=new JButton("boton 3");
          SpringLayout milayo=new SpringLayout();
          setLayout(milayo);
          add(boton1);
          add(boton2);
          add(boton3);
          
          Spring mimuelle=Spring.constant(0,10,100);
          Spring muellerigido=Spring.constant(10);
          milayo.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
          milayo.putConstraint(SpringLayout.WEST, boton2, muellerigido, SpringLayout.EAST, boton1);
          milayo.putConstraint(SpringLayout.WEST, boton3, muellerigido, SpringLayout.EAST, boton2);
          milayo.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
          
    }
}