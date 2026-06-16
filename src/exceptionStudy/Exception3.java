package exceptionStudy;

public class Exception3 {
    static void main(String[] args) {

        System.out.println("Hello all");

        String a=null;
        try
        {
            System.out.println(a.charAt(12));
        }
        catch (NullPointerException e)
        {
            System.out.println("object can not NULL");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Check Index");

        }
        System.out.println("Good Night");
    }
}
