package methodStudy;

public class MathOperationA {
    static void main(String[] args) {//creating object for calling non-static method in same class
        MathOperationA mathOperationA=new MathOperationA();
        mathOperationA.addition();  //Called Non-static method from same class
        mathOperationA.sub();       //Called Non-static method from same class

        //calling non-static method from another class
        MathOperationB mathOperationB=new MathOperationB(); //ClassName objectName=new ClassName();
        mathOperationB.mul();
        mathOperationB.div();
    }
    public void addition()
    {
        int a; //variable declaration
        a=45;   // variable assignment
        int b=35; //variable declaration and assignment
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }

    public void sub()
    {
        int x=78;  //variable declaration and assignment
        int y=43;  //variable declaration and assignment
        int sub=x-y;
        System.out.println("sub is "+sub);
    }
}
