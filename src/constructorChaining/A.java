package constructorChaining;

public class A {
    static void main(String[] args) {
        A a=new A();

    }
    public A()
    {
        this("Class A");
        System.out.println("Zero parameter A class constructor");
    }
    public A(String name)
    {
        this(15,15);
        System.out.println(name);
        System.out.println("Single parameter String Constructor A class");
    }
    public A(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
        System.out.println("private");
    }
}
