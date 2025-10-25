package Day12;

public class Question1 {
  public static void main(String[] args) {
    int [] arr = {1,0,0,7,8,0,9,0,7};
    int[] arr2 = {2,0,8};
    System.out.println(trapping_water(arr2));
  }
  public static int trapping_water(int[] arr){
    int n = arr.length;
    int[] left = new int[n];
    int[] right = new int[n];

    left[0]=arr[0];
    for(int i=1;i<n;i++){
      left[i]=Math.max(left[i-1], arr[i]);
    }

    right[n-1]=arr[n-1];
    for(int i = n-2;i>=0;i--){
      right[i] = Math.max(right[i+1], arr[i]);
    }

    int sum = 0;
    for(int i=0;i<n;i++){
      sum += Math.min(left[i], right[i])-arr[i];


    }

    return sum;

  }
}
