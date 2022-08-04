class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans =new int[r][c];
          int k=0,l=0;
         if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                ans[i][j]=mat[k][l];
                l++;
                if(l==mat[0].length){
                    l=0;
                    k++;
                }

            }
        }
        return ans;
    }
}