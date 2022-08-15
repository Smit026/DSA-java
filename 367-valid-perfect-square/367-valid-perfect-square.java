class Solution {
    public boolean isPerfectSquare(int num) {
        long s=1;
        long e=num;
        long mid=s+(e-s)/2;
        
        while(s<=e){
            long sq=mid*mid;
            if(sq==num){
                return true;
            }else if(sq>num){
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return false;
    }
}