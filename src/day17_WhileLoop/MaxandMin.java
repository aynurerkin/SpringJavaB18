package day17_WhileLoop;

import java.util.Scanner;

public class MaxandMin {


    public static void main(String[] args) {
        /*
        1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
         */
        Scanner input = new Scanner(System.in);
        int MaxNumber = -9999;

            for (int i = 1; i <= 10; i++) {
                System.out.println("Enter a number");
                int num = input.nextInt();

                if (num > MaxNumber) {
                    MaxNumber = num;
                }
            }
            System.out.println(("The Maximum Number Is: " + MaxNumber));


        }


    }