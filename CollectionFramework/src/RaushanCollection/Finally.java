package RaushanCollection;


import java.util.Scanner;


public class Finally{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();


    try{
      if(n>100){
        throw new myException("hiiii");
      }
      
    } catch (Exception e){
      System.out.println(e);
    } finally{
      System.out.println("always");
    }

  }

}
class myException extends Exception {
  public myException(String message){
    super(message);
  }
}

