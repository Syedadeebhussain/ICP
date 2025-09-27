class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int min=Integer.MAX_VALUE;
    List<List<Integer>> ll=new ArrayList<>();
    for(int i=0;i<=nums.length-3;i++){
    int fix=nums[i];
    int lo=i+1;
    int hi=nums.length-1;
    while(lo<hi){
       int sum=fix+nums[lo]+nums[hi];
       if(Math.abs(target-sum)<Math.abs(target-min)){
        min=sum;
       }
       else if(sum<target){
           lo++;
       }
       else{
        hi--;
       }
    }
    }
    return min;
    }
}
    