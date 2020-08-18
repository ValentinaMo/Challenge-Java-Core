package com.company;


public class Players {
    private int[] totalPlays;
    private int playerNumber;

    public Players(int[] totalPlays, int playerNumber) {
        this.totalPlays = totalPlays;
        this.playerNumber = playerNumber;
    }

    //Plays of each player
     public int[] arrayPlayers(){
        int contadorPlays = 0;
        int resultado = 0;
        int i = 0;

        if(playerNumber == 1){
            resultado = Math.round(totalPlays.length/2);
            resultado = totalPlays.length - resultado;
            i = 0;
        }
        if(playerNumber == 2){
            resultado = Math.round(totalPlays.length/2);
            i = 1;
        }
        int[] playerplays = new int[resultado];
        for (i = i; i < totalPlays.length; i = i + 2) {
            playerplays[contadorPlays] = (totalPlays[i]);
            contadorPlays ++;
        }
        return playerplays;
    }
}
