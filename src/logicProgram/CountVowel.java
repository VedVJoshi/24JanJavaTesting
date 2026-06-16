package logicProgram;

import java.util.Scanner;

public class CountVowel {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your String You want remove vowel form that");
        String givenString1 =scanner.next();

        String givenString =givenString1.toLowerCase();

        int count=0;

        for (int i=0;i<=givenString.length()-1;i++)
        {
            char temp = givenString.charAt(i);

            if (temp=='a' || temp=='e' || temp=='i' ||temp =='o' || temp=='u')
            {
                System.out.println("vowel found is "+temp);

                count++;
            }
        }
        System.out.println("count of vowel in string "+count); //total count in string how much are vowels


    }
}
