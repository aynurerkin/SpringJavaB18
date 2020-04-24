package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String [] months = { "Jan", "Feb", "Mar", "Apr", "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
           //                  0      1      2      3      4     5     6     7     8     9    10     11

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
            int num = input.nextInt();


                String result= months [num-1];

        System.out.println(result);







    }
}
