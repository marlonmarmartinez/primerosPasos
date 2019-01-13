
package practica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.*;

public class MarcoDialogos extends JFrame{

    public MarcoDialogos() {
        setTitle("prueba de dialogos");
        setBounds(500, 300, 600, 450);
        JPanel lamicuadricula=new JPanel();
        lamicuadricula.setLayout(new GridLayout(2,3));
        
        String[]primero={"Mensaje","Confirmar","Opcion","Entrada"};
        laminatipo=new LaminaBotones("Tipo",primero);
        
        laminatipomensaje=new LaminaBotones("tipo de mensaje", new String[]{
        "ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"});
        
         laminamensaje=new LaminaBotones("mensaje", new String[]{
        "cadena","icono","componente","otros","object[]"});
         
          laminatipoopciones=new LaminaBotones("tipo de opciones", new String[]{
        "DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"});
          
           laminaopciones=new LaminaBotones("opciones", new String[]{
        "String[]","Icon[]","Object[]"});
           
            laminaentrada=new LaminaBotones("entrada", new String[]{
        "campodetexto","combo"});
            setLayout(new BorderLayout());
        
        lamicuadricula.add(laminatipo);
        lamicuadricula.add(laminatipomensaje);
        lamicuadricula.add(laminamensaje);
         lamicuadricula.add(laminatipoopciones);
          lamicuadricula.add(laminaopciones);
           lamicuadricula.add(laminaentrada);
           
           JPanel laminamostrar=new JPanel();
           JButton botonmostrar=new JButton("mostrar");
           botonmostrar.addActionListener(new AccionMostrar());
           laminamostrar.add(botonmostrar);
           add(laminamostrar,BorderLayout.SOUTH);
           add(lamicuadricula,BorderLayout.CENTER);
    }
    
    public Object dameMensaje(){
        String s=laminamensaje.dameSeleccion();
        if(s.equals("cadena")){
            return cadenamensaje;
        }else if(s.equals("icono")){
            return iconomensaje;
        }else if(s.equals("componente")){
            return componentemensaje;
        }else if(s.equals("otros")){
            return objetomensaje;
        }else if(s.equals("object[]")){
            return new Object[]{cadenamensaje,iconomensaje,componentemensaje,objetomensaje};
        }else {
            return null;
        }
       
    }
    public int dameTipo(LaminaBotones lam){
        String s=lam.dameSeleccion();
        if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){
            return 0;
        }else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")){
            return 1;
        }else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")){
            return 2;
        }else if(s.equals("QUESTION_MESSAGE")){
            return 3;
        }else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")){
            return -1;
        }else{
            return 0;
        }
    }
    public Object []dameOpciones(LaminaBotones lamina){
        String s=lamina.dameSeleccion();
        if(s.equals("String[]")){
            return new String[]{"amarillo","azul","rojo"};
        }else if(s.equals("Icon[]")){
            return new Object []{new ImageIcon("ruta"),new ImageIcon("ruta"),new ImageIcon("ruta")};
        }else if(s.equals("Object[]")){
            return new Object[]{cadenamensaje,iconomensaje,componentemensaje,objetomensaje};
        }else {
            return null;
        }
    }
    
    private class AccionMostrar implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
            //System.out.println(laminatipo.dameSeleccion());
            if(laminatipo.dameSeleccion().equals("Mensaje")){
                JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(),"titulo",dameTipo(laminatipomensaje));
            }else if(laminatipo.dameSeleccion().equals("Confirmar")){
                JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(),"titulo",dameTipo(laminatipoopciones),dameTipo(laminatipomensaje));
            }else if(laminatipo.dameSeleccion().equals("Entrada")){
                if(laminaentrada.dameSeleccion().equals("campodetexto")){
                JOptionPane.showInputDialog(MarcoDialogos.this,dameMensaje(),"titulo",dameTipo(laminatipomensaje));
                }else if(laminaentrada.dameSeleccion().equals("combo")){
                    JOptionPane.showInputDialog(MarcoDialogos.this,dameMensaje(),"titulo",dameTipo(laminatipomensaje),null,new String[]{"amarillo","azul","rojo"},"azul");
                }
            }else if(laminatipo.dameSeleccion().equals("Opcion")){
                JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "titulo", 1, dameTipo(laminatipomensaje), null, dameOpciones(laminaopciones), null);
            }
        }
        
    }
    private LaminaBotones laminatipo,laminatipomensaje,laminamensaje,laminatipoopciones,laminaopciones,laminaentrada;
    private String cadenamensaje="mensaje";
    private Icon iconomensaje=new ImageIcon("ruta");
    private Object objetomensaje=new Date();
    private Component componentemensaje=new LaminaEjemplo();
}
class LaminaEjemplo extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2=(Graphics2D)g;
        Rectangle2D rec=new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setPaint(Color.YELLOW);
        g2.fill(rec);
    }
}
