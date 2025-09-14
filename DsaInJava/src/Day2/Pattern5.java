package Day2;

import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int star = 1;
    int space = n-star;
    while (row<n) {
      // space print
      int j=0;
      while (j<space) {
        System.out.print("  ");
        j++;
      }

      // start print
      int k = 0;
      while (k<star) {
        System.out.print("* ");
        k++;
      }


      //next loop prep
      space--;
      star++;
      row++;
      System.out.println();

    }
  }
}
