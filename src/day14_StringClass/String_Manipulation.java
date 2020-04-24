package day14_StringClass;

import java.sql.SQLOutput;

public class String_Manipulation {

    public static void main(String[] args) {
        String str = "I like to learn Java. I like to watch the movie Jumanji";

        int a1  = str.indexOf("J");
        System.out.println(a1);

        int a2 = str. indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I")+1 ; //second I index number
        System.out.println(a3);

        System.out.println("====================");

        String s = "I like Java, anf I like reading";
//                  01234567890
        int b1 = s.lastIndexOf("I");
        System.out.println(b1);

        int b2= s. lastIndexOf("l");
        System.out.println(b2);

        String z = "I like C#, C# is cool";
        int c1 = z.indexOf("C");
        System.out.println(c1);
        int c2 = z.lastIndexOf("C");
        System.out.println(c2);

        String x = "I like Java, Java is fun, Java programming is fun"; //find the second J
        int d1 = x.indexOf("Java is"); // second J index num
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2; //second J index num
        System.out.println(d2);

        int d3 = x.lastIndexOf("J"); // last J index number
        System.out.println(d3);

        int d4 = x.indexOf("Java p");
        System.out.println(d4);










    }



}
