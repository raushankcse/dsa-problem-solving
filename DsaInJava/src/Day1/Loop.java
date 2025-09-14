package Day1;

import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int n = sc.nextInt();

    while (i<n) {
      System.out.println("Hello");
      i++;
    }
  }
}
