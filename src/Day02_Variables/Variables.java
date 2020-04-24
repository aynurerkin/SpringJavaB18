package Day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /*
        declare variables:
        datatype variableName = Data
         */

        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        //  byte num1 = 130  exceeds the range of the byte
        // byte num = 2.5;  byte, short, int, long they only accept whole number


        System.out.println(12345);
        // by default compiler takes it as int primitive

        int n1 = 20000;
        int n2 = 100000000;
        long n4 = 9999999999999l;
        // forcefully telling the compiler that this is long data number
        // the "l" at the end will not print because it knows it is a number.

        // System.out.println(9999999999999);
        // compiler automatically thinks its a int number.

        System.out.println("==========================================");






    }
}
