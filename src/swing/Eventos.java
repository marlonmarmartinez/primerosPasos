
package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants;


public class Eventos {
    
    public static void main(String[] args) {
        Even d=new Even();
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
}
class Even extends JFrame{

    public Even() {
        setTitle("eventos");
        setSize(400, 400);
        Lami lami=new Lami();
        add(lami);
        
    }
    
}
class Lami extends JPanel {
    
    JButton botonazul=new JButton("Azul");
    JButton botonama=new JButton("Amarillo");
    JButton botonrojo=new JButton("Rojo");
    public Lami() {
        add(botonazul);
        add(botonama);
        add(botonrojo);
        
        Colorfondo ama=new Colorfondo(Color.YELLOW);
        Colorfondo azul=new Colorfondo(Color.BLUE);
        Colorfondo rojo=new Colorfondo(Color.RED);
        
        botonazul.addActionListener(azul);
        botonama.addActionListener(ama);
        botonrojo.addActionListener(rojo);
    }

    /*public void actionPerformed(ActionEvent ae) {
        Object botonpulsado=ae.getSource();
        if(botonpulsado==botonazul){
        setBackground(Color.BLUE);
        }else if(botonpulsado==botonama){
            setBackground(Color.YELLOW);
        }else{
            setBackground(Color.RED);
        }
    }*/
    private class Colorfondo implements ActionListener{
    
    public Colorfondo(Color c) {
        colordefondo=c;
    }
     public void actionPerformed(ActionEvent ae) {
         setBackground(colordefondo);
    }

   private Color colordefondo; 
}
}
