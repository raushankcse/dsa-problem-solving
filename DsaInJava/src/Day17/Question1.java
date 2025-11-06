package Day17;

public class Question1 {
  // equals or not
  public static void main(String[] args) {
    String str1= "hello";
    String str2 = "hello";
    String str3 = new String("hello");
    System.out.println(equal(str1,str3));
  }
  public static boolean equal(String str1, String str2){
    if(str1.length()!=str2.length()){
      return false;
    }
    if(str1==str2){
      return true;
    }
    for(int i=0;i<str1.length();i++){
      if(str1.charAt(i)!=str2.charAt(i)){
        return false;
      }
    }
    return true;
  }

}
