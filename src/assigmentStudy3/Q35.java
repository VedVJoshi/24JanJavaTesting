package assigmentStudy3;

//Write a program using nested for loops to print a right-aligned triangle pattern:
//*
//**
//***
//****
//*****
public class Q35 {
    static void main(String[] args) {

        for (int a=1;a<=5;a++)  //rows insert
        {
            for (int b=1;b<=a;b++) //columns insert
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
