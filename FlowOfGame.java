import java.io.*;
import java.lang.String;
import java.util.Scanner;


public class FlowOfGame {
    public static int numberOfPlayer =1;
    private int sizeOfGame;

    FlowOfGame(int sizeOfGame) {
        this.sizeOfGame = sizeOfGame;
    }

    player player = new player();


    void printBoard() {
            int[] position = new int[this.sizeOfGame];
            orderOfBoard();
            // moving action in game
            player.movingforwordPlayer();

           // after throwing the dices get the state without circle
            int stateInGame = player.getStateInGame();
            int afterCircleStateInGame = stateInGame % (this.sizeOfGame);
            for(int pos=0; pos < sizeOfGame ; pos++){
                if(pos == afterCircleStateInGame){
                    System.out.println("["+ numberOfPlayer + "]");
                }
            }
    }

    public void orderOfBoard() {
        // declaring array and allocating memory to array
        int[] numArray = new int[sizeOfGame];
        String[] valueOfEachCell = new String[sizeOfGame];
        for (int i = 0; i < sizeOfGame; i++) {
            numArray[i] = i;
            System.out.print(numArray[i] + " ");
        }
        System.out.println(" ");

        boolean flagBiggerThan10 = false;
        for (int i = 0; i < sizeOfGame; i++) {
            // a starting space
            if (i == 0) {
                valueOfEachCell[i] = "S";
            }
            // a tax space
            else if (i % 4 == 0) {
                if (i > 9) {
                    valueOfEachCell[i] = " T";
                } else {
                    valueOfEachCell[i] = "T";
                }
                // a property space
            } else if (i % 3 == 0) {
                if (i > 9) {
                    valueOfEachCell[i] = " P";
                } else {
                    valueOfEachCell[i] = "P";
                }
                // a lottery space
            } else if (i % 2 == 0) {
                if (i > 9) {
                    valueOfEachCell[i] = " L";
                } else {
                    valueOfEachCell[i] = "L";
                    // an empty space
                }
            } else {
                if (i > 9) {
                    valueOfEachCell[i] = " E";
                } else {
                    valueOfEachCell[i] = "E";
                }
            }
            System.out.print(valueOfEachCell[i] + " ");
        }
        System.out.println("\n");
    }
}



