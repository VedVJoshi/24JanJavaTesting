package patternPrograms;

public class Pattern15 {
    static void main(String[] args) {
// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *

        int row=13;
        int space=0;
        int star=7;

        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            System.out.println();

            if (i<7)
            {
                space++;
                star--;
            }
            else
            {
                space--;
                star++;
            }
        }
    }
}
