class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       char ans=' ';
         
        for(int i=0;i<letters.length;i++){
           if(letters[letters.length-1]<=target){
               if(letters[i]<target){
                ans=letters[i];
                break;
            }  
            }
            if(letters[i]>target){
                ans=letters[i];
                break;
            }
            
        }
    return ans;
    }
}