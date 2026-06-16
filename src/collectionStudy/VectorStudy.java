package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {
    static void main(String[] args) {

        Vector<Object> vector = new Vector<>();
        vector.add("test");
        vector.add('A');
        vector.add(null);
        vector.add(true);
        vector.add(12.15f);
        vector.add(null);
        vector.add("test");
        vector.add('A');
        vector.add(true);
        vector.add('C');
        vector.add(false);
        vector.add(12.15f);

        System.out.println(vector);
        System.out.println(vector.size());

        //add-->
        vector.add(2,90);
        System.out.println(vector);    //-->[test, A, 90, null, true, 12.15, null, test, A, true, C, false, 12.15]
        //vector.addFirst();
        //vector.addLast();

        //get()-->
        System.out.println(vector.get(5));  //-->12.15

        //addElement()-->

        vector.addElement(50);
        System.out.println(vector); //-->[test, A, 90, null, true, 12.15, null, test, A, true, C, false, 12.15, 50]

        //elementAt()-->
        System.out.println(vector.elementAt(8)); //--> A

        System.out.println(vector.firstElement()); //-->test
        System.out.println(vector.lastElement());  //--> 50

        //insertElement()-->
        vector.insertElementAt(58,9);
        System.out.println(vector);  //-->[test, A, 90, null, true, 12.15, null, test, A, 58, true, C, false, 12.15, 50]

        System.out.println("=======================for loop=======================");
        for (int i=0;i<=vector.size()-1;i++)
        {
            System.out.println(vector.get(i));
        }

        System.out.println("=======================for each loop=======================");

        for (Object v:vector)
        {
            System.out.println(v);
        }

        System.out.println("=======================iterator=======================");

        Iterator<Object> it=vector.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("=======================list iterator=======================");

        ListIterator<Object> lit=vector.listIterator();

        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }

        System.out.println("=======================list iterator previous =======================");

        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }


//        lit.add(45);                   //add
//        System.out.println(vector);
//        lit.next();
//        lit.remove();                  //remove
//        System.out.println(vector);
//        lit.next();
//        lit.set(456);                  //update
//        System.out.println(vector);

        System.out.println("=======================Enumeration=======================");

        Enumeration<Object> ele = vector.elements();
        while (ele.hasMoreElements())
        {
            System.out.println(ele.nextElement());
        }

        System.out.println("=======================================================");

        int data = vector.capacity();
        System.out.println(data);

        System.out.println(vector.size());









    }
}
