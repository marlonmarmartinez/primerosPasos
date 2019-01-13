
package primerospasos;

import java.util.Scanner;


public class Uso_Tallas {
    
    //enum Talla{pequeña,mediano,grande,extragrande};
    enum Talla{
        mini("s"),mediano("m"),grande("l"),extragrande("xl");
        private Talla(String abreviatura){
            this.abreviatura=abreviatura;
        }
        public String getAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    }
    
    public static void main(String[] args) {
       
       Scanner entrada=new Scanner(System.in);
        System.out.println("escribe una talla, mini,mediano,grande,extragrande");
        String entradadatos=entrada.next().toUpperCase();
        
        Talla lat=Enum.valueOf(Talla.class, entradadatos);
        System.out.println("TALLA "+lat);
        System.out.println("abreviatura "+lat.getAbreviatura());
    }
}
