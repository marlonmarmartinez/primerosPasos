
package primerospasos;

import java.util.Scanner;


public class EntradaSalidaDatos {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("introduce tu nombre ");
        String nombreusuario=entrada.nextLine();
        System.out.println("introduce edad ");
        int edad=entrada.nextInt();
        System.out.println("hola "+nombreusuario+" el año que viene tendras "+(edad+1) +" años");
    }
}
