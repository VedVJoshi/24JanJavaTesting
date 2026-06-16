package assigmentStudy3;

//Write a program to reverse a given number using while loop.
public class Q19 {
    static void main(String[] args) {
        String num="852";
        String rev="";

        for (int i=num.length()-1;i>=0;i--)
        {
            char ra=num.charAt(i);
            rev=rev+ra;

        }
        System.out.println(rev);
    }
}
