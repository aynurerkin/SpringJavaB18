package day10_switchscanner;

public class LocalVariables {
    public static void main(String[] args) {

        //declare variable: date type, and variable name

        int a = 0;

        if (true){
            System.out.println(a);
        }
       // System.out.println(b); local variable cannot be used outside its block

        switch (3){
            case 1:
                int c = 100;
            case 2:
                //System.out.println(c);  the local variables c belongs to the case block 1
        }

        if (9>10){
            int t =100;
        }else if (11>10){
            int y =200;
        }else if (12>10){
            int z = 300;
        }






    }
}
