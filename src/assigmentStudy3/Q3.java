package assigmentStudy3;

public class Q3 {
    //Write a program to find the largest among three numbers using if-else-if.
    static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        if (a>=b && a>=c)
        {
            System.out.println("Largest number is a");
        }
        else if (b>=a && b>=c)
        {
            System.out.println("Largest number is b");
        }
        else if (c>=a && c>=b) {
            System.out.println("largest number is c");
        }
    }
}
