package Day3;

import java.util.Scanner;

public class Pascal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int ncr=1;
    int i=0;
    while (i<row) {
      int n=i;
      int r=0;
      while (r<=n) {
        System.out.print(ncr + "\t");
        int ncnext = ((n-r)*ncr)/(r+1);
        if(ncnext==0){
          ncnext=1;
        }
        ncr=ncnext;
        r++;
      }
      System.out.println();
      i++;
      
    }
  }
}
