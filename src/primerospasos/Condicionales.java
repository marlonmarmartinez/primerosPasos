
package primerospasos;

import java.util.*;
public class Condicionales {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("introduce tu edad ");
        int edad=entrada.nextInt();
        
        if(edad<18){
            System.out.println("eres menor de edad");
        }else if(edad<40){
            System.out.println("eres joven");
        }else if(edad<65){
            System.out.println("eres maduro");
        }else{
            System.out.println("cuidate");
        }
    }
}
