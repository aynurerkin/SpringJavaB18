package day23_methods;

import java.util.Scanner;

public class methods_withparameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        byte age = scan.nextByte();

        Eligibletobuyalcohol(age);


    }



    public static void Eligibletobuyalcohol(int age){
        if (age>=21){
            System.out.println("Eligible to by alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
    }
}
