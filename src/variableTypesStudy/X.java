package variableTypesStudy;

public class X {
    int a=100;  //Global variable with value
    int b=99;
    int d;      //Global variable with default value
    static void main(String[] args) {
        X x=new X();
        x.display();
        x.show();

    }
    public void display()
    {
        int a=99;
        int sum=a+b;
        System.out.println("Sum is "+sum);

        int sum1=this.a+b;
        System.out.println("Sum1 is "+sum1);

        int c=100;  //Local variable value use ony this method
        System.out.println("value of C is "+c);

        System.out.println("value of d is "+d); //we don't give value of d anywhere that is give default value 0

    }

    public void show()
    {
        int c=77; //Local variable
        int a=5;
        int sub= c-this.a-b;
        System.out.println("Subtraction is "+sub);


    }
}
