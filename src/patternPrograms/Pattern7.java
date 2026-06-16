package patternPrograms;

public class Pattern7 {
    static void main(String[] args) {
//           *
//          ***
//         *****
//        *******

        int row=4;
        int column=7;
        int space=3;  //space in first line
        int star=1;   //star in first line

        for (int i=1;i<=row;i++)       //for row
        {
            for (int j=0;j<=space;j++)  //for space
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)   //for star
            {
                System.out.print("*");
            }
            System.out.println();
            star=star+2;
            space--;
        }

    }
}
