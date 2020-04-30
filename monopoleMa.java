import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class monopoleMa {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        boolean numNotInRange = true;
        System.out.println("please enter the size of the game between 12 and 25 (include)");
        int numFromUser = myObj.nextInt();
        if (numFromUser > 25 || numFromUser < 12) {
            while (numNotInRange == true) {
                System.out.println("error, please enter the size of the game between 12 and 25 (include)");
                Scanner ob = new Scanner(System.in);
                numFromUser = ob.nextInt();
                if (numFromUser >= 12 && numFromUser <= 25) {
                    numNotInRange = false;
                }
            }
        }
        FlowOfGame flowOfGame = new FlowOfGame(numFromUser);
        flowOfGame.printBoard();
        myObj.close();
    }
}
