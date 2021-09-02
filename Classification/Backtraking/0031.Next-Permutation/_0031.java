package Backtraking;

import java.util.Arrays;

public class _0031 {

	public static void main(String[] args) {

	}

}
class Solution0031 {
    public void nextPermutation(int[] nums) {
    	int k = nums.length - 1, index = 0, min = Integer.MAX_VALUE;
        if(nums.length <= 1) return;
    	while(nums[k] <= nums[k - 1]) {
    		k --;
    		if(k == 0) break;
    	}
    	if(k == 0) {
    		Arrays.sort(nums);
    		return;
    	}
    	for(int i = k; i < nums.length; i ++) {
    		if(nums[i] > nums[k - 1]) {
    			if(nums[i] < min) {
    				min = nums[i]; 
    				index = i;
    			}
    		}
    	}
        int t = nums[index];
    	nums[index] = nums[k - 1];
    	nums[k - 1] = t;
    	Arrays.sort(nums, k, nums.length);
    }
}
