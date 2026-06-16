package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {
    static void main(String[] args) {

        TreeSet<Object> treeSet=new TreeSet<>();
        treeSet.add(12);
        treeSet.add(23);
        treeSet.add(32);
        treeSet.add(22);
        treeSet.add(15);
        treeSet.add(42);
        treeSet.add(12);
        treeSet.add(62);
        treeSet.add(25);
        treeSet.add(52);

        System.out.println(treeSet); //-->[12, 15, 22, 23, 25, 32, 42, 52, 62] --> Ascending order print

        System.out.println("==========================================");

        //ceiling()--> Show elements Bigger number OR equal Number
        System.out.println(treeSet.ceiling(59)); //-->62

        System.out.println(treeSet.ceiling(52)); //-->52

        System.out.println(treeSet.ceiling(50)); //-->52

        System.out.println(treeSet.ceiling(100)); //--> null (no big OR equal number of 100)

        System.out.println(treeSet.ceiling(0));   // Bigger than 0 --> 12

        System.out.println("==========================================");

        //floor()--> Show elements smaller number OR equal number

        System.out.println(treeSet.floor(40)); //-->32

        System.out.println(treeSet.floor(25)); //-->25

        System.out.println(treeSet.floor(20)); //-->15

        System.out.println(treeSet.floor(0));  //--> null (no element smaller than zero)

        System.out.println("==========================================");

        //poll()-->

        System.out.println(treeSet.pollFirst()); //--> 12
        System.out.println(treeSet.pollLast());  //-->62
        //12 and 62 remove from the treeSet
        // [15, 22, 23, 25, 32, 42, 52]

        System.out.println(treeSet);

        System.out.println("====================for each loop======================");

        for (Object ts:treeSet)
        {
            System.out.println(ts);
        }

        System.out.println("====================iterator======================");
        Iterator<Object> it =treeSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }








    }
}
