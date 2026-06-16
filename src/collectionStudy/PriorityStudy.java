package collectionStudy;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityStudy {
    static void main(String[] args) {

        PriorityQueue<Object> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(123);
        //  priorityQueue.add(null);  -->NullPointerException
        priorityQueue.add(123);
        priorityQueue.add(145);
        priorityQueue.add(100);
        priorityQueue.add(99);
        priorityQueue.add(11);

        System.out.println(priorityQueue);
        //-->[11, 100, 99, 123, 123, 145]

        System.out.println("=======================for each loop=======================");

        for (Object pq : priorityQueue) {
            System.out.println(pq);
        }

        System.out.println("=======================iterator=======================");

        Iterator<Object> it = priorityQueue.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
