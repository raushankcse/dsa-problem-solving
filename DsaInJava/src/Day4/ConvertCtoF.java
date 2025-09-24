package Day4;


public class ConvertCtoF {

  public static void main(String[] args) {
    
    int minF=0;
    int maxF=100;
    while (minF<=maxF) {
      System.out.print(minF);
      int c = (int)((5.0/9) *(minF-32));
      System.out.println(" "+c);
      minF+=20;
      
    }


  }
}