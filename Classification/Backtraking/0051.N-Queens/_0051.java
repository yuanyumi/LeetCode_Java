package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0051 {

	public static void main(String[] args) {
		Solution0051 a = new Solution0051();
		System.out.println(a.solveNQueens(4));
	}

}
class Solution0051 {
	boolean[][] board;
	List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
    	board = new boolean[n][n];
    	ans = new ArrayList<>();
    	dfs(0);
    	return ans;
    }
	private void dfs(int k) {
		if(k >= board.length) {
			List<String> l = new ArrayList<>();
			for(int i = 0; i < board.length; i ++) {
				String s = "";
				for(int j = 0; j < board[0].length; j ++) {
					if(board[i][j]) s += 'Q';
					else s += '.';
				}
				l.add(s);
			}
			ans.add(l);
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