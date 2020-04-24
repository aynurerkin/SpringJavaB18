package day15_forloop;

public class Reverse {
    /*
    write program that can reverse the following string:

    String str = "Java";
    output = avaJ
    please provide two solutions:
    first solution, you MUST use substring method
    second solution, you MUST use charAt solution

     */
    public static void main(String[] args) {
        String str = "Java";
        //            0123

        String reverse1= "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        System.out.println(reverse1);

        String reverse2 = str.substring(3) + str.substring(2) + str.substring(1) + str.substring(0);
        System.out.println(reverse2);





    }
}
