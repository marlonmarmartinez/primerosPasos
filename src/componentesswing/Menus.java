
package componentesswing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menus {
public static void main(String[] args) {
        
  
     MarcoMenu marco1=new  MarcoMenu();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco1.setVisible(true);
    }
}
class MarcoMenu extends JFrame{
  
    public MarcoMenu() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       
     
      add(new  LamiMenu());
    }
}
class LamiMenu extends JPanel {

    public  LamiMenu() {
        JMenuBar barra=new JMenuBar();
        JMenu archivo=new JMenu("Archivo");
        JMenu edicion=new JMenu("Edicion");
        JMenu herramientas=new JMenu("Herramienta");
        JMenu opciones =new JMenu("opciones");
        
        JMenuItem guardar=new JMenuItem("guardar");
        JMenuItem guardarc=new JMenuItem("guardar como");
        JMenuItem cortar=new JMenuItem("cortar",new ImageIcon("ruta"));
        JMenuItem copiar=new JMenuItem("copiar",new ImageIcon("ruta"));
        JMenuItem pegar=new JMenuItem("pegar",new ImageIcon("ruta"));
        JMenuItem generales=new JMenuItem("generales");
        JMenuItem opc1=new JMenuItem("opcion1");
        JMenuItem opc2=new JMenuItem("opcion2");
        
        archivo.add(guardar);
         archivo.add(guardarc);
          edicion.add(cortar);
          edicion.add(copiar);
           edicion.add(pegar);
            herramientas.add(generales);
            opciones.add(opc1);
            opciones.add(opc2);
            edicion.addSeparator();
            edicion.add(opciones);
        
        barra.add(archivo);
        barra.add(edicion);
        barra.add(herramientas);
        add(barra);
        
    }
}
