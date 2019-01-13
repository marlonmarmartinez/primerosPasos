
package poo;

import java.util.Date;
import java.util.GregorianCalendar;


public class UsoPersona {
    
    public static void main(String[] args) {
        Persona[] laspersonas=new Persona[2];
        laspersonas[0]=new Empleado2("mario", 20000, 2018, 9, 29);
        laspersonas[1]=new Alumno("marlon", "ing sistemas");
        
        for (Persona laspersona : laspersonas) {
            System.out.println(laspersona.getNombre()+" "+laspersona.getDescripcion());
        }
    }
}

abstract class Persona{
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract String getDescripcion();
    
private String nombre;
}

class Empleado2 extends Persona{

    public Empleado2(String nom,double sue,int año,int mes,int dia) {
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(año, mes-1, dia);
        altacontrato=calendario.getTime();
    }
public String getDescripcion(){
    return"este empleado tiene un sueldo "+sueldo;
}

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double porcentaje) {
      double aumento=sueldo*porcentaje/100;
       sueldo+=aumento;
    }

    public Date getAltacontrato() {
        return altacontrato;
    }

    public void setAltacontrato(Date altacontrato) {
        this.altacontrato = altacontrato;
    }
    
 
  private double sueldo;
  private Date altacontrato;
}
class Alumno extends Persona{

   public Alumno(String nombre,String nomcarrera){
       super(nombre);
       carrera=nomcarrera;
   }
    public String getDescripcion() {
        return "este alumno esta estudiando la carrera de "+carrera;
    }
    private String carrera;
}