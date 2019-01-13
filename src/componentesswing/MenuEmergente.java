
package componentesswing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MenuEmergente {
    
public static void main(String[] args) {
        
  
     MarcoMenuE marco1=new  MarcoMenuE();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoMenuE extends JFrame{
  
    public MarcoMenuE() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
     
      add(new  LamiMenuE());
    }
}
class LamiMenuE extends JPanel {

    public  LamiMenuE() {
        
        
        JPopupMenu emergente=new JPopupMenu();
        JMenuItem opc1=new JMenuItem("opcion 1");
         JMenuItem opc2=new JMenuItem("opcion 2");
          JMenuItem opc3=new JMenuItem("opcion 3");
        emergente.add(opc1);
        emergente.add(opc2);
        emergente.add(opc3);
        setComponentPopupMenu(emergente);
        
        
    }
}