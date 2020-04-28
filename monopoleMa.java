import java.util.Scanner;
import java.io.*;
import java.lang.String;

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
                numFromUser = ob.nextInt();
                if (numFromUser >= 12 && numFromUser <= 25) {
                    numNotInRange = false;
                }
            }
        }
        // declaring array and allocating memory to array
        int[] numArray = new int[numFromUser];
        String[] valueOfEachCell = new String[numFromUser];
        for (int i = 0; i < numFromUser; i++) {
            numArray[i] = i;
            System.out.print(numArray[i] + " ");
        }
        System.out.println(" ");

        boolean flagBiggerThan10 = false;
        for (int i = 0 ; i < numFromUser ; i++){
            // a starting space
            if( i == 0){
                valueOfEachCell[i] = "S";
            }
            // a tax space
            else if( i % 4 ==0){
                if (i > 9) {
                    valueOfEachCell[i] = " T";
                }else {
                    valueOfEachCell[i] = "T";
                }
                // a property space
            }else if( i % 3 == 0){
                if (i > 9) {
                    valueOfEachCell[i] = " P";
                }else {
                    valueOfEachCell[i] = "P";
                }
                // a lottery space
            }else if( i % 2 == 0){
                if (i > 9) {
                    valueOfEachCell[i] = " L";
                }else {
                    valueOfEachCell[i] = "L";
                    // an empty space
                }
            }else{
                if (i > 9) {
                    valueOfEachCell[i] = " E";
                }else {
                    valueOfEachCell[i] = "E";
                }
            }
            System.out.print(valueOfEachCell[i]+ " ");
        }
    }
}
