class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int ans[]=new int[nums.length];
        ArrayList<Integer> t=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            t.add(index[i],nums[i]);
            
        }
     for(int i=0;i<nums.length;i++){
         ans[i]=t.get(i);
     }

        return ans;
    }
}