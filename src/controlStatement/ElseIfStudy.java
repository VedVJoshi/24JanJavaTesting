package controlStatement;

public class ElseIfStudy {
    static void main(String[] args) {


        //if marks is greater than or equals to 80 then - grade is A
        //if else marks is greater than or equals to 65 then - grade is B
        //if else marks is greater than or equals to 50 then - grade is C
        //if else marks is greater than or equals to 35 then - grade is D
        //else you are fail

        int marks = 72;

        if (marks >= 80)   //condition 1
        {
            System.out.println("You get A grade");
        }
        else if (marks >= 65)   //condition 2   (if condtion1 false then condition2 use/excute)
        {
            System.out.println("You get grade B");
        }
        else if (marks >= 50)    //condition 3   (if condition2 false then condition3 use/execute)
        {
            System.out.println("You get grade C");
        }
        else if (marks >= 35)     //condition 4   (if condition3 false then condition4 use/execute)
        {
            System.out.println("You get grade D");
        }
        else                      //default condition  (if all condition is false then else condition use)
        {
            System.out.println("You are fail");
        }


        //if Bp is greater than or equals to 180 - Hypertensive Crisis
        //else if Bp is greater than or equals to 140 - Hypertension stage 2
        //else if Bp is greater than or equals to 135 - Hypertension stage 1
        //else if Bp is greater than or equals to 115 - Normal

        int blood_pressure = 115;
        if (blood_pressure >= 180) {
            System.out.println("Your Blood pressure is Hypertensive Crisis");
        } else if (blood_pressure >= 140) {
            System.out.println("Your Blood pressure is Hypertension stage 2");
        } else if (blood_pressure >= 130) {
            System.out.println("Your Blood pressure is Hypertension stage 1");
        } else if (blood_pressure >= 115) {
            System.out.println("Your Blood pressure is normal");
        }


        //if age is or greater than 80 then old
        //else if age is greater than or equal to 65 aged
        //else if age is greater than or eual to 45 yonger adult
        //else if age is greater than or eqal to  25 adult
        //else if age is less than or equal to 20 kid

        int age = 12;
        if (age>=80)
        {
            System.out.println("Your age is high or old");
        }
        else if (age>=65)
        {
         System.out.println("You are aged");
        }
        else if (age>=40)
        {
            System.out.println("You are younger");
        }
        else if (age>=25)
        {
            System.out.println("you are adult");
        }
        else if (age<=20)   //here i add less than < to show age is less 20
        {
            System.out.println("You are kid go to home");
        }

    }
}
