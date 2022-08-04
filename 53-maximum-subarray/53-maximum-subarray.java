class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,n=0;
        for(int i=0;i<nums.length;i++){
        n += nums[i]; 
            if(max<n){
                max = n;
            }
            if(n<0){
                n = 0;
            }
        }
        return max;
    }
}