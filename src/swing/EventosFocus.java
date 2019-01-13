
package swing;


import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosFocus {
    
    public static void main(String[] args) {
        Focus marco=new Focus();
       
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Focus extends JFrame{

    public Focus() {
       
      setBounds(500,300,250,250);  
      setVisible(true);
      LamiFocus la=new LamiFocus();
      add(la);
    }
}
class LamiFocus extends JPanel {
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        cuadro1=new JTextField();
        cuadro2=new JTextField();
        cuadro1.setBounds(120,10,150,20);
        cuadro2.setBounds(120,50,150,20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocus el=new LanzaFocus();
        cuadro1.addFocusListener(el);
        cuadro2.addFocusListener(el);
    }
    private class LanzaFocus implements FocusListener{

   
    public void focusGained(FocusEvent fe) {
       
    }
    
    public void focusLost(FocusEvent fe) {
        String mail=cuadro1.getText();
        boolean comprobacion=false;
        
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                comprobacion=true;
                
            }
        }
        if(comprobacion){
            System.out.println("es correcto");
        }else{
            System.out.println("no es correcto");
        }
    }
    
}
     JTextField cuadro1;
    JTextField cuadro2;
}
