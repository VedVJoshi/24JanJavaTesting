package logicProgram;

import java.util.Scanner;

public class ReverseStringUserInput {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your String To Be Reverse");

        String givenString =scanner.next();
        String rev="";

        for (int i=givenString.length()-1;i>=0;i--)
        {
            char temp = givenString.charAt(i);
            rev=rev+temp;
        }
        System.out.println("Reverse String is "+rev);
    }
}
