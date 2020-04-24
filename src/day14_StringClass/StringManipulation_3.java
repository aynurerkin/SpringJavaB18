package day14_StringClass;

public class StringManipulation_3 {
    public static void main(String[] args) {
        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true, ignores the case sensitivity

        boolean r1 = str1.contains("school");
        System.out.println(r1);
        System.out.println("=====================================");
        /*
        valid password must contain a special characters such as (!,_,$)
        valid password should not contain space
         */

        String Password = "mmasd1 235";

        if (Password.contains(" ")){
            System.out.println("Password cannot contain space.");
        }

        System.out.println("===========================================");

        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();
        if (webAddress.startsWith("www.")){
            System.out.println("valid entry");
        }else{
            System.out.println("invalid entry");
        }

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l")); // true
        System.out.println(s4.endsWith("School"));//true
        System.out.println(s4.endsWith("Cybertek School"));//true

        // every single gmail email ends with gmail.com

        String email = "aynur@yahoo.com";

        if (email.endsWith("gmail.com")){
            System.out.println("valid gmail");
        }else{
            System.out.println("invalid gmail");
        }






    }
}
