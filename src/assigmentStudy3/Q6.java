package assigmentStudy3;

public class Q6 {
    //Write a program to display the grade of a student based on marks:
    //>=90 → A+, >=75 → A, >=60 → B, >=40 → C, else Fail.
    static void main(String[] args) {
        int marks=68;
        if (marks>=90)
        {
            System.out.println("Your grade is A+");
        }
        else if (marks>=75)
        {
            System.out.println("Your grade is A");
        }
        else if (marks>=60)
        {
            System.out.println("Your grade is B");
        }
        else if (marks>=40)
        {
            System.out.println("Your grade is C");
        }
        else
        {
            System.out.println("Your are fail");
        }

    }
}
