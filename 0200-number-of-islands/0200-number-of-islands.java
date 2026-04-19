class Solution {

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public boolean isValid(int i, int j, int n, int m) {
        return (i >= 0 && i < n && j >= 0 && j < m);
    }

    public void dfs(char[][] grid, int i, int j, boolean[][] vis) {
        
        vis[i][j] = true;

        for(int k = 0; k < 4; k++) {
            int row = i + dx[k];
            int col = j + dy[k];

            if(isValid(row, col, grid.length, grid[0].length) &&
               grid[row][col] == '1' &&
               !vis[row][col]) {
                
                dfs(grid, row, col, vis);
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(grid[i][j] == '1' && !vis[i][j]) {
                    count++;              // new island found
                    dfs(grid, i, j, vis);
                }
            }
        }

        return count;
    }
}