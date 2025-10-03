class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
         int[][] dp = new int[m][n];
         for(int [] d:dp)
         {
        Arrays.fill(d,-1);
         }
       return solve(obstacleGrid,0,0,dp); 
    }
    public int solve(int [][] arr,int i,int j,int [][] dp){
        if(i<0 || j<0|| i==arr.length ||j==arr[0].length || arr[i][j]==1){
            return 0;
        }
        if(i==arr.length-1 && j==arr[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down=solve(arr,i+1,j,dp);
        int right=solve(arr,i,j+1,dp);
        dp[i][j]=down+right;
        return dp[i][j];

    }
}