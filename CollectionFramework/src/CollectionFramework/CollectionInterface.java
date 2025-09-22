package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterface {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    list.add(20);
    list.add(10);
    list.add(30);

    System.out.println(list);
    System.out.println(list.size());
    list.remove(1);


    list.remove(Integer.valueOf(30));


    list2.add(1);
    list2.add(2);

    list.addAll(list2);
    System.out.println(list);


  }
}
