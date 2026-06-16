package Inheritance;

public class HierarchicalClassC extends HierarchicalClassA {
    //Son 2

    static void main(String[] args) {
        //this class method
        HierarchicalClassC hierarchicalClassC = new HierarchicalClassC();
        hierarchicalClassC.study(); //non-static method call using object
        HierarchicalClassC.swim();  //static method

        //class A after extends in class C   now Class A all methods and variable in Class C
        hierarchicalClassC.nature(); //non-static method call using C class object
        HierarchicalClassC.looks();  //static method call direct

    }

    public void study()
    {
        System.out.println("Son 2 is good in study");
    }

    public static void swim()
    {
        System.out.println("Son is Swimmer");
    }
}
