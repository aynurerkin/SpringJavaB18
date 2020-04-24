package Day07_IfStatements;

public class MinNumber {
    /*
write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 400.5;

        boolean aMinNumber = a < b && a < c ;
        boolean bMinNumber = b < c && b < a ;
        boolean cMinNumber = c < a && c < b;

        if (aMinNumber) {
            System.out.println(a + " is min number");
        }

        if (bMinNumber) {
            System.out.println(b + " is min number");
        }

        if (cMinNumber) {
            System.out.println(c + " is min number");
        }









    }



}

