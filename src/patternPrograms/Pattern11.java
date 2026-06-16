package patternPrograms;

public class Pattern11 {
    static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

        int row=9;
        int star=1;

        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i<5)
            {
                star++;
            }
            else
            {
                star--;
            }
        }

    }
}
