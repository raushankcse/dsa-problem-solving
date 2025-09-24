package Day4;

import java.util.Scanner;

public class InverseNumber {
  public static void main(String[] args) {
    int n = 126354;
    int sum = 0;
    int pos = 1;
    while (n>0) {
      int rem = n%10;
      sum = (int)(sum + pos* Math.pow(10, rem-1));

      pos++;

      n/=10;
    }
    System.out.println(sum);
  }
}
