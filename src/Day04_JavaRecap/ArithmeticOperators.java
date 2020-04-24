package Day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10/3; // will print 3
        System.out.println(a);

        System.out.println(10/4); //will print 2

        double d = 10/4; // double d = 2;
        // d==> 2.0
        System.out.println(d); //will print 2.0

        System.out.println(10.0/4); //2.5

        System.out.println(10/4.0); // will print 2.5

        System.out.println(10.0/4.0); // will print 2.5

        float f1 = 10/4;  //float f1 = 2;
        // why 2? int will only return a whole number;
        System.out.println(f1);

        boolean evenNumber = 25 % 2 == 0;
        // 1 == 0 == > 0 false
        // ig 25 /2 has a remainder of zero, then it's even number

        System.out.println(evenNumber);
        System.out.println(25 % 2);

        boolean oddNumber = 22 % 2!= 0; //odd number
        //   0!=0 ==>false
        System.out.println(oddNumber);//false




    }



}
