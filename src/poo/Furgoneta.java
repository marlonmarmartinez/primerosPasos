
package poo;


public class Furgoneta extends Coche{
    private int capacidadextra;
    private int plazasextras;

    public Furgoneta(int capacidadextra, int plazasextras) {
        super();//llama al constructor de la clase padre
        this.capacidadextra = capacidadextra;
        this.plazasextras = plazasextras;
    }

    public String getDtosFurgonetas() {
        return "la capacidad de carga es "+capacidadextra+" y las plazas extras son "+plazasextras;
    }
    
    
}
