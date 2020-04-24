package Day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        /*
        ask use enter:
        salary
        full name
        company name
        ssn
        job title
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        input.nextLine(); //Enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your company name:");
        String companyName = input.nextLine();

        System.out.println("Enter your ssn:");
        long ssn = input.nextLong();

        input.nextLine();
        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();


        System.out.println("Full name is: " + fullName);
        System.out.println("Job title is: " + jobTitle);
        System.out.println("Company name is: " + companyName);
        System.out.println("SSN is: "+ ssn);
        System.out.println("Salary is: " + salary);


    }
}
