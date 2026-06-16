package assigmentStudy1and2;

public class MethodCall2 {
    static void main(String[] args) {

        MethodCall2 methodCall2=new MethodCall2(); //object created for non-static method call
        methodCall2.data(); //call non-static method
                           //in non static method we call static method
    }

    public void data()
    {
       disply();              //calling static method from non static method
    }

    public static void disply()
    {
     System.out.println("This Static method ");
    }
}
