
package componentesswing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioBut1 {
    
    public static void main(String[] args) {
        MarcoRadio1 marco=new  MarcoRadio1();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoRadio1 extends JFrame{
  
    public MarcoRadio1() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
      LamiRadio1 la=new LamiRadio1();
      add(la);
    }
}
class LamiRadio1 extends JPanel {

    public LamiRadio1() {
        setLayout(new BorderLayout());
        texto=new JLabel("aaaaaaaaaaaa111");
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        add(texto,BorderLayout.CENTER);
        
        laminaboton=new JPanel();
        migrupo=new ButtonGroup();
        
        colocarBoton("peqqueño", false, 10);
        colocarBoton("mediano", true, 14);
        colocarBoton("grande", false, 16);
        colocarBoton("extragrande", false, 20);
        
        add(laminaboton,BorderLayout.SOUTH);
        
    }
   public void colocarBoton(String nombre,boolean seleccionado,final int tamaño){
       JRadioButton boton=new JRadioButton(nombre,seleccionado);
       migrupo.add(boton);
       laminaboton.add(boton);
       ActionListener mievento=new ActionListener() {

           public void actionPerformed(ActionEvent ae) {
             texto.setFont(new Font("Serif",Font.PLAIN,tamaño));
             
           }
       };
       boton.addActionListener(mievento);
       
   }
    private JLabel texto;
    private JRadioButton boton1,boton2,boton3,boton4;
    private ButtonGroup migrupo;
    private JPanel laminaboton;
}