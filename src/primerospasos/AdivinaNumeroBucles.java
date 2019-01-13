
package primerospasos;
import java.util.*;

public class AdivinaNumeroBucles {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int aleatorio=(int)(Math.random()*100);
        int numero=0;
        int intentos=0;
        
        /*while(numero != aleatorio)*/do{
            intentos++;
            System.out.println("introduce un numero ");
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("mas bajo");
            }
            else if(aleatorio>numero){
                System.out.println("mas alto");
            }
        } while(numero != aleatorio);
        System.out.println("correcto. lo has logrado en "+intentos+" intentos");
    }
}
