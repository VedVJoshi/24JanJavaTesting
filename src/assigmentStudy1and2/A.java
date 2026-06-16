package assigmentStudy1and2;

public class A {
    static void main(String[] args) {
        //calling from same class -->
        frame(); //call static method from same class
        A a=new A(); //call non static method from same class object create
        a.car();    //called non static method from same class


        //calling from another class
        B.gender();  // calling to static method from another class B

        B b=new B(); //create another class object for call non static method
        b.data();    //calling non static method from another class


    }
    public static void frame()
    {
        System.out.println("Black frame");
    }

    public void car()
    {
        System.out.println("All cars are light frame");
    }
}
