package Backtraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0046 {
	List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
    	dfs(0, nums);
    	return ans;
    }
	private void dfs(int k, int[] nums) {
		if(k >= nums.length) {
			List<Integer> l = new ArrayList<>();
			for(Integer n : nums) l.add(n);
			ans.add(l);
			return;
		}
		for(int i = k; i < nums.length; i ++) {
			int t = nums[i]; nums[i] = nums[k]; nums[k] = t;
			dfs(k + 1, nums);
			t = nums[i]; nums[i] = nums[k]; nums[k] = t;
		}
	}
}