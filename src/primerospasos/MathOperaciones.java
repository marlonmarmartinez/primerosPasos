
package primerospasos;


public class MathOperaciones {
    
    public static void main(String[] args) {
        //double raiz=Math.sqrt(9);
        double num1=5.85;
        int r=(int) Math.round(num1);
        System.out.println("la potencia es "+r);
        
        double base=5;
        double exponente=3;
        int resul=(int) Math.pow(base, exponente);
        System.out.println(resul);
    }
}
