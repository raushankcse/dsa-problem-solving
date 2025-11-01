package Day13;

public class Kadane {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,-8,-9};

        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans = Math.max(ans, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(ans);
    }
}
