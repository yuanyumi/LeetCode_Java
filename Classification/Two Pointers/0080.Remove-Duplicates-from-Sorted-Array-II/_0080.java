package two_points;

public class _0080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution0080 {
    public int removeDuplicates(int[] nums) {
    	int trash = 0;
    	for(int i = 0; i < nums.length - trash;) {
    		int limit = 1;
    		while(i < nums.length - trash - 1 && nums[i + 1] == nums[i]) {
    			if(limit > 0) {
    				limit --;
    				i ++;
    			}else {
    				toEnd(nums, i + 1);
    				trash ++;
    			}
    		}
    		i ++;
    	}
    	return nums.length - trash;
    }

	private void toEnd(int[] nums, int i) {
		while(i < nums.length - 1) {
			int t = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = t;
			i ++;
		}
	} 
}