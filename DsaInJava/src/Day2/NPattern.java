package Day2;

import java.util.Scanner;

public class NPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = 1;
    int space = n-1;
    int row = 0;
    int number = 1;
    while (row<n) {
      // different work in a row
      // space
      int i = 0;
      while (i<space) {
        System.out.print("  ");
        i++;
        
      }



      // star
      int j=0;
      while (j<star) {
        System.out.print(number+" ");
        number++;
        j++;
        
      }


      // next row prep
      row++;
      System.out.println();
      space--;
      star+=2;

      
    }

  }
}
