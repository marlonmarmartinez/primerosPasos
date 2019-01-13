
package poo;


public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoplataforma;
    private String color;
    private int pesototal;
    private boolean asientoscuero,climatizador;
    
    public Coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        pesoplataforma=500;
    }

   

    public String getDatosGenerales() {
        return "la plataforma tiene "+ruedas+" ruedas. mide "+largo/1000+" cm. con un ancho de "+ancho+" cm. y un peso de plataforma de "+pesoplataforma+" kilos";
    }

    public void setColor(String color) {
        this.color=color;
    }

    public String getColor() {
        return "el color del coche es "+color;
    }

    public String isAsientoscuero() {
        if(asientoscuero){
            return "el coche tiene asientos de cuero";
        }else{
            return"el coche no tiene asientos de cuero";
        }
    }

    public void setAsientoscuero(String asientoscuero) {
        this.asientoscuero = asientoscuero.equals("si");
    }

    public String isClimatizador() {
        if(climatizador){
            return "el coche tiene climatizador";
        }else{
            return"el coche no tiene climatizador";
        }
    }

    public void setClimatizador(String climatizador) {
       if(climatizador.equals("si")){
        this.climatizador = true;
       }else{
           this.climatizador=false;
       }
    }
public String dimePesoCoche(){
    int pesocarroceria=500;
    pesototal=pesoplataforma+pesocarroceria;
    if(asientoscuero){
        pesototal=pesototal+50;
    }
    if(climatizador){
        pesototal=pesototal+20;
    }
    return"el peso del coche es "+pesototal;
} 
    public int precioCoche(){
        int preciofinal=10000;
        if(asientoscuero){
            preciofinal+=2000;
        }
        if(climatizador){
            preciofinal+=1500;
        }
        return preciofinal;
    }
}
