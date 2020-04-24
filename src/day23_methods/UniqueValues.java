package day23_methods;

/*
warmup task:

        1.  Write a program that can print out the unique values from a String Array
        Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output:  A
        C
        MUST use for each loop

 */
public class UniqueValues {
    public static void main(String[] args) {

        String []arr = {"A", "B","A","C", "D","D",}; //B

        //"A"

        int count = 0;
        for (String each2: arr){
            if(each2.equals(each2)){
                count ++;
            }
        }





    }
}
