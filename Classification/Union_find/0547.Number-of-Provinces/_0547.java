package Union_find;

import java.util.HashSet;
import java.util.Set;

public class _0547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0547 {
    public int findCircleNum(int[][] isConnected) {
    	int n = isConnected.length;
    	int[] id = new int[n];
    	for(int i = 0; i < n; i ++) id[i] = i;
    	for(int i = 0; i < n; i ++) {
    		for(int j = i + 1; j < n; j++) {
    			if(isConnected[i][j] == 1) {
    				if(root(i, id) != root(j, id)) {
    					cr(i, j, id);
    				}
    			}
    		}
    	}
    	int ans = 0;
    	for(int i = 0; i < id.length; i ++) if(id[i] == i) ans ++;
    	return ans;
    }

	private void cr(int i, int j, int[] id) {
		id[root(j, id)] = root(i, id);
	}

	private int root(int i, int[] id) {
		while(i != id[i]) i = id[i];
		return i;
	}

	
}