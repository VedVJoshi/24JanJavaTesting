package collectionStudy;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class Assign {
    static void main(String[] args) {

        Vector <Object> vector=new Vector<>();
        vector.add("data");
        vector.add(123);
        vector.add('A');
        vector.add(true);
        vector.add(null);
        vector.add(false);
        vector.add(45.45f);
        vector.add("data");
        vector.add(456);
        vector.add(null);
        vector.add("vedant");
        vector.add('C');
        vector.add('D');
        vector.add(null);
        vector.add(12.12f);

        System.out.println("==========================for loop==========================");

        for (int a=0;a<=vector.size()-1;a++)
        {
            System.out.println(vector.get(a));
        }

        System.out.println("==========================for each loop==========================");

        for (Object vec:vector)
        {
            System.out.println(vec);
        }

        System.out.println("==========================Iterator==========================");

        Iterator<Object> it= vector.iterator();

        while (it.hasNext())
        {
           System.out.println(it.next());
        }

        System.out.println("==========================List Iterator==========================");

        ListIterator<Object> lit = vector.listIterator();

        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }

        System.out.println("==========================List Iterator previous==========================");

        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }

        System.out.println("==========================Enumeration Iterator==========================");

        Enumeration<Object> ele = vector.elements();

        while (ele.hasMoreElements())
        {
            System.out.println(ele.nextElement());
        }







    }
}
