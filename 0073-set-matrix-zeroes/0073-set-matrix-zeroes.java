class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] zeroRows = new boolean[row];
        boolean[] zeroCols = new boolean[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        } 

        for(int i=0;i<row;i++){
            if(zeroRows[i]){
                for(int j=0;j<col;j++){
                    matrix[i][j] = 0;
                }   
            }
        }

        for(int j=0;j<col;j++){
            if(zeroCols[j]){
                for(int i=0;i<row;i++){
                    matrix[i][j] = 0;
                }   
            }
        }
    }
}