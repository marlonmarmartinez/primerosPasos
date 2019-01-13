
package primerospasos;


public class UsoForEch {
    
    public static void main(String[] args) {
        
        String []paises=new String[8];
        paises[0]="españa";
        paises[1]="mexico";
        paises[2]="colombia";
        paises[3]="peru";
        paises[4]="chile";
        paises[5]="argentina";
        paises[6]="ecuador";
        paises[7]="venezuela";

        for (int i = 0; i < paises.length; i++) {
            System.out.println("los paises son"+i+1+""+paises[i]);
            
        }
        for (String paise : paises) {
            System.out.println(paise);
        }
    }
}
