package controlStatement;

public class IfElseStudy {
    static void main(String[] args) {

        //if is greater than or equal to 18 --> You Can drive car
        //else you cannot drive car

        int age=14; //here if condition use beacause this is true condition
        if (age >=18)
        {
            System.out.println("You can drive car");
        }
        else             //If age=14 then else block OR condition use/execute
        {
            System.out.println("You can not drive car");
        }

        //if finger print is right then - door open
        //else door not open

        String fingerprint="Right";
        if (fingerprint=="Right")
        {
            System.out.println("Door Open");
        }
        else
        {
            System.out.println("Door not open");
        }
    }
}
