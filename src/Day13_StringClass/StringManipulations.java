package Day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "Cybertek";
        //index #     01234567

        char ch1 = str.charAt(5);
        System.out.println(ch1);

        System.out.println(ch1 == 'T'); // prints false because java is case sensitive

        int totalLength = str.length();
        System.out.println(totalLength);

        System.out.println(totalLength>250); // false

        String str2 = "Today is a great day, Java is fun";
        int maxIndexNum = str2.length()-1;
        System.out.println(maxIndexNum);

        String s1 = "Cybertek";
                s1= s1.concat("School"); // CybertekSchool
        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language."));

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        System.out.println("=====================");
        String r1 = "Java is fun";
                r1= r1.concat(", and it's easy");
        System.out.println(r1);

        System.out.println("=====================");
        String name1= "CYBERTEK";
        name1= name1.toLowerCase();
        System.out.println(name1);

        System.out.println("==========================");
        String A1 = "        Today is a great day.        ";
        A1 = A1.trim();
        System.out.println(A1);










    }
}
