package patternPrograms;

public class Pattern12 {
    static void main(String[] args) {
//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *

        int row=7;
        int space=3;
        int star=1;

        //outer loop for--> row
        for (int i=1;i<=row;i++)
        {
            //inner loop 1 for--> space
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //inner loop 2 for--> star
            for (int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i < 4)
            {
                star=star+2;
                space--;
            }
            else
            {
                star=star-2;
                space++;
            }
        }
    }
}
