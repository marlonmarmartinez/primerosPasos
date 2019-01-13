
package swing;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {
    
    public static void main(String[] args) {
        Dibujo d=new Dibujo();
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
class Dibujo extends JFrame{

    public Dibujo() {
        setTitle("dibujo");
        setSize(400, 400);
        LaminaFigura lami=new LaminaFigura();
        add(lami);
        lami.setBackground(Color.yellow);
        
    }
    
}
class LaminaFigura extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        /*g.draw3DRect(50, 50, 200, 200, true);
        g.drawLine(100, 100, 300, 200);
        g.drawArc(50, 100, 100, 200, 120, 150);*/
        Graphics2D g2=(Graphics2D)g;
        Rectangle2D rec=new Rectangle2D.Double(100,100,200,150);
        
        g2.setPaint(Color.BLUE);
        
        g2.fill(rec);//draw
        Ellipse2D eli=new Ellipse2D.Double();
        eli.setFrame(rec);
        
        g2.setPaint(Color.RED);
        g2.fill(eli);
        g2.draw(new Line2D.Double(100,100,300,250));
        
        double centrox=rec.getCenterX();
        double centroY=rec.getCenterY();
        double radio=150;
        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrameFromCenter(centrox, centroY,centrox+radio , centroY+radio);
        g2.draw(circulo);
    }
}