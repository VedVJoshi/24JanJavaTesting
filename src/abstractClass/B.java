package abstractClass;

public abstract class B {
    public static void main(String[] args) {
//        B b=new B();
//        b.show1();
//        b.show2(); //can call method but complier object is don't want to create because of abstract method in class
//        b.show3();

    }

    public B() //constructor of abstract class
    {
        System.out.println("Constructor from abstract class B");
    }

    public void show1()
    {
        System.out.println("Show 1 method implemented Class B");
    }
    public void show2()
    {
        System.out.println("Show 2 method implemented Class B");
    }
    public abstract void show3(); //abstract method now class also abstract

    public abstract void show6(); //abstract method implement in C class

    public abstract void show7();  //
}
