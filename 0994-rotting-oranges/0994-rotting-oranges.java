class Solution {
    public boolean isValid(int i,int j,int n,int m){
        return(i>=0 && j>=0 && i<n && j<m);
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int minutes = 0;
        int fresh = 0;
        Queue<int[]> q =new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;

        int[] x = {-1,1,0,0};
        int[] y = {0,0,-1,1};
        
        while(!q.isEmpty()){
            int size = q.size();
            boolean rottenThisMin = false;
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                for(int j = 0;j<4;j++){
                    int row = curr[0] +x[j];
                    int col = curr[1] +y[j];

                    if(isValid(row,col,n,m) && grid[row][col]==1){
                        grid[row][col] = 2;
                        fresh--;
                        q.offer(new int[]{row,col});
                        rottenThisMin = true;
                    }
                } 
            }
            if(rottenThisMin) minutes++;
        }

        return fresh==0? minutes: -1;
    }
}