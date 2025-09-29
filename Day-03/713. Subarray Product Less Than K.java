class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int p=1;
        int si=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            p*=nums[i];
            while(p>=k){
                p/=nums[si];
                si++;
            }
            ans+=i-si+1;
           
        }
        return ans;
    }
}