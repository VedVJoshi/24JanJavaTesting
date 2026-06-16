package construtorStudy;

public class A {
    static void main(String[] args) {
        A a= new A();
        A a1=new A(45,45);
        //If we want call two method or more we have to create next object or more object
        //construtor is same name as className
        //Constructor is only use for non-static method
        //Constructor don't have return type for example-(void)
        //multiple construtor but change parameter
        //when we create object in class call automatically go to construtor


    }
    public A()
    {   //User Defined Construtor With Zero Parameter
        int a=45;
        int b=48;
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }

    public A(int x,int y){
        int sum=x+y;
        System.out.println("Sum is two parameter Constructor is  "+sum);

    }
}
