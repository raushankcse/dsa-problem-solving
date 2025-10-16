package Day10;

public class Question2 {

  public static void main(String[] args) {
    // rotate array at kth times
    int arr[] = {1,2,3,4,5,6,7};
    int k=3;

    //bruteforce
    // rotate(arr, k);     



    // optimization through rotate;
    int i=0;
    int n = arr.length;
    int j = n-k;


    reverse(arr, i, j-1);
    reverse(arr, j, n-1);
    reverse(arr, i, n-1);





    for(int ele: arr){
      System.out.print(ele+" ");
    }

    
    


  }
  public static void reverse(int []arr, int i, int j){
    while (i<j) {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
  }






  public static void rotate(int arr[], int k){
    int n = arr.length;
    k=k%n;

    while (k>0) {
      int ele = arr[arr.length-1];
      int i=arr.length-1;
      while (i>0) {
        arr[i]=arr[i-1];
        i--;
      }
      arr[0]=ele;
      k--;
    }

  }
}
