package day15_forloop;

import java.util.Scanner;

public class tasks {

    public static void main(String[] args) {

        //task 1:
        /*
        input: Cybertek
               batch18
        output: CB (initials of both words in capital letters)

         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name:");
        String firstname = scan.next();

        System.out.println("Enter your last name");
        String lastname = scan.next();

        String initials = firstname.substring(0,1) + lastname.substring(0,1);
        initials = initials.toUpperCase();
        System.out.println("Initials are " + initials);

        System.out.println("=========================");
        // with charat method

        String initials2 = "" + firstname.charAt(0) + lastname.charAt(0);
        initials2 = initials2.toUpperCase();
        System.out.println(initials2);









    }
}
