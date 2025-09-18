package Day3;

import java.util.Scanner;

public class NthFibonacci {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int first = 0;
    int second = 1;
    int next=0;
    Fibonacci(n);
    if(n==0){
      System.out.println(first);
      return;
    }
    if(n==1){
      System.out.println(second);
      return;
    }
    for(int i=2;i<=n;i++){
      next = first+second;
      first=second;
      second=next;
    }
    System.out.println(next);
  }

  public static void Fibonacci(int n){


    int first=0;
    int second=1;
    for(int i=1;i<=n;i++){
      int c = first + second; 
      first = second;
      second=c;


    }
    System.out.println(first);
  }
}
