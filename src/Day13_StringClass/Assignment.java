package Day13_StringClass;

import java.util.Scanner;

/*
Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
 */
public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.nextLine();
        System.out.println("Enter your last name:");
        String lastName = input.nextLine();

        String firstInitial = firstName.substring(0,1).toUpperCase();
        String lastInitial = lastName.substring(0,1).toUpperCase();


        System.out.println(firstInitial+lastInitial);




    }


}
