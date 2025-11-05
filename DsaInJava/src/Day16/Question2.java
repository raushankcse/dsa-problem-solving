package Day16;

public class Question2 {
  // book allocation 
  public static void main(String[] args) {
    int arr[] = {10,20,30,40 };
    int nos=2;

    System.out.println(bookAllocation(arr,nos));
  }
  public static int bookAllocation(int []arr, int nos){
    int lo=0;
    int hi=0;
    for(int i=0;i<arr.length;i++){
      hi+=arr[i];
    }
    int ans=0;
    while (lo<=hi) {
      int mid = (lo+hi)/2;
      if(isItPossible(arr,nos,mid)){
        ans=mid;
        hi=mid-1;
      }else{
        lo=mid+1;
      }
    }
    return ans;
  }
  public static boolean isItPossible(int []arr, int nos, int mid){
    int student = 1;
    int readPage=0;
    for(int i=0;i<arr.length;i++){
      if(readPage+arr[i]<=mid){
        readPage+=arr[i];

      }else{
        student++;
        readPage=arr[i];
      }

      if(student>nos){
        return false;
      }

    }
    return true;
  }

}
