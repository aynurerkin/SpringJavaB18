package Day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {


        /*
        A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        Write a program that declares three integers as angles and check whether a triangle is
        valid or not.
         */
        double angel1 = 30;
        double angel2 = 50;
        double angel3= 60;

        short sumOfAngels = (short)(angel1 + angel2 + angel3);

        boolean validTriangle = sumOfAngels == 180;
        if (sumOfAngels==180){
            System.out.println("The shape is a triangle.");
        }
        if (sumOfAngels!=180){
            System.out.println("The shape is not a valid triangle.");
        }










    }
}
