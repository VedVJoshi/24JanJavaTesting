package arrayStudy;

import java.util.Arrays;

public class ArraySample2 {
    static void main(String[] args) {

        //2nd option to create the Array-->

        int rollNum[]={21,2,54,1,4,78,52,14,65,85,74,12,10,8,15};

        //when you only want call single value (Using Index Number)-->
        System.out.println(rollNum[5]); //calling Index 5 value output is -->78
        System.out.println("===================================================");
//*****************************************************************************************
        //when you want to call all value--> we will use for loop-->
        for (int i=0;i<=rollNum.length-1;i++)
        {
            System.out.println(rollNum[i]);
        }

        System.out.println("=====================================================");
//*****************************************************************************************
        System.out.println("=========================Ascending Order========================");
        //want to print in ascending order (0 to 1000000000000000000000 Ultimate)
        Arrays.sort(rollNum); //sorted 1-100000000....

        for (int i=0;i<=rollNum.length-1;i++)
        {
            System.out.println(rollNum[i]);
        }
        System.out.println("=====================================================");
//*****************************************************************************************
        System.out.println("=========================Descending Order========================");
        //want to call in descending Order (1000000000000000000 Ultimate to 0)
        for (int i=rollNum.length-1;i>=0;i--)
        {
            System.out.println(rollNum[i]);
        }
        System.out.println("=====================================================");
//*****************************************************************************************

    }
}
