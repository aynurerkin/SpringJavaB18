package Day07_IfStatements;

public class If_ElseStatements {

    public static void main(String[] args) {
        int number = 0;
        if (number <= 0){
            System.out.println(number + " is positive");
        }
        if (number < 0) {
            System.out.println(number + " is negative");
        }
        System.out.println("===================================");


        if (number >= 0){
            System.out.println(number + " is positive");
        } else {
            System.out.println( number + " is negative");
        }


        System.out.println("=============================");
        int a = 99;

        if (a % 2 == 0){
            System.out.println(a + " is even number.");
        }
        else{
            System.out.println(a + " is odd number.");
        }

        System.out.println("==============================");
        int age = 21;
        if (age>=21){
            System.out.println("You can purchase alcohol.");
        }
        else {
            System.out.println("Sorry, you cannot purchase alcohol");
        }

        System.out.println("===================================");

        boolean  testedpositveforcorona = false;
        if (testedpositveforcorona){
            System.out.println("Please self quarentine.");
        }
        else {
            System.out.println("Stay home, eat healthy and rest well. ");
        }

    }

}
