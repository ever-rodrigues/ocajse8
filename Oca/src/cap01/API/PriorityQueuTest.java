package cap01.API;

import java.util.PriorityQueue;

public class PriorityQueuTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> myPriorityQueue= new PriorityQueue<>(new CustomComparator());

        myPriorityQueue.add(1);
        myPriorityQueue.add(10);
        myPriorityQueue.add(3);
        myPriorityQueue.add(20);
        //When you have all itens in queue

        System.out.println(myPriorityQueue);
        while (!myPriorityQueue.isEmpty()){
            System.out.println(myPriorityQueue.poll());
        }

        //Now you take out all elements using mehtod poll
        System.out.println(myPriorityQueue);
    }
}
