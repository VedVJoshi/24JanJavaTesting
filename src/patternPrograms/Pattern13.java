package patternPrograms;

public class Pattern13 {
    static void main(String[] args) {
               //*         *
               //**       **
               //***     ***
               //****   ****
               //***** *****
               //****   ****
               //***     ***
               //**       **
               //*         *

        int row=9;

        int space1=4;
        int star1=1;

        int space2=5;
        int star2=1;

        //outer for loop for-->row
        for (int i=1;i<=row;i++)
        {
            //inner for loop 1 for-->star1
            for (int j=1;j<=star1;j++)
            {
                System.out.print("*");
            }
            //inner for loop 2-->space1
            for (int k=1;k<=space1;k++)
            {
                System.out.print(" ");
            }
            //inner for loop 3--> space2
            for (int l=1;l<=space2;l++)
            {
                System.out.print(" ");
            }
            //inner for loop 4 for-->star2
            for (int m=1;m<=star2;m++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i<5)
            {
                star1++;
                space1--;

                star2++;
                space2--;
            }
            else
            {
                star1--;
                space1++;

                star2--;
                space2++;
            }
        }

    }
}
