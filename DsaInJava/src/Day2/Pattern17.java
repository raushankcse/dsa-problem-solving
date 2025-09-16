package Day2;

import java.util.Scanner;

public class Pattern17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int star = n/2+1;
    int space = -1;
    while (row<n) {
      // different work in a row
      // star
      int i =0;
      while (i<star) {
        System.out.print("* ");
        i++;
        
      }


      // space
      int j = 0;
      while (j<space) {
        System.out.print("  ");
        j++;
        
      }


      // star
      int k=0;
      if(row==0 || row==n-1){
        k=1;
      }
      while (k<star) {
        System.out.print("* ");
        k++;
        
      }


      // next row prep and mirror
      row++;
      System.out.println();
      if(row<n/2+1){
        star--;
        space+=2;
      }else{
        star++;
        space-=2;
      }
      
    }

  }
}
