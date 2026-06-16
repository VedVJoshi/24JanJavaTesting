package construtorStudy;

public class B {
    int a=45; //global variable
    int b=15;

    static void main(String[] args) {
        B b=new B();  //Calling Zero parameter Constructor
        b.add();
        B b1=new B(100,200);   //Calling 2 Parameter constructor
        b1.add();                    //This is only for calling a+b (addition method)

    }
    public B()     //User defined Constructor
    {
        a=40;
        b=10;

    }

    public B(int x, int y)           //User defined Constructor
    {
        a=x;
        b=y;
    }
    public void add()
    {
        int sum =a+b;
        System.out.println("Sum is "+sum);

    }

}
