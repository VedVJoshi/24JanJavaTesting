package assigmentStudy1and2;

public class ReturnType {
    static void main(String[] args) {

       ReturnType returnType = new ReturnType();
       returnType.addition(52,78);
    }
    public void addition(int a, int b)  //int = return type
                                        //parameter is a & b
    {
        int sum = a+b;
        System.out.println("addition is "+sum);
    }
}
