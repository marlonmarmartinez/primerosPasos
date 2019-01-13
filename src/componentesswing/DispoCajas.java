
package componentesswing;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DispoCajas {
public static void main(String[] args) {
        
  
     MarcoCaja marco1=new  MarcoCaja();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco1.setVisible(true);
    }
}
class MarcoCaja extends JFrame{
  
    public MarcoCaja() {
      setTitle("dispocisiones en caja");
      setBounds(500,300,500,300); 
       setVisible(true);
       
        JLabel rotulo=new JLabel("nombre");
        JTextField texto1=new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());
        Box cajah1=Box.createHorizontalBox();
        cajah1.add(rotulo);
        cajah1.add(Box.createHorizontalStrut(10));
        cajah1.add(texto1);
        
        JLabel rotulo1=new JLabel("contraseña");
        JTextField texto2=new JTextField(10);
        texto2.setMaximumSize(texto2.getPreferredSize());
        Box cajah2=Box.createHorizontalBox();
        cajah2.add(rotulo1);
        cajah2.add(Box.createHorizontalStrut(10));
        cajah2.add(texto2);
        
        JButton boton1=new JButton("ok");
         JButton boton2=new JButton("cancelar");
         
         Box cajah3=Box.createHorizontalBox();
         cajah2.add(boton1);
         cajah3.add(Box.createGlue());
         cajah3.add(boton2);
         
         Box cajav=Box.createVerticalBox();
         cajav.add(cajah1);
         cajav.add(cajah2);
         cajav.add(cajah3);
         add(cajav,BorderLayout.CENTER);
         
         
      
    }
}

