package arrayStudy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySimple1 {
    static void main(String[] args) {
        //i want to store batters name

        String batters[]=new String[5];
        batters[0]="Dhoni";
        batters[1]="Jadeja";
        batters[2]="Samson";
        batters[3]="Virat";
        batters[4]="Surya";
        //batters[8]="Hardik"; //-->ArrayIndexOutOfBoundsException

        System.out.println(batters[1]);
        //System.out.println(batters[78]); //-->ArrayIndexOutOfBoundsException
        System.out.println("=================================================================");

        System.out.println(batters.length);

        System.out.println("=================================================================");
        //i want print all batters
        for (int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }
        System.out.println("=====================Ascending case=======================================");

        Arrays.sort(batters); //for so sequence A-Z
        for (int i=0;i<=batters.length-1;i++)
        {
            System.out.println(batters[i]);
        }

        System.out.println("=====================Descending case=======================================");
        for (int i=batters.length-1;i>=0;i--)
        {
            System.out.println(batters[i]);
        }





    }
}
