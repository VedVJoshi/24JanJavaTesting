package exceptionStudy;

public class Exception7 {
    static void main(String[] args) {

        int a=10;
        int b=0;

        try
        {
            System.out.println(a / b);
            //System.out.println(10/2);
        }
        catch (NullPointerException e)
        {
            System.out.println("Object can not be NULL");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide By ZERO is not possible");
        }
        catch (Exception e)
        {
            System.out.println("Something Went WRONG");
        }
        finally
        {
            System.out.println("finally block is executed");
        }

        System.out.println("BYE BYE");
    }
}
