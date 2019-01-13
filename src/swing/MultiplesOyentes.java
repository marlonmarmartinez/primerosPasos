
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplesOyentes {
    
     public static void main(String[] args) {
        Multiples marco=new Multiples();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class Multiples extends JFrame{
  
    public Multiples() {
      setTitle("prueba");
      setBounds(500,300,250,250);  
     
      LamiMultiples la=new LamiMultiples();
      add(la);
    }
}
class LamiMultiples extends JPanel {

    public LamiMultiples() {
        JButton boton=new JButton("nuevo");
        add(boton);
        botoncerrar=new JButton("cerrar todo");
        add(botoncerrar);
        OyenteNuevo mi=new OyenteNuevo();
        boton.addActionListener(mi);
    }
    private class OyenteNuevo implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
           MarcoEmergente marco1=new MarcoEmergente(botoncerrar);
           marco1.setVisible(true);
        }
        
    }
    JButton botoncerrar;
}
class MarcoEmergente extends JFrame{

    public MarcoEmergente(JButton botonprincipal) {
        contador++;
        setTitle("ventana "+contador);
        setBounds(40*contador, 40*contador, 300, 150);
        CierraTodo cerrar=new CierraTodo();
        botonprincipal.addActionListener(cerrar);
    }
    private class CierraTodo implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
           dispose();
        }
        
    }
    private static int contador=0;
}