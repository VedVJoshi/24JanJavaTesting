package assigmentStudy3;

//Write a program using nested for loops to print the multiplication tables from 1 to 3.
public class Q29 {
    static void main(String[] args) {
        for (int a=1;a<=3;a++)
        {
            System.out.println(a);
            for (int b=1;b<=10;b++)
            {
                System.out.println(a+"x"+b+"="+(a*b));
            }
        }
    }

}
