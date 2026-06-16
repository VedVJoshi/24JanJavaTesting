package assigmentStudy3;

//Write a program to count the number of digits in a number using while loop.
public class Q23 {
    static void main(String[] args) {
        int a=11254;
        int count =1;

        while (a!=0)    //run code until the value is come 0 digit
        {
            a=a/10;  //divide 10 remove one digit in 4520145 --> 452014--> 45201-->4520-->452-->45-->4
                      //divide 10 count 1 number
            System.out.println(count);
            count++;
        }

    }
}
