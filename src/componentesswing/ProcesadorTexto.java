
package componentesswing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {
public static void main(String[] args) {
        
  
      MarcoPro marco1=new   MarcoPro();      
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
}
class MarcoPro extends JFrame{
  
    public  MarcoPro() {
      setTitle("texto");
      setBounds(500,300,500,300); 
       setVisible(true);
     
      add(new  LamiProcesador());
    }
}
class LamiProcesador extends JPanel {

    public  LamiProcesador() {
        setLayout(new BorderLayout());
        JPanel lamenu=new JPanel();
        JMenuBar barra=new JMenuBar();
        fuente=new JMenu("Fuente");
        estilo=new JMenu("Estilo");
        tam=new JMenu("Tamaño");
        
        configuraMenu("Arial","Fuente","Arial",9,10);
        configuraMenu("Courier","Fuente","Courier",9,10);
        configuraMenu("Verdana","Fuente","Verdana",9,10);
        
        configuraMenu("Negrita","Estilo","",Font.BOLD,1);
        configuraMenu("Cursiva","Estilo","",Font.ITALIC,1);
        
        configuraMenu("12","Tamaño","",9,12);
        configuraMenu("14","Tamaño","",9,14);
        configuraMenu("16","Tamaño","",9,16);
        configuraMenu("20","Tamaño","",9,20);
             
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tam);
        lamenu.add(barra);
        add(lamenu,BorderLayout.NORTH);
        
        miarea=new JTextPane();
        add(miarea,BorderLayout.CENTER);
        
        
    }
    public void configuraMenu(String rotulo,String menu,String tipoletra,int estilos,int tama){
        JMenuItem elem=new JMenuItem(rotulo);
        if(menu=="Fuente"){
            fuente.add(elem);
            if(tipoletra=="Arial"){
                elem.addActionListener(new StyledEditorKit.FontFamilyAction("cambiatam","Arial"));
            }else if(tipoletra=="Courier"){
                elem.addActionListener(new StyledEditorKit.FontFamilyAction("cambiatam","Verdana"));
            }else if(tipoletra=="Verdana"){
                elem.addActionListener(new StyledEditorKit.FontFamilyAction("cambiatam","Verdana"));
            }
        }else if(menu=="Estilo"){
            estilo.add(elem);
            /*if(estilo==Font.BOLD){
                elem.addActionListener(new StyledEditorKit.BoldAction());
            }else if(estilo==Font.ITALIC){
            elem.addActionListener(new StyledEditorKit.ItalicAction());
            }*/
        }else if(menu=="Tamaño"){
            tam.add(elem);
            elem.addActionListener(new StyledEditorKit.FontSizeAction("cambiatam",tama));
        }
        //elem.addActionListener(new GestionaEventos(rotulo,tipoletra,estilos,tama));
    }
    
   /* private class GestionaEventos implements ActionListener{
               String tipotex,menu;
               int estiloletra,tamletra;

        public GestionaEventos(String elemento,String texto2,int estilo2,int tamle) {
            tipotex=texto2;
            estiloletra=estilo2;
            tamletra=tamle;
            menu=elemento;
        }
               
        public void actionPerformed(ActionEvent ae) {
            letras=miarea.getFont();
            if(menu=="Arial" || menu=="Courier" || menu=="Verdana"){
                estiloletra=letras.getSize();
                tamletra=letras.getSize();
            }else if(menu=="Cursiva" || menu=="Negrita"){
                if(letras.getStyle()==1 || letras.getStyle()==2){
                    estiloletra=3;
                }
                tipotex=letras.getFontName();
                tamletra=letras.getSize();
            }else if(menu=="12" || menu=="14" || menu=="16" || menu=="20"){
                estiloletra=letras.getSize();
                tipotex=letras.getFontName();
            }
           miarea.setFont(new Font(tipotex,estiloletra,tamletra));
        }
    
}*/
    private JTextPane miarea;
    private JMenu fuente,estilo,tam;
    private Font letras;
}