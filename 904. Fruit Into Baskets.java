class Solution {
    public int totalFruit(int[] fruits) {
    Map<Integer,Integer> mp=new HashMap<>();
    int si=0;
    int ei=0;
    int ans=0;
    StringBuilder st=new StringBuilder();
    while(ei<fruits.length){
       if(mp.containsKey(fruits[ei]))
       {
       mp.put(fruits[ei],mp.get(fruits[ei])+1);
       }
       else{
        mp.put(fruits[ei],1);
       }
       
       //shrink
       while(mp.size()>2){
        int ele=fruits[si];
        mp.put(fruits[si],mp.get(fruits[si])-1);
        if(mp.get(fruits[si])==0){
            mp.remove(fruits[si]);
        }
        si++;
       }

       //update
       ans=Math.max(ans,ei-si+1);
       ei++;
    }  
    return ans;
    }
}