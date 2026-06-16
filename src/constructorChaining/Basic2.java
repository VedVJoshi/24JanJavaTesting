package constructorChaining;

import construtorStudy.B;

public class Basic2 extends Basic {
    static void main(String[] args) {
        Basic2 basic2=new Basic2();

    }



    public Basic2()
    {
        this("Vedant");
        System.out.println("user defined zero parameter constructor Y class");
    }

    public Basic2(String name)
    {
        this(25,25);
        System.out.println(name);
        System.out.println("user defined single parameter constructor Y class");
    }
    public Basic2(int a,int b)
    {
        super();
        int sum=a+b;
        System.out.println(sum);
        System.out.println("user defined constructor 2 parameter Y class");
    }


}
