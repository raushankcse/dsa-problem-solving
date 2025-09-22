package CollectionFramework;

import java.util.Stack;

public class StackOperation {
  public static void main(String[] args) {
    Stack<String> fruits = new Stack<>();
    fruits.push("appple");
    fruits.push("banana");
    System.out.println(fruits);
    System.out.println(fruits.pop());
    System.out.println(fruits.peek());
    System.out.println(fruits);
  }
}
