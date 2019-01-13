
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fuentes {
    
    public static void main(String[] args) {
        Colores1 d=new Colores1();
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        String[]fuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String f: fuentes) {
            System.out.println(f);
        }
    }
}
class Colores1 extends JFrame{

    public Colores1() {
        setTitle("dibujo");
        setSize(400, 400);
        LaminaColores lami=new LaminaColores();
        add(lami);
        lami.setForeground(Color.red);
    }
    
}
class LaminaColores extends JPanel{
    
     public void paintComponent(Graphics g){
          super.paintComponent(g);
          Graphics2D g2=(Graphics2D)g;
          Font fuen=new Font("Arial",Font.BOLD,26);
          g2.setFont(fuen);
          g2.setColor(Color.yellow);
          g2.drawString("mar", 100, 100);
          
          g2.setFont(new Font("Arial",Font.ITALIC,20));
          g2.setColor(new Color(12,12,12).brighter());
          g2.drawString("curso de java", 200, 200);
     }
}
    