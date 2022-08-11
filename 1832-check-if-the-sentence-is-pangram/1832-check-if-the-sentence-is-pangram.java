class Solution {
    public boolean checkIfPangram(String sentence) {
       boolean [] c=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            int k=sentence.charAt(i)-'a';
            c[k]=true;
        }
        for(int j=0;j<c.length;j++){
            if(c[j]==false) return false;
        }
        return true;
    }
}