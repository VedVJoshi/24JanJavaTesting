package assigmentStudy1and2;

public class ParameterAdd {
    // Write a program to demonstrate parameterized methods by adding two numbers.

    static void main(String[] args) {

        ParameterAdd parameterAdd=new ParameterAdd();
        parameterAdd.addition(45,15);

    }

    public void addition(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }


}
