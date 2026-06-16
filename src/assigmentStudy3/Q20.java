package assigmentStudy3;
//Write a program to check whether a number is palindrome or not.
public class Q20 {
    static void main(String[] args) {
        String num="1221";
        String rev="";

        for (int i=num.length()-1;i>=0;i--)
        {
            char ct=num.charAt(i);
            rev=rev+ct;
        }
        if (num.equals(rev))
        {
            System.out.println("This Number is Palindrome");
        }
        else
        {
            System.out.println("This Number is Not Palindrome");
        }
    }
}
