class Solution {
    public int mySqrt(int x) {
       int start=1;
     int end=x;
        int ans=0;
        int mid=start+(end-start)/2;
        while(start<=end){
        
            if(mid>(x/mid)){
               
                end=mid-1;
            }else{
                 ans=mid;
                start=mid+1;
            }
             mid=start+(end-start)/2;
        }
        return ans;
    }
}