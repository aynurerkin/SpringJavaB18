package Practice_325;
/*
if-else statement:
             if(condition){
                statementA;
             }else {
                statementB;
             }
             only one of the blocks gets executed.
 */
public class If_Else_Practice {
    public static void main(String[] args) {
        int num = 100;

        if(num % 2!=0){
            System.out.println(num + " is odd number");
        }else
            System.out.println(num + " is even number");

        System.out.println("=====================");

        // eligibility for buying alcohol

        int age = 21;
        if (age >= 21){
            System.out.println("You are eligible to buy alcohol.");
        }else {
            System.out.println("You are not eligible.");
        }

        System.out.println("=================");

        //Gender practice

        boolean genderMale = true;

        if (genderMale){
            System.out.println("Gender is male");
        }else{
            System.out.println("Gender is female.");
        }

        System.out.println("======================");

        // eligibility for voting practice

        boolean USCitizen = true;
        int ageofperson = 30;

        if (USCitizen == true && ageofperson>=18){
            System.out.println("Eligible to vote.");
        }else{
            System.out.println("Not eligible to vote.");
        }








    }
}
