package com.company;

public class Board {
    private int[] player1plays;
    private int[] player2plays;
    private int rows = 7;
    private int columns = 6;
    private int[][] matriz = new int[rows][columns];
    private int val_player1 = 1;
    private int val_player2 = 5;
    private int[] increment_columns = new int[rows];

    public Board(int[] player1plays, int[] player2plays) {
        this.player1plays = player1plays;
        this.player2plays = player2plays;
    }

    public int[][] getMatriz() {

            for (int j = 0; j < player2plays.length; j++) {
                rowsAndColumns(player1plays[j], val_player1);
                rowsAndColumns(player2plays[j], val_player2);
            }
        return matriz;
    }

    private int[][] rowsAndColumns(int player_1, int val){
        if (player_1 <= 6){

            switch (player_1) {
                case 1:
                    if (increment_columns[0] >= 7){
                        System.out.println("The column 1 is full. Please play with an other column.");
                        break;
                    } else {
                        matriz[increment_columns[0]][0] = val;
                        increment_columns[0] = increment_columns[0] + 1;
                        break;
                    }
                case 2:
                    if (increment_columns[1] >= 7){
                        System.out.println("The column 1 is full. Please play with an other column.");
                        break;
                    } else {
                        matriz[increment_columns[1]][1] = val;
                        increment_columns[1] = increment_columns[1] + 1;

                        break;
                    }

                case 3:
                    if (increment_columns[2] >= 7){
                        System.out.println("The column 1 is full. Please play with an other column.");
                        break;
                    } else {
                        matriz[increment_columns[2]][2] = val;
                        increment_columns[2] = increment_columns[2] + 1;
                        break;
                    }

                case 4:
                    if (increment_columns[3] >= 7){
                        System.out.println("The column 1 is full. Please play with an other column.");
                        break;
                    } else {
                        matriz[increment_columns[3]][3] = val;
                        increment_columns[3] = increment_columns[3] + 1;
                        break;
                    }

                case 5:
                    if (increment_columns[4] >= 7){
                        System.out.println("The column 1 is full. Please play with an other column.");
                        break;
                    } else {
                        matriz[increment_columns[4]][4] = val;
                        increment_columns[4] = increment_columns[4] + 1;
                        break;
                    }

                case 6:
                    if (increment_columns[5] >= 7){
                        System.out.println("The column 1 is full. Please play with an other column.");
                        break;
                    } else {
                        matriz[increment_columns[5]][5] = val;
                        increment_columns[5] = increment_columns[5] + 1;
                        break;
                    }
                default:
                    System.out.println("Error");
                    break;
            }
        } else {
            System.out.println("The column: " + player_1 + " does not exist. Please insert a column from (1 to 6)");
        }

        return matriz;
    }
}
