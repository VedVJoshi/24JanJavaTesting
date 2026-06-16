package assigmentStudy3;

//Write a program using nested for loops to print a hollow square pattern of 5×5 stars.
public class Q34 {
    static void main(String[] args) {
        for (int a=1;a<=5;a++){
            for (int b=1;b<=5;b++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
