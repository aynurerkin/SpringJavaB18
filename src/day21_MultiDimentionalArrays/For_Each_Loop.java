package day21_MultiDimentionalArrays;

public class For_Each_Loop {
    public static void main(String[] args) {

        /*
        for)DataType VariableName : ArrayName){

        variable name represents each of the data in the array
        DataType MUST be matched with Array's data type
        number of execution
        }

         */

        int [] nums = {1,2,3,4};

        for(int eachElement : nums){
            System.out.println(eachElement);
        }

        String [] students = {"Muhtar", "Asiya", "Murodil"};

        for(String eachStudents : students){
            System.out.println(eachStudents);
        }

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for (int eachnum: arr1){
            if (eachnum<5){
                continue;
            }
            System.out.println(eachnum);
        }


        System.out.println("==================================");
        /*
        Reverse this sentence "I like Java" using for-each loop
         */

        String sentence = "I like Java";
        String [] words = sentence.split(" ");

        for(int i =words.length-1; i>=0;i--){
            System.out.println(words[i]);
        }








    }
}
