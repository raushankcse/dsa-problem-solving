package Day13;

public class Question1 {
  public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,7,8,9,10,20};
    int item = 8;
    System.out.println(binary_search(arr, item));
  }

  public static int binary_search(int[] arr,int item){
    int low = 0;
    int hi = arr.length-1;
    while (low<hi) {
      int mid = (low+hi)/2;
      if(arr[mid]==item){
        return mid;
      }else if(arr[mid]>item){
        hi=mid;
      }else{
        low=mid+1;
      }
      
    }
    return -1;
  }


}
