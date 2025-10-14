package Day8;

public class LearnArray {
  public static void main(String[] args) {
    int[] arr = {10,8, 7,5, 6};
    swap(arr, 0, 1);
    System.out.println(arr[0]+" " +arr[1]);

  }
  public static void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
}
