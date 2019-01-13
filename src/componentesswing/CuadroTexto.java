
package componentesswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CuadroTexto {
    
    public static void main(String[] args) {
        MarcoTexto marco=new MarcoTexto();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
class MarcoTexto extends JFrame{
  
    public MarcoTexto() {
      setTitle("texto");
      setBounds(500,300,500,300);  
     
      LamiTexto la=new LamiTexto();
      add(la);
      setVisible(true);
    }
}
class LamiTexto extends JPanel {

    public LamiTexto() {
        setLayout(new BorderLayout());
        JPanel lamina2=new JPanel();
        lamina2.setLayout(new FlowLayout());
        
        resultado=new JLabel("",JLabel.CENTER);
        JLabel texto1=new JLabel("Email: ");
        lamina2.add(texto1);
        campo1=new JTextField(20);
        lamina2.add(campo1);
        add(resultado,BorderLayout.CENTER);
        add(resultado);
        JButton boton=new JButton("comprobar");
        DameTexto evento=new DameTexto();
        boton.addActionListener(evento);
        lamina2.add(boton);
        add(lamina2,BorderLayout.NORTH);
        
    }
    private class DameTexto implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
            int correcto=0;
            String mail=campo1.getText().trim();
            
            for(int i=0;i<mail.length();i++){
                if(mail.charAt(i)=='@'){
                    correcto++;
                }
            }
            if(correcto!=1){
                resultado.setText("incorrecto");
            }else{
               resultado.setText("correcto");
            }
            
            
        }
        
    }
   private JTextField campo1;
   private JLabel resultado;
}