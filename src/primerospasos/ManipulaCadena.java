
package primerospasos;

public class ManipulaCadena {
    
    public static void main(String[] args) {
      
        String nombre="marlon";
        System.out.println("mi nombre es "+nombre);
        System.out.println("mi nombre tiene "+nombre.length()+" letras");
        System.out.println("la primera letra de mi nombre es "+nombre.charAt(0));
        System.out.println(" ");
        System.out.println("------------------------------------------------");
        String frase="hoy estoy empezando a estudiar java";
        String fraseresumen=frase.substring(1,3)+"vamos pa esa";
        System.out.println(fraseresumen);
        System.out.println("");
        System.out.println("-------------------------------------------");
        String alumno1,alumno2;
        alumno1="David";
        alumno2="david";
        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
