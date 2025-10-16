package Day9;

public class Array2 {
  public static void main(String[] args) {
    fun(8);
    System.out.println(val);
  }
  static int val = 8;
  public static void fun(int x){
    int val=10;
    Array2.val=9;
    System.out.println(val);
  }
}
