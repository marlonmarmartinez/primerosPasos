
package primerospasos;


public class UsoArrays {
    
    public static void main(String[] args) {
        
        int[] matriz=new int[5];
        matriz[0]=23;
        matriz[1]=15;
        matriz[2]=3;
        matriz[3]=7;
        matriz[4]=16;
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i]);
            
        }
        int[] matri={12,23,34,2,4};
        for (int i = 0; i < matri.length; i++) {
            System.out.println("el valor del indice "+i+" = "+matri[i]);
            
        }
    }
}
