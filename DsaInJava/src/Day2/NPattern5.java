package Day2;

import java.util.Scanner;

public class NPattern5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = 1;
    int space = n-1;
    int row = 0;
    int number = 1;

    while (row<n*2-1) {
      // different work in a row
      // space
      int i = 0;
      while (i<space) {
        System.out.print("\t");
        i++;
        
      }



      // star
      int j=0;
      int p = number;
      while (j<star) {
        System.out.print(p+"\t");
        j++;
        if(j<star/2+1){
          p++;

        }else{
          p--;
        }
        
      }


      // next row prep
    
      row++;
      System.out.println();
      
      if(row<n){
        number++;
        space--;
        star+=2;

      }else{
        space++;
        star-=2;
        number--;
      }
      
      
    }

  }
}
