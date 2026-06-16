package logicProgram;

public class ReverseString {
    static void main(String[] args) {

        String a="VEDANT";
        String rev="";

        for (int i=a.length()-1;i>=0;i--)
        {
            char t=a.charAt(i);
            rev=rev+t;

        }
        System.out.println(rev);
    }
}

