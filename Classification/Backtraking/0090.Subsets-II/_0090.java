package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0090 {
	List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
    	ans = new ArrayList<>();
    	List<Integer> l = new ArrayList<>();
    	dfs(nums, 0, l);
    	return ans;
    }

	private void dfs(int[] nums, int k, List<Integer> l) {
		if(k >= nums.length) {
			if(check(l))ans.add(l);
			return;
		}
		dfs(nums, k + 1, l);
		List<Integer> cur = new ArrayList<>();
		for(Integer q:l) cur.add(q);
		cur.add(nums[k]);
		dfs(nums, k + 1, cur);
	}

	private boolean check(List<Integer> l) {
		int[] al= new int[21];
		for(Integer q : l) al[q + 10] ++;
		for(List<Integer> q : ans) {
			int[] aq = new int[21];
			for(Integer c : q) aq[c + 10] ++;
			if(compare(aq, al)) return false;
		}
		return true;
	}

	private boolean compare(int[] aq, int[] al) {
		for(int i = 0; i < al.length; i ++) {
			if(al[i] != aq[i]) return false;
		}
		return true;
	}
}