package Hexaware;

import java.util.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Testing9 {
    public static void main(String[] args) {
        Queue<String> q= new LinkedList<>();
        q.add("apple");
        q.add("banana");
        q.add("cherry");
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.add("Mango");
        System.out.println(q);
        System.out.println("Top element of queue : "+q.peek());
        System.out.println("Size: "+q.size());

        System.out.println("queue loop");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        Queue<String> pq = new PriorityQueue<>();
        pq.add("C");
        pq.add("D");
        pq.add("A");
        pq.add("B");
        System.out.println("Priority queue is : "+pq);
        System.out.println("Priority queue poll : "+pq.poll());
        System.out.println("After poll : "+pq);
    }

}
