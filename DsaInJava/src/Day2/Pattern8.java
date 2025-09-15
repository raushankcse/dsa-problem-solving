package Day2;

import java.util.Scanner;

public class Pattern8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int space = (n*2)-2;
    int star = 1;

    while (row<n) {
      // space
      int i =0;
      while (i<space) {
        System.out.print("  ");
        i++;
      }



      // star
      int j= 0;
      while (j<star) {
        System.out.print("* ");
        j++;
      }

      // next row prep
      star++;
      space-=2;
      row++;
      System.out.println();
      
    }

  }
}
