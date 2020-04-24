package Practice_325;

import java.sql.SQLOutput;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        /*
        for the loan:
        if has a job pays >$50,000 ==> might be ligible
        if has a good credit
        experience >2 years

         */

        int salary = 120000;
        short creditscore = 750;
        byte jobhistory = 2;


        if (salary > 50000){  //might be eligible
            if (creditscore > 600){
                if (jobhistory >=2){
                    System.out.println("You are qualified.");
                }else {
                    System.out.println("You do not have enough job history");
                }
            }else {
                System.out.println("You do not have a good credit history");
            }

        }else {
            System.out.println("You are not eligible.");
        }



    }
}
