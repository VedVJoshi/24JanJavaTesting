package assigmentStudy3;

//Write a program to find how many numbers between 1 and 50 are divisible by 3 and 5 using for loop.
public class Q21 {
    static void main(String[] args) {
        for (int a=1;a<=50;a++)
        {
            if (a%3==0 && a%5==0)
            {
             System.out.println("Number is divisible by 3 and 5 between 1 to 50 is "+a);
            }
        }
    }
}
