package componentesswing;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Barra mimarco=new Marco_Barra();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame{
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuraci�n de acciones
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.RED);
                
                Action accionsalir=new AbstractAction("salir",new ImageIcon("src/graficos/bola_roja.gif")) {

                    public void actionPerformed(ActionEvent ae) {
                      System.exit(0);
                    }
                };
                
                JMenu menu=new JMenu("Color");
                menu.add(accionAzul);
                 menu.add(accionAmarillo);
                  menu.add(accionRojo);
                  
                  JMenuBar barra=new JMenuBar();
                  barra.add(menu);
		  setJMenuBar(barra);
		
		JToolBar ba=new JToolBar();
                ba.add(accionAzul);
		ba.add(accionAmarillo);
                ba.add(accionRojo);
                ba.addSeparator();
                ba.add(accionsalir);
                add(ba,BorderLayout.NORTH);
                
	}
		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	}
	private JPanel lamina;
}



