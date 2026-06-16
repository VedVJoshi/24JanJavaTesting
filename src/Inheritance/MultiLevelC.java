package Inheritance;

public class MultiLevelC extends MultiLevelB {

    static void main(String[] args) {
        MultiLevelC multiLevelC=new MultiLevelC();
        multiLevelC.base(); //non-static in same class
        top(); //static in same class

        //after extends
        multiLevelC.hobbies(); //this class object and called this non-static method From A is now Class C method
        bad(); // static method of A class is now method of C class

        multiLevelC.data(); //this C class object and call non-static method From B class now method of C class
        study(); //static method of A class is now method of C class
    }

    public void base()
    {
        System.out.println("C Class, Base is Mountain");
    }

    public static void top()
    {
        System.out.println("C Class, Everest is Top");
    }
}
