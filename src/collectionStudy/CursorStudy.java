package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {
    static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(26);
        arrayList.add(28);
        arrayList.add(30);
        arrayList.add(35);
        arrayList.add(48);
        arrayList.add(88);
        arrayList.add(70);
        arrayList.add(45);
        arrayList.add(87);
        arrayList.add(92);

        System.out.println(arrayList); //-->[26, 28, 30, 35, 48, 88, 70, 45, 87, 92]

        System.out.println(arrayList.size()); //size of all elements --> 10

        System.out.println("========================for loop======================");
        for (int i=0;i<=arrayList.size()-1;i++)
        {
            System.out.println(arrayList.get(i));
        }

        System.out.println("========================each for loop======================");
        for (Integer al:arrayList)    //show all elements but this is advance of for loop
        {
            System.out.println(al);
        }

        System.out.println("========================iterator======================");

        Iterator<Integer> it=arrayList.iterator();
        while (it.hasNext())
        {

            Integer val=it.next();
            System.out.println(val);
//            it.next();
//            it.remove();
        }
        System.out.println("========================List Iterator======================");
        ListIterator<Integer> lit=arrayList.listIterator();
        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }

        System.out.println("========================List Iterator previous======================");

        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        System.out.println("===========================================================");


    }
}
