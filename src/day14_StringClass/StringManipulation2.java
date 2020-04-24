package day14_StringClass;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str = "";
        boolean bool1= str.isEmpty();
        System.out.println(bool1);

        String username = "";
        if (username.isEmpty()){
            System.out.println("Please provide the username first");
        }

        String z1 = "Tiger";
        String z2= new String("Tiger");
        String z3 = "Tiger";

        // ==
        System.out.println(z1 == z2); //false
        System.out.println(z2 == z3); //false
        System.out.println(z1 == z3); //true

        // equals();

        System.out.println(z1.equals(z2)); // true
        System.out.println(z2.equals(z3)); // true
        System.out.println(z1.equals(z3)); // true







    }
}
