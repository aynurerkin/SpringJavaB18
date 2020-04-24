package day17_WhileLoop;

import java.util.Scanner;

public class whilelooppractice {
    public static void main(String[] args) {
        /*
        ask user to enter yes or no
        if user enters something other than yes or no,repeat the previous step.
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter Yes or No:");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");
        while (!valid){
            System.out.println("please re-enter");
            word=input.next();

            if (word.equalsIgnoreCase("yes")|| word.equalsIgnoreCase("no")) {
                break;
            }
        }
        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        } else if (word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }else {
            System.out.println("Please re-enter Yes or No");
        }














    }
}
