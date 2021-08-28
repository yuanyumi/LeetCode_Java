package two_points;

import java.util.Arrays;

public class _0611 {

	public static void main(String[] args) {
		Solution0611 a = new Solution0611();
		int[] b = {2,2,3,4};
		System.out.println(a.triangleNumber(b));
	}

}
class Solution0611 {
    public int triangleNumber(int[] nums) {
    	int ans = 0;
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i ++) {
    		for(int j = i + 1; j < nums.length; j ++) {
    			for(int k = j + 1; k < nums.length; k ++) {
    				if(nums[i] + nums[j] > nums[k]) {
    					ans ++;
    				}
    				else break;
    			}
    		}
    	}
    	
    	return ans;
    }
}