package collectionStudy;

import java.util.ArrayList;

public class ArrayListMethods {
    static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();

        boolean result=arrayList.add(99);
        System.out.println("Element add status is "+result);
        //output --> Element add status is true

        arrayList.add(91);
        arrayList.add(94);
        arrayList.add(21);
        arrayList.add(45);
        arrayList.add(50);

        System.out.println(arrayList);
        //output is --> [99, 91, 94, 21, 45, 50]

        //i want to add 100 after 99
        arrayList.add(1,100);
        System.out.println(arrayList);
        //output-->[99, 100, 91, 94, 21, 45, 50]

        System.out.println("=================================================");
//********************************************************************************
        //addLast()-->

        arrayList.addLast(7); //at last i want to add--> 7
        System.out.println(arrayList);
        //output -->[99, 100, 91, 94, 21, 45, 50, 1, 7]

        //addFirst()-->
        arrayList.addFirst(1); //at First i want to add--> 1
        System.out.println(arrayList);
        //Output --> [1, 99, 100, 91, 94, 21, 45, 50, 7]

        System.out.println("=================================================");
 //********************************************************************************
        //clear()-->


       //arrayList.clear();
       //System.out.println(arrayList); //all data clear after clear
        //Output --> []

        System.out.println("=================================================");
//**********************************************************************************
        //clone()-->

        Object arrayListCloned = arrayList.clone();
        System.out.println(arrayListCloned);  //clone create duplicate data all data
        //Output -->  [1, 99, 100, 91, 94, 21, 45, 50, 7]

        System.out.println("=================================================");
//**********************************************************************************
        //equals()-->
        boolean result1=arrayList.equals(arrayListCloned);
        System.out.println(result1);
        //output --> true

        System.out.println("=================================================");
//**********************************************************************************
        //contains()-->

        boolean result2=arrayList.contains(100);
        System.out.println(result2);
        //output--> true

        System.out.println("=================================================");
//**********************************************************************************
        //get()-->

        Integer myElement=arrayList.get(5);
        System.out.println(myElement);
        //output--> 21


        System.out.println("=================================================");
//**********************************************************************************
        //getFirst()-->

        System.out.println(arrayList.getFirst());
        //output--> 1

        //getLast()-->

        System.out.println(arrayList.getLast());
        //output--> 7

        System.out.println("=================================================");
//**********************************************************************************
        //indexOf()-->

        int indexOfElement=arrayList.indexOf(21);
        System.out.println(indexOfElement);
        //output--> 5

        System.out.println(arrayList.indexOf(101));  //--> -1 (means wrong input of element number)

        //lastIndexOf-->

        System.out.println(arrayList.lastIndexOf(1));
        //Output--> 8 (1 is created only 1st number --> index number is 0

        System.out.println("=================================================");
//**********************************************************************************
        //size()-->  //show the size of only use in array and collection
        int sizeOfIndex=arrayList.size();
        System.out.println(sizeOfIndex); //output --> 9

        System.out.println("=================================================");
//**********************************************************************************
        //isEmpty()

        System.out.println(arrayList.isEmpty());
        //--> output is false

        System.out.println("=================================================");

//**********************************************************************************
        //remove(Object)-->  //On int we can not use the remove(Object)

//      boolean result3 = arrayList.remove("1");
//      System.out.println(result3);

        System.out.println(arrayList); //-->[1, 99, 100, 91, 94, 21, 45, 50, 7]

        //remove(Index)-->
        Integer result4 = arrayList.remove(1);
        System.out.println(result4);  //--> 99 remove

        System.out.println(arrayList); //-->[1, 100, 91, 94, 21, 45, 50, 7]

        System.out.println("=================================================");

//**********************************************************************************
        //set()-->

        Integer newData = arrayList.set(1, 77);
        System.out.println(newData); //-->output 100 because 1 index is 100 and 100 replace by 77

        System.out.println(arrayList); //-->[1, 77, 91, 94, 21, 45, 50, 7]

        int tt1=arrayList.set(5,707);
        System.out.println(tt1);

        System.out.println(arrayList); //-->[1, 77, 91, 94, 21, 707, 50, 7]

    }
}
