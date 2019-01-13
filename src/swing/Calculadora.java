
package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calculadora {
    public static void main(String[] args) {
        MarcoCal marco=new MarcoCal();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class MarcoCal extends JFrame{
  
    public MarcoCal() {
      setTitle("Calculadora");
      setBounds(500,300,500,300);  
     
      LamiCal la=new LamiCal();
      add(la);
      //pack();
    }
}
class LamiCal extends JPanel {

    public LamiCal() {
        principio=true;
        setLayout(new BorderLayout());       
        pantalla=new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        lamina2=new JPanel();
        lamina2.setLayout(new GridLayout(4,4));
        
        ActionListener insertar=new InsertaNumero();
        ActionListener orden=new AccionOrden();
        
        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBoton("/",orden);
        
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBoton("*",orden);
        
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBoton("-",orden);
        
        ponerBoton("0",insertar);
        ponerBoton(".",insertar);
        ponerBoton("=",orden);
        ponerBoton("+",orden);
        
        add(lamina2,BorderLayout.CENTER);
        ultimaoperacion="=";
        
    }
    private void ponerBoton(String rotulo,ActionListener oyente){
        JButton boton=new JButton(rotulo);
        boton.addActionListener(oyente);
        lamina2.add(boton);
    }
    private class InsertaNumero implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
           String entrada=ae.getActionCommand();
           if(principio){
               pantalla.setText("");
               principio=false;
           }
           pantalla.setText(pantalla.getText()+entrada);
        }
        
    }
    private class AccionOrden implements ActionListener{

        public void actionPerformed(ActionEvent ae) {
            String operacion=ae.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaoperacion=operacion;
           principio=true;
        }
       public void calcular(double x){
           if(ultimaoperacion.equals("+")){
               resultado+=x;
           }
           else if(ultimaoperacion.equals("-")){
               resultado-=x;
           }else if(ultimaoperacion.equals("*")){
               resultado*=x;
           }else if(ultimaoperacion.equals("/")){
               resultado/=x;
           }
           else if(ultimaoperacion.equals("=")){
               resultado=x;
           }
           pantalla.setText(""+resultado);
       } 
    }
    
    private JButton pantalla;
    private JPanel lamina2;
    private boolean principio;
    private double resultado;
    private String ultimaoperacion;
}
