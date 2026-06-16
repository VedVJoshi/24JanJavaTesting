package Inheritance;

public class SonSubClass extends MotherSuperClass {




    String hair_colour="Brown";

    public void face()
    {
        System.out.println("Normal smile");
    }

    public static void play()
    {
        System.out.println("Swim faster");
    }

    // public class SonSubClass extends MotherSuperClass after doing this we have mother class all method and variable in this class

    static void main(String[] args) {
        eye();  //mother class method can access here static
        SonSubClass sonSubClass=new SonSubClass();
        sonSubClass.nature();   // mother or super class all method now in this class because of extends keyword
                                 //mother class method now sons class
    }
}
