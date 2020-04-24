package Day08_Reviews;

public class MultiBranchIF {

    public static void main(String[] args) {
        int a = 100;

        boolean zero = a == 0;
        boolean negative = a < 0;
        boolean positive = a > 0;

        if ( zero){
            System.out.println("zero");
        }
        if (positive){
            System.out.println("positve");
        }
        if (negative){
            System.out.println("negative");
        }

        System.out.println("============================================");

        if (a == 0){
            System.out.println("zero");
        }
        else if (a>0){
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }





    }





}
