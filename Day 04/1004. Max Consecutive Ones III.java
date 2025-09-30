class Solution {
    public int longestOnes(int[] nums, int k) {
      int ei=0;
      int si=0;
      int c=0;
      int ans=0;
      while(ei<nums.length){
        if(nums[ei]==0){
           c++;
        }
        while(c>k){
            if(nums[si]==0){
                c--;
            }
            si++;
        }
        ans=Math.max(ans,ei-si+1);
        ei++;
      }  
      return ans;
    }
}