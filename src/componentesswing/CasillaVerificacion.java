
package componentesswing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CasillaVerificacion {
    
     public static void main(String[] args) {
        MarcoCasilla marco=new MarcoCasilla();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoCasilla extends JFrame{
  
    public MarcoCasilla() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
      LamiC la=new LamiC();
      add(la);
    }
}
class LamiC extends JPanel {

    public LamiC() {
        setLayout(new BorderLayout());
        Font letra=new Font("Serif",Font.PLAIN,24);
        texto=new JLabel("fffffffff");
        texto.setFont(letra);
        JPanel laminatex=new JPanel();
        laminatex.add(texto);
        add(laminatex,BorderLayout.CENTER);
        che1=new JCheckBox("Negrita");
        che2=new JCheckBox("Cursiva");
        
        che1.addActionListener(new ManejaChe());
        che2.addActionListener(new ManejaChe());
        JPanel lamiche=new JPanel();
        lamiche.add(che1);
        lamiche.add(che2);
        add(lamiche,BorderLayout.SOUTH);
        
        
    }
    private class ManejaChe implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
           int tipo=0;
           if(che1.isSelected()){
               tipo+=Font.BOLD;
           }
           if(che2.isSelected()){
               tipo+=Font.ITALIC;
               
           }
           texto.setFont(new Font("Serif",tipo,24));
        }
        
    }
    private JLabel texto;
    private JCheckBox che1,che2;
}