package JavaBasic;

import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int row=0;
    while (row<n) {
      // star
      int i=0;
      while (i<=row) {
        if(i==0 || i==row || row==0 || row == n-1){

          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
        i++;
        
      }



      // next row prep
      row++;
      System.out.println();
    }
  }
}
