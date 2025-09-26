class Solution {
    public int findJudge(int n, int[][] trust) {
      Map<Integer,Integer> mp=new HashMap<>();
      for(int i=1;i<=n;i++){
        mp.put(i,0);
      }
      for(int i=0;i<trust.length;i++){
        int a=trust[i][0];
        int b=trust[i][1];
      mp.put(a,mp.get(a)-1);
        mp.put(b,mp.get(b)+1);

      }
     for(int map:mp.keySet()){
        if(mp.get(map)==n-1){
            return map;
        }
     }
     return -1;
    }
}