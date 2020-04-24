package OfficeHours.Practice_04082020;

public class ForLoop_tasks {
    public static void main(String[] args) {

        /*
        print all numbers that are divisible by 3 or 5, numbers between 0-100
         */

        for (int i = 0; i <= 100; i++ ){
            if (i % 3 == 0 || i % 5 ==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("=====================================");

        //reverse practice

        String name = "Muhtar";
                //     012345
        String result = "";
        int lastindex= name.length()-1;
        for(int i = lastindex; i>=0; i--){
            result = result + name.charAt(i);
        }
        System.out.println(result);

        if(name.equalsIgnoreCase(result)){
            System.out.println(name + " is palidrome name.");
        }else{
            System.out.println(name + "is not palindrome name");
        }


    }
}
