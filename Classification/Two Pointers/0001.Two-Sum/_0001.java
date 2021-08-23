package two_points;

import java.util.HashMap;
import java.util.Map;

public class _0001 {

	public static void main(String[] args) {
		
	}

}
class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
    	int[] ans = new int[2];
    	Map<Integer,Integer> m = new HashMap<>();
    	for(int i = 0; i < nums.length; i ++) {
    		if(m.containsKey(nums[i])) {
    			ans[0] = m.get(nums[i]);
    			ans[1] = i;
    			return ans;
    		}else {
    			m.put(target - nums[i], i);
    		}
    	}
    	return ans;
    }
}