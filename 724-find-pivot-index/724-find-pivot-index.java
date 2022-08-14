class Solution {
    public int pivotIndex(int[] nums) {
        int right=0,left=0;
       for(int i=0;i<nums.length;i++){
           right=right+nums[i];
       }
        
       for(int i=0;i<nums.length;i++){
           right=right-nums[i];
           if(right==left){
               return i;
           }
           left=left+nums[i];
       } 
    return -1;
    }
}