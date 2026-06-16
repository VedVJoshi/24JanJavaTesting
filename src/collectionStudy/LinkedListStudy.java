package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(12);
        linkedList.add(12);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(14);
        linkedList.add(45);
        linkedList.add(65);
        linkedList.add(79);
        linkedList.add(77);

        System.out.println(linkedList); //-->[12, 12, null, null, 14, 45, 65, 79, 77]


        //add()-->
        linkedList.add(1,777);
        System.out.println(linkedList);  //-->[12, 777, 12, null, null, 14, 45, 65, 79, 77]

        linkedList.addFirst(11);
        linkedList.addLast(1111);
        System.out.println(linkedList);
        //-->[11, 12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111]

        System.out.println("=============================================");
        //get()-->
        System.out.println(linkedList.get(2)); //-->777

        System.out.println("=============================================");

        //clone()-->
        System.out.println(linkedList.clone()); //-->[11, 12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111]

        System.out.println("=============================================");

        //element()-->
        System.out.println(linkedList.element());  //--> 11 (it will show the first element only)

        System.out.println("=============================================");


        //clear()-->
//        linkedList.clear();
//        System.out.println(linkedList); //-->[]

        System.out.println("=============================================");

        //contains-->
        System.out.println(linkedList.contains(1111)); //-->true

        System.out.println("=============================================");

        //offer()-->
        linkedList.offer(9999);
        System.out.println(linkedList);
        //output-->[11, 12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111, 9999]

        linkedList.offerFirst(1);  //first -->1
        linkedList.offerLast(10000); //last--> 10000
        System.out.println(linkedList);
        //-->output-->[1, 11, 12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111, 9999, 10000]

        System.out.println("=============================================");
        //set()-->
        System.out.println("set method");
        linkedList.set(1,101);  //index 1 update the number to 101
        System.out.println(linkedList);

      //  [1, 101, 12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111, 9999, 10000]
          //--> 11 is On index 1 and after use of set it is remove and update to 101 on index 1


        System.out.println("=============================================");


        //peak()-->   peak only show element not remove
        System.out.println(linkedList.peek()); //--> 1

        //peak first and last-->
        System.out.println(linkedList.peekFirst()); //-->1
        System.out.println(linkedList.peekLast());  //-->10000

        System.out.println("=============================================");

        //poll()-->
        //poll will show that element and remove from the list --> poll method

        System.out.println(linkedList.poll()); //-->1 (1 is remove also from list)
        System.out.println(linkedList);//-->[11, 12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111, 9999, 10000]

        System.out.println(linkedList.pollFirst()); //--> 11 (11 remove from list)
        System.out.println(linkedList.pollLast());  //--> 10000 (10000 remove from list)

        System.out.println(linkedList);//-->[12, 777, 12, null, null, 14, 45, 65, 79, 77, 1111, 9999]

        System.out.println("=============================================");

        //pop()-->  pop also show that number and remove from the list

        linkedList.pop(); //--> it will remove first element in list
                          //12 is removed from list.
        System.out.println(linkedList);//-->[777, 12, null, null, 14, 45, 65, 79, 77, 1111, 9999]

        System.out.println("===================for loop==========================");

        for (int i=0;i<=linkedList.size()-1;i++)
        {
            System.out.println(linkedList.get(i));
        }

        System.out.println("===================for each loop==========================");

        for (Integer lk:linkedList)
        {
            System.out.println(lk);
        }

        System.out.println("===================iterator==========================");

        Iterator<Integer>it = linkedList.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("===================list iterator==========================");

        ListIterator<Integer> lit = linkedList.listIterator();

        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }

        System.out.println("===================list iterator previous==========================");

        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }












    }
}
