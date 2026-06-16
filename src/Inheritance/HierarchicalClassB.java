package Inheritance;

public class HierarchicalClassB extends HierarchicalClassA {
    //Son 1

    static void main(String[] args) {
        HierarchicalClassB hierarchicalClassB=new HierarchicalClassB();
        hierarchicalClassB.laptop(); // non-static method from son 1 using object to call
        HierarchicalClassB.rude(); //static method from this class

        //after HierarchicalClassB extends HierarchicalClassA --> now B Class can  access all method from class A

        hierarchicalClassB.nature(); //call non-static method of A Class using this class object
        HierarchicalClassB.looks();  //static method of A now in B class
    }

    public void laptop()
    {
        System.out.println("Son 1 have Laptop");
    }

    public static void rude()
    {
        System.out.println("Son 1 is Rude");
    }
}
