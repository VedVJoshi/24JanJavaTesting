package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {
    static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add(23);
        linkedHashSet.add(13);
        linkedHashSet.add(22);
        linkedHashSet.add(33);
        linkedHashSet.add(43);
        linkedHashSet.add(23);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(24);

        System.out.println(linkedHashSet); //-->[23, 13, 22, 33, 43, null, 24]

        //add()-->
        linkedHashSet.addFirst(11);
        linkedHashSet.addLast(1000);

        System.out.println(linkedHashSet);  //-->[11, 23, 13, 22, 33, 43, null, 24, 1000]

        System.out.println("===========================================");

        //size()-->
        System.out.println(linkedHashSet.size()); //-->9

        System.out.println("===========================================");

        //getFirst() / getLast()-->

        System.out.println(linkedHashSet.getFirst()); //-->11

        System.out.println(linkedHashSet.getLast());  //-->1000

        System.out.println("===========================================");

        //remove()-->

        linkedHashSet.removeFirst();

        linkedHashSet.remove(13);
        //     [23, 22, 33, 43, null, 24, 1000]
        System.out.println(linkedHashSet);

        System.out.println("===========================================");

        //clear()-->
         //linkedHashSet.clear();

        System.out.println("===========================================");
         //clone()-->

        System.out.println(linkedHashSet.clone());

        System.out.println("=======================for each loop====================");

        for (Integer ta:linkedHashSet)
        {
            System.out.println(ta);
        }


        System.out.println("=======================iterator====================");

        Iterator<Integer>it =linkedHashSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
















    }
}
