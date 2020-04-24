package Practice_325;

public class Nested_If {
    public static void main(String[] args) {
        byte dayoftheweek = 7;

        boolean validnumber = dayoftheweek >0 && dayoftheweek<8;
        String result = "";

        if (validnumber){
            if (dayoftheweek == 1 ) {
                result = "Monday";
            } else if ( dayoftheweek == 2){
                result= "Tuesday";
            }else if (dayoftheweek==3){
                result = "Wednesday";
            }else if (dayoftheweek==4){
                result = "Thursday";
            }else if (dayoftheweek==5) {
                result = "Friday";
            }else if (dayoftheweek==6) {
                result = "Saturday";
            }else if (dayoftheweek==7) {
                result = "Sunday";
            }

        }else {
            result = "Invalid Entry";
        }
        System.out.println(result);






    }
}
