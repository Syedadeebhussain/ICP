class Solution {
    int c = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
       for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    max=Math.max(max,c);
                    c=0;
                }
            }
        }
        return max;
    }
    private   void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }
         // so that one won,t counted double
        if (grid[i][j] == -1) {
            return;
        }
        c++;// one hoga to hi yaha par aaega
        grid[i][j] = -1; 
        dfs(grid, i, j - 1); // left
        dfs(grid, i - 1, j); // top
        dfs(grid, i, j + 1); // right
        dfs(grid, i + 1, j); // bottom
    }
}