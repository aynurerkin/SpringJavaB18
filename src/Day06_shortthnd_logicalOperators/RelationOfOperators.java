package Day06_shortthnd_logicalOperators;

public class RelationOfOperators {
    /*
    > greater
    >= greater equal
    < less
    <= less equal
    == equal
    != not equal
    ! the logical opposite

     */
    public static void main(String[] args) {
        System.out.println(10>9);

        boolean resultA = 10>9 ;
        System.out.println(resultA);

        boolean resultB = 10 >=9;
        System.out.println(resultB);

        boolean resultC = 10 <=9;
        System.out.println(resultC);

        boolean resultD = 1100 < 1200;
        System.out.println(resultD);

        boolean resultE = 1000<1000;
        System.out.println(resultE);

        boolean resultF = 1000<=1000;
        System.out.println(resultF);


        /*
        in java, true == true. false == false
        !false equal to true, !true equal to false
        !false does not equal !true

         */

        boolean C = !false != !true;
        System.out.println(C);

        boolean D = true == !false;
        System.out.println(D);

        boolean E = !(!true);
        System.out.println(E);







    }





}
