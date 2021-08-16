package two_points;

import java.util.Arrays;

public class _0016 {

	public static void main(String[] args) {
		int[] b = {-1,2,1,-4};
		Solution0016 a = new Solution0016();
		System.out.println(a.threeSumClosest(b, 1));
	}

}
class Solution0016 {
    public int threeSumClosest(int[] nums, int target) {
    	int ans = 0;
    	int smallest = Integer.MAX_VALUE;
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length - 2; i ++) {
    		int left = i + 1, right = nums.length - 1;
    		while(left < right) {
    			if(Math.abs(nums[i] + nums[left] + nums[right] - target) < smallest) {
    				smallest = Math.abs(nums[i] + nums[left] + nums[right] - target);
    				ans = nums[i] + nums[left] + nums[right];
    			}
    			if(nums[i] + nums[left] + nums[right] > target) right --;
    			else if(nums[i] + nums[left] + nums[right] < target) left ++;
    			else return 0;
    		}
    	}
    	return ans;
    }
}