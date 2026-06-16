package interfaceStudy;

public class MyClass implements MyInterface{
  // --> --> //implementation class ***

    static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.test1(); //interface method completed and call
        myClass.test2();  //interface method completed and call
        myClass.test3(); //own this class method
        myClass.test4();  //interface method completed and call
        myClass.test5();  //interface method completed and call
    }
    @Override
    public void test1() {
        System.out.println("interface method completed in implementation class");
    }

    @Override
    public void test2() {
        System.out.println("interface method completed in implementation class");

    }

    @Override
    public void test4() {
        System.out.println("interface class method completed implementation class");
    }

    @Override
    public void test5() {
        System.out.println("Interface method completed in implementation class");
    }

    public void test3()
    {
        System.out.println("MyClass own method");
    }
}
