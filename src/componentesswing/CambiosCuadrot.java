
package componentesswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class CambiosCuadrot {
    public static void main(String[] args) {
        MarcoTextoc marco=new MarcoTextoc();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
class MarcoTextoc extends JFrame{
  
    public MarcoTextoc() {
      setTitle("texto");
      setBounds(500,300,500,300);  
     
      LamiTextoc la=new LamiTextoc();
      add(la);
      setVisible(true);
    }
}
class LamiTextoc extends JPanel {

    public LamiTextoc() {
        setLayout(new BorderLayout());
        JPanel laminasuperior=new JPanel();
        laminasuperior.setLayout(new GridLayout(2,2));
        add(laminasuperior,BorderLayout.NORTH);
        JLabel etiqueta=new JLabel("usuario");
        JLabel eti=new JLabel("contraseña");
        JTextField usuario=new JTextField(15);
        
        CompruebaPass mievento=new CompruebaPass();
        contra=new JPasswordField(15);
        contra.getDocument().addDocumentListener(mievento);
        laminasuperior.add(etiqueta);
        laminasuperior.add(usuario);
        laminasuperior.add(eti);
        laminasuperior.add(contra);
        JButton enviar=new JButton("enviar");
        add(enviar,BorderLayout.SOUTH);
        
    }
    private class CompruebaPass implements DocumentListener{

        public void insertUpdate(DocumentEvent de) {
          char contraseña[];
          contraseña=contra.getPassword();
          
          if(contraseña.length<8 || contraseña.length>12){
              contra.setBackground(Color.RED);
          }else{
              contra.setBackground(Color.WHITE);
          }
        
        }

        public void removeUpdate(DocumentEvent de) {
         char contraseña[];
          contraseña=contra.getPassword();
          
          if(contraseña.length<8 || contraseña.length>12){
              contra.setBackground(Color.RED);
          }else{
              contra.setBackground(Color.WHITE);
          }
        }

        public void changedUpdate(DocumentEvent de) {
            
        }
        
    }
    private JPasswordField contra;
}