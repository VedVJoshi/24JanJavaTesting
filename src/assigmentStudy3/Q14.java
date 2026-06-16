package assigmentStudy3;

//Write a program to print odd numbers between 1 and 20 using while loop.
public class Q14 {
    static void main(String[] args) {
       //step 1 -->
        int a=1;
        while (a<=20)
        {
            if (a%2!=0)
            {
                System.out.println(a);
            }
            a++;
        }

        //step 2 -->
        int c=1;
        while (c<=20)
        {
            System.out.println(c);
            c=c+2;
        }
    }
}
