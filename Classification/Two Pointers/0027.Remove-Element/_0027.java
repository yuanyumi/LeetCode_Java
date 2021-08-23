package two_points;

public class _0027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0027 {
    public int removeElement(int[] nums, int val) {
    	int trash = nums.length - 1;
    	for(int i = 0; i <= trash; i ++) {
    		if(nums[i] != val) continue;
    		int tmp = nums[i];
    		nums[i] = nums[trash];
    		nums[trash] = tmp;
    		trash --;
    		i --;
    	}
    	return trash + 1;
    }
}