
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Imagenes {
     public static void main(String[] args) {
        Imag d=new Imag();
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
}
class Imag extends JFrame{

    public Imag() {
        setTitle("dibujo");
        setSize(400, 400);
        Laminai lami=new Laminai();
        add(lami);
        
    }
    
}
class Laminai extends JPanel{

    public Laminai() {
        File ruta=new File("ruta");
        try {
             imagen=ImageIO.read(ruta);
         } catch (IOException ex) {
             System.out.println("no se encontro la imagen");
         }
    }
    
     public void paintComponent(Graphics g){
          super.paintComponent(g);
         
         int ancho=imagen.getWidth(this);
         int altura=imagen.getHeight(this);
         g.drawImage(imagen, 5, 5, null);
         for(int i=0;i<300;i++){
             for(int j=0;j<200;j++){
                 if(j>0){
                g.copyArea(0, 0, ancho, altura, ancho*i,altura*j);
                 }
             }
         }
     }
     private Image imagen;
}