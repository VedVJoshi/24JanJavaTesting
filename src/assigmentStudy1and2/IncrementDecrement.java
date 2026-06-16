package assigmentStudy1and2;

public class IncrementDecrement {

      //Write a program to demonstrate unary operators (++, --).

    static void main(String[] args) {
        //post increment --> first assign then increase
        int a=45;
        int b=a++;
        System.out.println("value of a "+a);
        System.out.println("value of b "+b);

        //pre increment  --> first increase then assign
        int c=15;
        int d=++c;
        System.out.println("value of c "+c);
        System.out.println("value of d "+d);

        //post decrement --> first assign then decrement
        int e=13;
        int f=e--;
        System.out.println("value of f "+f);
        System.out.println("value of e "+e);

        //pre decrement  --> first decrement then assign
        int m=14;
        int n=--m;
        System.out.println("value of m "+m);
        System.out.println("value of n "+n);

    }
}
