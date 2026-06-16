package assigmentStudy3;

//Write a program to print all uppercase alphabets A to Z using for loop.
public class Q41 {
    static void main(String[] args) {
        for (int a=1;a<=26;a++)
        {
            char character=(char) (64+a); //from 65 Capital A-Z value start A=65 to Z=
            System.out.println(character);
        }
        int character1='A';
        int character26='Z';
        System.out.println("value of Capital A "+character1);
        System.out.println("value of Capital Z "+character26);
    }
}
