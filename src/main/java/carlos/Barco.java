/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos;
import java.util.Random;
/**
 *
 * @author carlos
 */
public class Barco {
    private int equipo; // Sólo podrá tener los valores 0 o 1
    private int ref;

    public Barco(int equipo) {
        Random r = new Random();
        if((equipo != 0) && (equipo != 1)){
            this.equipo = r.nextInt(2);
        }else{
            this.equipo = equipo;
        }
        
        this.ref = Math.abs(r.nextInt());
    }

    public Barco(){
        Random r = new Random();
        this.equipo = r.nextInt(2);
        this.ref = Math.abs(r.nextInt());
    }
    
    
    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }
    public void setEquipo(String equipo){
        if(equipo.equalsIgnoreCase("aliado")){
            this.equipo = 1;
        }
        else if(equipo.equalsIgnoreCase("enemigo")){
            this.equipo = 0;
        }
        // Si no coincide con ninguno de los dos, no hace nada
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        String aliado = (equipo == 1) ? "Aliado" : "Enemigo";
        return ("El barco con la referencia " + this.ref + " pertenece al equipo " + aliado);
    }
    
    
    
}
