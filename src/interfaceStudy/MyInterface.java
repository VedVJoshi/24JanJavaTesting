package interfaceStudy;

public interface MyInterface {
    // --> -->//interface class **


//    static void main(String[] args) {  error --> we can not create the object in interface class --> all method are abstract
//        MyInterface myInterface=new MyInterface();
//        myInterface.test1();
//    }
    int x=10; //by default final and public variable
   // x=x+10; --> error --> final variable can not re-assign or re-initialize

    void test1(); //interface is for in complete method or abstract method
    void test2(); //these all incomplete method are public and abstract
    void test4();//_____________||___________
    void test5();



//    public MyInterface()
//    {  error
//        constructor don't allow in interface
//    }
}
