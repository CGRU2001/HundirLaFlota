/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos;

/**
 *
 * @author carlos
 */
public class Jugador {
    public Mapa mapa;
    public String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mapa = new Mapa(25, 25);
        for (int i = 0; i < mapa.getDimensiones().length; i++) {
            for (int j = 0; j < mapa.getDimensiones()[i].length; j++) {
                mapa.getDimensiones()[i][j] = new Barco();
            }
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
    
    
    
}
