package Union_find;

public class _0684 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0684 {
	int[] id;
    public int[] findRedundantConnection(int[][] edges) {
    	int[] ans = edges[0];
    	int n = edges.length;
    	id = new int[n + 1];
    	for(int i = 1; i < n + 1; i ++) id[i] = i;
    	for(int i = 0; i < n; i ++) {
    		if(root(edges[i][0]) != root(edges[i][1])) {
    			id[root(edges[i][1])] = root(edges[i][0]);
    		}else ans = edges[i];
    	}
    	return ans;
    }

	private int root(int i) {
		while(i != id[i]) i = id[i];
		return i;
	}
}