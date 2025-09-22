package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();


    fruits.add("banana");
    fruits.add("kiwi");
    fruits.add("apple");
    fruits.add("orange");

    for(int i =0;i<fruits.size();i++){
      System.out.println(fruits.get(i));
    }

    for(String fruit: fruits){
      System.out.println(fruit);
    }

    Iterator<String> fe = fruits.iterator();
    while (fe.hasNext()) {
      System.out.println("iterator " + fe.next());
    }

  }
}
