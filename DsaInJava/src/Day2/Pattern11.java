package Day2;

import java.util.Scanner;

public class Pattern11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int space = n-1;
    int star = 1;

    while (row<n) {
      // space
      int i = 0;
      while (i<space) {
        System.out.print("  ");
        i++;
        
      }


      // star
      int j = 0;
      while (j<star) {
        if(j%2==0){
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
        j++;
      }


      // next row prep
      row++;
      System.out.println();
      star+=2;
      space--;
      
    }


  }
}
