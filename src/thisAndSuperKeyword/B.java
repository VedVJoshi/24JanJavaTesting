package thisAndSuperKeyword;

public class B extends A {
    //call global variable from another class
    int x=199; //global variable
    int y=10;
    static int c=1;

    static void main(String[] args) {
        B b=new B();
        b.show();
        b.display(); //Class B display method called

        //because same method name A class call as A class object
        A a=new A();
        a.display(); //call A class display method

    }
    public void show()
    {   //take local variable name x  -->
        int x=55; //local variable
        int sum1=x+10;
        System.out.println(sum1);

        //take global variable from same class name x -->
        int sum2=this.x+10; //take global variable use this because of x variable name are multiple
        System.out.println(sum2);

        //take super global variable x variable --> but after--> class B extends A
        int sum3=super.x+10;  //X  super class variable
        System.out.println(sum3);

        //take global variable of same class but no name same in method
        int sum4=y+10+super.y; //global variable y and super class global variable y
        System.out.println(sum4);

        int sum5=x+ A.c;
        System.out.println(sum5);
        System.out.println("sum5");

    }
    public void display()
    {
        System.out.println("Hello this is same method");
    }

}
