class Solution {
    int total=0;
    public int subsetXORSum(int[] nums) {
        Arrays.sort(nums);
       find(nums,0,0); 
       return total;
    }
    public void find(int [] nums,int idx,int xor){
        total+=xor;
        for(int i=idx;i<nums.length;i++){
            find(nums,i+1,xor^nums[i]);
        }
    }
}