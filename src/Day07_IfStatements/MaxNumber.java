package Day07_IfStatements;
/*
       task: write a java program that accepts three numbers and return the maximum number
               (assume that none of them are equal)
        */
public class MaxNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        //cannot use || or else it will return both or either.
        boolean aGreater = a > b && a >c;
        //if a is greater than both b and c, then a is greater.
        boolean bGreater = b > a && b > c;
        //if b is greater than both a and c, then b is greater.
        boolean cGreater = c > a && c > b;
        //if c is greater than both a and b, then b is greater.

        if (aGreater){
            System.out.println(a + " is greater number.");
        }

        if (bGreater) {
            System.out.println(b + " is greater number.");
        }

        if (cGreater) {
            System.out.println(c + " is greater number");
        }



    }


}
