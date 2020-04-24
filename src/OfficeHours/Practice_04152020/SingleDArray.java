package OfficeHours.Practice_04152020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        int a = 100;
        int [] arr = {100, 200, 300};
        //             0    1    2
        System.out.println(arr[1]); //200

        for (int i = 0; i< 3; i++){
            System.out.println(i);

        }
        System.out.println("==================================");
        int j = 0;
        while (j < 3){
            int num = arr [j];
            System.out.println(num);
            j++;
        }
        System.out.println("=====================================");
        String [] names = {"John", "Aaron", "Louise"};
        int length = names.length;
        String [] nameReverse = new String [length];

        nameReverse[0] = names [2];
        nameReverse[1] = names [1];
        nameReverse[2] = names [0];

        System.out.println(Arrays.toString(nameReverse));






    }
}
