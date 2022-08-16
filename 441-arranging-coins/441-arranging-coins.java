class Solution {
    public int arrangeCoins(int n) {
        long s=1;
        long e=n;
        long mid=s+(e-s)/2;
        long val=mid*(mid+1)/2;
        while(s<=e){
            if(val==n){
                return (int)mid;
            }else if(val<n){
                s=mid+1;
            }else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        val=mid*(mid+1)/2;
        }
        return (int)e;
    }
}
