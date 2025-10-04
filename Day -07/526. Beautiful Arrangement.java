class Solution {
    public int countArrangement(int n) {
    boolean[] visited=new boolean[n+1];
    return find(n,0,visited);
    }
    public int find(int n ,int idx,boolean [] visited){
        if(idx==n){
            return 1;
        }
        int c=0;
        for(int i=1;i<=n;i++){
        if(!visited[i] && ((i%(idx+1)==0) || (idx+1)%i==0))
        {
         visited[i]=true;
         c+= find( n ,idx+1,visited);
          visited[i]=false;
        }  
        }
        return c;
    }
}