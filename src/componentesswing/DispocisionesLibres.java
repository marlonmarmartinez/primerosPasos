
package componentesswing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DispocisionesLibres {
public static void main(String[] args) {
        
  
     MarcoDL marco1=new  MarcoDL();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco1.setVisible(true);
    }
}
class MarcoDL extends JFrame{
  
    public MarcoDL() {
        setTitle("dispocisiones avanzadas");
      setBounds(500,300,1200,400); 
      LamiDL la=new LamiDL();
      add(la);
    }
}
class LamiDL extends JPanel {

    public  LamiDL() {
        setLayout(new EnColumnas());
        JLabel nombre =new JLabel("nombre ");
        JLabel apellido=new JLabel("apellido ");
        JLabel edad=new JLabel("edad ");
         JLabel tel=new JLabel("telefono ");
        JTextField tnombre=new JTextField();
        JTextField tapellido=new JTextField();
        JTextField tedad=new JTextField();
         JTextField ttel=new JTextField();
        
        add(nombre);
        add(tnombre);
         add(apellido);
        add(tapellido);
        add(edad);
        add(tedad);
        add(tel);
        add(ttel);
    }
}
class EnColumnas implements LayoutManager{

    public void addLayoutComponent(String string, Component cmpnt) {
        
    }

    public void removeLayoutComponent(Component cmpnt) {
        
    }

    
    public Dimension preferredLayoutSize(Container cntnr) {
        return null;
        
    }

   
    public Dimension minimumLayoutSize(Container cntnr) {
        return null;
      
    }

   
    public void layoutContainer(Container micon) {
        int d=micon.getWidth();
        x=d/2;
      int contador=0;
      int n=micon.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;
            Component c=micon.getComponent(i);
            c.setBounds(x-100, y, 100, 20);
            x+=100;
            if(contador%2==0){
                x=d/2;
                y+=40;
            }
        }
    }
    private int x=20,y=20;
}