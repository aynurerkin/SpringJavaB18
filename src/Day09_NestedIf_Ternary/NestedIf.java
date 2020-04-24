package Day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        boolean USCitizen = true;
        int age = 18;

        if ( USCitizen){
            if(age >17){
                System.out.println("You are eligible to vote.");
            }else{
                System.out.println("Come back in few years.");
            }
        } else {
            System.out.println("You must be an US Citizen to be able to vote.");
        }
        System.out.println("======================");


        int score =45;
        String grade = "";

        if (score >=90 && score <=100){
            grade = "A";
        } else if (score >=80){
            grade = "B";
        } else if (score >=70){
            grade = "C";
        }else if (score >= 60){
            grade= "D";
        } else if (score <60 && score >=0){
            grade= "F";
        }else{
            grade = "Invalid";
        }

        System.out.println(grade);


        System.out.println("==========================");

        int score2= 75;
        String grade2= "";

        if(score2>=0 && score2<=100){
            grade2 = (score2 >=90 && score2 <=100)? "A" :(score2 >=80)? "B" : (score2 >=70)?"C"
                    :(score2 >= 60)? "D" : "F";

        }else{
            grade2 = "Invalid";
        }
        System.out.println(grade2);












    }

}
