package retrunType;

public class RetrunTypeStudy {
    static void main(String[] args) {
        addition();

        //option 1-->for call directly
        System.out.println(subtraction());
        //option 2--> for store value and then call
        int result= subtraction();
        System.out.println(result);

        String result1=data().toUpperCase();
        System.out.println(result1);


    }
    public static void addition()
    {
        int sum=10+20;
        System.out.println(sum);
    }
    public static int subtraction()
    {
        int sub=500-420;
        return sub;
    }
    public static String data()
    {
        String name="vedant joshi";
        return name;
    }
}
