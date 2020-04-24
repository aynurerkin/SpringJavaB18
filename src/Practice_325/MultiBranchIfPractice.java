package Practice_325;
/*
multi-branch if statement: when there are more than 2 options/conditions
    if(condition1){
       A;
    }else if (condition2{
       B;
    }else if (condition 3){
       C;
    }else{
       D;
    }


 */
public class MultiBranchIfPractice {
    public static void main(String[] args) {
        int number = 0;

        if (number >0){
            System.out.println("It's positive number.");
        } else if (number<0){
            System.out.println("It's negative number.");
        }else{
            System.out.println("It is zero");
        }
        System.out.println("====================");

        int num1 =100;
        int num2= 200;

        if (num1 > num2){
            System.out.println(num1 + " is greater than " +num2);
        }else if (num2>num1){
            System.out.println(num2 + " is greate than " + num1);
        } else {
            System.out.println(num1 + " is equal to " +num2);
        }


        System.out.println("==========================");

        String browsername = "Safari";

        if (browsername == "FireFox"){
            System.out.println("FireFox is opening");
        } else if (browsername == "InternetExplorer"){
            System.out.println("IE is opening");
        }else if (browsername== "Safari"){
            System.out.println("Safari is opening.");
        }else if (browsername == "Google Chrome"){
            System.out.println("Google Chrome is opening");
        }else {
            System.out.println("Invalid Entry...");
        }







    }
}
