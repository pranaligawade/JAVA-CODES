package Assignments;

import java.util.PriorityQueue;

public class PriorityQueueTwo {
      static int ContainCompare (PriorityQueue<Integer>pq1, PriorityQueue<Integer> pq2){
         return pq1.peek().compareTo(pq2.peek());
     }
    public static void main(String[] args) {
        PriorityQueue p= new PriorityQueue<Integer>();
        p.offer(12);
        p.offer(34);
        p.offer(56);
        p.offer(67);// queue
        p.offer(9);
        System.out.println(p);
        PriorityQueue p1= new PriorityQueue();
        p1.offer(14);
        p1.add(34);// collection // throw exception if it can't add element
        p1.add(54);
        p1.add(8);
        System.out.println(p1);

        System.out.println( ContainCompare(p,p1));
      }

        }
