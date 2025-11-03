package Leetcode;

public class L1752 {
  public static void main(String[] args) {
    int[] nums = {3,4,5,1,2};
    System.out.println(check(nums));;
    
  }


  //   Input: nums = [3,4,5,1,2]
  // Output: true

  public static boolean check(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){

            }else{
                x=i+1;
                break;
            }
        }
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[(i+x)%nums.length];
        }
        Boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){

            }else{
                return false;
            }
        }
        return flag;
    }

}
