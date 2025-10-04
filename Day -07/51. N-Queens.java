class Solution {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> ans=new ArrayList<>();
      List<String> ll=new ArrayList<>();
     boolean [][] chess=new boolean[n][n];
     print(chess,0,0,n,ans,ll);
     return ans;
    }
    public static void print(boolean [][] chess,int row,int col,int tq,List<List<String>> ans, List<String> ll)
    {
       if(tq==0){
        ans.add(new ArrayList<>(ll));
        return ;
       }
        for(int i=0;i<chess[0].length;i++){
            if(isvalid(chess,row,i))
            {
            chess[row][i]=true;
           ll.add(addkaro(i, chess.length));
            print(chess,row+1,col,tq-1,ans,ll);
            ll.remove(ll.size()-1);
            chess[row][i]=false;
            }
        }
    }
    public static boolean isvalid(boolean [][] chess,int row,int col)
    {
        //up
        int r=row;
        while(r>=0)
        {
           if(chess[r][col]==true)
           {
            return false;
           }
           r--;
        }
        // right diagonal
        r=row;
        int c=col;
        while(r>=0 && c<chess[0].length){
            if(chess[r][c]==true)
           {
            return false;
           }
           r--;
           c++;
        }

        //left diagonal
        r=row;
        c=col;
        while(r>=0 && c>=0){
            if(chess[r][c]==true)
           {
            return false;
           }
           r--;
           c--;
        }
        return true;
    }
    public static String addkaro(int c,int n){
        StringBuilder st=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i==c){
                st.append("Q");
            }
            else{
                st.append(".");
            }
        }
        return st.toString();
    }
}