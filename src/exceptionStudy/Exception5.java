package exceptionStudy;

public class Exception5 {
    static void main(String[] args) {

        String a=null;

        try
        {
            System.out.println(a.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("divide By zero can not possible");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("check Index");
        }
        catch (NullPointerException e)
        {
            System.out.println("Object can not be NULL");
        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        }


    }
}
