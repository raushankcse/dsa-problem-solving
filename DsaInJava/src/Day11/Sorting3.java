package Day11;

public class Sorting3 {
  public static void main(String[] args) {
    int[] arr = {11,2,3,4,5,6};
    sort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void sort(int []arr){
    for(int i=1;i<arr.length;i++){
      int item = arr[i];
      int j=i-1;
      while (j>=0&& arr[j]>item) {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=item;
      
    }
  }
}
