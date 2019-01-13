
package primerospasos;

import java.util.Stack;


public class EjemploArray2D {
   
    public static void main(String[] args) {
        double acumulado,interes=0.10;
        double [][]saldo=new double[6][5];
       
        for (int i = 0; i < 6; i++) {
           saldo[i][0]=10000;
           acumulado=10000;
            for (int j = 1; j < 5; j++) {
                acumulado=acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;
            }
            interes=interes+0.01;
        }
        for (int z = 0; z < 6; z++) {
            System.out.println();
            for (int h = 0; h < 5; h++) {
                System.out.printf("%1.2f",saldo[z][h]);
                System.out.print(" ");
            }
        }
        
        //-------------
         int pos;
    int nCartas = 10;
    Stack < Integer > pCartas = new Stack < > ();
    for (int i = 0; i < nCartas ; i++) {
      pos = (int) Math.floor(Math.random() * nCartas );
      while (pCartas.contains(pos)) {
        pos = (int) Math.floor(Math.random() * nCartas );
      }
      pCartas.push(pos);
    }
    System.out.println("Núm. aleatorios sin repetición:");
    System.out.println(pCartas.toString());
    }
}
