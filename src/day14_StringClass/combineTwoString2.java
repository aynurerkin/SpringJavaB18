package day14_StringClass;

import java.util.Scanner;

/*

2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

 */
public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first word:");
        String word1 = input.next(); //apple
        word1 = word1.substring(1,word1. length()); //pple

        System.out.println("Enter second word:");
        String word2 = input.next(); //banana
        word2 = word2.substring(1,word2.length()); //anana

        String result = word1 + word2;

        System.out.println(result);











    }
}
