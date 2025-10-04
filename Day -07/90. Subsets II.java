class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<Integer> ll=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(nums);
    print(nums,ans,ll,0);
    return ans;   
    }
  public static void print(int [] nums,List<List<Integer>> ans,List<Integer> ll,int idx)
    {
        ans.add(new ArrayList<>(ll));     
        for(int i=idx;i<nums.length;i++)
        {
        if(i>idx && nums[i]==nums[i-1]) continue ;
        ll.add(nums[i]);
        print(nums,ans,ll,i+1);
        ll.remove(ll.size()-1);
        }
    }

}