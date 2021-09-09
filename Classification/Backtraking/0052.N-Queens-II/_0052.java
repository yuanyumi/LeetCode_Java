package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0052 {

	public static void main(String[] args) {
		Solution0052 a = new Solution0052();
		System.out.println(a.totalNQueens(4));
	}

}
class Solution0052 {
	boolean[][] board;
	int ans;
	public int totalNQueens(int n) {
    	board = new boolean[n][n];
    	ans = 0;
    	dfs(0);
    	return ans;
    }
	private void dfs(int k) {
		if(k >= board.length) {
			ans ++;
			return;
		}
		for(int i = 0; i < board[0].length; i ++) {
			if(check(k, i)) continue;
			board[k][i] = true;
			dfs(k + 1);
			board[k][i] = false;
		}
	}
	private boolean check(int k, int m) {
		for(int i = 0; i < k; i ++) {
			if(board[i][m]) return true; 
			if(m - k + i >= 0 && board[i][m - k + i]) return true;
			if(m + k - i < board[0].length && board[i][m + k - i]) return true;
		}
		return false;
	}
}