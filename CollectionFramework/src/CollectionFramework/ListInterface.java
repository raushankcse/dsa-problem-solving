package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(5);
    list.add(6);
    list.add(7);

    System.out.println(list.get(0));
    list.set(0,100);
    
    list.add(0,200);
    
    System.out.println(list.indexOf(300));
    list.remove(Integer.valueOf(7));
    System.out.println(list);



  }
}
