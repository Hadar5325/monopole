import java.util.Scanner;
import java.io.*;


public class monopoleMa {

    public static void main(String args[]) {
        boolean numNotInRange = true;
        System.out.println("please enter the size of the game between 12 and 25 (include)");
        Scanner myObj = new Scanner(System.in);
        int numFromUser = myObj.nextInt();
        if (numFromUser > 25 || numFromUser < 12) {
            while (numNotInRange == true) {
                System.out.println("error, please enter the size of the game between 12 and 25 (include)");
                Scanner ob = new Scanner(System.in);
                int num = ob.nextInt();
                if (num >= 12 && num <= 25) {
                    numNotInRange = false;
                }
            }
        }
    }
}
