class Solution {
    public List<List<Integer>> combine(int n, int k) {
    List<Integer> ll=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    print(n,ans,ll,1,k);
    return ans;
    }
    public static void print(int n, List<List<Integer>> ans, List<Integer> ll,int idx,int k)
    {
        if(k==0){
             ans.add(new ArrayList<>(ll));
            return ;
        }
    for(int i=idx;i<=n;i++)
     {
    ll.add(i);
    print(n,ans,ll,i+1,k-1);
    ll.remove(ll.size()-1);
     }
    }

}