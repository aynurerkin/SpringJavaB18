package OfficeHours.Practice142020;

public class StringMethods {
    public static void main(String[] args) {
        //charAt(indexNumber): returns the char at the given index, char primitive

        String str1 = "Java";
               //      1234

        char ch1 = str1.charAt(3);
        System.out.println(ch1);

        // char ch2 = str1.charAt(4);
        //  System.out.println(ch2); //this will not print because 4 is out of range


        // Length method
        String str2 = "Cybertek School";
        System.out.println(str2.length());

        int total = str2.length();
        System.out.println(total);

        // concat(str): concatenation

        String str3 = "Cybertek";
        str3 = str3.concat(" School");//returns
        System.out.println(str3);

        String str5 = "CYBERTEK SCHOOL";
        str5 = str5.toLowerCase();
        System.out.println(str5);

        String str6 = "muhtar";
        str6 = str6.toUpperCase();
        System.out.println(str6);
        System.out.println(str6.toLowerCase());

        String str7 = "    Cybertek";
        System.out.println(str7);
        System.out.println(str7.trim());
        str7 = str7.trim();
        System.out.println(str7);


        String str8 = "   .  "; // will these white space will be removed?
        str8 = str8.trim();
        System.out.println(str8);
        System.out.println(str8.length());

        String sentence1 = "I like Java.";
        //                  012345678910
        String word1 = sentence1.substring(7,sentence1.length()); //"Java"

        String word2 = sentence1.substring(2,6);
        System.out.println(word2);

        String word3 = sentence1.substring(2,6) + sentence1.substring(7,sentence1.length());
        System.out.println(word3);













    }
}
