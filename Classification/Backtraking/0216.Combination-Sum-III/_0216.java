package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0216 {

	public static void main(String[] args) {
		Solution0216 a = new Solution0216();
		System.out.println(a.combinationSum3(3, 9));
	}

}
class Solution0216 {
	List<List<Integer>> ans = new ArrayList<>();
	boolean[] b = new boolean[10];
    public List<List<Integer>> combinationSum3(int k, int n) {
    	dfs(k, n, 1);
    	return ans;
    }
	private void dfs(int k, int n, int m) {
		if(m >= 10 && k != 0) return;
		if(k == 0) {
			if(n != 0) return;
			List<Integer> l = new ArrayList<>();
			for(int i = 1; i < 10; i ++) {
				if(b[i]) l.add(i);
			}
			if(!ans.contains(l))ans.add(l);
			return;
		}
		for(int i = m; i < 11 - k; i ++) {
			if(b[i] == true) continue;
			b[i] = true;
			dfs(k - 1, n - i, m + 1);
			b[i] = false;
		}
	}
}