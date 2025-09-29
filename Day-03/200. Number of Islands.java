class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    find(grid, i, j); 
                }
            }
        }
        return count;
    }

    public void find(char[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; 
        find(grid, i + 1, j); 
        find(grid, i - 1, j); 
        find(grid, i, j + 1); 
        find(grid, i, j - 1); 
    }
}
