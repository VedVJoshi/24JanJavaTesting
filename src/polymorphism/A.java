package polymorphism;

public class A {
    static void main(String[] args) {
        A a=new A();
        a.addition();
        a.addition(20);
        a.addition(2.5f);

    }
    public void addition()
    {
        int a=10;
        int b=10;
        int sum=a+b;
        System.out.println("addition is "+sum);
    }
    public void addition(int a)
    {
        int sum=a+10;
        System.out.println("addition is "+sum);
    }
    public void addition(float a)
    {
        float sum=a+10;
        System.out.println("addition is "+sum);
    }
}
