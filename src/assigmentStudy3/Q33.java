package assigmentStudy3;

//Write a program using nested for loops to print the following pattern:
//*****
//****
//***
//**
//*
public class Q33 {
    static void main(String[] args) {

        for (int a=5;a>=1;a--)
        {
            for (int b=1;b<=a;b++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
