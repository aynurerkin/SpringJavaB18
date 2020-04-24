package Day07_IfStatements;

public class vote {
    public static void main(String[] args) {
        int age = 17;
        boolean UScitizen = true;

        boolean eligible = age >=18 && UScitizen == true;
        if (eligible){
            System.out.println("You are eligible to vote.");
        }
        if (!eligible){
            System.out.println("You are not eligible to vote.");
        }

    }



}
