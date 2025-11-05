package Day17;

public class LearnString {

  // string
  public static void main(String[] args) {
    String str ="hello";
    String str1 = new String("Hello");
    String str2 ="hello";
    String str3 = new String("Hello");
    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);

    str = str + "hey";
    str1.concat(str3);
    
  }
}
