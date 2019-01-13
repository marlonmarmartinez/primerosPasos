
package componentesswing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ComboBox1 {
    public static void main(String[] args) {
        
  
     MarcoCombo marco1=new  MarcoCombo();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoCombo extends JFrame{
  
    public MarcoCombo() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
      LamiCombo la=new LamiCombo();
      add(la);
    }
}
class LamiCombo extends JPanel {

    public LamiCombo() {
        setLayout(new BorderLayout());
        texto=new JLabel("sssssssss");
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        add(texto,BorderLayout.CENTER);
        JPanel laminan=new JPanel();
        combo=new JComboBox();
        combo.setEditable(true);
        combo.addItem("Serif");
        combo.addItem("SansSerif");
        combo.addItem("Monospaced");
        combo.addItem("Dialog");
        EventoCombo e=new EventoCombo();
        combo.addActionListener(e);
        laminan.add(combo);
        add(laminan,BorderLayout.NORTH);
        
    }
    private class EventoCombo implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
           texto.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,18));
           
        }
        
    }
   private  JLabel texto;
   private JComboBox combo;
}
