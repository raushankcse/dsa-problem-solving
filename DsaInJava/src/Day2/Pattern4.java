package Day2;

import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int row = 0;
    int star = n;
    while (row<n) {
      // star print
      int i = 0;
      while (i<star) {
        System.out.print("* ");
        i++;
      }



      // next row prep
      row++;
      star--;
      System.out.println();
    }
  }
}
