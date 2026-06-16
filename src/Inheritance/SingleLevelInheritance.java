package Inheritance;

public class SingleLevelInheritance {
    static void main(String[] args) {
        //calling mother/super class
        MotherSuperClass motherSuperClass=new MotherSuperClass();
        motherSuperClass.nature(); //calling super class method (non-static)
        MotherSuperClass.eye();    // calling super class method (static)

        System.out.println("=====================================");

      //calling sub/chid class
        SonSubClass sonSubClass=new SonSubClass();
        sonSubClass.face(); //calling sub class method (non-static)
        SonSubClass.play();  //calling sub class method (static)

        System.out.println("=====================================");

        //calling mother class method and variable now extends are done in son class
        sonSubClass.nature();  //calling super class method using sub class object (non-static)
        SonSubClass.eye();     //calling super class method using sub class.
        System.out.println(sonSubClass.blood_group); //super class global variable non-static using sub class
        System.out.println(sonSubClass.hair_colour);   //calling son class global variable

    }
}
