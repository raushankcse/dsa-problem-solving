package Day9;

public class Array3 {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int item = 4;
    int index = search(arr, item);
    System.out.println(index);
  }


  public static int search(int arr[] , int item){
    int i=0;
    while (i<arr.length) {
      if(arr[i]==item) return i;
      i++;
    }
    return -1;
  }
}
