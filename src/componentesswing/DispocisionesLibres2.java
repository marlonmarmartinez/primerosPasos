
package componentesswing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DispocisionesLibres2 {
public static void main(String[] args) {
        
  
     MarcoDL2 marco1=new  MarcoDL2();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco1.setVisible(true);
    }
}
class MarcoDL2 extends JFrame{
  
    public MarcoDL2() {
        setTitle("dispocisiones avanzadas");
      setBounds(500,300,500,300); 
      LamiDL2 la=new LamiDL2();
      add(la);
    }
}
class LamiDL2 extends JPanel {

    public  LamiDL2() {
        setLayout(null);
        
    }
}