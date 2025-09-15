package Day2;

import java.util.Scanner;

public class Pattern14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row=0;
    int star = 1;
    while (row<2*n-1) {
      // different task in a row

      // print star
      int i=0;
      while (i<star) {
        System.out.print("* ");
        i++;
      }




      // next row prep and mirror concept
      row++;
      System.out.println();
      if(row<n){
        star++;
      }else{
        star--;
      }
    }
  }
}
