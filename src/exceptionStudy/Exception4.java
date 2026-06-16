package exceptionStudy;

public class Exception4 {
    static void main(String[] args) {
        String a="Pune";

        try
        {
            System.out.println(a.charAt(-1));
        }catch (IndexOutOfBoundsException  e)
        {
            System.out.println("Check Index");
        }

    }
}
