package assigmentStudy3;

//Write a program using nested if to check loan eligibility:
//If nationality = "Indian" and age ≥ 21 → Eligible, else Not eligible.
public class Q8 {
    static void main(String[] args) {

        String nationality="Indian";
        int age=25;
        if (nationality=="Indian")
        {
            System.out.println("You are Indian,Please enter your age");
            if (age>=21)
            {
                System.out.println("Your age valid,You are eligible");
            }
            else
            {
                System.out.println("You are noy eligible");
            }
        }
        else
        {
            System.out.println("You are not Indian");
        }

    }
}
