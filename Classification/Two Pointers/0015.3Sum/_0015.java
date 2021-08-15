package two_points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0015 {

	public static void main(String[] args) {
		Solution0015 t = new Solution0015();
		int[] b = {-2,0,1,1,2};
		System.out.println(t.threeSum(b));
	}

}
class Solution0015 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> ans = new ArrayList<>();
    	if(nums.length < 3) return ans;
    	Arrays.sort(nums);
    	int i = 0;
    	while(i < nums.length - 2) {
    		int left = i + 1, right = nums.length - 1;
    		while(left < right) {
    			if(nums[left] + nums[right] + nums[i] == 0) {
    				List<Integer> l = new ArrayList<>();
    				l.add(nums[i]);
    				l.add(nums[left]);
    				l.add(nums[right]);
    				ans.add(l);
    				right --;
    			}
    			else if(nums[left] + nums[right] > -nums[i]) right --;
    			else left ++;
    		}
    		i ++;
    	}
    	return ans;
    }
}