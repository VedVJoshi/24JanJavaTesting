package assigmentStudy3;
//32. Write a program to print numbers in the same triangle pattern:
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class Q32 {
    static void main(String[] args) {
        for (int a=1;a<=5;a++)
        {
            for (int b=1; b<=a; b++)
            {
                System.out.print( " "+b);
            }
            System.out.println();
        }
    }
}
//Outer loop (a) → controls rows (1 to 5)
//Inner loop (b) → prints numbers from 1 to i
//System.out.print(j + " ") → prints numbers in the same line
//System.out.println() → moves to next line