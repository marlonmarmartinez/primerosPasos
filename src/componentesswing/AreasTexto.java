
package componentesswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreasTexto {
     public static void main(String[] args) {
        MarcoTextoa marco=new MarcoTextoa();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
class MarcoTextoa extends JFrame{
  
    public MarcoTextoa() {
      setTitle("texto");
      setBounds(500,300,500,300);  
     
      LamiTextoa la=new LamiTextoa();
      add(la);
      setVisible(true);
    }
}
class LamiTextoa extends JPanel {

    public LamiTextoa() {
        area=new JTextArea(8,20);
        JScrollPane barra=new JScrollPane(area);
        //area.setLineWrap(true);
        add(barra);
        JButton boton=new JButton("enviar");
        boton.addActionListener(new GestionaArea());
        add(boton);
    }
    private class GestionaArea implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
            System.out.println(area.getText());
        }
        
    }
    private JTextArea area;
}