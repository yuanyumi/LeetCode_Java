package two_points;

public class _0674 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0674 {
    public int findLengthOfLCIS(int[] nums) {
    	int ans = 1;
    	for(int i = 0; i < nums.length;) {
    		int j = i + 1;
    		while(j < nums.length) {
    			if(nums[j] > nums[j - 1]) j ++;
    			else break;
    		}
    		ans = Math.max(ans, j - i);
    		i = j;
    	}
    	
    	
    	return ans;
    }
}