package Day12_JavaRecap;
import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your name");
        int num = input.nextInt();
        System.out.println(num);

        System.out.println("Enter your name:");
        String name = input.nextLine();


    }
}
