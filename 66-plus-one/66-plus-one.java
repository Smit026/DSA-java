class Solution {
    public int[] plusOne(int[] digits) {
        int a=0;
        int n=digits.length;
                int[] ans= new int[n + 1];

        for(int i = n - 1; i>=0; --i){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0; 
        }
        
        
    
        ans[0] = 1;
        return ans;}
}