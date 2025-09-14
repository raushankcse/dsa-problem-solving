package Day2;

import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    int row=0;
    int n = sc.nextInt();
    int star = row;
    while(row<n){

      // star print
      int i = 0;
      while (i<=star) {
        System.out.print("* ");
        i++;
      }

      // next row prep
      row++;
      star=row;
      System.out.println();
    }

  }
}
