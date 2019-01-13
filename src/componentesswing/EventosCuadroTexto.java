
package componentesswing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosCuadroTexto {
    public static void main(String[] args) {
        MarcoTextoe marco=new MarcoTextoe();      
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
class MarcoTextoe extends JFrame{
  
    public MarcoTextoe() {
      setTitle("texto");
      setBounds(500,300,500,300);  
     
      LamiTextoe la=new LamiTextoe();
      add(la);
      setVisible(true);
    }
}
class LamiTextoe extends JPanel {

    public LamiTextoe() {
        JTextField campo=new JTextField(20);
        EscuchaTexto elevento=new EscuchaTexto();
        Document doc=campo.getDocument();
        doc.addDocumentListener(elevento);
        add(campo);
    }
    private class EscuchaTexto implements DocumentListener{

        public void insertUpdate(DocumentEvent de) {
            System.out.println("has introducido el texto");
        }

        public void removeUpdate(DocumentEvent de) {
            System.out.println("has borrado el texto");
        }

        public void changedUpdate(DocumentEvent de) {
             
        }
        
    }
}