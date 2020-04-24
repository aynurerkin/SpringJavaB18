package Day09_NestedIf_Ternary;

public class IfStatement_withoutcurlybraces {
    public static void main(String[] args) {
        int number = 100;
        if (number %2 ==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
        // If statement without curly braces: the block can only contain a single statement without the curly brace

        if (true){ // if the block containing more than one statement we must give curly braces
            System.out.println("Hello");
            System.out.println("condition is true");
            System.out.println("Test executed");
        }






    }

}
