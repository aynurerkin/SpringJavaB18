package day21_MultiDimentionalArrays;

public class Emails {
    public static void main(String[] args) {
        String [] emails = {"cybertek@gmail.com", "cybertek@yahoo.com", "cybertek@hotmail.com",
        "cybertek@outlook.com"};
        for (String eachemail : emails){
            if (!eachemail.endsWith("@gmail.com")){
                System.out.println(eachemail);
            }
        }



    }
}
