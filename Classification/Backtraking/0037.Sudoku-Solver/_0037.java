package Backtraking;

public class _0037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0037 {
    char[][] q;
    public void solveSudoku(char[][] board) {
    	char[][] b = new char[9][9];
    	q = board;
    	for(int i = 0; i < 9; i ++) {
    		for(int j = 0; j < 9; j ++) {
    			b[i][j] = board[i][j];
    		}
    	}
    	dfs(b, 0, 0);
    	
    }

	private void dfs(char[][] board, int i, int j) {
		if(j >= 9) {
			dfs(board, i + 1, 0);
			return;
		}
		if(i >= 9) {
			for(int m = 0; m < 9; m ++) {
	    		for(int n = 0; n < 9; n ++) {
	    			q[m][n] = board[m][n];
	    		}
	    	}
			return;
		}
		if(board[i][j] != '.') {
			dfs(board, i, j + 1);
			return;
		}
		for(int k = 1; k <= 9; k ++) {
			if(check(board, i, j, k)) continue;
			board[i][j] = (char)(48 + k);
			dfs(board, i, j + 1);
			board[i][j] = '.';
		}
	}

	private boolean check(char[][] board, int i, int j, int k) {
		for(int m = 0; m < 9; m ++) {
			if(board[i][m] == (char)(48 + k)) return true;
			if(board[m][j] == (char)(48 + k)) return true;
		}
		int x = i / 3;
		int y = j / 3;
		for(int m = x * 3; m <= x * 3 + 2; m ++) {
			for(int n = y * 3; n <= y * 3 + 2; n ++) {
				if(board[m][n] == (char)(48 + k)) return true;
			}
		}
		return false;
	}
}