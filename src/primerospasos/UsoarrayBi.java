
package primerospasos;


public class UsoarrayBi {
    
    public static void main(String[] args) {
        int [][]matrix={
        {12,23,34,45,3},
        {12,23,34,45,4},
        {12,23,34,45,3},
        {12,23,34,45,2}};
        
        for (int[] fila : matrix) {
            System.out.println();
            for (int z : fila) {
                System.out.print(z+" \t");
            }
        }
    }
}
