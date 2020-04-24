package Day09_NestedIf_Ternary;

public class agegroups_nestedif {
    public static void main(String[] args) {
        /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
        int age = 27;
        String agegroup = "";


        if (age<150 && age >0){
            if (age<21){
                agegroup = "Teenager";
            }else if (age <55){
                agegroup = "Adult";
            }else if (age > 55){
                agegroup = "Senior";
            }


        }else{
            agegroup = "Invalid Entry";
        }
        System.out.println(agegroup);

        System.out.println("=======================");
        // do the same test with ternaries

        int age2 = 45;
        String ageGroup2="";
        if (age<150 && age>0){
            ageGroup2 = (age2<21)? "Teenager" : (age2>=21 && age2<55)? "Adult" : "Senior";
        }else{
            ageGroup2= "invalid Entry";
        }
        System.out.println(ageGroup2);





    }
}
