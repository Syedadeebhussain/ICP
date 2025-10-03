class Solution {
    public long countSubarrays(int[] nums, long k) {
      int ei=0;
      int si=0;
      long sum=0;
      long ans=0;
      while(ei<nums.length){
        sum+=nums[ei];
        while(sum*(ei-si+1)>=k){
            sum-=nums[si];
            si++;
        }
        ans+=ei-si+1;
        ei++;
      }  
      return ans;
    }
}