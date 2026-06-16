package logicProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateAndSort {
    static void main(String[] args) {

      //  Q.Remove Duplicate Number and Sort.

        int rollNum []={54,15,85,56,98,21,11,1,32,41,87,99,22,63,46,76,56,15,78,11,21,98,87};

        //for each --> for show all number

        System.out.println("==============for Remove Duplicate and Sort===============");
        TreeSet<Integer> treeSet= new TreeSet<>();
        for (Integer rn:rollNum)
        {
            treeSet.add(rn);
        }
        System.out.println(treeSet);
        //-->[1, 11, 15, 21, 22, 32, 41, 46, 54, 56, 63, 76, 78, 85, 87, 98, 99]

        System.out.println("==============for Print One By One===============");

        for (Integer ts:treeSet)
        {
            System.out.println(ts);
        }

        System.out.println("==============If i want big number===============");
        //In TreeSet we can not find Big Number Using get()--> Casting into ArrayList

        ArrayList<Integer> arrayList=new ArrayList<>(treeSet);

        //for big number-->
        System.out.println(arrayList.get(arrayList.size()-1)); //-->99

        //for 2nd big number
        System.out.println(arrayList.get(arrayList.size()-2));//--> 98

        System.out.println("==============If i want small number===============");

        //small Number-->
        System.out.println(arrayList.get(0)); //-->1

        //2nd small number-->
        System.out.println(arrayList.get(1)); //--> 11




    }
}
