package casting;

public class CastingStudy {
    static void main(String[] args) {

        //implicit casting --> widening casting
        //storage--> lower--> higher
        //memory--> memory size increase
        //no data loss

        byte a=10;  //2 byte
        System.out.println(a);

       // int b=a;  //4 byte
       // System.out.println(b);

        double c=a;  //8 byte
        System.out.println(c);

        System.out.println("=======================================");

        //Explicit casting --> narrowing cast
        //storage--> higher--> lower
        //memory--> memory size decrease
        // possible data loss

        int s=12145785;
        System.out.println(s);

        short t= (short) s;             //data loss
        System.out.println(t);

        double m=124.2475;
        System.out.println(m);

        int n=(int)m;
        System.out.println(n);    //data loss


    }
}
