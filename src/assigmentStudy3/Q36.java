package assigmentStudy3;

//Write a program using nested for loops to print the following alphabet pattern:
//A
//A B
//A B C
//A B C D
//A B C D E
public class Q36 {
    static void main(String[] args) {
        for (int a=1;a<=5;a++)
        {
            for (int b=1;b<=a;b++)
            {
                char character =(char) (64+b);  //In java A value store from 64 and value of a is 65
                //Capital letters start from 65
                //Small letters start from 97
//                When j = 1 → 64 + 1 = 65 → 'A'
//                When j = 2 → 66 → 'B'
                System.out.print(character);
            }
            System.out.println();
        }

        int character= 'A';
        System.out.println(character);
    }
}
