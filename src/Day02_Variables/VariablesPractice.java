package Day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /*
        salary, federal tax, state tax, loan, ssn
         */

        int salary = 120000;
        double FederalTax = 0.18;
        float StateTax = 0.065f;
        //salary after tax = salary (1- sum of taxes)

        double SumOfTaxes = FederalTax + StateTax;

        double salaryaftertax = salary * (1-SumOfTaxes);
        System.out.println(salaryaftertax);
        // salary after tax


        System.out.println("==============================");

        //area of the circle = r*r*pi

        double r = 5.5;
        double areaofcircle = r * r * 3.14;
        System.out.println(areaofcircle);


        System.out.println("================================");
        int kg = 60;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("=================================");
        double lira = 1000;
        double LiraInDollar = lira / 6.15;
        System.out.println(LiraInDollar);

        System.out.println("===================================");
        double rupi = 1000;
        double rupiindollar = rupi * 0.014;
        System.out.println(rupiindollar);

        System.out.println("===================================");
        double liter = 10000;
        double literingallons = 1000/3.7;
        System.out.println(literingallons);









    }
}
