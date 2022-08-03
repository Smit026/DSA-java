class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int[] s=new int[2];
        int i=0;
        int j=0;
        for( i=0;i<nums.length;i++){
            for( j=0;j<nums.length;j++){
            sum=nums[j]+nums[i];
                if(i!=j && sum==target){
                    s[0]=i;
                    s[1]=j;
                }

            }
        }
          
        return s;
    }
}