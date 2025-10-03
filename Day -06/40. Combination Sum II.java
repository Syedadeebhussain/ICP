class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
    List<Integer> ll=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(nums);
    print(nums,ll,ans,target,0);
    return ans;
    }
    public static void print(int[] nums,List<Integer> ll,List<List<Integer>> ans,int amount,int idx)
    {
        if(amount==0)
        {
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=idx;i<nums.length;i++){
           if(i>idx && nums[i]==nums[i-1]) continue;
           if(amount>=nums[i] )
            {
            ll.add(nums[i]);
            print(nums,ll,ans,amount-nums[i],i+1);
            ll.remove(ll.size()-1);
            }   
        }
    }
    }
