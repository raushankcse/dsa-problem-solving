package Day2;

import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 0;
    int star = n;

    while (i<n) {
      // star print
      int j=0;

      while (j<star) {
        System.out.print("* ");
        j++;
      }

      // next row prep
      System.out.println();
      i++;
    }

  }
}
