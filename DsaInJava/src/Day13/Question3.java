package Day13;

public class Question3 {
    static int  bad = 4;

    public static void main(String[] args) {
        int n=5;
        System.out.println(firstBadVersion( n));
    }
    public static Boolean isBadVersion(int version){

        if(version<bad){
            return false;
        }else{
            return true;
        }
    }
    public static int firstBadVersion(int n){
        int lo=1;
        int hi=n;
        int ans=0;
        while (lo<=hi){
            System.out.println("---");
            int version = (lo+hi)/2;
            if(isBadVersion(version)){
                ans=version;
                hi=version-1;
            }else{
                lo=version+1;
            }
        }
        return ans;
    }

}
