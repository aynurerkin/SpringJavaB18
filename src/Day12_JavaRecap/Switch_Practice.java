package Day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {
        switch (3){
            case 1:
                System.out.println("Case 1");
                break; //exits switch statement
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Does not exist");
                break;
            default:
                System.out.println("Invalid Case");

        }
        System.out.println("===========================");

        int statusCode = 404;

        switch (statusCode){

            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 404:
                System.out.println("Does Not Exist");
                break;
            default:
                System.out.println("Invalid StatusCode");
        }


    }
}
