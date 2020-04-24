package OfficeHours.Practice_04152020;
import java.util.Arrays;


public class ArraysUtility {
    /*
    Arrays.sort();  sorts arrays in ascending order
    Arrays.equal();
    Arrays.toString();

    Arrays.deepToString()
     */

    public static void main(String[] args) {
        int [] arr = {9,10,8,65,8,6,5,89};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int [] salaries = {10000,20000,30,5000,200000};
        int length = salaries.length;
        int lastIndex = length -1;

        Arrays.sort(salaries);

        System.out.println(Arrays.toString(salaries));
        System.out.println("Minimum salary is "+ salaries [0]);
        System.out.println("Maximum salary is " + salaries[lastIndex]);







    }
}
