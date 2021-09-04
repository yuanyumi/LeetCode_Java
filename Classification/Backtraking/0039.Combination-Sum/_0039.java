package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0039 {
	List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	ans = new ArrayList<>();
    	List<Integer> l = new ArrayList<>();
    	dfs(candidates, target, 0, 0, l);
    	return ans;
    }

	private void dfs(int[] candidates, int target, int k, int sum, List<Integer> q) {
		if(sum == target) {
			ans.add(q);
			return;
		}
		if(k >= candidates.length) return;
		List<Integer> l = new ArrayList<>();
		for(Integer c:q) l.add(c);
		while(true) {
			dfs(candidates, target, k + 1, sum, l);
			sum += candidates[k];
			if(sum > target) break;
			l.add(candidates[k]);
		}
	}
}
