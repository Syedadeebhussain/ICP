class Solution {
     public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    if (!isvalid(board, row, col, board[row][col])) {
                        return false;
                    }
                }
            }
        }
        return true;
     }
    public boolean isvalid(char [][] board,int row,int col,int item){
        //row
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]==item && i!=col){
                return false;
            }
        }

        //col
        for(int i=0;i<board.length;i++){
            if(board[i][col]==item && i!=row){
                return false;
            }
        }

        //3x3 matrix
        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==item && i!=row && j!=col){
                    return false;
                }
            }
        }
        return true;
    }
}