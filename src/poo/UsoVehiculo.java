
package poo;

import javax.swing.JOptionPane;


public class UsoVehiculo {
    
    public static void main(String[] args) {
        Coche carro=new Coche();
        carro.setColor("verde");
        Furgoneta furgo=new Furgoneta(582, 7);
        furgo.setColor("negro");
        furgo.setAsientoscuero("si");
        furgo.setClimatizador("si");
        System.out.println(carro.getDatosGenerales()+" "+carro.getColor());
        System.out.println(furgo.getDtosFurgonetas()+" "+furgo.getDatosGenerales());
    }
}
