package two_points;

public class _0209 {

	public static void main(String[] args) {
		Solution0209 a = new Solution0209();
		int[] b = {2,3,1,2,4,3};
		System.out.println(a.minSubArrayLen(7, b));
	}

}
class Solution0209 {
    public int minSubArrayLen(int target, int[] nums) {
    	int ans = Integer.MAX_VALUE, l = 0, r = 0, now = 0;
    	while(r < nums.length) {
    		if(now < target) {
    			now += nums[r ++];
    		}else{
    			ans = Math.min(ans, r - l);
    			now -= nums[l ++];
    		}
    	}
    	while(now >= target) {
    		ans = Math.min(ans, r - l);
			now -= nums[l ++];
    	}
    	return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}