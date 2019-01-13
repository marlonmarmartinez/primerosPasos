
package componentesswing;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;


public class JSpinner1 {
 public static void main(String[] args) {
        
  
     MarcoSP marco1=new  MarcoSP();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoSP extends JFrame{
  
    public MarcoSP() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
     
      add(new LamiSP());
    }
}
class LamiSP extends JPanel {

    public LamiSP() {
        //String[] lista=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1){
            public Object getPreviousValue(){
                return super.getNextValue();
            }
            public Object getNextValue(){
                return super.getPreviousValue();
            }
        });
        Dimension d=new Dimension(50,20);
        control.setPreferredSize(d);
        add(control);
        
    }
   
}
