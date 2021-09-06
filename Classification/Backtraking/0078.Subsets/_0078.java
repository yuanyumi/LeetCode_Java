package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class _0078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0078 {
	List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
    	ans = new ArrayList<>();
    	List<Integer> l = new ArrayList<>();
    	dfs(nums, 0, l);
    	return ans;
    }

	private void dfs(int[] nums, int k, List<Integer> l) {
		if(k >= nums.length) {
			ans.add(l);
			return;
		}
		dfs(nums, k + 1, l);
		List<Integer> cur = new ArrayList<>();
		for(Integer q:l) cur.add(q);
		cur.add(nums[k]);
		dfs(nums, k + 1, cur);
	}
}