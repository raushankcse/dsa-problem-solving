package Generics;

public class GenericsMethod {
  public static void main(String[] args) {

    printData("hii");
    printData(123);


    GenericsMethod obj = new GenericsMethod();
    obj.doubleData("hii");
    obj.doubleData(123);


    
  }

  static <E> void printData(E data){
    System.out.println(data);
  }


  <E> void doubleData(E data){
    System.out.println(data);
  }

  
}
