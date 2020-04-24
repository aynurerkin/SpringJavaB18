package Day12_JavaRecap;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //7921 JonesBranch Dr., McLean VA 22034
        // fullAddress: Building-number  Street  City   State  Zipcode

        System.out.println("Building Number: ");
        int BuildingNumber = input.nextInt();

        System.out.println("Building number is: " + BuildingNumber);

        input.nextLine(); //used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street = input.nextLine();

        System.out.println("Street IS:" + street);

        System.out.println("Enter the zipcode: ");
        int zipCode = input.nextInt(); // 22034

        input.nextLine(); //take out the Enter

        System.out.println("Enter the city name and state separated by comma and space");
        String cityState = input.nextLine();

        String fulAddress = BuildingNumber + " " + street + ", " + cityState + " "+zipCode;
        System.out.println(fulAddress);












    }
}
