package patternPrograms;

public class Pattern6 {
    static void main(String[] args) {
//        *******
//         *****
//          ***
//           *

        //row     columns     stars in 1st line      space in first line

        int row=4;
        int column=7;
        int space=0;  //in first line space
        int star=7; //in first line star

        for (int i=1;i<=row;i++) //for row
        {
            for (int j=1;j<=space;j++)  //for space
            {
                System.out.print(" ");
            }

            for (int k=1;k<=star;k++) //for star
            {
                System.out.print("*");
            }
            System.out.println();
            star=star-2;
            space++;
        }


    }
}
