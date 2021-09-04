package Backtraking;

import java.util.HashSet;
import java.util.Set;

public class _0036 {

	public static void main(String[] args) {
//		[["8","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
		char[][] b = {{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'},{'.','.','.',',',',','.','.','.','.'}};
		Solution0036 a = new Solution0036();
	}

}
class Solution0036 {
    public boolean isValidSudoku(char[][] board) {
    	for(int i = 0; i < 9; i ++) {
    		Set<Character> s = new HashSet<>();
    		for(int j = 0; j < 9; j ++) {
    			if(board[i][j] == '.') continue;
    			if(s.contains(board[i][j])) return false;
    			s.add(board[i][j]);
    		}
    	}
    	for(int i = 0; i < 9; i ++) {
    		Set<Character> s = new HashSet<>();
    		for(int j = 0; j < 9; j ++) {
    			if(board[j][i] == '.') continue;
    			if(s.contains(board[j][i])) return false;
    			s.add(board[j][i]);
    		}
    	}
    	return check(board,0,0) && check(board,0,3) && check(board,0,6) && check(board,3,0) && check(board,3,3) && check(board,3,6) && check(board,6,0) && check(board,6,3) && check(board,6,6);
    }

	private boolean check(char[][] board, int m, int n) {
		Set<Character> s = new HashSet<>();
		for(int i = m; i <= m + 2; i ++) {
			for(int j = n; j <= n + 2; j ++) {
				if(board[i][j] == '.') continue;
    			if(s.contains(board[i][j])) return false;
    			s.add(board[i][j]);
			}
		}
		return true;
	}
}