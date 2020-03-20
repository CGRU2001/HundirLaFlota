/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String[] nombre = new String[]{"Pedro", "Jose", "Ángel", "Rosa", "Angelina", "Josefa"};
        int players;
        int x, y;
        String player1;
        String player2;
        do {
            System.out.print("Introduce el número de jugadores que jugarán en esta ocasión: ");
            players = s.nextInt();
        } while ((players != 1) && (players != 2));

        s.nextLine();
        
        System.out.print("Introduce el nombre del jugador aliado: ");
        player1 = s.nextLine();

        if (players == 1) {
            player2 = nombre[r.nextInt(6)];
            System.out.println("Te enfrentarás contra " + player2);
        } else {
            System.out.print("Introduce el nombre del jugador de la oposición: ");
            player2 = s.nextLine();
        }
        
       
        Jugador aliados = new Jugador(player1, 1);
        Jugador oposicion = new Jugador(player2, 0);

        System.out.println(aliados.getMapa());

        
        do{
            System.out.println("--------------------------------");
            System.out.println("Tu turno");
            System.out.println("--------------------------------");
            System.out.print("Introduce la posición en el eje X de la posición que quieras tirar: ");
            x = s.nextInt();
            System.out.print("Introduce la posición en el eje X de la posición que quieras tirar: ");
            y = s.nextInt();
            try{
            if(oposicion.voltear(x, y)){
                oposicion.getMapa().eliminarBarco(x, y);
                System.out.println("Se ha eliminado el barco que se encontraba en la posición " + x + "X" + y );
            }
            }catch(IndexOutOfBoundsException iobe){
                System.out.println("La posición " + x + "X" + y + " no existe");
            }
            System.out.println("--------------------------------");
            System.out.println("Turno de la oposición...");
            System.out.println("--------------------------------");
            try{
                Thread.sleep(1000);
                x = r.nextInt(25);
                y = r.nextInt(25);
                if(aliados.voltear(x, y)){
                    aliados.getMapa().eliminarBarco(x, y);
                    System.out.println("El enemigo ha eliminado tu barco en la posición " + x + "X" + y);
                }
                else{
                    System.out.println("El enemigo no ha conseguido eliminar ningún barco de tu flota");
                }
            }catch(Exception e){
                
            }
            
        }while(oposicion.getMapa().getBarcos() != 0 || aliados.getMapa().getBarcos() != 0);
        if(aliados.getMapa().getBarcos() == 0){
            System.out.println("Has perdido...");
        }
        System.out.println("¡Has ganado!");

    }
}
