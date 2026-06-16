package logicProgram;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name =scanner.next();
        System.out.println("Your name is "+name);

        System.out.println("======================================");

        System.out.println("Please Enter Your Age");
        int age =scanner.nextInt();
        System.out.println("Your Age is "+age);

        System.out.println("======================================");

        System.out.println("Please Enter Your Weight");
        float weight = scanner.nextFloat();
        System.out.println("Your Weight is "+weight);

    }
}
