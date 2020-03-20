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
public class Jugador {
    private Mapa mapa;
    private String nombre;
    private int bando;
    

    public Jugador(String nombre, int bando) {
        Random r = new Random();
        this.nombre = nombre;
        this.bando = bando;
        mapa = new Mapa(25, 25, this.bando);
        for (int i = 0; i < 10; i++) {
            mapa.getDimensiones()[r.nextInt(25)][r.nextInt(25)] = new Barco(this.bando);
        }

        
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBando() {
        return bando;
    }

    public void setBando(int bando) {
        this.bando = bando;
    }
    public boolean voltear(int x, int y){
        if(mapa.getDimensiones()[x][y] != null){
            if(mapa.getDimensiones()[x][y].isDisponible()){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }
    
    
    
}
