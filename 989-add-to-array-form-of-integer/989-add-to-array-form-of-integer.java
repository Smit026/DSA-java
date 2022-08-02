import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       ArrayList<Integer> ans=new ArrayList<Integer>();
       int c = k;
        for(int i=num.length-1;i>=0;i--){
            c = num[i]+c;
            ans.add(0,c%10);
            c /= 10;
        }
        while(c!=0){
            ans.add(0,c%10);
            c /= 10;
        }
        
        return ans;
    }
    
}