package CollectionFramework;

import java.util.EnumSet;

public class LearnEnumSet {
  enum Color{
    RED, YELLOW, BLUE
  }
  public static void main(String[] args) {
    

    EnumSet<Color> enumset = EnumSet.allOf(Color.class);

    System.out.println(enumset);

  }
}
