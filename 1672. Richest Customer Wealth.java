class Solution {
    public int maximumWealth(int[][] accounts) {
    int n=accounts[0].length;
    int max=Integer.MIN_VALUE;
    
    for(int i=0;i<accounts.length;i++)
    {
        int sum=0;
        for(int j=0;j<n;j++)
        {
            sum+=accounts[i][j];
        }
        if(sum>=max)
        {
            max=sum;
        }
    } 
    return max; 
    }
}