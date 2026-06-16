package assigmentStudy1and2;

public class MethodCall {
    static void main(String[] args) {
        keyword();   //called keyword method in main method in keyword method we call data method
    }

    public static void keyword()
    {
        MethodCall methodCall = new MethodCall();
        methodCall.data();    //called non static method in static method
    }

    public void data()
    {
        System.out.println("Hello world");
    }
}
