package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {
        /*
        1. write a program that can return the unique characters from a string
        Ex: "AABCC" ==> "B"
         */

        String str = "AABCC";
        String result = ""; //"B"

        int count = 0;

        for (int i=0; i <= str.length()-1;i++){
            if (str.charAt(i)=='A'){
                count++;
            }
        }

        if (count == 1){  //if unique
            result += 'B';

        }







    }
}
