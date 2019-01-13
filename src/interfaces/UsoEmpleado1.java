
package interfaces;

import java.util.Arrays;

import java.util.Date;
import java.util.GregorianCalendar;


public class UsoEmpleado1 {
    
    public static void main(String[] args) {
       Jefatura jeferh=new Jefatura("mio", 10000, 2017, 10, 23);
       jeferh.setIncentivo(2570);
       
        Empleado[] misempleados=new Empleado[6];
        misempleados[0]=new Empleado("marlon",5000,2004,9,04);
        misempleados[1]=new Empleado("manuel",4000,2003,8,04);
        misempleados[2]=new Empleado("martinez", 6000, 2002, 7, 04);
         misempleados[3]=new Empleado("martinez");
         misempleados[4]=jeferh;//polimorfismo.principio de sustitucion
         misempleados[5]=new Jefatura("maria", 96000, 1999, 6, 26);
      Jefatura jefafinanzas=(Jefatura)misempleados[5];
      jefafinanzas.setIncentivo(5000);
      
        System.out.println(jefafinanzas.tomarDecisiones("da mas dias de vacaciones a los empleados"));
        System.out.println("el jefe "+jefafinanzas.getNombre()+" tiene un bonus de "+jefafinanzas.estableceBonus(500));
        System.out.println(misempleados[2].getNombre()+" tiene un bonus de "+misempleados[2].estableceBonus(200));
        
        
        for (Empleado misempleado : misempleados) {
            misempleado.setSueldo(5);
            
        }
        Arrays.sort(misempleados);
        for (Empleado misempleado : misempleados) {
            System.out.println("nombre " + misempleado.getNombre()+" sueldo " + misempleado.getSueldo()+" fecha contrato " + misempleado.getAltacontrato());
        }
    }
}
class Empleado implements Comparable,Trabajadores{

    public Empleado(String nom,double sue,int año,int mes,int dia) {
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(año, mes-1, dia);
        altacontrato=calendario.getTime();
    }
public Empleado(String nombre){
    this(nombre,3000,2012,2,2);
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
  private String nombre;
  private double sueldo;
  private Date altacontrato;

    public int compareTo(Object t) {
      Empleado otro=(Empleado)t;
      if(this.sueldo<otro.sueldo){
          return -1;
      }
      if(this.sueldo>otro.sueldo){
          return 1;
      }
      return 0;
    }

    public double estableceBonus(double bonificacion) {
       return Trabajadores.bonusbase+bonificacion;
    }
}
class Jefatura extends Empleado implements Jefes{

    public Jefatura(String nom, double sue, int año, int mes, int dia) {
        super(nom, sue, año, mes, dia);
        
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        double sueldojefe=super.getSueldo();
        return sueldojefe+incentivo;
    }

  
    public String tomarDecisiones(String decision) {
        return "un miembro de la direccion ha tomado la decicsio de "+decision;
    }

    
    public double estableceBonus(double bonificacion) {
        double prima=2000;
        return Trabajadores.bonusbase+bonificacion+prima;
    }
    
      private double incentivo; 
}
class Director extends Jefatura{

    public Director(String nom, double sue, int año, int mes, int dia) {
        super(nom, sue, año, mes, dia);
    }
    
}