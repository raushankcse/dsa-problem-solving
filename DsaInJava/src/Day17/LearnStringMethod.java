package Day17;

public class LearnStringMethod {
  public static void main(String[] args) {
    String str = "hello";
    String str1 = new String("hello");
    String str2 = "hello";
    String str3 = new String("hello");

    System.out.println(str==str2);
    System.out.println(str.equals(str1));
    
    

  }
}
