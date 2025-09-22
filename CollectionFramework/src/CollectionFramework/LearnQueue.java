package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(29);
    q.offer(30);
    q.offer(50);
    
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);

  }
}
