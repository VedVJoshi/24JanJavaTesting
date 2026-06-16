package logicProgram;

import java.util.Scanner;

public class RemoveVowel {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your string that vowels will remove");

        String output="";
        int count=0;

        String givenString1 = scanner.next();
        String givenString= givenString1.toLowerCase();

        for (int i=0;i<=givenString.length()-1;i++)
        {
            char temp = givenString.charAt(i);

            if (temp=='a' ||temp=='e'||temp=='i' ||temp=='o' ||temp== 'u')
            {
                //System.out.println("vowel found in String "+temp);
                //count++;

                continue;
            }
            output=output+temp;

        }
        System.out.println("String without vowel is "+output);
        //System.out.println(count); //if want to count how much vowel in string given by user

    }
}
