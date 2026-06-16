package exceptionStudy;

public class Exception6 {
    static void main(String[] args) {

        //String a="test";
        String a=null;

        try
        {
            System.out.println(a.length());
        }
        finally {
            System.out.println("finally block will executed");
        }
        System.out.println("end of code");
    }
}
