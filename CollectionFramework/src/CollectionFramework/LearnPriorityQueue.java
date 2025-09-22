package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>();
    pq.add(10);
    pq.add(40);
    pq.add(20);
    pq.add(30);



    System.out.println(pq);
    pq.poll();
    System.out.println(pq);
  }
}
