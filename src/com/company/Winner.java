package com.company;

public class Winner {
    private int rows = 7;
    private int columns = 6;
    private int[][] finalmatriz;
    private String winner;
    private int flag = 0;

    public Winner(int[][] finalmatriz) {
        this.finalmatriz = finalmatriz;
    }

    public String getWinner() {
        vertical();
        horizontal();
        diagonal();

        if(flag == 1) {
            winner = "player 1 won ";
        }
        if(flag == 2){
            winner = "player 2 won ";
        }
        if(flag == 0){
            winner = "anyone's won";
        }

        return winner;
    }

    private int vertical(){
        for (int i = 0; i < columns; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum = sum + finalmatriz[j][i];
                if(sum == 4){
                    flag = 1;
                }
                if(sum == 20){
                    flag = 2;
                }
            }
       }
        return flag;
    }

    private int horizontal(){

        for (int i = 0; i < rows; i++){
            int sum = 0;
            for(int j = 0; j < columns; j++){
                sum = sum + finalmatriz[i][j];
                if(sum == 4){
                    flag = 1;
                }
                if(sum == 20){
                    flag = 2;
                }
            }
        }
        return flag;
    }

    private int diagonal(){
        for(int i=0; i<= 3; i++){
            for(int j=0; j<3; j++){
                switch ((finalmatriz[i][j] + finalmatriz[i+1][j+1] + finalmatriz[i+2][j+2] + finalmatriz[i+3][j+3])){
                    case 4:
                        flag = 1;
                        break;
                    case 20:
                        flag = 2;
                        break;
                }

            }
        }
        for(int i=0; i<3; i++){
            for(int j=3; j<6; j++){
                switch ((finalmatriz[i][j] + finalmatriz[i+1][j-1] + finalmatriz[i+2][j-2] + finalmatriz[i+3][j-3])){
                    case 4:
                        flag = 1;
                        break;
                    case 20:
                        flag = 2;
                        break;
//
                }
            }
        }
        return flag;

    }
}
