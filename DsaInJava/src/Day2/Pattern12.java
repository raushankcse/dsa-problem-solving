package Day2;

import java.util.Scanner;

public class Pattern12 {
  public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 0;
    int space= (n*2)-3;
    int star = 1;

    while (row<n) {

      // different task in a row
      // star
      int i =0;
      while (i<star) {
        System.out.print("* ");
        i++;
        
      }


      // space
      int j =0;
      while (j<space) {
        System.out.print("  ");
        j++;
        
      }


      // star
      if(row==n-1){
        star--;
      }
      int k=0;
      while (k<star) {
        System.out.print("* ");
        k++;
        
      }


      // next row prep
      row++;
      System.out.println();
      star++;
      space-=2;
     


      
    }
  

  }
}
