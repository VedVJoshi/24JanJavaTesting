package patternPrograms;

public class Pattern1 {
    static void main(String[] args) {

//        *****
//        *****
//        *****

           //row     columns

        int row=3;     //total row
        int column=5;  //total column

        for (int i=1;i<=row;i++)  //outer loop for row
        {
            for (int j=0;j<=column;j++)   //inner loop for column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
