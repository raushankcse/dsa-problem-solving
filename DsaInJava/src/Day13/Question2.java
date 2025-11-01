package Day13;

public class Question2 {
    public static void main(String[] args) {
        int n=88;
        int k=3;
        System.out.println(search(n,k));
    }

    public static int search(int n, int k){
        int low=1;
        int hi=n;
        int ans=0;
        while (low<hi){
            int mid = (low+hi)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }else {
                hi=mid-1;

            }

        }
        return ans;
    }


}
