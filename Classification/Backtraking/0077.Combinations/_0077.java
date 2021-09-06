package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0077 {
	List<List<Integer>> ans;
	int n;
    public List<List<Integer>> combine(int n, int k) {
    	ans = new ArrayList<>();
    	List<Integer> l = new ArrayList<>();
    	this.n = n;
    	dfs(1,k,l);
    	return ans;
    }
	private void dfs(int now, int k, List<Integer> l) {
		if(k == 0) {
			List<Integer> add = new ArrayList<>();
			for(Integer num:l) add.add(num);
			ans.add(add);
			return;
		}
		if(now > n) return;
		dfs(now + 1, k, l);
		l.add(now);
		dfs(now + 1, k - 1, l);
		l.remove(l.size() - 1);
	}
}