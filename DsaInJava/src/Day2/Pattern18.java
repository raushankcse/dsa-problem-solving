package Day2;

import java.util.Scanner;

public class Pattern18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row =0;
    int space1 = n/2;
    int space2 = -1;
    while (row<n) {
      // different work in a row
      // space
      int i=0;
      while (i<space1) {
        System.out.print("  ");
        i++;
        
      }


      // star

      System.out.print("* ");



      // space
      int j=0;
      while (j<space2) {
        System.out.print("  ");
        j++;
        
      }


      // star
      if(row!=0 && row != n-1)
      {
        System.out.print("* ");

      }





      // next row prep
      row++;
      System.out.println();
      if(row<n/2+1)
      {
        space1--;
        space2+=2;
      }else{
        space1++;
        space2-=2;
      }
      
    }
  }
}
