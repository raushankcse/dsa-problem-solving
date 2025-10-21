package Day11;

public class Sorting1 {
  public static void main(String[] args){
    int[] arr= {11,2,3,4,56,7,8,0};
    sort(arr);

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void sort(int[] arr){
    // bubble sort
    for(int i=1;i<arr.length;i++){
      for(int j=0;j<arr.length-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
}
