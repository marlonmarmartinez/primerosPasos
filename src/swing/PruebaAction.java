
package swing;


import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class PruebaAction {
    
     public static void main(String[] args) {
        Accion marco=new Accion();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class Accion extends JFrame{
  
    public Accion() {
      setTitle("prueba");
      setBounds(500,300,250,250);  
     
      LamiAccion la=new LamiAccion();
      add(la);
    }
}
class LamiAccion extends JPanel {

    public LamiAccion() {
        AccionColor ama=new AccionColor("Amarillo",new ImageIcon("ruta"),Color.YELLOW);
        AccionColor azul=new AccionColor("Azul",new ImageIcon("ruta"),Color.BLUE);
        AccionColor rojo=new AccionColor("rojo",new ImageIcon("ruta"),Color.RED);
        add(new JButton(ama));
        add(new JButton(azul));
        add(new JButton(rojo));
       
        InputMap mapa=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    
        mapa.put(KeyStroke.getKeyStroke("ctrl A"), "fondoamarillo");
        mapa.put(KeyStroke.getKeyStroke("ctrl N"), "fondoazul");
        mapa.put(KeyStroke.getKeyStroke("ctrl B"), "fondorojo");
        ActionMap mapaaccion=getActionMap();
        mapaaccion.put("fondoamarillo", ama);
         mapaaccion.put("fondoazul", azul);
          mapaaccion.put("fondorojo", rojo);
    } 
    private class AccionColor extends AbstractAction{

    public AccionColor(String nombre,Icon icono,Color colorboton) {
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "PONER LAMINA DE COLOR "+nombre);
        putValue("colordefondo", colorboton);
    }

    public void actionPerformed(ActionEvent ae) {
        Color c=(Color)getValue("colordefondo");
        setBackground(c);
        System.out.println("nombre "+getValue(Action.NAME)+" descripcion "+getValue(Action.SHORT_DESCRIPTION));
        
    }
    
}
}
