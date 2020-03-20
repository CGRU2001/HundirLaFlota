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
public class Mapa {

    private Barco[][] dimensiones;
    private int equipo;
    private int barcos = 10;

    public Mapa(int width, int height, int equipo) {
        this.dimensiones = new Barco[width][height];
        this.equipo = equipo;
    }

    public Barco[][] getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Barco[][] dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getBarcos() {
        return barcos;
    }

    public void setBarcos(int barcos) {
        this.barcos = barcos;
    }
    public void eliminarBarco(int x, int y){
        this.dimensiones[x][y].eliminarBarco();
        this.barcos--;
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.dimensiones.length; i++) {
            for (int j = 0; j < this.dimensiones[i].length; j++) {
                try {
                    if (dimensiones[i][j].getEquipo() == this.equipo) {

                        System.out.println(dimensiones[i][j].toString() + " y se encuentra en la posición " + i + "X" + j);

                    }
                } catch (NullPointerException npe) {
                    System.out.print("");
                }
            }
        }
        return "";
    }

}
