package Day16;


import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

  //. aggressive cow
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t>0) {
      
    


      int n= sc.nextInt();
      int noc = sc.nextInt();
      int [] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
  
      System.out.println(minDistance(arr,noc));
      t--;
    }

    
  }
  public static int minDistance(int[] arr, int noc){
    int lo=arr[0];
    int hi = arr[arr.length-1];
    int ans = 0;
    while (lo<=hi) {
      int mid = (lo+hi)/2;
      if(isItPossible(arr, noc, mid)){
        ans = mid;
        lo=mid+1;
      }else{
        hi=mid-1;
      }
    }
    return ans;
  }
  public static boolean isItPossible(int[] arr, int noc, int mid){
    int pos = arr[0];
    int cowscount=1;
    for(int i=1;i<arr.length;i++){
      if(arr[i]-pos>=mid){
        pos=arr[i];
        cowscount++;
      }
      if(cowscount==noc){
        return true;
      }
    }
    return false;

  }

}
