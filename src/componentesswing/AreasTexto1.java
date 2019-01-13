
package componentesswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class AreasTexto1 {
     public static void main(String[] args) {
        MarcoTextoa1 marco=new MarcoTextoa1();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
    }
}
class MarcoTextoa1 extends JFrame{
  
    public MarcoTextoa1() {
      setTitle("texto");
      setBounds(500,300,500,300);  
        setLayout(new BorderLayout());
      LamiTextoa1 la=new LamiTextoa1();
      add(la);
      laminaboton=new JPanel();
      botoninsertar=new JButton("insertar");
      botoninsertar.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent ae) {
            areatexto.append("un lugar donde sea");
          }
      });
      laminaboton.add(botoninsertar);
      botonsaltolinea=new JButton("salto linea");
      botonsaltolinea.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent ae) {
            boolean saltar=!areatexto.getLineWrap();
            areatexto.setLineWrap(saltar);
             /*if(saltar){
                botonsaltolinea.setText("quitar salto");
            }else{
                botonsaltolinea.setText("salto linea");
            }*/
            botonsaltolinea.setText(saltar? "quitar salto ": "salto linea");
          }
      });
      laminaboton.add(botonsaltolinea);
      add(laminaboton,BorderLayout.SOUTH);
      areatexto=new JTextArea(8,20);
      laminabarra=new JScrollPane(areatexto);
      add(laminabarra,BorderLayout.CENTER);
    }
    private JPanel laminaboton;
    private JButton botoninsertar,botonsaltolinea;
    private JTextArea areatexto;
    private JScrollPane laminabarra;
}
class LamiTextoa1 extends JPanel {

    public LamiTextoa1() {
       
}
}