package variableTypesStudy;

public class StaticMethodInVariable {
    int a=10;  //Global Variable with value (This is non-static)
    static int b=50;  // Static Global variable value (italic style font)

    static void main(String[] args) {
        StaticMethodInVariable staticMethodInVariable=new StaticMethodInVariable();
        staticMethodInVariable.display();
        show();

    }
    public void display()  //non-static method
    {
        int a=30; //Local variable (this is not a static variable . non-static variable
        //static int c=10;   //error / not allow in method static method

        int sum= a+100;     // Here a local value is a=30
        System.out.println(sum);

        int sum1=this.a+150;  //Here a is global variable and value
        System.out.println(sum1);

        int sum2=a-StaticMethodInVariable.b; //calling static variable italic b is 50
        System.out.println(sum2);
    }

    public static void show()
    {
        int a=50;  //local variable in static method
        int b=40;  //local variable is non-static variable

        int sub= a-b; //both are local variable
        System.out.println(sub);

        //int sub1=this.a-b; //this error this. only use in non-static method

        int sub3= b-StaticMethodInVariable.b; //calling static variable
        System.out.println(sub3);
    }
}
