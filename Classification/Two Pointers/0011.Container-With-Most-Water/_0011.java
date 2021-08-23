package two_points;

public class _0011 {

	public static void main(String[] args) {

	}

}
class Solution0011 {
    public int maxArea(int[] height) {
    	int i = 0, j = height.length - 1;
    	int ans = 0;
    	while(i < j) {
    		ans = Math.max(ans, (j - i) * Math.min(height[i], height[j]));
    		if(height[i] < height[j]) i ++;
    		else j --;
    	}
    	
    	return ans;
    }
}