package Day12_JavaRecap;


/*
create statement testing for "A B C D "
 */
public class TernaryPractice2 {
    public static void main(String[] args) {
        char ch1 = 'A';
        String result = (ch1 == 'A')? "A is selected. " : (ch1 == 'B')? "B is selected"
                : (ch1 == 'C')? "C is selected" : (ch1== 'D')? "D is selected": "Invalid Entry";

        System.out.println(result);


    }
}
