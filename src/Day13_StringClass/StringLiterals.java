package Day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1 = "cat"; //string pool
        String str2 = new String("cat"); // stored in Java heap

        System.out.println(str1+":"+str2);
        System.out.println(str1 == str2); // two different objects, false

        String str3 = "cat"; // goes to String pool

        System.out.println(str1 == str3); //true
        System.out.println("============================================");

        String s1 = "Java"; // string pool, immutable, cannot be modified.
        System.out.println(s1);

        s1= "JavaScript"; // new object will be created, and shared by s1. I'll print the latest.











    }
}
