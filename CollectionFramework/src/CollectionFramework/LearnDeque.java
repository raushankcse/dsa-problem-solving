package CollectionFramework;

import java.util.ArrayDeque;

public class LearnDeque {
  public static void main(String[] args) {
    ArrayDeque<Integer> dq = new ArrayDeque<>();
    dq.offer(8);
    dq.offerLast(9);
    dq.offerFirst(7);
    System.out.println(dq.peek()); 
    System.out.println(dq.peekLast());

    System.out.println(dq);
    System.out.println(dq.poll());

    System.out.println(dq.pollLast());
    System.out.println(dq);
  }
}
