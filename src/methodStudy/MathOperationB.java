package methodStudy;

public class MathOperationB {

    //we are not creating main method in this class
    //because we have to call non-static method to another class
    //This method calling in MathOperationA

    public void mul()
    {
        int p=75;   //variable declaration and assignment
        int q=7;   //variable declaration and assigment
        int mul=p*q;
        System.out.println("multiplication is "+mul);
    }

    public void div()
    {
        int e=87;    //variable declaration and assignment
        int f=7;     //variable declaration and assignment
        int div= e/f;
        System.out.println("Division is "+div);
    }
}
