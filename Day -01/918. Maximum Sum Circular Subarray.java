class Solution {
    public int maxSubarraySumCircular(int[] nums) {
// pehle maximum subarr sum calculate karo fir total sum calculate karo fir minimum subarray sum calculate karo fir end me max(ans1,sum-ans2)
        int sum=0;
        int max=0;
        int min=0;
        int ans1=Integer.MIN_VALUE;
          int ans2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max+=nums[i];
            ans1=Math.max(ans1,max);
            if(max<0) {
                max=0;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
        }
       
        for(int i=0;i<nums.length;i++)
        {
            min+=nums[i];
            ans2=Math.min(ans2,min);
            if(min>0)
            {
                min=0;
            }
        }
       if(ans1<0) // If all numbers are negative, return the maximum subarray sum
       {
        return ans1;
       }
       return Math.max(ans1,(sum-ans2));


    }
}