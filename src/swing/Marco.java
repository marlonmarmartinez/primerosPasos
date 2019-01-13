
package swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Marco {
    
    public static void main(String[] args) {
        MarcoCentrado marco=new MarcoCentrado();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamaño=mipantalla.getScreenSize();
        int alturapantalla=tamaño.height;
        int anchopantalla=tamaño.width;
        setSize(anchopantalla/2,alturapantalla/2);
        setLocation(anchopantalla/4,alturapantalla/4);
        setTitle("marco centrado");
        Image icono=mipantalla.getImage("icono.gif");
        setIconImage(icono);
        
    }
}