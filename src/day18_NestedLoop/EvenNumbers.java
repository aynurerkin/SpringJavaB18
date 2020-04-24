package day18_NestedLoop;
/*
write a program with do-while loop to print even numbers in the same line seperated by a space.
between 0-100
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int num= 0;
        do {
            if (num % 2 ==0){
                System.out.print(num+" ");
            }

            num++ ;
        }while (num <= 100);
        System.out.println();

        int i = 1;
        do {
            System.out.println(i);
        }while (i<=5);

        System.out.println("==================");

        int z = 1;
        do{
            System.out.println(z);
            if (z==2){
                break;
            }
            z++;
        }while (z<=5);









    }
}
