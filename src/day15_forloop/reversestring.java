package day15_forloop;

public class reversestring {
    public static void main(String[] args) {
        /*
        reverse string Java
         */

        String str = "Java";
        //            0123
        int LastIndexnum = str.length()-1;

        for (int i = LastIndexnum; i>=0;i-- ){
            System.out.print(str.charAt(i));
        }











    }
}
