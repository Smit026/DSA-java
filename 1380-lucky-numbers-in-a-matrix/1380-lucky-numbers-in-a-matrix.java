class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
         ArrayList<Integer> ans1=new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
       
        for(int i=0;i<matrix.length;i++){
            int l=matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
            
                if(matrix[i][j]<l){
                
                   l= matrix[i][j];
                }
            }
            ans.add(l);
            }
        
         for(int i=0;i<matrix[0].length;i++){
            int k=matrix[0][i];
            for(int j=0;j<matrix.length;j++){
            
                if(matrix[j][i]>k){
                
                   k= matrix[j][i];
                }
            }
             ans1.add(k);
            }
        
        for(int i=0;i<ans.size();i++){
            for (int j=0;j<ans1.size();j++){
                if(ans.get(i).equals(ans1.get(j))){
                    list.add(ans.get(i));
                    break;
                }
            }
        }
        
        return list;
    }
}