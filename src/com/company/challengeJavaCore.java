package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class challengeJavaCore {

    public static void main(String[] args) {

        int plays[] = Array.ArrayPlayers();

        Players player1 = new Players(plays, 1);
        Players player2 = new Players(plays, 2);
        int[] player1plays = player1.arrayPlayers();
        int[] player2plays = player2.arrayPlayers();

        Board board = new Board(player1plays, player2plays);
        int[][] finalmatriz = board.getMatriz();

        Winner winner = new Winner(finalmatriz);
        String message = winner.getWinner();
        System.out.println(message);
    }


    public static class Array{
        public static int[] ArrayPlayers(){
            File archivo = new File("datosJugadores.txt");
            int val = 0;
            int movements=42;
            int[] player_1 = new int[movements];
            try {
                Scanner linea = new Scanner(archivo);
                movements = linea.nextInt();
                while (linea.hasNext()) {
                    String players = linea.nextLine();
                    String[] divide = players.split(" ");
                    for (int i = 1; i < divide.length; i++) {
                        player_1[val] = Integer.parseInt(divide[i]);
                        val++;
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("The file does not exist");
            }
            int[] largerArray = Arrays.copyOf(player_1, movements);
            return largerArray;
        }
    }

}
