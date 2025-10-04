class Solution {
    public int totalNQueens(int n) {
     boolean [][] chess=new boolean[n][n];
    return solve(chess,0,n);
    
    }
       public static int solve(boolean[][] chess, int row, int tq) {
        if (tq == 0) {
            return 1;
        }
        if (row >= chess.length) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < chess[0].length; i++) {
            if (isvalid(chess, row, i)) {
                chess[row][i] = true;
                count += solve(chess, row + 1, tq - 1);
                chess[row][i] = false;
            }
        }
        return count;
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