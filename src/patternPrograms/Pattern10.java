package patternPrograms;

public class Pattern10 {
    static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****
//        *****

        int row=9;
        int star=5;

        //outer loop for--> row
        for (int i=1;i<=row;i++)
        {
            //inner loop for--> star
            for (int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i<5)
            {
                star--;
            }
            else
            {
              star++;
            }
        }

    }
}
