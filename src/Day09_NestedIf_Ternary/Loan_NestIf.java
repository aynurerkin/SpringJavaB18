package Day09_NestedIf_Ternary;

public class Loan_NestIf {
    public static void main(String[] args) {
        double salary = 40000;
        byte workhistory = 1;

        if (salary >=30000){//might be qualified
            if (workhistory>=2){
                System.out.println("you are qualified for loan");
            }
        }else {
            System.out.println("You are not qualified");
        }








    }




}
