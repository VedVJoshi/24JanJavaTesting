package controlStatement;

public class IfStudy {
    static void main(String[] args) {

        //my age >18 you can drive the car
        int age = 32;  //if age only 18 then in if condtion enter (>=)
                       // value is true block or use exeucated
        if (age > 18)
        {
            System.out.println("You can drive the car");
        }

         //if my age is 18 and condition is 18
        int age1=18;
        if (age1>=18)
        {
            System.out.println("18 year you can drive");
        }



        //my grade is A then you are pass
        char grade='A';   //here if we enter grade is B then if not use their block and no output will come
        if (grade=='A')
        {
            System.out.println("You are pass");
        }

        // my attendance is good then i can give exam
        String attendance="good";  //attendace="bad"- no output
        if (attendance=="good")
        {
            System.out.println("You can give exam");
        }

    }
}
