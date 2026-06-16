package constructorChaining;

import variableTypesStudy.X;

public class Basic {

    static void main(String[] args) {
        Basic basic=new Basic();


    }
    public Basic()
    {
        this(20); //call int a constructor
        System.out.println("This is user defined constructor zero parameter ");
    }

    public Basic(int a)
    {
        this (45,45); //call 2 parameter constructor
        System.out.println(a);
        System.out.println("This is user defined constructor single parameter");
    }

    public Basic(int a,int b)
    {
         this("Dada");   //call string parameter single constructor
        int sum=a+b;
        System.out.println(sum);
        System.out.println("This is user defined constructor 2 parameter");
    }

    public Basic(String name)
    {
        System.out.println(name);
        System.out.println("This is user defined constructor string parameter single");
    }
}
