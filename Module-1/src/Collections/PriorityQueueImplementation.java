package Collections;

import java.util.*;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // Max Heap
        PriorityQueue<Integer> p = new PriorityQueue<>();  // Min Heap

        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.poll());

        p.offer(1);
        p.offer(2);
        p.offer(3);
        p.offer(4);
        System.out.println(p);
        System.out.println(p.poll());

    }
    }




