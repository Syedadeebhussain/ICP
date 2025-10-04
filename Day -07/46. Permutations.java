class Solution {
    public List<List<Integer>> permute(int[] nums) {
    int n=nums.length;
    boolean[] visited=new boolean[n];
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> ll=new ArrayList<>();
    find(nums,0,visited,ans,ll);
    return ans;
    }
    public void find(int [] nums ,int idx,boolean [] visited, List<List<Integer>> ans,List<Integer> ll){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=0;i<=nums.length-1;i++){
        if(!visited[i])
        {
         ll.add(nums[i]);
         visited[i]=true;
          find(nums,idx+1,visited,ans,ll);
         visited[i]=false;
         ll.remove(ll.size()-1);
        }  
     }
    }
}