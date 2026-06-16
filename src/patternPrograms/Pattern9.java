package patternPrograms;

public class Pattern9 {
    static void main(String[] args) {
//        * * * *
//         * * *
//          * *
//           *

        int row=4;
        int column=4;
        int space=0;  //space in first line
        int star=4;   //star in first line

        for (int i=1;i<=row;i++)  //for row
        {
            for(int j=1;j<=space;j++)  //for space
            {
                System.out.print(" ");
            }

            for (int k=1;k<=star;k++) //for star
            {
                System.out.print("* ");
            }
            System.out.println();
            star--;
            space++;
        }

    }
}
