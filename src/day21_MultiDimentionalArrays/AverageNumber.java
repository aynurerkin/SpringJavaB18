package day21_MultiDimentionalArrays;
/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class AverageNumber {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,25,45};
        // average number = sum of all numbers / total number of elements (length)
        int length = arr.length;   //total number of elements
        int sum = 0;

        for (int i = 0; i< length;i ++ ){
            int eachNum = arr[i];
            sum += eachNum;
        }

        System.out.println(sum / length);





    }
}
