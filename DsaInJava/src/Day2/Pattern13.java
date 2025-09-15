package Day2;

import java.util.Scanner;

public class Pattern13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int star = n;
    int space = -1;

    while (row<n) {
      // different work in a row

      // star
      int i = 0;
      while (i<star) {
        System.out.print("* ");
        i++;
        
      }

      // space
      int j=0;
      while (j<space) {
        System.out.print("  ");
        j++;
      }

      // star
      int k=0;
      if(row==0){
        k=1;
      }
      while (k<star) {
        System.out.print("* ");
        k++;
        
      }


      // next row prep
      row++;
      System.out.println();
      star--;
      space+=2;
      
    }

  }
}
