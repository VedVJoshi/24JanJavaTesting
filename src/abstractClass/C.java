package abstractClass;
//Concrete class of B
public class C extends B{
    public static void main(String[] args) {
        C c=new C();
        c.show1();  // B class complete method
        c.show2();  //B class complete method
        c.show3();  //B class abstract method override in C class
        c.show4();  // C class complete method
        c.show5();  // C class complete method
        c.show6();  //B class abstract method override in C class
        c.show7();  //B class abstract method override in C class

    }
    public C()
    {
        super();  //called constructor from B class
    }

    @Override
    public void show3() {
        System.out.println("Show 3 method created in B but Implemented class C");
    }

    @Override
    public void show6() {
        System.out.println("Created in B class show 6 method but implemented C class");
    }

    @Override
    public void show7() {
        System.out.println("Created in B class show 7 method but implemented C class");
    }

    public void show4()
    {

        System.out.println("show 4 method implemented C class");
    }
    public void  show5()
    {
        System.out.println("show 5 method implemented C class");
    }
}
