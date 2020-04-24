package day23_methods;
/*
decleration of methods:
access-modifier specifier return-type  methodName(){
       statements;
}

Access modifier: public, protected, default, private
specifier: static, final, abstract, synchronized

step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
 */
    public class methods {
        public static void main(String[] args) {
            System.out.println("Hello Cybertek");
            printhello5();
            System.out.println("Hello Batch18");
            printhello5();
            System.out.println("Hello Saim");
            printhello5();

     }
    public static void printhello5(){
        for (int i =0; i<5; i++){
            System.out.println("Hello World");
        }
    }
}
