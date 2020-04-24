package Day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 9;
        char ch1 = ' ';

        if (number > 0) {
            ch1 = '+';
        } else if (number < 0) {
            ch1 = '-';
        } else {
            ch1 = '0';
        }
        System.out.println(ch1);


        System.out.println("==========");

        char ch2 = (number > 0) ? '+' : (number < 0) ? '-' : '0';

        System.out.println(ch2);


        System.out.println("================");

        byte score = 45;
        String grade = "";
        if (score >= 90 && score <= 100) {
            grade = "excellent";
        } else if (score >= 80 && score < 90) {
            grade = "great";
        } else if (score >= 70 && score < 80) {
            grade = "good";
        } else if (score >= 60 && score < 70) {
            grade = "pass";
        } else if (score < 60 && score < 0){
            grade = "fail";
        }else{
            grade = "Invalid";
        }
        System.out.println(grade);

        System.out.println("====================================");
        String grade2 = (score >=90 && score <=100)?"excellent" :
                (score>=80 && score <90)? "great" : (score >= 70 && score < 80)? "good"
                        : (score >= 60 && score < 70)? "pass"
                                : (score < 60 && score < 0)? "fail" : "Invalid";
        System.out.println(grade2);






    }
}
