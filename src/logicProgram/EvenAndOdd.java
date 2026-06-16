package logicProgram;

import java.util.Scanner;

public class EvenAndOdd {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your number to check odd OR Even");
        
        int givenNum =scanner.nextInt();

        if (givenNum ==0)
        {
            System.out.println("Number is zero can not define even or odd");
        }
        else if (givenNum %2 ==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}
