class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
    public int solve(int [] arr,int k,int sum,int i){
        if(sum==k && i==arr.length){
            return 1;
        }
        if(i>=arr.length){
            return 0;
        }
       int a= solve(arr,k,sum+arr[i],i+1);
        int b=solve(arr,k,sum-arr[i],i+1);
        return a+b;
    }
    
}