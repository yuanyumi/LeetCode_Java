package Backtraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0040 {

	public static void main(String[] args) {
		Solution0040 a = new Solution0040();
		int[] c = {2,5,2,1,2};
		System.out.println(a.combinationSum2(c, 5));
	}

}
class Solution0040 {
	List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	ans = new ArrayList<>();
    	Arrays.sort(candidates);
    	List<Integer> l = new ArrayList<>();
    	dfs(candidates, target, 0, l);
    	return ans;
    }
	private void dfs(int[] candidates, int target, int k, List<Integer> l) {
		if(target == 0) {
			List<Integer> q = new ArrayList<>();
			for(Integer c:l) q.add(c);
			if(!ans.contains(q)) ans.add(q);
			return;
		}
		for(int i = k; i < candidates.length; i ++) {
			if(target < candidates[i]) break;
			l.add(candidates[i]);
			dfs(candidates, target - candidates[i], i + 1, l);
			l.remove(l.size() - 1);
		}
		
	}

}