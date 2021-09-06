package Backtraking;

public class _0079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0079 {
	boolean bool;
    public boolean exist(char[][] board, String word) {
    	bool = false;
    	for(int i = 0; i < board.length; i ++) {
    		for(int j = 0; j < board[0].length; j ++) {
    			if(board[i][j] == word.charAt(0)) {
    				boolean[][] b = new boolean[board.length][board[0].length];
    				dfs(i, j, board, b, word, 0);
    				if(bool) return true;
    			}
    		}
    	}
    	return false;
    }
	private void dfs(int x, int y, char[][] board, boolean[][] b, String word, int k) {
		if(k >= word.length()) {
			bool = true;
			return;
		}
		if(x >= board.length || y >= board[0].length || x < 0 || y < 0 || board[x][y] != word.charAt(k) || b[x][y]) {
			return;
		}
		b[x][y] = true;
		dfs(x - 1, y, board, b, word, k + 1);
		dfs(x + 1, y, board, b, word, k + 1);
		dfs(x, y - 1, board, b, word, k + 1);
		dfs(x, y + 1, board, b, word, k + 1);
		b[x][y] = false;
	}
}