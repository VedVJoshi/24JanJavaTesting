package assigmentStudy3;
//31. Write a program using nested for loops to print a right-angled triangle pattern of stars:
//
//*
//* *
//* * *
//* * * *
//* * * * *
public class Q31 {
    static void main(String[] args) {
        for (int a=1;a<=5;a++)        //rows
        {
            for (int b=1;b<=a;b++)   //column
            {
                                       //see that we did b=1 and b<=a
                                       //When a = 1 - a runs 1 time - 1 star
                                       //When a = 2 - a runs 2 times - 2 stars
                                       //When a = 3 - a runs -->3 stars like
                                       // till end of 5
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
