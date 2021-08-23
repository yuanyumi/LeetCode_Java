package two_points;

import java.util.Arrays;

public class _0026 {

	public static void main(String[] args) {
		
	}

}
class Solution0026_1 {
    public int removeDuplicates(int[] nums) {
    	int trash = nums.length - 1;
    	for(int i = 0; i <= trash; i ++) {
    		boolean t = false;
    		for(int j = 0; j < i; j ++) {
    			if(nums[i] == nums[j]) {
    				t = true;
    				break;
    			}
    		}
    		if(!t) continue;
    		int tmp = nums[i];
    		nums[i] = nums[trash];
    		nums[trash] = tmp;
    		trash --;
    		i --;
    	}
    	Arrays.sort(nums, 0, trash + 1);
    	return trash + 1;
    }
}
