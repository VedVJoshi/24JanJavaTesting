package assigmentStudy1and2;

public class ArithmeticOperation {
     //Write a program to perform all arithmetic operations (+, -, *, /, %).


    //Doing arithmetic operation    (+ , - , * , / ,%)

    static void main(String[] args) {
        int a =450;
        int b=14;

        int sum = a+b;   //addition +
        System.out.println(sum);

        int sub=a-b;    //subtraction -
        System.out.println(sub);

        int mul=a*b;    //multiplication *
        System.out.println(mul);

        int div=a/b;   //Division /
        System.out.println(div);

        int odd=a%b;  //reminder will show is =2 (if after division reminder is 0 then output is zero)
        System.out.println(odd);
    }

}
