
package componentesswing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioBut {
    
    public static void main(String[] args) {
        MarcoRadio marco=new  MarcoRadio();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoRadio extends JFrame{
  
    public MarcoRadio() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
      LamiRadio la=new LamiRadio();
      add(la);
    }
}
class LamiRadio extends JPanel {

    public LamiRadio() {
        ButtonGroup grupo=new ButtonGroup();
        ButtonGroup grupo1=new ButtonGroup();
        JRadioButton boton1=new JRadioButton("azul",false);
         JRadioButton boton2=new JRadioButton("rojo",true);
          JRadioButton boton3=new JRadioButton("amarillo",false);
          JRadioButton boton4=new JRadioButton("masculino",false);
          JRadioButton boton5=new JRadioButton("femenino",false);
          
          grupo.add(boton1);
          grupo.add(boton2);
          grupo.add(boton3);
          grupo1.add(boton4);
          grupo1.add(boton5);
          
          add(boton1);
          add(boton2);
          add(boton3);
          add(boton4);
          add(boton5);
          
          
    }
}