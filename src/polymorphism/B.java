package polymorphism;

public class B extends A{
    static void main(String[] args) {
        B b=new B();
        b.addition(); //b object for same name method B Class
        b.addition(20);

        A a=new A();
        a.addition(); //call A class same name method using A Class--> object
        a.addition(10);

    }
    public void addition()
    {
        int a=15;
        int b=85;
        int sum=a+b;
        System.out.println("addition is "+sum);
    }
    public void addition(int a)
    {
     int sum=a+10;
     System.out.println("addition is "+sum);
    }
}
