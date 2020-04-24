package day21_MultiDimentionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

    String name = "Java";
    char [] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);


        System.out.println("===============================");
        String str = "I like Java";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        task:
        reverse the sentence
         */

        String sentence = "Today is a great day";
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); // will print [Today, is, great, day]
        String result = "";

        for (int i = words.length-1; i>=0; i--){
            String eachwords = words [i];
            result += eachwords + " ";
        }

        System.out.println(result);


        String str2 = "abcd";
        String arr2[] = str2.split("");
        System.out.println(Arrays.toString(arr2));



    }
}
