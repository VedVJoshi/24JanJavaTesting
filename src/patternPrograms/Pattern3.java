package patternPrograms;

public class Pattern3 {
    static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *

        //row     columns     stars in 1st line

        int row=5;
        int column=5;
        int star=5;

        for (int i=1; i<=row;i++)  //for row
        {
          for (int j=1;j<=star;j++)  //for star
          {
              System.out.print("*");
          }
          System.out.println();
          star--;
        }


    }
}
