package assigmentStudy3;

//Write a program to print all lowercase alphabets a to z using while loop.
public class Q42 {
    static void main(String[] args) {
        for (int a=1;a<=26;a++)
        {
            char character=(char)(96+a); //small/lowercase a start from 97 and end 122
            System.out.println(character);
        }


        int character1='a';
        int character26='z';
        System.out.println("value of lowercase a "+character1);
        System.out.println("value of lowercase z "+character26);
    }
}
