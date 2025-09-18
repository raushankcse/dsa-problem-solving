package Day3;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int divisor = Math.min(a, b);
    int dividend = Math.max(a, b);
    int hcf=0;



    // by while loop


    // while(true){
    //   int rem = dividend%divisor;
    //   if(rem==0){
    //     System.out.println(divisor);
    //     break;
    //   }


    //   dividend=divisor;
    //   divisor=rem;
    // }



    // for loop
    for(;;){
      int rem = dividend%divisor;
      if(rem==0){
        System.out.println(divisor);
        hcf=divisor;
        break;
      }

      dividend=divisor;
      divisor=rem;
    }

    System.out.println(" lcm is " + (a*b)/hcf);






    // one way


    // for(int i = min;i>=1;i--){
    //   if(a%i==0 && b%i==0){
    //     System.out.println(i);
    //     break;
    //   }
    // }
  }
}
