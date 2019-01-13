
package swing;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    
    public static void main(String[] args) {
        MarcoTexto marco=new MarcoTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
class MarcoTexto extends JFrame{

    public MarcoTexto() {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Escribiendo");
        
        Lamina mila=new Lamina();
        add(mila);
    }
    
}
class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("estamos aprendiendo swing", 100, 100);
        
    }
}