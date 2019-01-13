
package poo;


public class Pruebas {
    
    public static void main(String[] args) {
        Empleado1 persona=new Empleado1("marlon");
        Empleado1 persona1=new Empleado1("manuel");
         Empleado1 persona2=new Empleado1("maa");
         
        persona.setSeccion("financiero");
        System.out.println(persona.getSeccion()+"\n"+persona1.getSeccion()+"\n"+persona2.getSeccion());
        System.out.println(Empleado1.getIdSi());
       
    }
}
class Empleado1{

    public Empleado1(String nombre) {
        this.nombre = nombre;
        seccion="administracion";
       id=idsi;
       idsi++;
    }

    public String getSeccion() {
        return "2l nombre es "+nombre+" la seccion es "+seccion+" el id "+id;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
        
    }
   public static String getIdSi(){
       return "el id siguiente es "+idsi;
   }
    
    private final String nombre;
    private String seccion;
    private int id;
    private static int idsi=1;
    
}