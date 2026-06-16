package methodStudy;

public class StaticMethod1 {
    static void main(String[] args) {  //how to call static method from same class??
        //in one class only one main method we use and multiple
        // regular method we can use.
        test();              //we can call static method from same class method name only
        test1();             //that method name in static word that known as static method


        StaticMethod2.b();  //calling static method from another class
        StaticMethod2.c();   //ClassName.methodName();   (use this format)

        StaticMethod2 staticMethod2 = new StaticMethod2();  //Calling Nonstatic method from another class
        staticMethod2.testA();    //Called Nonstatic method from another class
        staticMethod2.testB();     //Called Nonstatic method from another class
        //ClassName objectName= new ClassName(); Use this format
    }


    public static void test() {    //static regular method
        System.out.println("This is Deposit Option");

    }

    public static void test1() {      //static regular method
        System.out.println("This is Check Balance");

    }
}