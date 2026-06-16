package arrayStudy;

import java.util.Arrays;

public class ArraySample3 {
    static void main(String[] args) {

        //Multidimensional array using new keyword
        int test[] []=new int[2][2]; //array declaration
        test[0][0]= 5;
        test[0][1]= 10;
        test[1][0]= 15;
        test[1][1]= 20;

        //array usage--> FOR SINGLE ARRAY PRINT-->
        System.out.println(test[0][1]);
        System.out.println("==========================================");

        //for print all row and column --> FOR ALL ARRAY PRINT-->
           //row --> outer loop of for
        //i --> row
        //j --> column
        for (int i=0;i<=test.length-1;i++) //for row
        {
            for (int j=0;j<= test[i].length-1; j++ ) //for column
            {
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("==========================================");

        for ( int a=test.length-1;a>=0;a--)
        {
            for (int b=0;b<= test[a].length-1;b++)
            {
                System.out.print(test[a][b]+ " ");
            }
            System.out.println();
        }

    }
}
