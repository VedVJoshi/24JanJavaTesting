package assigmentStudy3;

//18. Write a program to calculate the factorial of a number using for loop.
public class Q18 {
    static void main(String[] args) {
        int number=5;
        int fact=1;
        for (int a=1; a<=number; a++) //5x4x3x2x1 =120 --> factorial number
        {
            fact=fact*a;
        }
        System.out.println(fact);

    }
}
