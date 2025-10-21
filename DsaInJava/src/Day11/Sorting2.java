package Day11;

public class Sorting2 {
  public static void main(String[] args) {
    int [] arr = {-8,5,1, 4,3,2,10};
    sort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void sort(int [] arr){
    for(int i=0;i<arr.length;i++){
      int smallest = i;
      for(int j = i+1;j<arr.length;j++){
        if(arr[smallest]>arr[j]){
          smallest=j;
        }
      }
      int temp = arr[i];
      arr[i]=arr[smallest];
      arr[smallest]=temp;
    }
  }
}
