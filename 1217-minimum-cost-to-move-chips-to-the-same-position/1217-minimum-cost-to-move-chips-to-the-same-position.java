class Solution {
    public int minCostToMoveChips(int[] position) { 
        int eve= 0;
        int odd= 0;
        int ans=0;
        for (int i=0;i<position.length;i++) {
            if(position[i]%2==0) {
                eve++;
            }
            else
            {
                odd++;
            }
        }
        if(odd<eve){
            ans=odd;
        }else{
            ans=eve;
        }
        return ans;
    }
}
    