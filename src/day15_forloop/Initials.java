package day15_forloop;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

/*
username: cybertek.batch12@gmail.com
pw: Javengers
write a program for the login functionality of tbe gmail account.
-usename can be entered either in upper or lower case
- pw MUST be entered as it is

- if the username does not end with "@gmail.com"
print "invalid email"

if username ends with gmail but username or pw did not match:
print "invalid username or pw"

if username and pw are correct:
print logged in successfully

 */
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String user = scan.nextLine();
        System.out.println("Enter your password:");
        String pass = scan.nextLine();

        String Username = "Ccybertek.batch12@gmail.com";
        String password = "Javengers";

        if (user.endsWith("@gmail.com")) {
            if (user.equalsIgnoreCase(Username)&&pass.equals(password)){
            }else{
        System.out.println("Invalid username or password");
            }

        }else{
            System.out.println("It is not a valid email address");
        }








    }

}

