class Solution {
    public int combinationSum4(int[] coin, int amount) {
      int [] dp=new int[amount+1];
       Arrays.fill(dp,-1); 
       return Combination(coin, amount,dp);
	}

	public static int Combination(int[] coin, int amount,int [] dp) {
		if (amount == 0) {
			return 1;
		}
        
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int c=0;
		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				c+=Combination(coin, amount - coin[i],dp);
			}
		}
        return dp[amount]=c; // us particular amount ke kitne combination possible hai
         	
    }
}

