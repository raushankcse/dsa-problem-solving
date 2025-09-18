package Day3;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = false;
    int  n = sc.nextInt();
    for(int i=2;i<n;i++){
      if(n%i==0){
        flag=true;
        break;
      }
    }

    if(flag){
      System.out.println("not prime");
    }else{
      System.out.println("prime");
    }
  }
}
