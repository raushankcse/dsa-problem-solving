package JavaBasic;

import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();


    int row = 0;
    while (row<n) {
      // star
      int i=0;
      while (i<n) {
        if(row==0 || i==0 || i==n-1 || row==n-1){
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
