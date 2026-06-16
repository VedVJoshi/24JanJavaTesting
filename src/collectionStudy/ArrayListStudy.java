package collectionStudy;

import java.util.ArrayList;


public class ArrayListStudy {
    static void main(String[] args) {

        ArrayList<Object> arrayList=new ArrayList<>(); //this is ArrayList Final Class--> object
         //Genric array List-->

        //How to add elements in ArrayList
        //method--> add()

        arrayList.add("Velocity");
        arrayList.add(null);
        arrayList.add(7666);
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add(85.54f);
        arrayList.add('B');
        arrayList.add('C');
        arrayList.add('A');
        arrayList.add(null);
        arrayList.add("Vedant");
        arrayList.add("Velocity");
        arrayList.add(20.45f);

        System.out.println(arrayList); //call through direct object
       // output--> [Velocity, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Velocity, 20.45]

        //If i want to add Testing--> after 1st Velocity
        arrayList.add(1,"Testing");
        System.out.println(arrayList);
        //output--> [Velocity, Testing, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Velocity, 20.45]

        //If i want to add Joshi--> after Vedant
        arrayList.add(12,"Joshi");
        System.out.println(arrayList);
        //output-->[Velocity, Testing, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Joshi, Velocity, 20.45]

        System.out.println("===========================================================================");
//*********************************************************************************************************************
        //Specific array List-->

        ArrayList<String> arrayList1 =new ArrayList<>();
        arrayList1.add("Test 1");
        arrayList1.add("Test 2");
        arrayList1.add("Test 3");
        System.out.println(arrayList1);
        System.out.println("============================================================================");
//*********************************************************************************************************************

        System.out.println(arrayList.size()); //--> 15 elements in ArrayList
        System.out.println(arrayList1.size()); //--> 3 elements in ArrayList1



    }
}
