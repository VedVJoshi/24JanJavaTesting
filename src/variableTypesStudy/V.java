package variableTypesStudy;

public class V {
    int a=9;   //non-static global variable
    static int b=10;  //static global variable

    static void main(String[] args) {

        V v=new V();
        int sub= v.a-1;  //calling non-static global variable from same class that's why we create object and (objectName.variableName)
        //calling with object reference
        System.out.println("Subtraction in main method for non static global variable is "+sub);

        int sub1=b-5;   //calling static variable from same class
        //direct call in same class to static method
        System.out.println("static variable subtraction "+sub1);

        v.data(); //object is already created so direct calling

        addition(); //calling static method directly
    }
    public void data()     //non-static method
    {
        int a=58; //local variable not use/called anywhere
        int sub=20-this.a; //calling non static global variable use this.a
        System.out.println("subtraction of non static variable is "+sub);

        int div=7500/b;   //calling static global variable in non-static method
        System.out.println("div of static global variable in non static method "+div);
    }

    public static void addition()
    {
        int b=15;
        int div=550/V.b;  //calling static global variable 10
        System.out.println("division of static variable is "+div);

       // int mul=650*this.a; //this. is error because non-static variable not allowed in static method
                               //errorrrrrr
    }

}

