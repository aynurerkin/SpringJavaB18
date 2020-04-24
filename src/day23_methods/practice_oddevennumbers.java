package day23_methods;

/*
1. write a method that can print all odd number between 1-100
2.write a method that can print all even number between 1-100
 */
public class practice_oddevennumbers {
    public static void main(String[] args) {


        evenNumber1_100();


    }

    public static void evenNumber1_100(){
        for(int i =1; i<=100; i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void oddNumber1_100(){
        for(int i =1;i<.100;i++){
            if (i%2 !=0){
                System.out.print(i+ " ");
            }
        }
    }

}

