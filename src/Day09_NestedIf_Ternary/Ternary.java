package Day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = " ";

        if (num % 2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }

        // in ternary: ? means the if, : else keyword

        System.out.println("==================================");

        String result2 = (num %2 == 0)? "Even" : "Odd";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("============================");
        int num1= 100;
        int num2= 200;
        int max = 0;

        if (num1>num2){
            max = num1;
        } else{
            max = num2;
        }
        int max2= (num1 > num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(max2);

        System.out.println("===================");

        String str = "";
        if(true){
            str = "Hello";
        } else {
            str = "Hola";
        }
        System.out.println(str);

        String str2 = (true)? "Hello" : "hola";
        System.out.println(str2);







    }

}
