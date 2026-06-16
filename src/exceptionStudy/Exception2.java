package exceptionStudy;

public class Exception2 {
    static void main(String[] args) {

        System.out.println("Hiii");

        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("can not divide by zero");
        }

        System.out.println("Helloo");
    }
}
