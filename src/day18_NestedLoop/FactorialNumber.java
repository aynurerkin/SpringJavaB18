package day18_NestedLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        2. write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number:");
        int num = scan.nextInt();

        int result = 1;
        while (num >= 1){
            result *= num;
            // result = result * num;     is also correct
            num--;
        }
        System.out.println(result);




    }
}
