package constructorChaining;

public class B extends A {
    static void main(String[] args) {
        B b=new B();
    }
    public B()
    {
        this(23);
        System.out.println("zero parameter constructor B class");
    }
    public B(int a)
    {
        this("Class B");
        System.out.println(a);
    }
    public B(String name)
    {
       // super(25,25);  //private constructor
        System.out.println(name);
    }
}
