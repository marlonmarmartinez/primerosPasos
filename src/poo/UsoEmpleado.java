
package poo;

import java.util.Date;
import java.util.GregorianCalendar;


public class UsoEmpleado {
    
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
        
        for (Empleado misempleado : misempleados) {
            misempleado.setSueldo(5);
            
        }
        for (Empleado misempleado : misempleados) {
            System.out.println("nombre " + misempleado.getNombre()+" sueldo " + misempleado.getSueldo()+" fecha contrato " + misempleado.getAltacontrato());
        }
    }
}
class Empleado{

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
}
class Jefatura extends Empleado{

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
    
   private double incentivo; 
}
class Director extends Jefatura{

    public Director(String nom, double sue, int año, int mes, int dia) {
        super(nom, sue, año, mes, dia);
    }
    
}