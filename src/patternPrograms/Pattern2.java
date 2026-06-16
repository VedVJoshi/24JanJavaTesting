package patternPrograms;

public class Pattern2 {
    static void main(String[] args) {

//        *
//        **
//        ***
//        ****
//        *****

        //row     columns     stars in 1st line

        int row=5;
        int column=5;
        int star=1;   //in first line star

        for (int i=1;i<=row;i++)   //outer loop for row
        {
            for (int j=1;j<=star;j++)  //inner loop for star
            {
                System.out.print("*");
            }
            System.out.println();
            star++;
        }


    }
}
