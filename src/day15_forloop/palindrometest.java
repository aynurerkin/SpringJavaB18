package day15_forloop;

import java.util.Scanner;

public class palindrometest {
    public static void main(String[] args) {
        /*
        write a program to identify if a string is palindrome or not.
        print yes or now
        ex: anna palindrome is anna. level <-> level
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your words:");
        String word = input.nextLine();
            String reversedword = "";


            for(int i = word.length()-1;i >= 0 ; i--){
                reversedword += word.charAt(i);
            }

        boolean palidrome = word.equalsIgnoreCase(reversedword);
        System.out.println(palidrome);









    }
}
