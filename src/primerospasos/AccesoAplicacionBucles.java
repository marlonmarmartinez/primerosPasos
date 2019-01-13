
package primerospasos;

import javax.swing.*;
public class AccesoAplicacionBucles {
    
    public static void main(String[] args) {
        String clave="marlon";
        String pass="";
        
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("introduce la contraseña ");
            if(clave.equals(pass)==false){
                System.out.println("contraseña incorrecta");
            }
        }
        System.out.println("contraseña correcta. Acceso permitido");
    }
}
