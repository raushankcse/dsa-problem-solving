package Day9;

public class Array1 {
  public static void main(String[] args) {
    int [] arr = {10, 20, 30};
    int [] other = {100, 200 , 300};
    System.out.println(arr[0]+ " "+ other[0]);
    int[] temp = arr;
     arr = other;
    other=temp;
    System.out.println(arr[0]+" "+ other[0]);
    
  }

  public static void swap(int[]arr, int[] other){
    int[] temp = arr;
    arr=other;
    other=temp;
  }
}
