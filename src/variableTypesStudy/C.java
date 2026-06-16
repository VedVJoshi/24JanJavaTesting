package variableTypesStudy;

public class C {
    int a=25; //Global Variable (Variable is not in method and In the class that known as global variable)
    int b=15;  //Global variable
    int d;     //Global variable default value that is 0
    static void main(String[] args) {
        C c=new C(); //For calling display method a=85 and b=100
        c.display();
        c.show();

    }

    public void display()
    {
        int a=75;//local variable
        int sum=a+b; //a=75,b=15
        System.out.println("Sum of one local and one global variable change value is "+sum);

        int x=45;  //local variable
        int sum1=x+b;
        System.out.println("Sum of Local variable and global variable no change in value "+sum1);
        //If you already change value of global  variable a or b in method compiler take resent value
        //in this method this.b used, b value is 100 and if i applied comment(//) to b=100 then b=15.

        int sum2= this.a+this.b;
        System.out.println("sum of global value is "+sum2);
        //In this method we created b=100 that's why this output is 125
        //If we removed that b=100 then b value is 15 amd output is 40

        System.out.println("value of d is "+d);
        //we are not given a value of d in anywhere so d is global variable that value is 0

    }
    public void show()
    {
        int c=150;
        int sub=c-this.b;  // b=100 because in display method changed the value.If we remove the b=100 then b value is b=15.
        System.out.println("Subtraction is "+sub);

        int a=400; //Local variable
        int sub1=a-this.a;  //a global value is 25
        System.out.println("subtraction of b global variable is "+sub1);
        //In this b value we changed in display method is 100 so output is 300
        //If we remove that b=100 then b has global value is 15 then output is 385

    }
}
