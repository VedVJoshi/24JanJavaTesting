package methodStudy;

public class MethodReuse {
    static void main(String[] args) {
        //Calling Zero Parameter Method
        MethodReuse methodReuse=new MethodReuse();  //created object
        methodReuse.addition();                     //calling method

        //Calling 2 parameter method
        methodReuse.addition(45,45);

    }
    public void addition()    //zero parameter non-static method
    {
        int a=15;
        int b=85;
        int sum= a+b;
        System.out.println("Sum of zero parameter is "+sum);

    }

    public void addition(int a, int b)    //calling 2 parameter method
    {
        int sum= a+b;
        System.out.println("Sum of 2 parameter is "+sum);
    }
}
