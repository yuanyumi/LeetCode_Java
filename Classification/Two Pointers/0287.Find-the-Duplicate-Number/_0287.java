package two_points;

public class _0287 {

	public static void main(String[] args) {
		Solution0287 a = new Solution0287();
		int[] b = {1,1,3,4,2};
		System.out.println(a.findDuplicate(b));
	}

}
class Solution0287 {
    public int findDuplicate(int[] nums) {
    	int left = 1, right = nums.length - 1;
    	int mid;
    	while(left < right) {
    		mid = (right + left) / 2;
    		int count = 0;
    		for(Integer num : nums) {
    			if(num > mid && num <= right) count ++;
    		}
    		if(count > right - mid) left = mid + 1;
    		else right = mid;
    	}
    	return left;
    }
}