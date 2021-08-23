package two_points;

public class _0643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0643 {
    public double findMaxAverage(int[] nums, int k) {
    	int l = 0, r = 0, now = 0;
    	while(r < k) now += nums[r ++];
    	int ans = now;
    	while(r < nums.length) {
    		now += nums[r ++];
    		now -= nums[l --];
    		ans = Math.max(ans, now);
    	}
    	return ans / (double) k;
    }
}