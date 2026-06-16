package interfaceStudy;

public class A implements Sample2{

    static void main(String[] args) {
        A a=new A();
        a.test1(); //interface Sample 2--> method completed and call
        a.test2(); //interface Sample 2--> method completed and call
        a.test5(); //interface Sample 1--> method completed and call
        a.test6(); //interface Sample 1--> method completed and call

    }

    @Override
    public void test5() {
        System.out.println("Interface Sample 2 method completed in A class");
    }

    @Override
    public void test6() {
        System.out.println("interface Sample 2 method completed in A class");
    }

    @Override
    public void test1() {
        System.out.println("Interface Sample 1 method completed in A class");
    }

    @Override
    public void test2() {
        System.out.println("interface Sample 1 method completed in A class");
    }
}
