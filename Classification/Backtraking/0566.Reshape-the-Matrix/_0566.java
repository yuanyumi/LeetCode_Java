package Backtraking;

public class _0566 {

	public static void main(String[] args) {

	}

}
class Solution0566 {
	int x = 0, y = 0;
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    	if(mat.length * mat[0].length != r * c) return mat;
    	int[][] ans = new int[r][c];
    	for(int i = 0; i < mat.length; i ++) {
    		for(int j = 0; j < mat[0].length; j ++)
    			fill(ans, mat[i][j]);
    	}
    	return ans;
    }

	private void fill(int[][] ans, int now) {
		if(y >= ans[0].length) {
			x ++;
			y = 0;
			fill(ans, now);
			return;
		}
		ans[x][y] = now;
		y ++;
	}
}