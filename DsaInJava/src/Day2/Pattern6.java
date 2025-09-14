package Day2;

import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = n;
    int space = 0;
    int row = 0;
    while (row<n) {
      // space print
      int i= 0;
      while (i<space) {
        System.out.print("  ");
        i++;
      }

      // star print
      int j=0;
      while (j<star) {
        System.out.print("* ");
        j++;
      }
      // next row prep
      row++;
      System.out.println();
      space++;
      star--;
    }
  }
}
