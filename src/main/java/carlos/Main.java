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
        String player1;
        String player2;
        do {
            System.out.print("Introduce el número de jugadores que jugarán en esta ocasión: ");
            players = s.nextInt();
        } while ((players != 0) && (players != 2));

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
        
        

    }
}
