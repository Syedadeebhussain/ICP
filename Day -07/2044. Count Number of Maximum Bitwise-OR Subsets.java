class Solution {
    int maxbit=0;
    int c=0;
    public int countMaxOrSubsets(int[] nums) {
    for(int i=0;i<nums.length;i++){
        maxbit |=nums[i];
    }
       Arrays.sort(nums);
       find(nums,0,0); 
       return c;
    }
    public void find(int [] nums,int idx,int or){
        if(or==maxbit) c++;
        for(int i=idx;i<nums.length;i++){
            find(nums,i+1,or|nums[i]);
        }
    }
}