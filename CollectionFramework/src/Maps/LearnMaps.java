package Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMaps {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("us", "usa");
    map.put("in", "india");
    map.put("en", "england");


    // Set<String> keys = map.keySet();
    ArrayList<String> keys = new ArrayList<>(map.keySet());

    Collection<String> values = map.values();

    Set<Map.Entry<String, String>> entries = map.entrySet();


    System.out.println(entries);
    for(Map.Entry<String, String> entry: entries){
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }



    System.out.println(values);
    System.out.println(keys);

    System.out.println(map.containsKey("in"));

    System.out.println(map.get("us"));

    map.remove("in");
    map.remove("us", "usa");

    System.out.println(map);



  }
}
