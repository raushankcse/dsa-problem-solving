package Day9;

public class Array4 {
  public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,8,2};
    System.out.println(max(arr));
  }
  public static int max(int[] arr){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      max = Math.max(arr[i], max);
    }
    return max;
  }
}
