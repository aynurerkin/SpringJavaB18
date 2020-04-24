package day16_forloop;
/*
print alphabets in accending/decending order
 */
public class alphabets {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z' ; ch++){
            System.out.print(ch + " ");
        }

        System.out.println(" ");

        for (char ch= 'Z'; ch >='A'; ch--){
            System.out.print(ch + " ");
        }

        System.out.println(" ");

        //print all the lowercase

        for (char ch = 'a'; ch<='z'; ch++){
            System.out.print(ch + " ");
        }






    }
}
