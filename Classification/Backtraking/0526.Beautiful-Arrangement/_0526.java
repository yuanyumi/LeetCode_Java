package Backtraking;

public class _0526 {

	public static void main(String[] args) {
		Solution0526 a = new Solution0526();
		System.out.println(a.countArrangement(1));
	}

}
class Solution0526 {
	int[] nums;
	int ans = 0;
    public int countArrangement(int n) {
    	nums = new int[n];
    	for(int i = 0; i < n; i ++) nums[i] = i + 1;
    	dfs(0);
    	return ans;
    }
	private void dfs(int k) {
		if(k >= nums.length) {
			for(int i = 0; i < nums.length; i ++) {
				if(nums[i] % (i+1) == 0 || (i+1) % nums[i] == 0) continue;
				return;
			}
			ans ++;
			return;
		}
		for(int i = k; i < nums.length; i ++) {
			if(!(nums[i] % (k+1) == 0 || (k+1) % nums[i] == 0)) continue;
			int t = nums[i]; nums[i] = nums[k]; nums[k] = t;
			dfs(k + 1);
			t = nums[i]; nums[i] = nums[k]; nums[k] = t;
		}
	}
}