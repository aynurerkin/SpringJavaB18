package day14_StringClass;

import java.util.Scanner;

public class credentials2 {
    public static void main(String[] args) {
        /*
        valid credentials are
        username: cybertek
        pw: cybertekschool

        username and PW cannot be empty, ==> output please enter your credentials
        if use entered both valid username and pw ==> log in
        if valid passwors, invalid username,==> username incorrect
        if both incorrect, ==> invalid username and pw
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUserName = input.next();

        System.out.println("Enter your password");
        String inputPassword = input.next();

        boolean logedIn = inputUserName.equals("cybertek") && inputPassword.equals("cybertekschool");
        boolean InvalidUserName = !inputUserName.equals("cybertek") && inputPassword.equals("cybertekschool");
        boolean InvalidPassword = inputUserName.equals("cybertek") && !inputPassword.equals("cybertekschool");

        if (!inputUserName.isEmpty() && !inputPassword.isEmpty() ){
            if (logedIn){
                System.out.println("Logging in...");
            } else if (InvalidUserName) {
                System.out.println("Your username is invalid");
            }else if (InvalidPassword){
                System.out.println("Your password is incorrect");
            }else{
                System.out.println("Both information are incorrect");
            }
        }else{
            System.out.println("Please enter your username and password.");
        }








    }
}
