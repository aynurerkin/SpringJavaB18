package day14_StringClass;

public class webaddressvalidator {
    public static void main(String[] args) {
     /*
     write a program that can validate if a web address is valid
     valid web address:
     must start with www.
     must end with .com, .edu, .net, .gov
      */

     String webaddress = "www.google.cm";
            webaddress = webaddress.toLowerCase();
     boolean validending = webaddress.endsWith(".com")|| webaddress.endsWith("edu.com")
             || webaddress.endsWith(".net") || webaddress.endsWith(".gov");
     if (webaddress.startsWith("www.") && validending){
         System.out.println("valid web address");
     }else{
         System.out.println("Invalid Entry");
     }


    }
}
