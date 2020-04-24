package day16_forloop;

public class divisibleby3 {
    public static void main(String[] args) {
        /*
        pring all the odd numbers between 1-100 that are divisible by 3 and 5
         */

        for ( int i = 1; i<=100; i++){
            if (i % 2 !=0){
                if (i % 3 ==0 && i % 5 == 0)
                System.out.print(i + " ");
            }
        }








    }
}
