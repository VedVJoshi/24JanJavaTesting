package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {
    static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("test");
        hashSet.add("data");
        hashSet.add("test");
        hashSet.add(null);
        hashSet.add("java");
        hashSet.add(null);
        hashSet.add("selenium");
        hashSet.add("automation");

        System.out.println(hashSet); //-->[null, java, automation, test, data, selenium]

        //remove()-->
        hashSet.remove("data");
        System.out.println(hashSet); //-->[null, java, automation, test, selenium]

        //size()-->
        System.out.println(hashSet.size()); //--> output--> 5

//        //clear()-->
//        hashSet.clear();
//        System.out.println(hashSet); //output-->[]

        //contains()-->

        boolean result=hashSet.contains("selenium");
        System.out.println(result); //--> true

        //isEmpty()-->

        System.out.println(hashSet.isEmpty()); //--> false

        System.out.println("==============================for each loop==========================");
        for (String ha:hashSet)
        {
            System.out.println(ha);
        }

        System.out.println("==============================iterator==========================");
        Iterator<String> it=hashSet.iterator();


        //only for print or remove the single element / word
//        it.next();
//        it.next();
//        it.remove();
//        System.out.println(it.next());
//        System.out.println(hashSet);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }






    }
}
