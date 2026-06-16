package logicProgram;

public class PalindromeString {
    static void main(String[] args) {
        //MOM DAD RADAR MADAM
        String a="RADAR";
        String rev="";

        for (int i=a.length()-1;i>=0;i--)
        {
            char value=a.charAt(i);
            rev=rev+value;

        }
        if (a.equals(rev))
        {
            System.out.println("This is Palindrome String");
        }
        else
        {
            System.out.println("This is not a palindrome String");
        }
    }
}
