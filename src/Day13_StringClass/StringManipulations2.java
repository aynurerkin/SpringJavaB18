package Day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";
        //            012345678
        String SchoolName = str.substring(0,8);
        System.out.println(SchoolName);

        String FullName = "Kuzzat Altay";
        //                 01234567891011
        String FirstName= FullName.substring(0,5+1);
        String Lastname = FullName.substring(7,11+1);
        System.out.println(FirstName);
        System.out.println(Lastname);

        System.out.println("================================");

        String Murtaza = "Murtaza Nazeeri";
        //                0123456789

        String firstname = Murtaza.substring(0,6+1);
        String lastname = Murtaza.substring(8,14+1);
        System.out.println(firstname);
        System.out.println(lastname);

        String gmail= lastname.concat("_").concat(firstname);
        System.out.println(gmail + "@gmail.com");

        String name = "COVID18";
        name= name.replace("18", "19");
        System.out.println(name);

        String r1 = " I Love C++, C++ and more C++";
        r1= r1.replaceFirst("C++", "Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2= r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);









    }
}
