class Solution {
    public boolean exist(char[][] board, String word) {
    for(int i=0;i<board.length;i++)
    {
        for(int j=0;j<board[0].length;j++){
           if(WordSearch(board,word,i,j,0))
           {
            return true;
           }
        }
    }
     return false;
    }
public static boolean WordSearch(char[][] board, String word, int i, int j, int idx) {
		if (idx == word.length()) {
			return true;
		}
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) {
			return false;
		}
		board[i][j] = '*';
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
		for (int k = 0; k < c.length; k++) {
			boolean ans = WordSearch(board, word, i + r[k], j + c[k], idx + 1);
			if (ans) {
				return true;
			}

		}
		board[i][j] = word.charAt(idx);
		return false;
	}

}